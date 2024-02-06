package org.jf.dexlib2.d.d;

import java.util.Iterator;
import org.jf.dexlib2.d.o;

/* compiled from: VariableSizeLookaheadIterator.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/j.class */
public abstract class j<T> extends com.b.a.c.b<T> implements Iterator<T> {
    private final o zw;

    protected abstract T a(o oVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public j(org.jf.dexlib2.d.g gVar, int i) {
        this.zw = gVar.aY(i);
    }

    @Override // com.b.a.c.b
    protected final T cR() {
        return a(this.zw);
    }
}