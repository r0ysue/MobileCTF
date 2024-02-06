package org.jf.baksmali.a.a;

import java.io.IOException;
import org.jf.a.m;
import org.jf.baksmali.a.p;

/* compiled from: StartLocalMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a/i.class */
public final class i extends b {
    private final org.jf.dexlib2.e.a.i pG;
    private final p pH;

    public i(int i, int i2, p pVar, org.jf.dexlib2.e.a.i iVar) {
        super(i, -1);
        this.pG = iVar;
        this.pH = pVar;
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(m mVar) throws IOException {
        mVar.write(".local ");
        this.pH.e(mVar, this.pG.jB());
        String bf = this.pG.bf();
        String io = this.pG.io();
        String jb = this.pG.jb();
        if (bf != null || io != null || jb != null) {
            mVar.write(", ");
            f.a(mVar, bf, io, jb);
            return true;
        }
        return true;
    }
}