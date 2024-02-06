package org.jf.dexlib2.f.a;

/* compiled from: ImmutableEndLocal.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/a/b.class */
public final class b extends a implements org.jf.dexlib2.e.a.b {
    private int uT;
    private String cW;
    private String eb;
    private String Aq;

    public b(int i, int i2, String str, String str2, String str3) {
        super(i);
        this.uT = i2;
        this.cW = str;
        this.eb = str2;
        this.Aq = str3;
    }

    @Override // org.jf.dexlib2.e.a.b
    public final int jB() {
        return this.uT;
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String bf() {
        return this.cW;
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String io() {
        return this.eb;
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String jb() {
        return this.Aq;
    }

    @Override // org.jf.dexlib2.e.a.a
    public final int jC() {
        return 5;
    }
}