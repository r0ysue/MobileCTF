package com.b.a.c;

import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableAsList.java */
/* loaded from: repireall.jar:com/b/a/c/bk.class */
public class bk<E> extends ad<E> {
    private final af<E> lR;
    private final ah<? extends E> lS;

    @Override // com.b.a.c.ah, java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk(af<E> afVar, ah<? extends E> ahVar) {
        this.lR = afVar;
        this.lS = ahVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk(af<E> afVar, Object[] objArr) {
        this(afVar, ah.b(objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.ad
    public af<E> eS() {
        return this.lR;
    }

    @Override // com.b.a.c.ah
    public final cg<E> S(int i) {
        return (cg<? extends E>) this.lS.listIterator(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.ah, com.b.a.c.af
    public final int a(Object[] objArr, int i) {
        return this.lS.a(objArr, i);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.lS.get(i);
    }
}