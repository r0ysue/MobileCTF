package org.jf.dexlib2.e.c;

import java.util.List;

/* compiled from: MethodReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/e/c/c.class */
public interface c extends Comparable<c>, d {
    String iG();

    String bf();

    List<? extends CharSequence> iH();

    String iI();

    int hashCode();

    boolean equals(Object obj);

    @Override // java.lang.Comparable
    /* renamed from: c */
    int compareTo(c cVar);
}