package org.jf.dexlib2.f.e;

/* compiled from: ImmutableDoubleEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/f.class */
public class f extends org.jf.dexlib2.b.b.f implements g {
    private double AO;

    public f(double d) {
        this.AO = d;
    }

    public static f a(org.jf.dexlib2.e.d.f fVar) {
        if (fVar instanceof f) {
            return (f) fVar;
        }
        return new f(fVar.lT());
    }

    @Override // org.jf.dexlib2.e.d.f
    public final double lT() {
        return this.AO;
    }
}