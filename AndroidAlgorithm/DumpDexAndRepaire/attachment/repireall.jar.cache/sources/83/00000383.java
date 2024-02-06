package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction23x.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/t.class */
public final class t extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.t {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format23x;
    private int vf;
    private int vh;
    private int vm;

    public t(org.jf.dexlib2.e eVar, int i, int i2, int i3) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.bq(i);
        this.vh = org.jf.dexlib2.h.f.bq(i2);
        this.vm = org.jf.dexlib2.h.f.bq(i3);
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
    }

    @Override // org.jf.dexlib2.e.b.r
    public final int jN() {
        return this.vh;
    }

    @Override // org.jf.dexlib2.e.b.q
    public final int jS() {
        return this.vm;
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}