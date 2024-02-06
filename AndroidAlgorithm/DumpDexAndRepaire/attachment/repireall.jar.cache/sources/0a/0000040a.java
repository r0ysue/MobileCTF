package org.jf.dexlib2.d;

/* compiled from: DexBackedAnnotationElement.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d.class */
public final class d extends org.jf.dexlib2.b.b {
    private final g vF;
    private int vG;
    private org.jf.dexlib2.e.d.g vH;

    public d(o oVar) {
        this.vF = (g) oVar.vA;
        this.vG = oVar.kf();
        this.vH = org.jf.dexlib2.d.e.c.f(oVar);
    }

    @Override // org.jf.dexlib2.e.b
    public final String bf() {
        return this.vF.aU(this.vG);
    }

    @Override // org.jf.dexlib2.e.b
    public final org.jf.dexlib2.e.d.g kt() {
        return this.vH;
    }
}