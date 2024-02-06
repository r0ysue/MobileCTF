package com.b.a.c;

import com.b.a.c.af;
import com.b.a.c.ao;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: ImmutableSortedSet.java */
/* loaded from: repireall.jar:com/b/a/c/as.class */
public abstract class as<E> extends at<E> implements bx<E>, NavigableSet<E> {
    private static final Comparator<Comparable> kd = bf.fT();
    private static final as<Comparable> ke = new w(kd);
    final transient Comparator<? super E> kf;
    private transient as<E> kg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract as<E> a(E e, boolean z);

    abstract as<E> a(E e, boolean z, E e2, boolean z2);

    abstract as<E> b(E e, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: eD */
    public abstract cf<E> descendingIterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int indexOf(Object obj);

    @Override // com.b.a.c.ao, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> as<E> b(Comparator<? super E> comparator) {
        if (!kd.equals(comparator)) {
            return new w(comparator);
        }
        return (as<E>) ke;
    }

    public static <E> as<E> d(Iterable<? extends E> iterable) {
        return a(bf.fT(), iterable);
    }

    public static <E> as<E> e(Collection<? extends E> collection) {
        return a(bf.fT(), collection);
    }

    public static <E> as<E> a(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new a(comparator).f(it).fm();
    }

    private static <E> as<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        com.b.a.a.i.i(comparator);
        if (by.b(comparator, iterable) && (iterable instanceof as)) {
            as<E> asVar = (as) iterable;
            if (!asVar.eF()) {
                return asVar;
            }
        }
        Object[] f = au.f(iterable);
        return a(comparator, f.length, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> as<E> a(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return b(comparator);
        }
        be.e(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = (Object) eArr[i3];
            if (comparator.compare(obj, (Object) eArr[i2 - 1]) != 0) {
                int i4 = i2;
                i2++;
                eArr[i4] = obj;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        return new bq(ah.b(eArr, i2), comparator);
    }

    /* compiled from: ImmutableSortedSet.java */
    /* loaded from: repireall.jar:com/b/a/c/as$a.class */
    public static final class a<E> extends ao.a<E> {
        private final Comparator<? super E> kh;

        @Override // com.b.a.c.ao.a
        public final /* bridge */ /* synthetic */ ao.a e(Iterator it) {
            super.a(it);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.b.a.c.ao.a
        public final /* bridge */ /* synthetic */ ao.a x(Object obj) {
            super.t(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.b.a.c.ao.a, com.b.a.c.af.a
        public final /* synthetic */ af.a s(Object obj) {
            super.t(obj);
            return this;
        }

        @Override // com.b.a.c.ao.a, com.b.a.c.af.b
        public final /* synthetic */ af.b a(Iterator it) {
            super.a(it);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.b.a.c.ao.a, com.b.a.c.af.a, com.b.a.c.af.b
        public final /* synthetic */ af.b t(Object obj) {
            super.t(obj);
            return this;
        }

        public a(Comparator<? super E> comparator) {
            this.kh = (Comparator) com.b.a.a.i.i(comparator);
        }

        public final a<E> f(Iterator<? extends E> it) {
            super.a(it);
            return this;
        }

        @Override // com.b.a.c.ao.a
        /* renamed from: fp */
        public final as<E> fm() {
            as<E> a = as.a(this.kh, this.dK, this.jJ);
            this.dK = a.size();
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(Object obj, Object obj2) {
        return this.kf.compare(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public as(Comparator<? super E> comparator) {
        this.kf = comparator;
    }

    @Override // com.b.a.c.bx
    public Comparator<? super E> comparator() {
        return this.kf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: e */
    public final as<E> headSet(E e, boolean z) {
        return a((as<E>) com.b.a.a.i.i(e), z);
    }

    @Override // java.util.NavigableSet
    /* renamed from: c */
    public final as<E> subSet(E e, boolean z, E e2, boolean z2) {
        com.b.a.a.i.i(e);
        com.b.a.a.i.i(e2);
        com.b.a.a.i.z(this.kf.compare(e, e2) <= 0);
        return a(e, z, e2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: f */
    public final as<E> tailSet(E e, boolean z) {
        return b((as<E>) com.b.a.a.i.i(e), z);
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return (E) av.a((Iterator<? extends Object>) headSet(e, false).descendingIterator(), (Object) null);
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return (E) av.a((Iterator<? extends Object>) headSet(e, true).descendingIterator(), (Object) null);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return (E) au.a(tailSet(e, true), (Object) null);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return (E) au.a(tailSet(e, false), (Object) null);
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: eC */
    public as<E> descendingSet() {
        as<E> asVar = this.kg;
        as<E> asVar2 = asVar;
        if (asVar == null) {
            as<E> eE = eE();
            this.kg = eE;
            asVar2 = eE;
            eE.kg = this;
        }
        return asVar2;
    }

    as<E> eE() {
        return new s(this);
    }

    public static <E> as<E> fo() {
        return (as<E>) ke;
    }
}