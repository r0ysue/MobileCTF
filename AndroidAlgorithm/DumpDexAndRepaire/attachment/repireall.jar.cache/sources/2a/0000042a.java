package org.jf.dexlib2.d.e;

import org.jf.dexlib2.b.b.l;
import org.jf.dexlib2.d.o;

/* compiled from: DexBackedMethodEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/e/f.class */
public final class f extends l {
    private org.jf.dexlib2.d.g re;
    private final int zJ;

    public f(o oVar, int i) {
        this.re = (org.jf.dexlib2.d.g) oVar.vA;
        this.zJ = oVar.aJ(i + 1);
    }

    @Override // org.jf.dexlib2.e.d.m
    public final org.jf.dexlib2.e.c.c lO() {
        return new org.jf.dexlib2.d.c.c(this.re, this.zJ);
    }
}