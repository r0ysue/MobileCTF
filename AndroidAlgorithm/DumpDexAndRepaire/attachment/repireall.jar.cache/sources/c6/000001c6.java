package com.b.a.c;

import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableList.java */
/* loaded from: repireall.jar:com/b/a/c/bm.class */
public final class bm<E> extends ah<E> {
    private final transient int mf;
    private final transient int mg;
    private final transient Object[] mh;

    @Override // com.b.a.c.ah, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    private bm(Object[] objArr, int i, int i2) {
        this.mf = i;
        this.mg = i2;
        this.mh = objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bm(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.mg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return this.mg != this.mh.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.ah, com.b.a.c.af
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.mh, this.mf, objArr, i, this.mg);
        return i + this.mg;
    }

    @Override // java.util.List
    public final E get(int i) {
        com.b.a.a.i.a(i, this.mg);
        return (E) this.mh[i + this.mf];
    }

    @Override // com.b.a.c.ah, java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = 0; i < this.mg; i++) {
            if (this.mh[this.mf + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.b.a.c.ah, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = this.mg - 1; i >= 0; i--) {
            if (this.mh[this.mf + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.ah
    public final ah<E> e(int i, int i2) {
        return new bm(this.mh, this.mf + i, i2 - i);
    }

    @Override // com.b.a.c.ah
    public final cg<E> S(int i) {
        return av.a(this.mh, this.mf, this.mg, i);
    }
}