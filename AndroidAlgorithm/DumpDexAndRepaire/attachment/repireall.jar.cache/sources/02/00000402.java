package org.jf.dexlib2.d.c;

import org.jf.dexlib2.d.g;

/* compiled from: DexBackedFieldReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/c/a.class */
public final class a extends org.jf.dexlib2.b.a.a {
    private g re;
    private int wS;

    public a(g gVar, int i) {
        this.re = gVar;
        this.wS = gVar.aQ(i);
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String iG() {
        return this.re.aW(this.re.az(this.wS));
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String bf() {
        return this.re.aU(this.re.ax(this.wS + 4));
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String io() {
        return this.re.aW(this.re.az(this.wS + 2));
    }
}