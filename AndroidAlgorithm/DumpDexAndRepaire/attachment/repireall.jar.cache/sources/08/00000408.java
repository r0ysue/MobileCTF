package org.jf.dexlib2.d.c;

import org.jf.dexlib2.d.g;

/* compiled from: DexBackedStringReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/c/e.class */
public final class e extends org.jf.dexlib2.b.a.d {
    private g re;
    private int yU;

    public e(g gVar, int i) {
        this.re = gVar;
        this.yU = i;
    }

    @Override // org.jf.dexlib2.e.c.e
    public final String lD() {
        return this.re.aU(this.yU);
    }
}