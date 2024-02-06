package org.jf.dexlib2.b.b;

/* compiled from: BaseShortEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/n.class */
public abstract class n implements org.jf.dexlib2.e.d.o {
    public int hashCode() {
        return lV();
    }

    public boolean equals(Object obj) {
        return (obj instanceof org.jf.dexlib2.e.d.o) && lV() == ((org.jf.dexlib2.e.d.o) obj).lV();
    }

    @Override // org.jf.dexlib2.e.d.o, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(2, gVar.jc());
        if (h != 0) {
            return h;
        }
        return lV() - ((org.jf.dexlib2.e.d.o) gVar).lV();
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 2;
    }
}