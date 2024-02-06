package org.jf.baksmali.b;

import java.io.IOException;
import org.jf.a.m;

/* compiled from: IntegerRenderer.java */
/* loaded from: repireall.jar:org/jf/baksmali/b/f.class */
public final class f {
    public static void e(m mVar, int i) throws IOException {
        if (i < 0) {
            mVar.write("-0x");
            mVar.l(-i);
            return;
        }
        mVar.write("0x");
        mVar.l(i);
    }
}