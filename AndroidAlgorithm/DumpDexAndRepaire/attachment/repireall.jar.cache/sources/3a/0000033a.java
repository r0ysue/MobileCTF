package org.jf.dexlib2.b;

import java.util.Comparator;
import org.jf.a.g;

/* compiled from: BaseAnnotation.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/a.class */
public abstract class a implements org.jf.dexlib2.e.a {
    public static final Comparator<? super org.jf.dexlib2.e.a> uj = new Comparator<org.jf.dexlib2.e.a>() { // from class: org.jf.dexlib2.b.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(org.jf.dexlib2.e.a aVar, org.jf.dexlib2.e.a aVar2) {
            return aVar.io().compareTo(aVar2.io());
        }
    };

    public int hashCode() {
        return (((kr() * 31) + io().hashCode()) * 31) + ks().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.a) {
            org.jf.dexlib2.e.a aVar = (org.jf.dexlib2.e.a) obj;
            return kr() == aVar.kr() && io().equals(aVar.io()) && ks().equals(aVar.ks());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.a, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.a aVar) {
        int h = com.b.a.e.b.h(kr(), aVar.kr());
        if (h != 0) {
            return h;
        }
        int compareTo = io().compareTo(aVar.io());
        if (compareTo != 0) {
            return compareTo;
        }
        return g.a(ks(), aVar.ks());
    }
}