package org.jf.baksmali.a.a;

import java.io.IOException;
import org.jf.a.m;

/* compiled from: LineNumberMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a/e.class */
public final class e extends b {
    private final int pC;

    public e(int i, int i2, org.jf.dexlib2.e.a.d dVar) {
        super(i, -2);
        this.pC = dVar.jD();
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(m mVar) throws IOException {
        mVar.write(".line ");
        int i = this.pC;
        if (i < 0) {
            mVar.m(i & 4294967295L);
            return true;
        }
        mVar.bX(i);
        return true;
    }
}