package org.jf.dexlib2.b.b;

/* compiled from: BaseLongEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/k.class */
public abstract class k implements org.jf.dexlib2.e.d.l {
    public int hashCode() {
        long ln = ln();
        return (((int) ln) * 31) + ((int) (ln >>> 32));
    }

    public boolean equals(Object obj) {
        return (obj instanceof org.jf.dexlib2.e.d.l) && ln() == ((org.jf.dexlib2.e.d.l) obj).ln();
    }

    @Override // org.jf.dexlib2.e.d.l, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(6, gVar.jc());
        if (h != 0) {
            return h;
        }
        long ln = ln();
        long ln2 = ((org.jf.dexlib2.e.d.l) gVar).ln();
        if (ln < ln2) {
            return -1;
        }
        return ln > ln2 ? 1 : 0;
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 6;
    }
}