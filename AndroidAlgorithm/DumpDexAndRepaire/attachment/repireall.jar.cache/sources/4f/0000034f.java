package org.jf.dexlib2.b.b;

/* compiled from: BaseNullEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/m.class */
public abstract class m implements org.jf.dexlib2.e.d.n {
    public int hashCode() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof org.jf.dexlib2.e.d.n;
    }

    @Override // org.jf.dexlib2.e.d.n, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        return com.b.a.e.b.h(30, gVar.jc());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 30;
    }
}