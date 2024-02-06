package org.jf.dexlib2.f.e;

/* compiled from: ImmutableEnumEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/i.class */
public final class i extends org.jf.dexlib2.b.b.g implements g {
    private org.jf.dexlib2.e.c.a AQ;

    public i(org.jf.dexlib2.e.c.a aVar) {
        this.AQ = aVar;
    }

    public static i a(org.jf.dexlib2.e.d.h hVar) {
        if (hVar instanceof i) {
            return (i) hVar;
        }
        return new i(hVar.lN());
    }

    @Override // org.jf.dexlib2.e.d.h
    public final org.jf.dexlib2.e.c.a lN() {
        return this.AQ;
    }
}