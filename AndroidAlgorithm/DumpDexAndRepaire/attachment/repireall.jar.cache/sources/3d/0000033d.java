package org.jf.dexlib2.b.a;

import com.b.a.c.bf;
import org.jf.a.g;

/* compiled from: BaseMethodProtoReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/a/b.class */
public abstract class b implements org.jf.dexlib2.e.c.b {
    public int hashCode() {
        return (iI().hashCode() * 31) + iH().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.c.b) {
            org.jf.dexlib2.e.c.b bVar = (org.jf.dexlib2.e.c.b) obj;
            return iI().equals(bVar.iI()) && org.jf.a.e.a(iH(), bVar.iH());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.c.b, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.c.b bVar) {
        int compareTo = iI().compareTo(bVar.iI());
        if (compareTo != 0) {
            return compareTo;
        }
        return g.a(bf.fU(), iH(), bVar.iH());
    }

    public String toString() {
        return org.jf.dexlib2.h.g.c(this);
    }
}