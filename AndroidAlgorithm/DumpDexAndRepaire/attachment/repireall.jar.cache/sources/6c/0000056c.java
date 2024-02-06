package org.jf.dexlib2.g;

import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: RewriterUtils.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/q.class */
public final class q {
    public static <T> T a(o<T> oVar, T t) {
        if (t == null) {
            return null;
        }
        return oVar.E(t);
    }

    public static <T> Set<T> a(final o<T> oVar, final Set<? extends T> set) {
        return new AbstractSet<T>() { // from class: org.jf.dexlib2.g.q.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<T> iterator() {
                final Iterator it = set.iterator();
                return new Iterator<T>() { // from class: org.jf.dexlib2.g.q.1.1
                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final T next() {
                        return (T) q.a(oVar, it.next());
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        it.remove();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return set.size();
            }
        };
    }

    public static <T> List<T> a(final o<T> oVar, final List<? extends T> list) {
        return new AbstractList<T>() { // from class: org.jf.dexlib2.g.q.2
            @Override // java.util.AbstractList, java.util.List
            public final T get(int i) {
                return (T) q.a(o.this, list.get(i));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return list.size();
            }
        };
    }

    public static <T> Iterable<T> a(final o<T> oVar, final Iterable<? extends T> iterable) {
        return new Iterable<T>() { // from class: org.jf.dexlib2.g.q.3
            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                final Iterator<T> it = iterable.iterator();
                return new Iterator<T>() { // from class: org.jf.dexlib2.g.q.3.1
                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final T next() {
                        return (T) q.a(oVar, it.next());
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        it.remove();
                    }
                };
            }
        };
    }

    public static org.jf.dexlib2.e.c.f a(final o<String> oVar, final org.jf.dexlib2.e.c.f fVar) {
        return new org.jf.dexlib2.b.a.e() { // from class: org.jf.dexlib2.g.q.4
            @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
            public final String io() {
                return (String) o.this.E(fVar.io());
            }
        };
    }
}