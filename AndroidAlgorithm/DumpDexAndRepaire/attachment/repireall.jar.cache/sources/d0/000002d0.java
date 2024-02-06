package org.jf.baksmali.b;

import java.io.IOException;
import org.jf.a.m;

/* compiled from: ByteRenderer.java */
/* loaded from: repireall.jar:org/jf/baksmali/b/b.class */
public final class b {
    public static void a(m mVar, byte b) throws IOException {
        if (b < 0) {
            mVar.write("-0x");
            mVar.l(-b);
            mVar.write(116);
            return;
        }
        mVar.write("0x");
        mVar.l(b);
        mVar.write(116);
    }
}