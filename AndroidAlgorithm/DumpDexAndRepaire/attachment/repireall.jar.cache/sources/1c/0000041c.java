package org.jf.dexlib2.d.d;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import org.jf.dexlib2.d.o;

/* compiled from: VariableSizeList.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/h.class */
public abstract class h<T> extends AbstractSequentialList<T> {
    private final org.jf.dexlib2.d.g zr;
    private final int zs;
    private final int zt;

    protected abstract T a(o oVar, int i);

    @Override // java.util.AbstractList, java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public h(org.jf.dexlib2.d.g gVar, int i, int i2) {
        this.zr = gVar;
        this.zs = i;
        this.zt = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.zt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    /* renamed from: bl */
    public i<T> listIterator(int i) {
        i<T> iVar = new i<T>(this.zr, this.zs, this.zt) { // from class: org.jf.dexlib2.d.d.h.1
            @Override // org.jf.dexlib2.d.d.i
            protected final T a(o oVar, int i2) {
                return (T) h.this.a(oVar, i2);
            }
        };
        for (int i2 = 0; i2 < i; i2++) {
            iVar.next();
        }
        return iVar;
    }
}