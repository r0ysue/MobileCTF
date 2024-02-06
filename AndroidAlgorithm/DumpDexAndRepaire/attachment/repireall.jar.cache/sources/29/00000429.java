package org.jf.dexlib2.d.e;

import org.jf.dexlib2.d.o;

/* compiled from: DexBackedFieldEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/e/e.class */
public final class e extends org.jf.dexlib2.b.b.h {
    private org.jf.dexlib2.d.g re;
    private final int zI;

    public e(o oVar, int i) {
        this.re = (org.jf.dexlib2.d.g) oVar.vA;
        this.zI = oVar.aJ(i + 1);
    }

    @Override // org.jf.dexlib2.e.d.i
    public final org.jf.dexlib2.e.c.a lN() {
        return new org.jf.dexlib2.d.c.a(this.re, this.zI);
    }
}