package com.b.a.c;

import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransformedListIterator.java */
/* loaded from: repireall.jar:com/b/a/c/cb.class */
public abstract class cb<F, T> extends ca<F, T> implements ListIterator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public cb(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return av.n(this.mE).hasPrevious();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) y(av.n(this.mE).previous());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return av.n(this.mE).nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return av.n(this.mE).previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}