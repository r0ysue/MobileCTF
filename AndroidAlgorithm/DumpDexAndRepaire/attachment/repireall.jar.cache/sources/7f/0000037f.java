package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction22cs.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/p.class */
public final class p extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.p {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format22cs;
    private int vf;
    private int vh;
    private int vl;

    public p(org.jf.dexlib2.e eVar, int i, int i2, int i3) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.bp(i);
        this.vh = org.jf.dexlib2.h.f.bp(i2);
        this.vl = i3;
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
    }

    @Override // org.jf.dexlib2.e.b.r
    public final int jN() {
        return this.vh;
    }

    @Override // org.jf.dexlib2.e.b.b
    public final int jR() {
        return this.vl;
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}