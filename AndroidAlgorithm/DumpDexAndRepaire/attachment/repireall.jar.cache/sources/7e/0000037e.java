package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction22c.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/o.class */
public final class o extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.o {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format22c;
    private int vf;
    private int vh;
    private org.jf.dexlib2.e.c.d vj;

    public o(org.jf.dexlib2.e eVar, int i, int i2, org.jf.dexlib2.e.c.d dVar) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.bp(i);
        this.vh = org.jf.dexlib2.h.f.bp(i2);
        this.vj = dVar;
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
    }

    @Override // org.jf.dexlib2.e.b.r
    public final int jN() {
        return this.vh;
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