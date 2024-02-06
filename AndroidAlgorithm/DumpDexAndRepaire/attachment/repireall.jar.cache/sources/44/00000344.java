package org.jf.dexlib2.b.b;

import java.util.Iterator;
import java.util.List;

/* compiled from: BaseArrayEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b/b.class */
public abstract class b implements org.jf.dexlib2.e.d.b {
    public int hashCode() {
        return lM().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.d.b) {
            return lM().equals(((org.jf.dexlib2.e.d.b) obj).lM());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.d.b, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.d.g gVar) {
        int h = com.b.a.e.b.h(28, gVar.jc());
        if (h != 0) {
            return h;
        }
        List<? extends org.jf.dexlib2.e.d.g> lM = lM();
        List<? extends org.jf.dexlib2.e.d.g> lM2 = ((org.jf.dexlib2.e.d.b) gVar).lM();
        int h2 = com.b.a.e.b.h(lM.size(), lM2.size());
        if (h2 != 0) {
            return h2;
        }
        Iterator<? extends org.jf.dexlib2.e.d.g> it = lM2.iterator();
        for (org.jf.dexlib2.e.d.g gVar2 : lM) {
            int compareTo = gVar2.compareTo(it.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    @Override // org.jf.dexlib2.e.d.g
    public final int jc() {
        return 28;
    }
}