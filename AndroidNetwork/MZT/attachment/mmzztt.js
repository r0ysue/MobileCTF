setImmediate(function(){
    Java.perform(function(){
        Java.use("android.view.Window").addFlags.implementation = function(x){
            console.log("addFlags called")
        }
        Java.use("android.view.Window").setFlags.implementation = function(x,y){
            console.log("setFlags called")
        }
    })
})