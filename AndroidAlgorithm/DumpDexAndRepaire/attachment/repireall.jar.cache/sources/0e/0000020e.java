package com.b.a.c;

import java.util.NoSuchElementException;

/* compiled from: AbstractSequentialIterator.java */
/* loaded from: repireall.jar:com/b/a/c/i.class */
public abstract class i<T> extends cf<T> {
    private T jn;

    protected abstract T o(T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public i(T t) {
        this.jn = t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.jn != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return this.jn;
        } finally {
            this.jn = o(this.jn);
        }
    }
}