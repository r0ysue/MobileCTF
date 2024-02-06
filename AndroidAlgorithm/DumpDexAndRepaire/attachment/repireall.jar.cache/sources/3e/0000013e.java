package com.b.a.c;

import com.b.a.c.af;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: repireall.jar:com/b/a/c/ah.class */
public abstract class ah<E> extends af<E> implements List<E>, RandomAccess {
    private static final ah<Object> jK = new bm(be.lK);

    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public static <E> ah<E> eY() {
        return (ah<E>) jK;
    }

    public static <E> ah<E> u(E e) {
        return new bv(e);
    }

    public static <E> ah<E> j(E e, E e2) {
        Object[] e3 = be.e(e, e2);
        return b(e3, e3.length);
    }

    public static <E> ah<E> c(Iterable<? extends E> iterable) {
        com.b.a.a.i.i(iterable);
        return iterable instanceof Collection ? d((Collection) iterable) : b(iterable.iterator());
    }

    public static <E> ah<E> d(Collection<? extends E> collection) {
        if (collection instanceof af) {
            ah<E> eK = ((af) collection).eK();
            if (eK.eF()) {
                Object[] array = eK.toArray();
                return b(array, array.length);
            }
            return eK;
        }
        Object[] e = be.e(collection.toArray());
        return b(e, e.length);
    }

    public static <E> ah<E> b(Iterator<? extends E> it) {
        if (it.hasNext()) {
            E next = it.next();
            if (!it.hasNext()) {
                return u(next);
            }
            return new a().v(next).c(it).fa();
        }
        return (ah<E>) jK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> ah<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> ah<E> b(Object[] objArr, int i) {
        switch (i) {
            case 0:
                return (ah<E>) jK;
            case CAN_THROW:
                return new bv(objArr[0]);
            default:
                if (i < objArr.length) {
                    objArr = be.d(objArr, i);
                }
                return new bm(objArr);
        }
    }

    @Override // com.b.a.c.af
    public cf<E> eB() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: S */
    public cg<E> listIterator(int i) {
        return new com.b.a.c.a<E>(size(), i) { // from class: com.b.a.c.ah.1
            @Override // com.b.a.c.a
            protected final E get(int i2) {
                return ah.this.get(i2);
            }
        };
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj != null) {
            ListIterator<E> listIterator = listIterator();
            while (listIterator.hasNext()) {
                if (com.b.a.a.h.e(obj, listIterator.next())) {
                    return listIterator.previousIndex();
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj != null) {
            ListIterator<E> listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (com.b.a.a.h.e(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: d */
    public ah<E> subList(int i, int i2) {
        com.b.a.a.i.a(i, i2, size());
        switch (i2 - i) {
            case 0:
                return (ah<E>) jK;
            case CAN_THROW:
                return u(get(i));
            default:
                return e(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah<E> e(int i, int i2) {
        return new c(i, i2 - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* loaded from: repireall.jar:com/b/a/c/ah$c.class */
    public class c extends ah<E> {
        private transient int an;
        private transient int v;

        @Override // com.b.a.c.ah, java.util.List
        public final /* synthetic */ List subList(int i, int i2) {
            return subList(i, i2);
        }

        @Override // com.b.a.c.ah, java.util.List
        public final /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.b.a.c.ah, java.util.List
        public final /* synthetic */ ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.b.a.c.ah, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final /* synthetic */ Iterator iterator() {
            return super.eB();
        }

        c(int i, int i2) {
            this.an = i;
            this.v = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.v;
        }

        @Override // java.util.List
        public final E get(int i) {
            com.b.a.a.i.a(i, this.v);
            return ah.this.get(i + this.an);
        }

        @Override // com.b.a.c.ah
        public final ah<E> d(int i, int i2) {
            com.b.a.a.i.a(i, i2, this.v);
            return ah.this.subList(i + this.an, i2 + this.an);
        }

        @Override // com.b.a.c.af
        final boolean eF() {
            return true;
        }
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.b.a.c.af
    public final ah<E> eK() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public ah<E> eZ() {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImmutableList.java */
    /* loaded from: repireall.jar:com/b/a/c/ah$b.class */
    public static class b<E> extends ah<E> {
        private final transient ah<E> jM;

        @Override // com.b.a.c.ah, java.util.List
        public final /* synthetic */ List subList(int i, int i2) {
            return subList(i, i2);
        }

        @Override // com.b.a.c.ah, java.util.List
        public final /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.b.a.c.ah, java.util.List
        public final /* synthetic */ ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.b.a.c.ah, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final /* synthetic */ Iterator iterator() {
            return super.eB();
        }

        b(ah<E> ahVar) {
            this.jM = ahVar;
        }

        private int T(int i) {
            return (size() - 1) - i;
        }

        @Override // com.b.a.c.ah
        public final ah<E> eZ() {
            return this.jM;
        }

        @Override // com.b.a.c.ah, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.jM.contains(obj);
        }

        @Override // com.b.a.c.ah, java.util.List
        public final int indexOf(Object obj) {
            int lastIndexOf = this.jM.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return T(lastIndexOf);
            }
            return -1;
        }

        @Override // com.b.a.c.ah, java.util.List
        public final int lastIndexOf(Object obj) {
            int indexOf = this.jM.indexOf(obj);
            if (indexOf >= 0) {
                return T(indexOf);
            }
            return -1;
        }

        @Override // com.b.a.c.ah
        public final ah<E> d(int i, int i2) {
            com.b.a.a.i.a(i, i2, size());
            return this.jM.subList(size() - i2, size() - i).eZ();
        }

        @Override // java.util.List
        public final E get(int i) {
            com.b.a.a.i.a(i, size());
            return this.jM.get(T(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.jM.size();
        }

        @Override // com.b.a.c.af
        final boolean eF() {
            return this.jM.eF();
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == com.b.a.a.i.i(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            return size() == list.size() && av.a((Iterator<?>) iterator(), (Iterator<?>) list.iterator());
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ (-1)) ^ (-1);
        }
        return i;
    }

    /* compiled from: ImmutableList.java */
    /* loaded from: repireall.jar:com/b/a/c/ah$a.class */
    public static final class a<E> extends af.a<E> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.b.a.c.af.a
        public final /* bridge */ /* synthetic */ af.a s(Object obj) {
            super.t(obj);
            return this;
        }

        @Override // com.b.a.c.af.b
        public final /* bridge */ /* synthetic */ af.b a(Iterator it) {
            super.a(it);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.b.a.c.af.a, com.b.a.c.af.b
        public final /* synthetic */ af.b t(Object obj) {
            super.t(obj);
            return this;
        }

        public a() {
            this(4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i) {
            super(i);
        }

        public final a<E> v(E e) {
            super.t(e);
            return this;
        }

        public final a<E> c(Iterator<? extends E> it) {
            super.a(it);
            return this;
        }

        public final ah<E> fa() {
            return ah.b(this.jJ, this.dK);
        }
    }
}