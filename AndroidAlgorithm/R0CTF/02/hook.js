function main(){
    Java.perform(function(){
        let AlgoHelper = Java.use("com.r0ysue.rctf.utils.AlgoHelper");
        var result = AlgoHelper["Sign"]("r0ysue")
        console.log("result => ", result)
    })
}

setImmediate(main)