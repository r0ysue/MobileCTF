package org.antlr.stringtemplate.a;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/e.class */
public final class e implements Iterator {
    private int dW = -1;
    private Object oO;
    private int oP;

    public e(Object obj) {
        this.oO = null;
        this.oO = obj;
        this.oP = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.dW + 1 < this.oP && this.oP > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.dW++;
        if (this.dW >= this.oP) {
            throw new NoSuchElementException();
        }
        return Array.get(this.oO, this.dW);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}