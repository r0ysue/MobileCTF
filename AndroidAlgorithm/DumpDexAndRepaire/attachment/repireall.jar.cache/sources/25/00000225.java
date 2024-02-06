package com.b.a.c;

import java.util.Iterator;

/* compiled from: FluentIterable.java */
/* loaded from: repireall.jar:com/b/a/c/x.class */
public abstract class x<E> implements Iterable<E> {
    private final Iterable<E> jE;

    /* JADX INFO: Access modifiers changed from: protected */
    public x() {
        this.jE = this;
    }

    x(Iterable<E> iterable) {
        this.jE = (Iterable) com.b.a.a.i.i(iterable);
    }

    public static <E> x<E> b(final Iterable<E> iterable) {
        return iterable instanceof x ? (x) iterable : new x<E>(iterable) { // from class: com.b.a.c.x.1
            @Override // java.lang.Iterable
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public String toString() {
        return av.h(this.jE.iterator());
    }

    public final x<E> a(com.b.a.a.j<? super E> jVar) {
        return b(au.a(this.jE, jVar));
    }

    public final <T> x<T> a(com.b.a.a.d<? super E, T> dVar) {
        return b(au.a(this.jE, dVar));
    }

    public final x<E> Q(final int i) {
        final Iterable<E> iterable = this.jE;
        com.b.a.a.i.i(iterable);
        com.b.a.a.i.a(i >= 0, "limit is negative");
        return b(new x<T>() { // from class: com.b.a.c.au.1
            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return av.a(iterable.iterator(), i);
            }
        });
    }
}