package org.jf.dexlib2.f.c;

/* compiled from: ImmutableFieldReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/c/a.class */
public final class a extends org.jf.dexlib2.b.a.a implements d {
    private String sD;
    private String cW;
    private String eb;

    public a(String str, String str2, String str3) {
        this.sD = str;
        this.cW = str2;
        this.eb = str3;
    }

    public static a d(org.jf.dexlib2.e.c.a aVar) {
        if (aVar instanceof a) {
            return (a) aVar;
        }
        return new a(aVar.iG(), aVar.bf(), aVar.io());
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String iG() {
        return this.sD;
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String bf() {
        return this.cW;
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String io() {
        return this.eb;
    }
}