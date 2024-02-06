package org.jf.dexlib2.b.b;

import org.jf.dexlib2.e.d.q;

/* compiled from: BaseTypeEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/p.class */
public abstract class p implements q {
    public int hashCode() {
        return lP().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return lP().equals(((q) obj).lP());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.d.q, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(24, gVar.jc());
        if (h != 0) {
            return h;
        }
        return lP().compareTo(((q) gVar).lP());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 24;
    }
}