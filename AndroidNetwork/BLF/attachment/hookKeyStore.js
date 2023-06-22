function hook_KeyStore_load() {
    Java.perform(function () {
        var StringClass = Java.use("java.lang.String");
        var KeyStore = Java.use("java.security.KeyStore");
        KeyStore.load.overload('java.security.KeyStore$LoadStoreParameter').implementation = function (arg0) {
            // printStack("KeyStore.load1");
            console.log(Java.use("android.util.Log").getStackTraceString(Java.use("java.lang.Throwable").$new()));
            console.log("KeyStore.load1:", arg0);
            this.load(arg0);
        };
        KeyStore.load.overload('java.io.InputStream', '[C').implementation = function (arg0, arg1) {
            // printStack("KeyStore.load2");
            console.log(Java.use("android.util.Log").getStackTraceString(Java.use("java.lang.Throwable").$new()));
            console.log("KeyStore.load2:", arg0, arg1 ? StringClass.$new(arg1) : null);
            this.load(arg0, arg1);
        };

        console.log("hook_KeyStore_load...");
    });
}
hook_KeyStore_load()
// com.bianlifeng.customer.android/com.rnx.react.activityfork.RNXActivity1