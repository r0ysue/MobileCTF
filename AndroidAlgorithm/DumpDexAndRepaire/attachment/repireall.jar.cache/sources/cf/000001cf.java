package com.b.a.c;

import java.io.Serializable;

/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: repireall.jar:com/b/a/c/br.class */
final class br extends bf<Comparable> implements Serializable {
    static final br mx = new br();

    @Override // com.b.a.c.bf, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        com.b.a.a.i.i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private br() {
    }

    @Override // com.b.a.c.bf
    public final <S extends Comparable> bf<S> fS() {
        return bd.lJ;
    }
}