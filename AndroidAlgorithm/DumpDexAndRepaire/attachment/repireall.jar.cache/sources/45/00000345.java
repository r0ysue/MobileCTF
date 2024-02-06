package org.jf.dexlib2.b.b;

/* compiled from: BaseBooleanEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/c.class */
public abstract class c implements org.jf.dexlib2.e.d.c {
    public int hashCode() {
        return lQ() ? 1 : 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof org.jf.dexlib2.e.d.c) && lQ() == ((org.jf.dexlib2.e.d.c) obj).lQ();
    }

    @Override // org.jf.dexlib2.e.d.c, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(31, gVar.jc());
        if (h != 0) {
            return h;
        }
        return com.b.a.e.a.a(lQ(), ((org.jf.dexlib2.e.d.c) gVar).lQ());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 31;
    }
}