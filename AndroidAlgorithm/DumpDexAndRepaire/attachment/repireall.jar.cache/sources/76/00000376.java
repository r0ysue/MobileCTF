package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction20bc.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/g.class */
public final class g extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.g {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format20bc;
    private int vi;
    private org.jf.dexlib2.e.c.d vj;

    public g(org.jf.dexlib2.e eVar, int i, org.jf.dexlib2.e.c.d dVar) {
        super(eVar);
        this.vi = org.jf.dexlib2.h.f.bB(i);
        this.vj = dVar;
    }

    @Override // org.jf.dexlib2.e.b.t
    public final int jO() {
        return this.vi;
    }

    @Override // org.jf.dexlib2.e.b.m
    public final org.jf.dexlib2.e.c.d jP() {
        return this.vj;
    }

    @Override // org.jf.dexlib2.e.b.m
    public final int ib() {
        return org.jf.dexlib2.g.a(this.vj);
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}