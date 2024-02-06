package org.jf.dexlib2.b.b;

/* compiled from: BaseEnumEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/g.class */
public abstract class g implements org.jf.dexlib2.e.d.h {
    public int hashCode() {
        return lN().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.d.h) {
            return lN().equals(((org.jf.dexlib2.e.d.h) obj).lN());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.d.h, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(27, gVar.jc());
        if (h != 0) {
            return h;
        }
        return lN().compareTo(((org.jf.dexlib2.e.d.h) gVar).lN());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 27;
    }
}