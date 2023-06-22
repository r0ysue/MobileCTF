
const STD_STRING_SIZE = 3 * Process.pointerSize;
class StdString {
    constructor() {
        this.handle = Memory.alloc(STD_STRING_SIZE);
    }

    dispose() {
        const [data, isTiny] = this._getData();
        if (!isTiny) {
            Java.api.$delete(data);
        }
    }

    disposeToString() {
        const result = this.toString();
        this.dispose();
        return result;
    }

    toString() {
        const [data] = this._getData();
        return data.readUtf8String();
    }

    _getData() {
        const str = this.handle;
        const isTiny = (str.readU8() & 1) === 0;
        const data = isTiny ? str.add(1) : str.add(2 * Process.pointerSize).readPointer();
        return [data, isTiny];
    }
}

function prettyMethod(method_id, withSignature) {
    const result = new StdString();
    Java.api['art::ArtMethod::PrettyMethod'](result, method_id, withSignature ? 1 : 0);
    return result.disposeToString();
}

function hook_dlopen(module_name, fun) {
    var android_dlopen_ext = Module.findExportByName(null, "android_dlopen_ext");

    if (android_dlopen_ext) {
        Interceptor.attach(android_dlopen_ext, {
            onEnter: function (args) {
                var pathptr = args[0];
                if (pathptr) {
                    this.path = (pathptr).readCString();
                    if (this.path.indexOf(module_name) >= 0) {
                        this.canhook = true;
                        console.log("android_dlopen_ext:", this.path);
                    }
                }
            },
            onLeave: function (retval) {
                if (this.canhook) {
                    fun();
                }
            }
        });
    }
    var dlopen = Module.findExportByName(null, "dlopen");
    if (dlopen) {
        Interceptor.attach(dlopen, {
            onEnter: function (args) {
                var pathptr = args[0];
                if (pathptr) {
                    this.path = (pathptr).readCString();
                    if (this.path.indexOf(module_name) >= 0) {
                        this.canhook = true;
                        console.log("dlopen:", this.path);
                    }
                }
            },
            onLeave: function (retval) {
                if (this.canhook) {
                    fun();
                }
            }
        });
    }
    console.log("android_dlopen_ext:", android_dlopen_ext, "dlopen:", dlopen);
}


function hook_native() {


    var module_libart = Process.findModuleByName("libart.so");
    var symbols = module_libart.enumerateSymbols();
    var ArtMethod_Invoke = null;
    for (var i = 0; i < symbols.length; i++) {
        var symbol = symbols[i];
        var address = symbol.address;
        var name = symbol.name;
        var indexArtMethod = name.indexOf("ArtMethod");
        var indexInvoke = name.indexOf("Invoke");
        var indexThread = name.indexOf("Thread");
        if (indexArtMethod >= 0
            && indexInvoke >= 0
            && indexThread >= 0
            && indexArtMethod < indexInvoke
            && indexInvoke < indexThread) {
            console.log(name);
            ArtMethod_Invoke = address;
        }
    }
    if (ArtMethod_Invoke) {
        Interceptor.attach(ArtMethod_Invoke, {
            onEnter: function (args) {
                var method_name = prettyMethod(args[0], 0);
                if (!(method_name.indexOf("java.") == 0 || method_name.indexOf("android.") == 0)) {
                    console.log("ArtMethod Invoke:" + method_name + '  called from:\n' +
                        Thread.backtrace(this.context, Backtracer.ACCURATE)
                            .map(DebugSymbol.fromAddress).join('\n') + '\n');
                }
            }
        });
    }
}
function FlutterSSLBypass () {
	// pattern bytes
	// var pattern = "ff 03 05 d1 fd 7b 0f a9 bc de 05 94 08 0a 80 52 48"
	var pattern = "2d e9 f0 4f a3 b0 81 46 50 20 10 70"
    // library name
	var module = "libflutter.so"
	// define your arm version
	var armversion = 7
	// expected return value
	var expectedReturnValue = true
	
	// random string, you may ignore this
	console.log("Horangi - Bypass Flutter SSL Pinning")
	// enumerate all process
	Process.enumerateModules().forEach(v => {
		// if the module matches with our library
		if(v['name'] == module) {
			// debugging purposes
			console.log("Base: ", v['base'], "| Size: ", v['size'], "\n")
			// scanning memory - synchronous version
			// compare it based on base, size and pattern
			Memory.scanSync(v['base'], v['size'], pattern).forEach(mem => {
				// assign address to variable offset
				var offset = mem['address']
				if(armversion === 7) {
					// armv7 add 1
					offset = offset.add(1)
				}
				// another debugging purposes
				console.log("Address:",offset,"::", mem['size'])
				// hook to the address
				Interceptor.attach(offset, {
					// when leaving the address, 
					onLeave: function(retval) {
						// execute this debugging purpose (again)
						console.log("ReturnValue",offset,"altered from", +retval,"to", +expectedReturnValue)
						// replace the return value to expectedReturnValue
						retval.replace(+expectedReturnValue);
					}
				})
			})
		}
	});
}// wait for 1 sec until the app load the library.
function hook7B7C(){
    var breakpad = Process.findModuleByName("libbreakpad.so")
    Interceptor.attach(breakpad.base.add('0x7b7c'),{
        onEnter:function(args){
            console.log("entering 7b7c...")

        },onLeave:function(ret){
            console.log("leaving 7b7c:",ret,ret.readCString())
        }
    })
}
function hookBase64decide(){
    Java.perform(function(){
        Java.use("android.util.Base64").decode.overload('java.lang.String', 'int').implementation = function(str,i){
            var result = this.decode(str,i)
            var ByteString = Java.use("com.android.okhttp.okio.ByteString");
            console.log("str,i,result=>",str,i, ByteString.of(result).hex())
            return result;
        }
    })
}

function main() {
    // hook_dlopen("libbreakpad.so", hook7B7C);
    // hook_native();
    hookBase64decide();

}

setImmediate(main);



// 308209d10201033082099706092a864886f70d010701a082098804820984308209803082043706092a864886f70d010706a0820428308204240201003082041d06092a864886f70d010701301c060a2a864886f70d010c0106300e0408c9175ba6d5c3da5a02020800808203f08184e684e800341ef703732933257a00fe205649587ff93c4c0c500f8049ee75a2b09dada846a388d55697587bd77472f388efa127e31e69fb4dec60b0a1bb4ee3b894a8fbd24c944105fb1ae33ad2ee4300af1e946ba616268ef69213edfa95ad272875a5e139c0411627138af7c02a5ce3bfd5a750c65e992e7b255756b45a42bd9b86d7a948485211df0e31746abce205c1bc9f850c8379cc10f4107c7b955b4cc2285c09290ae58383f5ca599dd3142d78e7cc9acaf8c336d3781d660e6096eeb348a9b54f687c1e56a1e4d389a0026d95a869dc38a3f05a93ce2261d245a60ca7b4e5d01993e755bb4098ec25fd6c07b523f503915a9205904ae276c7d9cc6fc08cb5f5559713e9144597f38d47f8c3b7aeeaa493c13f4e2a08056a0835c431845d7a6d9ce62378a7f2cc22dc8b938591a10df7f259e76acfe3552016bb2a1d5e2f8f670c864b3c6747e026b89bcca94db258d9dd8b01036f757259e6f105efbf1273e03df19b84c7244e78069e20ba57ac350ea7b6496a48242b47c49bc572bcf253ed798581aa2b2f46e65d0c7f4a8912ee5cec402660deefd51eba9277df9faddf389606e51aecd33c0c65597d593dd685aadd69ad694f9da9384cfcdaf89d044d33385623176b676fa671be26d50bcd8291ebb07f07834a8e3189cf5004b606af8562fa2d3e7c7133d0f914a7c8d1a085b523f88cd4b29635c5c4e5926aaf3bc9a3a3293e5d38c6dcb710af76032f5bca6933ef663ac98a9a3979885889f3148aa9993526be3de72b6fabbdd41dad5f636a94028a5026a485c16ffc5ac09a8b994627357fb66881cdee50c66ceae808638d2af3c40a66590a78e5b73990f400dfa072b8d516e49abf26eb645cf56fd4108af9dd6c83410b8b2065586943dc034b2ed2a14e0101dc8dc3ae67de4e6415be159207162991bb0f7f6b49fb86ea8ac824a053b2f7f0070743b107d3c7c2d00799f73927aa435a950c4446322ad40e6bd47c98a02438b2e888c333b1cb4b726184329f3512b08455081b2feb7d3f9efa0ec2177d67e7631e6c7ddcb2c96e9e6594ba3003fad301e1a4d8a9fd845417250f45949df1a401028343b24eec53bbaf2ce3312b8d0aece34ec9c09c6dd94594e5a89dd49bf17de1a6aac3157be90e788df9d35a9c5dacb9b2135ecb7e63ee56b94efdc38ee2113e176336bd83f75547809c3f41c498a049b591ab111d80559cc597f2bdbe8982a848305b2b8705a394434beb5938243c7f70ac16eb4444bee312309dc60c141c090112ddc3942aabaf2a38e0d2f604f12cd94546d51d7be64204a4fe8b31d7aa600658ea47b29efe2f7fd14c694a01dce1febd2fb7dbc846cd0d202aa150c4f41875cb825acb5bd410f3868f972ced189e6d7583ea462040c410f1652978f2cf5d10d3e73082054106092a864886f70d010701a08205320482052e3082052a30820526060b2a864886f70d010c0a0102a08204ee308204ea301c060a2a864886f70d010c0103300e04086fff9a6e67fd785d02020800048204c8ce68a30d966b16948b0480b7e83b5c96ea9d478db618040cc174924f3309d6ef0a2629a80c629103c9f1c6cdf683a2e3ce20a14c2c288e3076db04b49c7fc1cbad2236e51eade0c84cac0d8dd68cc3a22066a267e0b2a5b73eed5b326e1e182bdefb50615b172e4b6f56171e3ac5a6717f4e3bca7b8c9489e786fbd83c9fa71ea281577988d489a9d0cc6242a830dab2c67a7386fa74abd39a0aa8ecbc22282b66fba7567a94558add8a4d4a92a8a0553998b348897173abfcb4cffb72b57e7e7a7ac90a062357284f3c4393dea7f1640735628ee038f78f9765ac5b1865823281f479f38858dd3a59d8b5827be81d65e30331f4bb0a73d636afb39c37d6a77e96da4511d1454392182e270e3ec33a3f7a54e5685ad5b6354e29f3fc4c53c7a39f838993896870d706cdabeec77a189de414bea06fe9f6f6e78d8d44a223a7667a24eb60afba545703f12504ae1d360b82680f4b151b73f1a5a6edaf37777cb33c99a44274dcc5a9c66a73fdc29f3f519b6735524bc792d9bd3e87ca471bee49425b2d83b9f28a18e68244007c17e0bc0be37407caa06335d28d8d9ae188850192ca1befce51de3073a807a390edf2b22e3787b75f8ef347556b4b8acca3308113df0c9d0ebd358a37ddd2f3a6c0e42b77866a4340bb56f62b09c746c77bfea5d1b4c17666aa60c56fe93cc5c40f60e426e622c2e71bb503f88a53c8b639979ee8f5e3ab21b86fcc1ee2dfa8e35a1a47bf98c1078a091e35e6f33a3e3c72d51c024104fcded4c5a1ce904088b48a58531cbc4fc3bd5103a5bdc9ac1614ba8caf4a54caef3ea4cdd9e789c5322ec9b1089a8afefd9f7bec5635370f4da9c36d1ae761426257a654cb5557cf064d48f79244703914799441a03fe92dcb8af30b748ff8c2574d5d64f2398d43720729b2ca2a4eaea187cfcf54f164ff2f179b505c6ddca62affb5644fd6b35c530065fad806912f583752fa8aeaaf1e672b15c0bab353ea475873ad16857f8e100fcd7a9d7fad17e3ac866cc2e2225bc80867c1b02280b98b434c5107b30e7e0b144d6ff368e64cca0c1725ae56a5478b85e62cb069c9297a89f37c0e3174cae236ce167716080accb61082942d5804c81ff076a830dfaa1104c275776a475634fe74b4ef62e1d5cb3c60fb98a9586cc2cdd9cc45019c76c7104397f2f9c05cf676c29e40a24790c564dea2bd9147225dcb355ab7422e1abce490fae4b57809565f35605f543c90f2d87413a68cf5df2ac6f8667fd9e50313c44d20a11e4bf137e53df6b0c4cc3cf79acdb60d7634281cfce0af6cfdf962e0201dd677acacfbcbe879a26dcdf0fd761aea05d418d6f20ba3d4463a90c09fdb162458da76a9477c9ac7a5e56eb6d0ac6ca737028f8989e9a9a3fad3aba348467d3a45c2d188edef3fa4f7e1998c4b4ed597ccdf3b1f5eeeb6e401577b24cf43e10f002167dbeacc456d575031f933f556e30fe34089a8e1e62f8c600c22ce2cf8de4b6034db4f68dee8476c4402e4bd15e5fc463ba939a70f9c572e8c0ebb3d88081d8a412ec7a08688dc3435887ce5791b059141a7eeb26378b84549e81490497b16cb38ed9e153caaddaed3ad00a2d0c5dab12c560337a823bbd6b8c5202f3586b94039c479e6f992aad0924b600309d5cf4ca282984150b554ced92f9fb29a68d214d762748ff722b9b5d3f84c81f02db50fecba0520c48d99bb685da6a1e95f1f7b3125302306092a864886f70d0109153116041405ab8be40ad9a8c965625010e58ab85ddccc12e830313021300906052b0e03021a050004148acecf2b9eb82759bc7f633eb208374fb68a6ab90408859934ee6fe34b5702020800