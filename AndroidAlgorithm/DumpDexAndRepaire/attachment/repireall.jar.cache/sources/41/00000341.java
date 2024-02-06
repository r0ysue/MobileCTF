package org.jf.dexlib2.b;

import java.util.Comparator;

/* compiled from: BaseAnnotationElement.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/b.class */
public abstract class b implements org.jf.dexlib2.e.b {
    public static final Comparator<org.jf.dexlib2.e.b> uk = new Comparator<org.jf.dexlib2.e.b>() { // from class: org.jf.dexlib2.b.b.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(org.jf.dexlib2.e.b bVar, org.jf.dexlib2.e.b bVar2) {
            return bVar.bf().compareTo(bVar2.bf());
        }
    };

    public int hashCode() {
        return (bf().hashCode() * 31) + kt().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof org.jf.dexlib2.e.b)) {
            org.jf.dexlib2.e.b bVar = (org.jf.dexlib2.e.b) obj;
            return bf().equals(bVar.bf()) && kt().equals(bVar.kt());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.b, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.b bVar) {
        int compareTo = bf().compareTo(bVar.bf());
        if (compareTo != 0) {
            return compareTo;
        }
        return kt().compareTo(bVar.kt());
    }
}