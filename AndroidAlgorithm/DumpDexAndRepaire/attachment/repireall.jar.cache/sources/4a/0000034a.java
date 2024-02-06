package org.jf.dexlib2.b.b;

/* compiled from: BaseFieldEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/h.class */
public abstract class h implements org.jf.dexlib2.e.d.i {
    public int hashCode() {
        return lN().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.d.i) {
            return lN().equals(((org.jf.dexlib2.e.d.i) obj).lN());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.d.i, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(25, gVar.jc());
        if (h != 0) {
            return h;
        }
        return lN().compareTo(((org.jf.dexlib2.e.d.i) gVar).lN());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 25;
    }
}