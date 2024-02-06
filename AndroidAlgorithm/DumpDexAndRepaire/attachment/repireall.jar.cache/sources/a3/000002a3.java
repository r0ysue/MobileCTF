package org.jf.baksmali.a.a;

import java.io.IOException;
import org.jf.a.m;
import org.jf.a.s;

/* compiled from: SetSourceFileMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a/h.class */
public final class h extends b {
    private final String pF;

    public h(int i, int i2, org.jf.dexlib2.e.a.h hVar) {
        super(i, -3);
        this.pF = hVar.iT();
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(m mVar) throws IOException {
        mVar.write(".source");
        if (this.pF != null) {
            mVar.write(" \"");
            s.b(mVar, this.pF);
            mVar.write(34);
            return true;
        }
        return true;
    }
}