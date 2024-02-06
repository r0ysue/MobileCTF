package org.jf.dexlib2.c.b;

import java.util.List;

/* compiled from: BuilderArrayPayload.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/a.class */
public final class a extends org.jf.dexlib2.c.c implements org.jf.dexlib2.e.b.a.a {
    private static org.jf.dexlib2.e vb = org.jf.dexlib2.e.ARRAY_PAYLOAD;
    private int vc;
    private List<Number> vd;

    public a(int i, List<Number> list) {
        super(vb);
        this.vc = i;
        this.vd = list == null ? com.b.a.c.ah.eY() : list;
    }

    @Override // org.jf.dexlib2.e.b.a.a
    public final int jI() {
        return this.vc;
    }

    @Override // org.jf.dexlib2.e.b.a.a
    public final List<Number> jJ() {
        return this.vd;
    }

    @Override // org.jf.dexlib2.c.c, org.jf.dexlib2.e.b.f
    public final int iR() {
        return 4 + (((this.vc * this.vd.size()) + 1) / 2);
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return vb.format;
    }
}