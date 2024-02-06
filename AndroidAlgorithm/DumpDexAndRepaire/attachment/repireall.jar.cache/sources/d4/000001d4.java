package com.b.a.c;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonImmutableList.java */
/* loaded from: repireall.jar:com/b/a/c/bv.class */
public final class bv<E> extends ah<E> {
    private transient E mC;

    @Override // com.b.a.c.ah, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.b.a.c.ah, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return av.z(this.mC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bv(E e) {
        this.mC = (E) com.b.a.a.i.i(e);
    }

    @Override // java.util.List
    public final E get(int i) {
        com.b.a.a.i.a(i, 1);
        return this.mC;
    }

    @Override // com.b.a.c.ah, java.util.List
    public final int indexOf(Object obj) {
        return this.mC.equals(obj) ? 0 : -1;
    }

    @Override // com.b.a.c.ah, com.b.a.c.af
    public final cf<E> eB() {
        return av.z(this.mC);
    }

    @Override // com.b.a.c.ah, java.util.List
    public final int lastIndexOf(Object obj) {
        return indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }

    @Override // com.b.a.c.ah
    public final ah<E> d(int i, int i2) {
        com.b.a.a.i.a(i, i2, 1);
        return i == i2 ? ah.eY() : this;
    }

    @Override // com.b.a.c.ah
    public final ah<E> eZ() {
        return this;
    }

    @Override // com.b.a.c.ah, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.mC.equals(obj);
    }

    @Override // com.b.a.c.ah, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            return list.size() == 1 && this.mC.equals(list.get(0));
        }
        return false;
    }

    @Override // com.b.a.c.ah, java.util.Collection, java.util.List
    public final int hashCode() {
        return 31 + this.mC.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.mC.toString();
        return new StringBuilder(obj.length() + 2).append('[').append(obj).append(']').toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.ah, com.b.a.c.af
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.mC;
        return i + 1;
    }
}