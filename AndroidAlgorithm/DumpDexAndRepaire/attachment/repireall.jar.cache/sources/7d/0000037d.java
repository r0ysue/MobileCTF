package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction22b.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/n.class */
public final class n extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.n {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format22b;
    private int vf;
    private int vh;
    private int vg;

    public n(org.jf.dexlib2.e eVar, int i, int i2, int i3) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.bq(i);
        this.vh = org.jf.dexlib2.h.f.bq(i2);
        this.vg = org.jf.dexlib2.h.f.bt(i3);
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
    }

    @Override // org.jf.dexlib2.e.b.r
    public final int jN() {
        return this.vh;
    }

    @Override // org.jf.dexlib2.e.b.i
    public final int jL() {
        return this.vg;
    }

    @Override // org.jf.dexlib2.e.b.v
    public final long jM() {
        return this.vg;
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}