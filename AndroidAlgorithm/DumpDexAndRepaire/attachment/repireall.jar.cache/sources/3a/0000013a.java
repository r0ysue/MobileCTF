package com.b.a.c;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ImmutableCollection.java */
/* loaded from: repireall.jar:com/b/a/c/af.class */
public abstract class af<E> extends AbstractCollection<E> implements Serializable {
    private transient ah<E> jI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: eB */
    public abstract cf<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean eF();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return be.lK;
        }
        Object[] objArr = new Object[size];
        a(objArr, 0);
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object[]] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.b.a.a.i.i(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = be.c(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return obj != null && super.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ah<E> eK() {
        ah<E> ahVar = this.jI;
        if (ahVar == null) {
            ah<E> eX = eX();
            this.jI = eX;
            return eX;
        }
        return ahVar;
    }

    ah<E> eX() {
        switch (size()) {
            case 0:
                return ah.eY();
            case CAN_THROW:
                return ah.u(iterator().next());
            default:
                return new bk(this, toArray());
        }
    }

    int a(Object[] objArr, int i) {
        Iterator it = iterator();
        while (it.hasNext()) {
            int i2 = i;
            i++;
            objArr[i2] = it.next();
        }
        return i;
    }

    /* compiled from: ImmutableCollection.java */
    /* loaded from: repireall.jar:com/b/a/c/af$b.class */
    public static abstract class b<E> {
        public abstract b<E> t(E e);

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int c(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = i + (i >> 1) + 1;
            int i4 = i3;
            if (i3 < i2) {
                i4 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            return i4;
        }

        b() {
        }

        public b<E> a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                t(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableCollection.java */
    /* loaded from: repireall.jar:com/b/a/c/af$a.class */
    public static abstract class a<E> extends b<E> {
        Object[] jJ;
        int dK;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i) {
            n.c(i, "initialCapacity");
            this.jJ = new Object[i];
            this.dK = 0;
        }

        @Override // com.b.a.c.af.b
        /* renamed from: s */
        public a<E> t(E e) {
            com.b.a.a.i.i(e);
            int i = this.dK + 1;
            if (this.jJ.length < i) {
                this.jJ = be.d(this.jJ, c(this.jJ.length, i));
            }
            Object[] objArr = this.jJ;
            int i2 = this.dK;
            this.dK = i2 + 1;
            objArr[i2] = e;
            return this;
        }
    }
}