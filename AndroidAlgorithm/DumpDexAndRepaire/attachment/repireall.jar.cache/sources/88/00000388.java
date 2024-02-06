package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction32x.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/y.class */
public final class y extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.y {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format32x;
    private int vf;
    private int vh;

    public y(org.jf.dexlib2.e eVar, int i, int i2) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.br(i);
        this.vh = org.jf.dexlib2.h.f.br(i2);
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
    }

    @Override // org.jf.dexlib2.e.b.r
    public final int jN() {
        return this.vh;
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}