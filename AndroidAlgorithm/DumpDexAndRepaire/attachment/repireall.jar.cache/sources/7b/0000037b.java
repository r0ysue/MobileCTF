package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction21s.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/l.class */
public final class l extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.l {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format21s;
    private int vf;
    private int vg;

    public l(org.jf.dexlib2.e eVar, int i, int i2) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.bq(i);
        this.vg = org.jf.dexlib2.h.f.bu(i2);
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
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