package org.jf.dexlib2.d.d;

import java.util.AbstractSet;
import java.util.Iterator;
import org.jf.dexlib2.d.o;

/* compiled from: VariableSizeSet.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/k.class */
public abstract class k<T> extends AbstractSet<T> {
    private final org.jf.dexlib2.d.g zx;
    private final int zy;
    private final int zz;

    protected abstract T a(o oVar, int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return new g<T>(this.zx, this.zy, this.zz) { // from class: org.jf.dexlib2.d.d.k.1
            @Override // org.jf.dexlib2.d.d.g
            protected final T a(o oVar, int i) {
                return (T) k.this.a(oVar, i);
            }
        };
    }

    public k(org.jf.dexlib2.d.g gVar, int i, int i2) {
        this.zx = gVar;
        this.zy = i;
        this.zz = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.zz;
    }
}