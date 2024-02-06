package com.b.a.c;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NaturalOrdering.java */
/* loaded from: repireall.jar:com/b/a/c/bd.class */
public final class bd extends bf<Comparable> implements Serializable {
    static final bd lJ = new bd();

    @Override // com.b.a.c.bf, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        com.b.a.a.i.i(comparable);
        com.b.a.a.i.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.b.a.c.bf
    public final <S extends Comparable> bf<S> fS() {
        return br.mx;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    private bd() {
    }
}