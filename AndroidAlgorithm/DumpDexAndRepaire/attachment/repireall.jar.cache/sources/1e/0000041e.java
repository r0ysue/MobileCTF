package org.jf.dexlib2.d.d;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jf.dexlib2.d.o;

/* compiled from: VariableSizeListIterator.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/i.class */
public abstract class i<T> implements ListIterator<T> {
    private o zo;
    private int dK;
    private final int zv;
    private int ux;

    protected abstract T a(o oVar, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public i(org.jf.dexlib2.d.g gVar, int i, int i2) {
        this.zo = gVar.aY(i);
        this.zv = i;
        this.dK = i2;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.ux < this.dK;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (this.ux >= this.dK) {
            throw new NoSuchElementException();
        }
        o oVar = this.zo;
        int i = this.ux;
        this.ux = i + 1;
        return a(oVar, i);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.ux > 0;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i = this.ux - 1;
        this.zo.aG(this.zv);
        this.ux = 0;
        while (this.ux < i) {
            o oVar = this.zo;
            int i2 = this.ux;
            this.ux = i2 + 1;
            a(oVar, i2);
        }
        o oVar2 = this.zo;
        int i3 = this.ux;
        this.ux = i3 + 1;
        return a(oVar2, i3);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.ux;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.ux - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}