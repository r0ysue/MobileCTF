package com.b.a.c;

import java.util.Iterator;

/* compiled from: TransformedIterator.java */
/* loaded from: repireall.jar:com/b/a/c/ca.class */
abstract class ca<F, T> implements Iterator<T> {
    final Iterator<? extends F> mE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T y(F f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ca(Iterator<? extends F> it) {
        this.mE = (Iterator) com.b.a.a.i.i(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.mE.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return y(this.mE.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.mE.remove();
    }
}