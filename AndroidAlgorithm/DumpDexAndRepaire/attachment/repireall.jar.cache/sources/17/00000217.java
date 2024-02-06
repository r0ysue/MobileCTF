package com.b.a.c;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComparatorOrdering.java */
/* loaded from: repireall.jar:com/b/a/c/p.class */
public final class p<T> extends bf<T> implements Serializable {
    private Comparator<T> js;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Comparator<T> comparator) {
        this.js = (Comparator) com.b.a.a.i.i(comparator);
    }

    @Override // com.b.a.c.bf, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.js.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.js.equals(((p) obj).js);
        }
        return false;
    }

    public final int hashCode() {
        return this.js.hashCode();
    }

    public final String toString() {
        return this.js.toString();
    }
}