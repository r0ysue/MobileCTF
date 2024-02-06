package com.b.a.c;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Sets.java */
/* loaded from: repireall.jar:com/b/a/c/bt.class */
public final class bt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Sets.java */
    /* loaded from: repireall.jar:com/b/a/c/bt$a.class */
    public static abstract class a<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return bt.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) com.b.a.a.i.i(collection));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Set<?> set) {
        int i = 0;
        Iterator<?> it = set.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    return set.containsAll(set2);
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (it.hasNext()) {
                z = z2 | set.remove(it.next());
            } else {
                return z2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Set<?> set, Collection<?> collection) {
        com.b.a.a.i.i(collection);
        if (collection instanceof bc) {
            collection = ((bc) collection).fR();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return av.a(set.iterator(), collection);
        }
        return a(set, collection.iterator());
    }
}