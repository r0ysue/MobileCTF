package org.jf.a;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractForwardSequentialList.java */
/* loaded from: repireall.jar:org/jf/a/a.class */
public abstract class a<T> extends AbstractSequentialList<T> {
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator<T> iterator();

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<T> bO(int i) {
        if (i < 0) {
            throw new NoSuchElementException();
        }
        Iterator<T> it = iterator();
        for (int i2 = 0; i2 < i; i2++) {
            it.next();
        }
        return it;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(final int i) {
        try {
            final Iterator<T> bO = bO(i);
            return new b<T>() { // from class: org.jf.a.a.1
                private int ux;
                private Iterator<T> Fm;

                {
                    this.ux = i - 1;
                    this.Fm = bO;
                }

                private Iterator<T> mR() {
                    if (this.Fm == null) {
                        try {
                            this.Fm = a.this.bO(this.ux + 1);
                        } catch (IndexOutOfBoundsException unused) {
                            throw new NoSuchElementException();
                        }
                    }
                    return this.Fm;
                }

                @Override // org.jf.a.b, java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
                    return mR().hasNext();
                }

                @Override // org.jf.a.b, java.util.ListIterator
                public final boolean hasPrevious() {
                    return this.ux >= 0;
                }

                @Override // org.jf.a.b, java.util.ListIterator, java.util.Iterator
                public final T next() {
                    T next = mR().next();
                    this.ux++;
                    return next;
                }

                @Override // org.jf.a.b, java.util.ListIterator
                public final int nextIndex() {
                    return this.ux + 1;
                }

                @Override // org.jf.a.b, java.util.ListIterator
                public final T previous() {
                    this.Fm = null;
                    try {
                        a aVar = a.this;
                        int i2 = this.ux;
                        this.ux = i2 - 1;
                        return (T) aVar.bO(i2).next();
                    } catch (IndexOutOfBoundsException unused) {
                        throw new NoSuchElementException();
                    }
                }

                @Override // org.jf.a.b, java.util.ListIterator
                public final int previousIndex() {
                    return this.ux;
                }
            };
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }
}