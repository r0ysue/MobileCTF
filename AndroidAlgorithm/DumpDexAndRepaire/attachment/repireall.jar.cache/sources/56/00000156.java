package com.b.a.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: Iterables.java */
/* loaded from: repireall.jar:com/b/a/c/au.class */
public final class au {
    static /* synthetic */ Iterator i(Iterable iterable) {
        return new ca<Iterable<? extends T>, Iterator<? extends T>>(iterable.iterator()) { // from class: com.b.a.c.au.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.b.a.c.ca
            public final /* synthetic */ Object y(Object obj) {
                return ((Iterable) obj).iterator();
            }
        };
    }

    public static int e(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : av.g(iterable.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] f(Iterable<?> iterable) {
        return (iterable instanceof Collection ? (Collection) iterable : ax.o(iterable.iterator())).toArray();
    }

    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(o.a(iterable));
        }
        return av.a(collection, ((Iterable) com.b.a.a.i.i(iterable)).iterator());
    }

    public static <T> Iterable<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return g(ah.j(iterable, iterable2));
    }

    public static <T> Iterable<T> g(final Iterable<? extends Iterable<? extends T>> iterable) {
        com.b.a.a.i.i(iterable);
        return new x<T>() { // from class: com.b.a.c.au.2
            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return av.i(au.i(iterable));
            }
        };
    }

    public static <T> Iterable<T> a(final Iterable<T> iterable, final com.b.a.a.j<? super T> jVar) {
        com.b.a.a.i.i(iterable);
        com.b.a.a.i.i(jVar);
        return new x<T>() { // from class: com.b.a.c.au.4
            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return av.a((Iterator) iterable.iterator(), jVar);
            }
        };
    }

    public static <T> boolean a(Iterable<T> iterable, com.b.a.a.j<? super T> jVar) {
        return av.b(iterable.iterator(), jVar);
    }

    public static <F, T> Iterable<T> a(final Iterable<F> iterable, final com.b.a.a.d<? super F, ? extends T> dVar) {
        com.b.a.a.i.i(iterable);
        com.b.a.a.i.i(dVar);
        return new x<T>() { // from class: com.b.a.c.au.5
            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return av.a((Iterator) iterable.iterator(), dVar);
            }
        };
    }

    public static <T> T a(Iterable<? extends T> iterable, T t) {
        return (T) av.a((Iterator<? extends Object>) iterable.iterator(), (Object) null);
    }

    public static <T> T a(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) list.get(list.size() - 1);
        }
        return (T) av.j(iterable.iterator());
    }

    public static boolean h(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}