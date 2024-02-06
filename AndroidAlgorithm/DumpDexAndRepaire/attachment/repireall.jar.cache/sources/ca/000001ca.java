package com.b.a.c;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableSet.java */
/* loaded from: repireall.jar:com/b/a/c/bo.class */
public final class bo<E> extends ao<E> {
    private final Object[] mn;
    private transient Object[] mo;
    private final transient int mp;
    private final transient int mq;

    @Override // com.b.a.c.ao, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return av.c(this.mn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo(Object[] objArr, int i, Object[] objArr2, int i2) {
        this.mn = objArr;
        this.mo = objArr2;
        this.mp = i2;
        this.mq = i;
    }

    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int R = ac.R(obj.hashCode());
        while (true) {
            Object obj2 = this.mo[R & this.mp];
            if (obj2 == null) {
                return false;
            }
            if (!obj2.equals(obj)) {
                R++;
            } else {
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.mn.length;
    }

    @Override // com.b.a.c.af
    public final cf<E> eB() {
        return av.c(this.mn);
    }

    @Override // com.b.a.c.af
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.mn, 0, objArr, i, this.mn.length);
        return i + this.mn.length;
    }

    @Override // com.b.a.c.af
    final ah<E> eX() {
        return new bk(this, this.mn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return false;
    }

    @Override // com.b.a.c.ao, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.mq;
    }

    @Override // com.b.a.c.ao
    final boolean eL() {
        return true;
    }
}