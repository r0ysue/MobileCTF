function sleep(time) {
    var timeStamp = new Date().getTime();
    var endTime = timeStamp + time;
    while (true) {
      if (new Date().getTime() > endTime) {
        return;
      }
    }
  }

function Sign(str){
    let AlgoHelper = Java.use("com.r0ysue.rctf.utils.AlgoHelper");
    return AlgoHelper["Sign"](str)
}

function encrypt(str){
    let AlgoHelper = Java.use("com.r0ysue.rctf.utils.AlgoHelper");
    return AlgoHelper["encryp"](Sign(str), "r00000000000ysue")
}

function main(){
    Java.perform(function(){
        // let AlgoHelper = Java.use("com.r0ysue.rctf.utils.AlgoHelper");
        // var str = "134986a7705d88191c1f58abf5630ecd";
        // var str1 = "r00000000000ysue";
        // var result = AlgoHelper["decrypt"](str, str1);
        // console.log("result => ", result)
        for(var i=22222;i<99999;i++){
            var result = encrypt(i.toString())
            var value = result.toLowerCase().substring(0, 32);
            if(value === "134986a7705d88191c1f58abf5630ecd"){
                console.log(i.toString())
                break
            }
            sleep(100)
        }
    })
}




setImmediate(main)