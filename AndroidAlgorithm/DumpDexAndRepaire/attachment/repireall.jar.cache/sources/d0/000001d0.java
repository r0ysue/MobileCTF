package com.b.a.c;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReverseOrdering.java */
/* loaded from: repireall.jar:com/b/a/c/bs.class */
public final class bs<T> extends bf<T> implements Serializable {
    private bf<? super T> my;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bs(bf<? super T> bfVar) {
        this.my = (bf) com.b.a.a.i.i(bfVar);
    }

    @Override // com.b.a.c.bf, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.my.compare(t2, t);
    }

    @Override // com.b.a.c.bf
    public final <S extends T> bf<S> fS() {
        return (bf<? super T>) this.my;
    }

    public final int hashCode() {
        return -this.my.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bs) {
            return this.my.equals(((bs) obj).my);
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(String.valueOf(this.my));
        return new StringBuilder(10 + valueOf.length()).append(valueOf).append(".reverse()").toString();
    }
}