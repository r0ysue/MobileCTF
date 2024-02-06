package org.jf.dexlib2.f.e;

/* compiled from: ImmutableShortEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/p.class */
public class p extends org.jf.dexlib2.b.b.n implements g {
    private short AU;

    public p(short s) {
        this.AU = s;
    }

    public static p a(org.jf.dexlib2.e.d.o oVar) {
        if (oVar instanceof p) {
            return (p) oVar;
        }
        return new p(oVar.lV());
    }

    @Override // org.jf.dexlib2.e.d.o
    public final short lV() {
        return this.AU;
    }
}