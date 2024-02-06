package com.b.a.c;

import java.util.ListIterator;

/* compiled from: UnmodifiableListIterator.java */
/* loaded from: repireall.jar:com/b/a/c/cg.class */
public abstract class cg<E> extends cf<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}