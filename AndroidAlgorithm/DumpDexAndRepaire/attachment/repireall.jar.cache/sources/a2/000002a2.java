package org.jf.baksmali.a.a;

import java.io.IOException;
import org.jf.a.m;
import org.jf.baksmali.a.p;

/* compiled from: RestartLocalMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a/g.class */
public final class g extends b {
    private final org.jf.dexlib2.e.a.g pD;
    private final p pE;

    public g(int i, int i2, p pVar, org.jf.dexlib2.e.a.g gVar) {
        super(i, -1);
        this.pD = gVar;
        this.pE = pVar;
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(m mVar) throws IOException {
        mVar.write(".restart local ");
        this.pE.e(mVar, this.pD.jB());
        String bf = this.pD.bf();
        String io = this.pD.io();
        String jb = this.pD.jb();
        if (bf != null || io != null || jb != null) {
            mVar.write("    # ");
            f.a(mVar, bf, io, jb);
            return true;
        }
        return true;
    }
}