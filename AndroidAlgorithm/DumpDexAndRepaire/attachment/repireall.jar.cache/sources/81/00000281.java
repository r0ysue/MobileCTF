package org.jf.a;

import com.b.a.c.as;
import com.b.a.c.bf;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: CollectionUtils.java */
/* loaded from: repireall.jar:org/jf/a/g.class */
public final class g {
    public static <T> int a(Iterable<T> iterable, com.b.a.a.j<? super T> jVar) {
        int i = 0;
        int i2 = -1;
        for (T t : iterable) {
            if (jVar.apply(t)) {
                i2 = i;
            }
            i++;
        }
        return i2;
    }

    public static <T> int a(Comparator<? super T> comparator, Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Iterator<? extends T> it = iterable2.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            try {
                int compare = comparator.compare((T) it2.next(), (T) it.next());
                if (compare != 0) {
                    return compare;
                }
            } catch (NoSuchElementException unused) {
                return 1;
            }
        }
        if (it.hasNext()) {
            return -1;
        }
        return 0;
    }

    private static <T> SortedSet<? extends T> i(Collection<? extends T> collection) {
        boolean z;
        if (collection instanceof SortedSet) {
            Comparator comparator = ((SortedSet) collection).comparator();
            z = comparator == null || comparator.equals(bf.fT());
        } else {
            z = false;
        }
        if (z) {
            return (SortedSet) collection;
        }
        return as.e(collection);
    }

    public static <T extends Comparable<T>> int a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        int h = com.b.a.e.b.h(collection.size(), collection2.size());
        if (h != 0) {
            return h;
        }
        i(collection);
        i(collection2);
        Iterator<? extends T> it = collection2.iterator();
        for (T t : collection) {
            int compareTo = t.compareTo(it.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }
}