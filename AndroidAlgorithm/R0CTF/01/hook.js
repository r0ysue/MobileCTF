



function main(){
    Java.perform(function(){
        let AlgoHelper = Java.use("com.r0ysue.rctf.utils.AlgoHelper");
        var key = "0000000000000000"
        var str = "0000000000000000"
        var result = AlgoHelper["encryp"](str,key)
        console.log("result => ",result);
    })
}



setImmediate(main)