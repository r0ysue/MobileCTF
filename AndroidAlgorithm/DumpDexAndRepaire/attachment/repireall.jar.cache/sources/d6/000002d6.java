package org.jf.baksmali.b;

import java.io.IOException;
import org.jf.a.m;

/* compiled from: ShortRenderer.java */
/* loaded from: repireall.jar:org/jf/baksmali/b/h.class */
public final class h {
    public static void a(m mVar, short s) throws IOException {
        if (s < 0) {
            mVar.write("-0x");
            mVar.l(-s);
            mVar.write(115);
            return;
        }
        mVar.write("0x");
        mVar.l(s);
        mVar.write(115);
    }
}