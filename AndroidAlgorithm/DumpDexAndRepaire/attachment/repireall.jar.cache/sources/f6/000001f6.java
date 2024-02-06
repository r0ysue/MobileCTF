package com.b.a.c;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator.java */
/* loaded from: repireall.jar:com/b/a/c/cf.class */
public abstract class cf<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}