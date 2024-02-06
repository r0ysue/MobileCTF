package com.b.a.c;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DescendingImmutableSortedSet.java */
/* loaded from: repireall.jar:com/b/a/c/s.class */
public final class s<E> extends as<E> {
    private final as<E> jA;

    @Override // com.b.a.c.as, java.util.NavigableSet
    public final /* synthetic */ Iterator descendingIterator() {
        return this.jA.iterator();
    }

    @Override // com.b.a.c.as, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        return this.jA;
    }

    @Override // com.b.a.c.as, com.b.a.c.ao, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.jA.descendingIterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(as<E> asVar) {
        super(bf.c(asVar.comparator()).fS());
        this.jA = asVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.jA.size();
    }

    @Override // com.b.a.c.af
    public final cf<E> eB() {
        return this.jA.descendingIterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.as
    public final as<E> a(E e, boolean z) {
        return this.jA.tailSet(e, z).descendingSet();
    }

    @Override // com.b.a.c.as
    final as<E> a(E e, boolean z, E e2, boolean z2) {
        return this.jA.subSet(e2, z2, e, z).descendingSet();
    }

    @Override // com.b.a.c.as
    final as<E> b(E e, boolean z) {
        return this.jA.headSet(e, z).descendingSet();
    }

    @Override // com.b.a.c.as
    public final as<E> eC() {
        return this.jA;
    }

    @Override // com.b.a.c.as
    public final cf<E> eD() {
        return this.jA.iterator();
    }

    @Override // com.b.a.c.as
    final as<E> eE() {
        throw new AssertionError("should never be called");
    }

    @Override // com.b.a.c.as, java.util.NavigableSet
    public final E lower(E e) {
        return this.jA.higher(e);
    }

    @Override // com.b.a.c.as, java.util.NavigableSet
    public final E floor(E e) {
        return this.jA.ceiling(e);
    }

    @Override // com.b.a.c.as, java.util.NavigableSet
    public final E ceiling(E e) {
        return this.jA.floor(e);
    }

    @Override // com.b.a.c.as, java.util.NavigableSet
    public final E higher(E e) {
        return this.jA.lower(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.as
    public final int indexOf(Object obj) {
        int indexOf = this.jA.indexOf(obj);
        if (indexOf != -1) {
            return (size() - 1) - indexOf;
        }
        return indexOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return this.jA.eF();
    }
}