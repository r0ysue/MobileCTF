package org.jf.baksmali.a.a;

import java.io.IOException;
import org.jf.a.m;
import org.jf.baksmali.a.p;

/* compiled from: EndLocalMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a/c.class */
public final class c extends b {
    private final org.jf.dexlib2.e.a.b pA;
    private final p pB;

    public c(int i, int i2, p pVar, org.jf.dexlib2.e.a.b bVar) {
        super(i, -1);
        this.pA = bVar;
        this.pB = pVar;
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(m mVar) throws IOException {
        mVar.write(".end local ");
        this.pB.e(mVar, this.pA.jB());
        String bf = this.pA.bf();
        String io = this.pA.io();
        String jb = this.pA.jb();
        if (bf != null || io != null || jb != null) {
            mVar.write("    # ");
            f.a(mVar, bf, io, jb);
            return true;
        }
        return true;
    }
}