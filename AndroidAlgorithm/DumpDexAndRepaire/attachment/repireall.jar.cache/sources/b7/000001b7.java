package com.b.a.c;

import java.util.Iterator;

/* compiled from: PeekingIterator.java */
/* loaded from: repireall.jar:com/b/a/c/bg.class */
public interface bg<E> extends Iterator<E> {
    E peek();

    @Override // java.util.Iterator
    E next();
}