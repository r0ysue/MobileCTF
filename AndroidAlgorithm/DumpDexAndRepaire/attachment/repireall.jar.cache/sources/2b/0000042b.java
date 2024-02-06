package org.jf.dexlib2.d.e;

import org.jf.dexlib2.b.b.o;

/* compiled from: DexBackedStringEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/e/g.class */
public final class g extends o {
    private org.jf.dexlib2.d.g re;
    private final int zK;

    public g(org.jf.dexlib2.d.o oVar, int i) {
        this.re = (org.jf.dexlib2.d.g) oVar.vA;
        this.zK = oVar.aJ(i + 1);
    }

    @Override // org.jf.dexlib2.e.d.p
    public final String lP() {
        return this.re.aU(this.zK);
    }
}