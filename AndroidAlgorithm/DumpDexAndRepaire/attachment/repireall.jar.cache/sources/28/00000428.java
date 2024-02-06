package org.jf.dexlib2.d.e;

import org.jf.dexlib2.d.o;

/* compiled from: DexBackedEnumEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/e/d.class */
public final class d extends org.jf.dexlib2.b.b.g {
    private org.jf.dexlib2.d.g re;
    private final int zH;

    public d(o oVar, int i) {
        this.re = (org.jf.dexlib2.d.g) oVar.vA;
        this.zH = oVar.aJ(i + 1);
    }

    @Override // org.jf.dexlib2.e.d.h
    public final org.jf.dexlib2.e.c.a lN() {
        return new org.jf.dexlib2.d.c.a(this.re, this.zH);
    }
}