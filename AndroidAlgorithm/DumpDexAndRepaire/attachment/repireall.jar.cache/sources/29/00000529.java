package org.jf.dexlib2.f.e;

/* compiled from: ImmutableFieldEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/j.class */
public final class j extends org.jf.dexlib2.b.b.h implements g {
    private org.jf.dexlib2.e.c.a AQ;

    public j(org.jf.dexlib2.e.c.a aVar) {
        this.AQ = aVar;
    }

    public static j a(org.jf.dexlib2.e.d.i iVar) {
        if (iVar instanceof j) {
            return (j) iVar;
        }
        return new j(iVar.lN());
    }

    @Override // org.jf.dexlib2.e.d.i
    public final org.jf.dexlib2.e.c.a lN() {
        return this.AQ;
    }
}