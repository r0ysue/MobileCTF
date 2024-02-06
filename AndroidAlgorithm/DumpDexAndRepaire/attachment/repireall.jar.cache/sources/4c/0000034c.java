package org.jf.dexlib2.b.b;

/* compiled from: BaseIntEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/j.class */
public abstract class j implements org.jf.dexlib2.e.d.k {
    public int hashCode() {
        return getValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof org.jf.dexlib2.e.d.k) && getValue() == ((org.jf.dexlib2.e.d.k) obj).getValue();
    }

    @Override // org.jf.dexlib2.e.d.k, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(4, gVar.jc());
        if (h != 0) {
            return h;
        }
        return com.b.a.e.b.h(getValue(), ((org.jf.dexlib2.e.d.k) gVar).getValue());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 4;
    }
}