package org.jf.dexlib2.b.b;

/* compiled from: BaseCharEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/e.class */
public abstract class e implements org.jf.dexlib2.e.d.e {
    public int hashCode() {
        return lS();
    }

    public boolean equals(Object obj) {
        return (obj instanceof org.jf.dexlib2.e.d.e) && lS() == ((org.jf.dexlib2.e.d.e) obj).lS();
    }

    @Override // org.jf.dexlib2.e.d.e, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(3, gVar.jc());
        if (h != 0) {
            return h;
        }
        return lS() - ((org.jf.dexlib2.e.d.e) gVar).lS();
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 3;
    }
}