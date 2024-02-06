package org.jf.dexlib2.k;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jf.dexlib2.c;
import org.jf.dexlib2.f;
import org.jf.dexlib2.g.e;
import org.jf.dexlib2.g.p;

/* loaded from: repireall.jar:org/jf/dexlib2/k/liyh.class */
public class liyh {
    public static String Bc = null;
    public static String Bd = null;
    public static byte[] Be = null;
    public static ByteBuffer Bf = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.IOException] */
    public static void main(String[] strArr) {
        new l().lW();
        ?? r0 = Bd;
        try {
            r0 = r0 + ".new.dex";
            c.a((String) r0, new e(new p()).b(c.a(Bd + "new.dex", f.hZ())));
        } catch (IOException e) {
            r0.printStackTrace();
        }
    }
}