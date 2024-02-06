package org.jf.baksmali.a;

import java.io.IOException;

/* compiled from: RegisterFormatter.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/p.class */
public class p {
    public final org.jf.baksmali.c qx;
    private int qy;
    private int qz;
    private static /* synthetic */ boolean pL;

    static {
        pL = !p.class.desiredAssertionStatus();
    }

    public p(org.jf.baksmali.c cVar, int i, int i2) {
        this.qx = cVar;
        this.qy = i;
        this.qz = i2;
    }

    public final void a(org.jf.a.m mVar, int i, int i2) throws IOException {
        if (this.qx.qJ) {
            if (!pL && i > i2) {
                throw new AssertionError();
            }
            if (i >= this.qy - this.qz) {
                mVar.write("{p");
                mVar.bX(i - (this.qy - this.qz));
                mVar.write(" .. p");
                mVar.bX(i2 - (this.qy - this.qz));
                mVar.write(125);
                return;
            }
        }
        mVar.write("{v");
        mVar.bX(i);
        mVar.write(" .. v");
        mVar.bX(i2);
        mVar.write(125);
    }

    public final void e(org.jf.a.m mVar, int i) throws IOException {
        if (this.qx.qJ && i >= this.qy - this.qz) {
            mVar.write(112);
            mVar.bX(i - (this.qy - this.qz));
            return;
        }
        mVar.write(118);
        mVar.bX(i);
    }
}