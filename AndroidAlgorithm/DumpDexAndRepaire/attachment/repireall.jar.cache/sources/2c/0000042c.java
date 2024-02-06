package org.jf.dexlib2.d.e;

import org.jf.dexlib2.b.b.p;
import org.jf.dexlib2.d.o;

/* compiled from: DexBackedTypeEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/e/h.class */
public final class h extends p {
    private org.jf.dexlib2.d.g re;
    private final int zL;

    public h(o oVar, int i) {
        this.re = (org.jf.dexlib2.d.g) oVar.vA;
        this.zL = oVar.aJ(i + 1);
    }

    @Override // org.jf.dexlib2.e.d.q
    public final String lP() {
        return this.re.aW(this.zL);
    }
}