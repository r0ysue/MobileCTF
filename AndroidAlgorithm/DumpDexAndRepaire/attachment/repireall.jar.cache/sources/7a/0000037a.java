package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction21lh.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/k.class */
public final class k extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.k {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format21lh;
    private int vf;
    private long vk;

    public k(org.jf.dexlib2.e eVar, int i, long j) {
        super(eVar);
        this.vf = org.jf.dexlib2.h.f.bq(i);
        this.vk = org.jf.dexlib2.h.f.i(j);
    }

    @Override // org.jf.dexlib2.e.b.k
    public final int jK() {
        return this.vf;
    }

    @Override // org.jf.dexlib2.e.b.v
    public final long jM() {
        return this.vk;
    }

    @Override // org.jf.dexlib2.e.b.d
    public final short jQ() {
        return (short) (this.vk >>> 48);
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}