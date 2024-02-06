package com.b.a.c;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SortedIterables.java */
/* loaded from: repireall.jar:com/b/a/c/by.class */
public final class by {
    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        com.b.a.a.i.i(comparator);
        com.b.a.a.i.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (iterable instanceof bx) {
            comparator2 = ((bx) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }

    private static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        bf bfVar = comparator;
        if (comparator == null) {
            bfVar = bf.fT();
        }
        return bfVar;
    }
}