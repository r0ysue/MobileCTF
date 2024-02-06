package org.jf.dexlib2.d.d;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: FixedSizeSet.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/d.class */
public abstract class d<T> extends AbstractSet<T> {
    public abstract T aZ(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return new Iterator<T>() { // from class: org.jf.dexlib2.d.d.d.1
            private int ux = 0;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.ux < d.this.size();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                d dVar = d.this;
                int i = this.ux;
                this.ux = i + 1;
                return (T) dVar.aZ(i);
            }
        };
    }
}