package org.jf.dexlib2.b.b;

/* compiled from: BaseStringEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/o.class */
public abstract class o implements org.jf.dexlib2.e.d.p {
    public int hashCode() {
        return lP().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.d.p) {
            return lP().equals(((org.jf.dexlib2.e.d.p) obj).lP());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.d.p, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(23, gVar.jc());
        if (h != 0) {
            return h;
        }
        return lP().compareTo(((org.jf.dexlib2.e.d.p) gVar).lP());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 23;
    }
}