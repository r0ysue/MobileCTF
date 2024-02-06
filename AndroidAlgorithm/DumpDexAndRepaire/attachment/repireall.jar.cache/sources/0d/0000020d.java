package com.b.a.c;

import java.lang.Comparable;

/* compiled from: AbstractRangeSet.java */
/* loaded from: repireall.jar:com/b/a/c/h.class */
abstract class h<C extends Comparable> implements bj<C> {
    @Override // com.b.a.c.bj
    public void a(bh<C> bhVar) {
        throw new UnsupportedOperationException();
    }

    public void b(bh<C> bhVar) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bj) {
            return ga().equals(((bj) obj).ga());
        }
        return false;
    }

    public final int hashCode() {
        return ga().hashCode();
    }

    public final String toString() {
        return ga().toString();
    }
}