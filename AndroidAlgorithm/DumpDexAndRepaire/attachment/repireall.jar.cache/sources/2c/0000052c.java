package org.jf.dexlib2.f.e;

/* compiled from: ImmutableLongEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/m.class */
public class m extends org.jf.dexlib2.b.b.k implements g {
    private long iH;

    public m(long j) {
        this.iH = j;
    }

    public static m a(org.jf.dexlib2.e.d.l lVar) {
        if (lVar instanceof m) {
            return (m) lVar;
        }
        return new m(lVar.ln());
    }

    @Override // org.jf.dexlib2.e.d.l
    public final long ln() {
        return this.iH;
    }
}