package com.b.a.c;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

/* compiled from: Iterators.java */
/* loaded from: repireall.jar:com/b/a/c/av.class */
public final class av {
    private static cg<Object> ko = new cg<Object>() { // from class: com.b.a.c.av.1
        @Override // java.util.Iterator, java.util.ListIterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, java.util.ListIterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return false;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return 0;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return -1;
        }
    };

    static {
        new Iterator<Object>() { // from class: com.b.a.c.av.4
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.b.a.a.i.b(false, "no calls to next() since the last call to remove()");
            }
        };
    }

    public static int g(Iterator<?> it) {
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }

    public static boolean a(Iterator<?> it, Object obj) {
        return b(it, com.b.a.a.k.j(obj));
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        com.b.a.a.j c = com.b.a.a.k.c(collection);
        com.b.a.a.i.i(c);
        boolean z = false;
        while (it.hasNext()) {
            if (c.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            r0 = r3
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2f
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r3
            java.lang.Object r0 = r0.next()
            r5 = r0
            r0 = r4
            java.lang.Object r0 = r0.next()
            r6 = r0
            r0 = r5
            r1 = r6
            boolean r0 = com.b.a.a.h.e(r0, r1)
            if (r0 != 0) goto L2c
            r0 = 0
            return r0
        L2c:
            goto L0
        L2f:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L3a
            r0 = 1
            return r0
        L3a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.c.av.a(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static String h(Iterator<?> it) {
        return o.jr.a(new StringBuilder("["), it).append(']').toString();
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        com.b.a.a.i.i(collection);
        com.b.a.a.i.i(it);
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (it.hasNext()) {
                z = z2 | collection.add(it.next());
            } else {
                return z2;
            }
        }
    }

    public static <T> Iterator<T> b(Iterator<? extends T> it, Iterator<? extends T> it2) {
        return i(ah.j(it, it2).iterator());
    }

    public static <T> Iterator<T> i(final Iterator<? extends Iterator<? extends T>> it) {
        com.b.a.a.i.i(it);
        return new Iterator<T>() { // from class: com.b.a.c.av.5
            private Iterator<? extends T> kt = av.fq();
            private Iterator<? extends T> ku;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                boolean hasNext;
                while (true) {
                    hasNext = ((Iterator) com.b.a.a.i.i(this.kt)).hasNext();
                    if (hasNext || !it.hasNext()) {
                        break;
                    }
                    this.kt = (Iterator) it.next();
                }
                return hasNext;
            }

            @Override // java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.ku = this.kt;
                return this.kt.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.b.a.a.i.b(this.ku != null, "no calls to next() since the last call to remove()");
                this.ku.remove();
                this.ku = null;
            }
        };
    }

    public static <T> cf<T> a(final Iterator<T> it, final com.b.a.a.j<? super T> jVar) {
        com.b.a.a.i.i(it);
        com.b.a.a.i.i(jVar);
        return new com.b.a.c.b<T>() { // from class: com.b.a.c.av.6
            @Override // com.b.a.c.b
            protected final T cR() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (jVar.apply(t)) {
                        return t;
                    }
                }
                return dV();
            }
        };
    }

    public static <T> boolean b(Iterator<T> it, com.b.a.a.j<? super T> jVar) {
        return c(it, jVar) != -1;
    }

    private static <T> int c(Iterator<T> it, com.b.a.a.j<? super T> jVar) {
        com.b.a.a.i.a(jVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (!jVar.apply(it.next())) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static <F, T> Iterator<T> a(Iterator<F> it, final com.b.a.a.d<? super F, ? extends T> dVar) {
        com.b.a.a.i.i(dVar);
        return new ca<F, T>(it) { // from class: com.b.a.c.av.7
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.b.a.c.ca
            public final T y(F f) {
                return (T) dVar.apply(f);
            }
        };
    }

    public static <T> T a(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T j(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> Iterator<T> a(final Iterator<T> it, final int i) {
        com.b.a.a.i.i(it);
        com.b.a.a.i.a(i >= 0, "limit is negative");
        return new Iterator<T>() { // from class: com.b.a.c.av.8
            private int hO;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.hO < i && it.hasNext();
            }

            @Override // java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.hO++;
                return (T) it.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                it.remove();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T k(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(Iterator<?> it) {
        com.b.a.a.i.i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> cf<T> c(T... tArr) {
        return a(tArr, 0, tArr.length, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> cg<T> a(final T[] tArr, final int i, int i2, int i3) {
        com.b.a.a.i.z(i2 >= 0);
        com.b.a.a.i.a(i, i + i2, tArr.length);
        com.b.a.a.i.b(i3, i2);
        if (i2 != 0) {
            return new com.b.a.c.a<T>(i2, i3) { // from class: com.b.a.c.av.2
                @Override // com.b.a.c.a
                protected final T get(int i4) {
                    return (T) tArr[i + i4];
                }
            };
        }
        return (cg<T>) ko;
    }

    public static <T> cf<T> z(final T t) {
        return new cf<T>() { // from class: com.b.a.c.av.3
            private boolean kr;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return !this.kr;
            }

            @Override // java.util.Iterator
            public final T next() {
                if (this.kr) {
                    throw new NoSuchElementException();
                }
                this.kr = true;
                return (T) t;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Iterators.java */
    /* loaded from: repireall.jar:com/b/a/c/av$b.class */
    public static class b<E> implements bg<E> {
        private final Iterator<? extends E> kB;
        private boolean kC;
        private E kD;

        public b(Iterator<? extends E> it) {
            this.kB = (Iterator) com.b.a.a.i.i(it);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.kC || this.kB.hasNext();
        }

        @Override // com.b.a.c.bg, java.util.Iterator
        public final E next() {
            if (!this.kC) {
                return this.kB.next();
            }
            E e = this.kD;
            this.kC = false;
            this.kD = null;
            return e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.b.a.a.i.b(!this.kC, "Can't remove after you've peeked at next");
            this.kB.remove();
        }

        @Override // com.b.a.c.bg
        public final E peek() {
            if (!this.kC) {
                this.kD = this.kB.next();
                this.kC = true;
            }
            return this.kD;
        }
    }

    public static <T> bg<T> m(Iterator<? extends T> it) {
        if (it instanceof b) {
            return (b) it;
        }
        return new b(it);
    }

    public static <T> cf<T> a(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        com.b.a.a.i.a(iterable, "iterators");
        com.b.a.a.i.a(comparator, "comparator");
        return new a(iterable, comparator);
    }

    /* compiled from: Iterators.java */
    /* loaded from: repireall.jar:com/b/a/c/av$a.class */
    private static class a<T> extends cf<T> {
        private Queue<bg<T>> ky;

        public a(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.ky = new PriorityQueue(2, new Comparator<bg<T>>() { // from class: com.b.a.c.av.a.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return comparator.compare(((bg) obj).peek(), ((bg) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.ky.add(av.m(it));
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.ky.isEmpty();
        }

        @Override // java.util.Iterator
        public final T next() {
            bg<T> remove = this.ky.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.ky.add(remove);
            }
            return next;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ListIterator<T> n(Iterator<T> it) {
        return (ListIterator) it;
    }

    @Deprecated
    public static <T> cf<T> fq() {
        return ko;
    }
}