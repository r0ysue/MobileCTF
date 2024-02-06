package com.b.a.c;

import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator.java */
/* loaded from: repireall.jar:com/b/a/c/a.class */
abstract class a<E> extends cg<E> {
    private final int iK;
    private int iL;

    protected abstract E get(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i, int i2) {
        com.b.a.a.i.b(i2, i);
        this.iK = i;
        this.iL = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.iL < this.iK;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.iL;
        this.iL = i + 1;
        return get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.iL;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.iL > 0;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.iL - 1;
        this.iL = i;
        return get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.iL - 1;
    }
}