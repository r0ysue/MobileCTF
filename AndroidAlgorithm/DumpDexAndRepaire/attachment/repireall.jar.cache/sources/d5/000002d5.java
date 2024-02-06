package org.jf.baksmali.b;

import java.io.IOException;
import org.jf.a.m;

/* compiled from: LongRenderer.java */
/* loaded from: repireall.jar:org/jf/baksmali/b/g.class */
public final class g {
    public static void b(m mVar, long j) throws IOException {
        if (j < 0) {
            mVar.write("-0x");
            mVar.l(-j);
            mVar.write(76);
            return;
        }
        mVar.write("0x");
        mVar.l(j);
        mVar.write(76);
    }

    public static void c(m mVar, long j) throws IOException {
        if (j < 0) {
            mVar.write("-0x");
            mVar.l(-j);
            if (j < -2147483648L) {
                mVar.write(76);
                return;
            }
            return;
        }
        mVar.write("0x");
        mVar.l(j);
        if (j > 2147483647L) {
            mVar.write(76);
        }
    }
}