package org.jf.dexlib2.b.a;

import com.b.a.c.bf;
import org.jf.a.g;

/* compiled from: BaseMethodReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/a/c.class */
public abstract class c implements org.jf.dexlib2.e.c.c {
    @Override // org.jf.dexlib2.e.c.c
    public int hashCode() {
        return (((((iG().hashCode() * 31) + bf().hashCode()) * 31) + iI().hashCode()) * 31) + iH().hashCode();
    }

    @Override // org.jf.dexlib2.e.c.c
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof org.jf.dexlib2.e.c.c)) {
            org.jf.dexlib2.e.c.c cVar = (org.jf.dexlib2.e.c.c) obj;
            return iG().equals(cVar.iG()) && bf().equals(cVar.bf()) && iI().equals(cVar.iI()) && org.jf.a.e.a(iH(), cVar.iH());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.c.c, java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(org.jf.dexlib2.e.c.c cVar) {
        int compareTo = iG().compareTo(cVar.iG());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = bf().compareTo(cVar.bf());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        int compareTo3 = iI().compareTo(cVar.iI());
        if (compareTo3 != 0) {
            return compareTo3;
        }
        return g.a(bf.fU(), iH(), cVar.iH());
    }

    public String toString() {
        return org.jf.dexlib2.h.g.b(this, false);
    }
}