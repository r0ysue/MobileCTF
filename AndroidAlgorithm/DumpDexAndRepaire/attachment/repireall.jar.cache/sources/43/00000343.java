package org.jf.dexlib2.b.b;

/* compiled from: BaseAnnotationEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/a.class */
public abstract class a implements org.jf.dexlib2.e.d.a {
    public int hashCode() {
        return (io().hashCode() * 31) + ks().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.d.a) {
            org.jf.dexlib2.e.d.a aVar = (org.jf.dexlib2.e.d.a) obj;
            return io().equals(aVar.io()) && ks().equals(aVar.ks());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.d.a, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(29, gVar.jc());
        if (h != 0) {
            return h;
        }
        org.jf.dexlib2.e.d.a aVar = (org.jf.dexlib2.e.d.a) gVar;
        int compareTo = io().compareTo(aVar.io());
        if (compareTo != 0) {
            return compareTo;
        }
        return org.jf.a.g.a(ks(), aVar.ks());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 29;
    }
}