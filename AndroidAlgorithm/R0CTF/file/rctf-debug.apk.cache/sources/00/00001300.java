package com.r0ysue.rctf.utils;

/* loaded from: classes3.dex */
public class AlgoHelper {
    public static native String Sign(String str);

    public static native String decrypt(String str, String str2);

    public static native String doMath(byte[] bArr);

    public static native String encryp(String str, String str2);

    static {
        System.loadLibrary("rctf");
    }
}