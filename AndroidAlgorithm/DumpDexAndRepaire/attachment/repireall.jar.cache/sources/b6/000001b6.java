package com.b.a.c;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: Ordering.java */
/* loaded from: repireall.jar:com/b/a/c/bf.class */
public abstract class bf<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public static <C extends Comparable> bf<C> fT() {
        return bd.lJ;
    }

    public static <T> bf<T> c(Comparator<T> comparator) {
        return comparator instanceof bf ? (bf) comparator : new p(comparator);
    }

    public static bf<Object> fU() {
        return ch.nc;
    }

    public <S extends T> bf<S> fS() {
        return new bs(this);
    }

    public final <F> bf<F> a(com.b.a.a.d<F, ? extends T> dVar) {
        return new m(dVar, this);
    }

    public final <E extends T> List<E> a(Iterable<E> iterable) {
        Object[] f = au.f(iterable);
        Arrays.sort(f, this);
        return ax.j(Arrays.asList(f));
    }

    public final <E extends T> ah<E> f(Iterable<E> iterable) {
        Object[] f = au.f(iterable);
        for (Object obj : f) {
            com.b.a.a.i.i(obj);
        }
        Arrays.sort(f, this);
        return ah.b(f);
    }
}