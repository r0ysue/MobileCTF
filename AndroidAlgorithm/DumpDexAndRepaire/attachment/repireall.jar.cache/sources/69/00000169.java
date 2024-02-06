package com.b.a.c;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: Lists.java */
/* loaded from: repireall.jar:com/b/a/c/ax.class */
public final class ax {
    public static <E> ArrayList<E> d(E... eArr) {
        com.b.a.a.i.i(eArr);
        int length = eArr.length;
        n.c(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(com.b.a.e.b.g(5 + length + (length / 10)));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> j(Iterable<? extends E> iterable) {
        com.b.a.a.i.i(iterable);
        return iterable instanceof Collection ? new ArrayList<>(o.a(iterable)) : o(iterable.iterator());
    }

    public static <F, T> List<T> a(List<F> list, com.b.a.a.d<? super F, ? extends T> dVar) {
        return list instanceof RandomAccess ? new c(list, dVar) : new d(list, dVar);
    }

    /* compiled from: Lists.java */
    /* loaded from: repireall.jar:com/b/a/c/ax$d.class */
    private static class d<F, T> extends AbstractSequentialList<T> implements Serializable {
        private List<F> kI;
        final com.b.a.a.d<? super F, ? extends T> kL;

        d(List<F> list, com.b.a.a.d<? super F, ? extends T> dVar) {
            this.kI = (List) com.b.a.a.i.i(list);
            this.kL = (com.b.a.a.d) com.b.a.a.i.i(dVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.kI.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.kI.size();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new cb<F, T>(this.kI.listIterator(i)) { // from class: com.b.a.c.ax.d.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.b.a.c.ca
                public final T y(F f) {
                    return d.this.kL.apply(f);
                }
            };
        }
    }

    /* compiled from: Lists.java */
    /* loaded from: repireall.jar:com/b/a/c/ax$c.class */
    private static class c<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private List<F> kI;
        final com.b.a.a.d<? super F, ? extends T> kJ;

        c(List<F> list, com.b.a.a.d<? super F, ? extends T> dVar) {
            this.kI = (List) com.b.a.a.i.i(list);
            this.kJ = (com.b.a.a.d) com.b.a.a.i.i(dVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.kI.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.kJ.apply((F) this.kI.get(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new cb<F, T>(this.kI.listIterator(i)) { // from class: com.b.a.c.ax.c.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.b.a.c.ca
                public final T y(F f) {
                    return c.this.kJ.apply(f);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.kI.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.kJ.apply((F) this.kI.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.kI.size();
        }
    }

    public static <T> List<T> b(List<T> list) {
        if (list instanceof ah) {
            return ((ah) list).eZ();
        }
        if (list instanceof b) {
            return ((b) list).fr();
        }
        if (list instanceof RandomAccess) {
            return new a(list);
        }
        return new b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Lists.java */
    /* loaded from: repireall.jar:com/b/a/c/ax$b.class */
    public static class b<T> extends AbstractList<T> {
        private final List<T> kE;

        b(List<T> list) {
            this.kE = (List) com.b.a.a.i.i(list);
        }

        final List<T> fr() {
            return this.kE;
        }

        private int T(int i) {
            int size = size();
            com.b.a.a.i.a(i, size);
            return (size - 1) - i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int V(int i) {
            int size = size();
            com.b.a.a.i.b(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, T t) {
            this.kE.add(V(i), t);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.kE.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.kE.remove(T(i));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i, T t) {
            return this.kE.set(T(i), t);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.kE.get(T(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.kE.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
            com.b.a.a.i.a(i, i2, size());
            return ax.b(this.kE.subList(V(i2), V(i)));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            final ListIterator<T> listIterator = this.kE.listIterator(V(i));
            return new ListIterator<T>() { // from class: com.b.a.c.ax.b.1
                private boolean kF;

                @Override // java.util.ListIterator
                public final void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.kF = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.kF = true;
                    return (T) listIterator.previous();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
                    return b.this.V(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                public final T previous() {
                    if (!hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.kF = true;
                    return (T) listIterator.next();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
                    com.b.a.a.i.b(this.kF, "no calls to next() since the last call to remove()");
                    listIterator.remove();
                    this.kF = false;
                }

                @Override // java.util.ListIterator
                public final void set(T t) {
                    com.b.a.a.i.A(this.kF);
                    listIterator.set(t);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Lists.java */
    /* loaded from: repireall.jar:com/b/a/c/ax$a.class */
    public static class a<T> extends b<T> implements RandomAccess {
        a(List<T> list) {
            super(list);
        }
    }

    public static <E> ArrayList<E> o(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        av.a(arrayList, it);
        return arrayList;
    }
}