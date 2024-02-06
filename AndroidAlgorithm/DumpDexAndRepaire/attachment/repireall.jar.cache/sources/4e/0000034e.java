package org.jf.dexlib2.b.b;

/* compiled from: BaseMethodEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/l.class */
public abstract class l implements org.jf.dexlib2.e.d.m {
    public int hashCode() {
        return lO().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.d.m) {
            return lO().equals(((org.jf.dexlib2.e.d.m) obj).lO());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.d.m, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(26, gVar.jc());
        if (h != 0) {
            return h;
        }
        return lO().compareTo(((org.jf.dexlib2.e.d.m) gVar).lO());
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 26;
    }
}