package org.jf.dexlib2.b.b;

/* compiled from: BaseFloatEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/i.class */
public abstract class i implements org.jf.dexlib2.e.d.j {
    public int hashCode() {
        return Float.floatToRawIntBits(lU());
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof org.jf.dexlib2.e.d.j) && Float.floatToRawIntBits(lU()) == Float.floatToRawIntBits(((org.jf.dexlib2.e.d.j) obj).lU());
    }

    @Override // org.jf.dexlib2.e.d.j, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(16, gVar.jc());
        if (h != 0) {
            return h;
        }
        return Float.compare(lU(), ((org.jf.dexlib2.e.d.j) gVar).lU());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 16;
    }
}