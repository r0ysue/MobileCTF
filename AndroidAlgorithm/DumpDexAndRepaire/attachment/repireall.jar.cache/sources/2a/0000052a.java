package org.jf.dexlib2.f.e;

/* compiled from: ImmutableFloatEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/k.class */
public class k extends org.jf.dexlib2.b.b.i implements g {
    private float AR;

    public k(float f) {
        this.AR = f;
    }

    public static k a(org.jf.dexlib2.e.d.j jVar) {
        if (jVar instanceof k) {
            return (k) jVar;
        }
        return new k(jVar.lU());
    }

    @Override // org.jf.dexlib2.e.d.j
    public final float lU() {
        return this.AR;
    }
}