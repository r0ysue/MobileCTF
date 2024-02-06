package org.jf.dexlib2.d.c;

import org.jf.dexlib2.d.g;

/* compiled from: DexBackedTypeReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/c/f.class */
public final class f extends org.jf.dexlib2.b.a.e {
    private g re;
    private int vC;

    public f(g gVar, int i) {
        this.re = gVar;
        this.vC = i;
    }

    @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
    public final String io() {
        return this.re.aW(this.vC);
    }
}