package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction3rc.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/ac.class */
public final class ac extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.ac {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format3rc;
    private int vt;
    private int qy;
    private org.jf.dexlib2.e.c.d vj;

    public ac(org.jf.dexlib2.e eVar, int i, int i2, org.jf.dexlib2.e.c.d dVar) {
        super(eVar);
        this.vt = org.jf.dexlib2.h.f.br(i);
        this.qy = org.jf.dexlib2.h.f.by(i2);
        this.vj = dVar;
    }

    @Override // org.jf.dexlib2.e.b.n
    public final int jZ() {
        return this.vt;
    }

    @Override // org.jf.dexlib2.e.b.s
    public final int im() {
        return this.qy;
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