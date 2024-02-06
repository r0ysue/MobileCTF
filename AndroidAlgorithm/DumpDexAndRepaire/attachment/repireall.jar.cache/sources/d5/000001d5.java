package com.b.a.c;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonImmutableSet.java */
/* loaded from: repireall.jar:com/b/a/c/bw.class */
public final class bw<E> extends ao<E> {
    private transient E mC;
    private transient int mD;

    @Override // com.b.a.c.ao, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return av.z(this.mC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(E e) {
        this.mC = (E) com.b.a.a.i.i(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(E e, int i) {
        this.mC = e;
        this.mD = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.mC.equals(obj);
    }

    @Override // com.b.a.c.af
    public final cf<E> eB() {
        return av.z(this.mC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return false;
    }

    @Override // com.b.a.c.af
    final int a(Object[] objArr, int i) {
        objArr[i] = this.mC;
        return i + 1;
    }

    @Override // com.b.a.c.ao, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            return set.size() == 1 && this.mC.equals(set.iterator().next());
        }
        return false;
    }

    @Override // com.b.a.c.ao, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.mD;
        int i2 = i;
        if (i == 0) {
            int hashCode = this.mC.hashCode();
            i2 = hashCode;
            this.mD = hashCode;
        }
        return i2;
    }

    @Override // com.b.a.c.ao
    final boolean eL() {
        return this.mD != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.mC.toString();
        return new StringBuilder(obj.length() + 2).append('[').append(obj).append(']').toString();
    }
}