package org.jf.dexlib2.b.b;

/* compiled from: BaseDoubleEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/f.class */
public abstract class f implements org.jf.dexlib2.e.d.f {
    public int hashCode() {
        long doubleToRawLongBits = Double.doubleToRawLongBits(lT());
        return (int) (doubleToRawLongBits ^ (doubleToRawLongBits >>> 32));
    }

    public boolean equals(Object obj) {
        return (obj instanceof org.jf.dexlib2.e.d.f) && Double.doubleToRawLongBits(lT()) == Double.doubleToRawLongBits(((org.jf.dexlib2.e.d.f) obj).lT());
    }

    @Override // org.jf.dexlib2.e.d.f, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(17, gVar.jc());
        if (h != 0) {
            return h;
        }
        return Double.compare(lT(), ((org.jf.dexlib2.e.d.f) gVar).lT());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 17;
    }
}