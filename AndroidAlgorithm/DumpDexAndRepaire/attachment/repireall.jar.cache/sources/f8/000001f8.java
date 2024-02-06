package com.b.a.c;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UsingToStringOrdering.java */
/* loaded from: repireall.jar:com/b/a/c/ch.class */
public final class ch extends bf<Object> implements Serializable {
    static final ch nc = new ch();

    @Override // com.b.a.c.bf, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public final String toString() {
        return "Ordering.usingToString()";
    }

    private ch() {
    }
}