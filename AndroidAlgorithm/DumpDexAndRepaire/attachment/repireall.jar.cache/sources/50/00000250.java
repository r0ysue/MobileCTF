package org.antlr.stringtemplate.a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ArrayWrappedInList.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/f.class */
public final class f extends ArrayList {
    private Object oO;
    private int oP;

    public f(Object obj) {
        this.oO = null;
        this.oO = obj;
        this.oP = Array.getLength(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Array.get(this.oO, i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.oP;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.oP == 0;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return (Object[]) this.oO;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new e(this.oO);
    }
}