package org.jf.dexlib2.d.d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jf.dexlib2.d.o;

/* compiled from: VariableSizeIterator.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/g.class */
public abstract class g<T> implements Iterator<T> {
    private final o zq;
    private int dK;
    private int ux;

    protected abstract T a(o oVar, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public g(org.jf.dexlib2.d.g gVar, int i, int i2) {
        this.zq = gVar.aY(i);
        this.dK = i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ux < this.dK;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.ux >= this.dK) {
            throw new NoSuchElementException();
        }
        o oVar = this.zq;
        int i = this.ux;
        this.ux = i + 1;
        return a(oVar, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}