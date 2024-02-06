package org.jf.dexlib2.c.b;

/* compiled from: BuilderInstruction3rms.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/ae.class */
public final class ae extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.ae {
    private static org.jf.dexlib2.d ve = org.jf.dexlib2.d.Format3rms;
    private int vt;
    private int qy;
    private int vs;

    public ae(org.jf.dexlib2.e eVar, int i, int i2, int i3) {
        super(eVar);
        this.vt = org.jf.dexlib2.h.f.br(i);
        this.qy = org.jf.dexlib2.h.f.by(i2);
        this.vs = i3;
    }

    @Override // org.jf.dexlib2.e.b.n
    public final int jZ() {
        return this.vt;
    }

    @Override // org.jf.dexlib2.e.b.s
    public final int im() {
        return this.qy;
    }

    @Override // org.jf.dexlib2.e.b.u
    public final int jY() {
        return this.vs;
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return ve;
    }
}