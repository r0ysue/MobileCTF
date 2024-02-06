package org.jf.dexlib2.b.a;

import org.jf.dexlib2.h.g;

/* compiled from: BaseFieldReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/a/a.class */
public abstract class a implements org.jf.dexlib2.e.c.a {
    @Override // org.jf.dexlib2.e.c.a
    public int hashCode() {
        return (((iG().hashCode() * 31) + bf().hashCode()) * 31) + io().hashCode();
    }

    @Override // org.jf.dexlib2.e.c.a
    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.c.a) {
            org.jf.dexlib2.e.c.a aVar = (org.jf.dexlib2.e.c.a) obj;
            return iG().equals(aVar.iG()) && bf().equals(aVar.bf()) && io().equals(aVar.io());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.c.a, java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(org.jf.dexlib2.e.c.a aVar) {
        int compareTo = iG().compareTo(aVar.iG());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = bf().compareTo(aVar.bf());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return io().compareTo(aVar.io());
    }

    public String toString() {
        return g.a((org.jf.dexlib2.e.c.a) this, false);
    }
}