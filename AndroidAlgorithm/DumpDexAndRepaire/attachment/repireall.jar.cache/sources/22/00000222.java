package com.b.a.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmptyImmutableSet.java */
/* loaded from: repireall.jar:com/b/a/c/u.class */
public final class u extends ao<Object> {
    static final u jC = new u();

    @Override // com.b.a.c.ao, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return av.fq();
    }

    private u() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    @Override // com.b.a.c.af
    public final cf<Object> eB() {
        return av.fq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return false;
    }

    @Override // com.b.a.c.af
    final int a(Object[] objArr, int i) {
        return i;
    }

    @Override // com.b.a.c.af
    public final ah<Object> eK() {
        return ah.eY();
    }

    @Override // com.b.a.c.ao, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.b.a.c.ao, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.b.a.c.ao
    final boolean eL() {
        return true;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }
}