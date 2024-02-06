package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction21c.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/i.class */
public final class i extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.i {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format21c;
    private int vf;
    private org.jf.dexlib2.e.c.d vj;

    public i(org.jf.dexlib2.e eVar, int i, org.jf.dexlib2.e.c.d dVar) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.bq(i);
        this.vj = dVar;
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
    }

    @Override // org.jf.dexlib2.e.b.m
    public final org.jf.dexlib2.e.c.d jP() {
        return this.vj;
    }

    @Override // org.jf.dexlib2.e.b.m
    public final int ib() {
        return this.uq.referenceType;
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}