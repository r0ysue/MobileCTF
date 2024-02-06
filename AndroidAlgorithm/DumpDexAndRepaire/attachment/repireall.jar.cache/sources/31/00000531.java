package org.jf.dexlib2.f.e;

/* compiled from: ImmutableTypeEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/r.class */
public final class r extends org.jf.dexlib2.b.b.p implements g {
    private String AV;

    public r(String str) {
        this.AV = str;
    }

    public static r a(org.jf.dexlib2.e.d.q qVar) {
        if (qVar instanceof r) {
            return (r) qVar;
        }
        return new r(qVar.lP());
    }

    @Override // org.jf.dexlib2.e.d.q
    public final String lP() {
        return this.AV;
    }
}