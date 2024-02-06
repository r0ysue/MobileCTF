package org.jf.dexlib2.d.d;

import java.util.AbstractList;

/* compiled from: FixedSizeList.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/c.class */
public abstract class c<T> extends AbstractList<T> {
    public abstract T aZ(int i);

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return aZ(i);
    }
}