package org.jf.dexlib2.b.b;

/* compiled from: BaseByteEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/d.class */
public abstract class d implements org.jf.dexlib2.e.d.d {
    public int hashCode() {
        return lR();
    }

    public boolean equals(Object obj) {
        return (obj instanceof org.jf.dexlib2.e.d.d) && lR() == ((org.jf.dexlib2.e.d.d) obj).lR();
    }

    @Override // org.jf.dexlib2.e.d.d, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(0, gVar.jc());
        if (h != 0) {
            return h;
        }
        return com.b.a.e.b.h(lR(), ((org.jf.dexlib2.e.d.d) gVar).lR());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 0;
    }
}