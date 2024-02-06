package com.b.a.c;

import com.b.a.c.ba;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMapBasedMultimap.java */
/* loaded from: repireall.jar:com/b/a/c/d.class */
public abstract class d<K, V> extends com.b.a.c.f<K, V> implements Serializable {
    private transient Map<K, Collection<V>> iO;
    private transient int iP;

    abstract Collection<V> dY();

    static /* synthetic */ Iterator a(d dVar, Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    static /* synthetic */ int b(d dVar) {
        int i2 = dVar.iP;
        dVar.iP = i2 - 1;
        return i2;
    }

    static /* synthetic */ int c(d dVar) {
        int i2 = dVar.iP;
        dVar.iP = i2 + 1;
        return i2;
    }

    static /* synthetic */ int a(d dVar, int i2) {
        int i3 = dVar.iP + i2;
        dVar.iP = i3;
        return i3;
    }

    static /* synthetic */ int b(d dVar, int i2) {
        int i3 = dVar.iP - i2;
        dVar.iP = i3;
        return i3;
    }

    static /* synthetic */ int a(d dVar, Object obj) {
        Collection collection = (Collection) ba.c(dVar.iO, obj);
        int i2 = 0;
        if (collection != null) {
            i2 = collection.size();
            collection.clear();
            dVar.iP -= i2;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Map<K, Collection<V>> map) {
        com.b.a.a.i.z(map.isEmpty());
        this.iO = map;
    }

    public void clear() {
        for (Collection<V> collection : this.iO.values()) {
            collection.clear();
        }
        this.iO.clear();
        this.iP = 0;
    }

    @Override // com.b.a.c.bb
    public Collection<V> r(K k) {
        Collection<V> collection = this.iO.get(k);
        Collection<V> collection2 = collection;
        if (collection == null) {
            collection2 = dY();
        }
        return a((d<K, V>) k, (Collection) collection2);
    }

    final Collection<V> a(K k, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new i(k, (SortedSet) collection, null);
        }
        if (collection instanceof Set) {
            return new h(k, (Set) collection);
        }
        if (collection instanceof List) {
            return a(k, (List) collection, null);
        }
        return new f(k, collection, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<V> a(K k, List<V> list, d<K, V>.f fVar) {
        return list instanceof RandomAccess ? new c(k, list, fVar) : new g(k, list, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$f.class */
    public class f extends AbstractCollection<V> {
        final K ja;
        Collection<V> jb;
        final d<K, V>.f jc;
        private Collection<V> jd;

        f(K k, Collection<V> collection, d<K, V>.f fVar) {
            this.ja = k;
            this.jb = collection;
            this.jc = fVar;
            this.jd = fVar == null ? null : fVar.jb;
        }

        final void ee() {
            Collection<V> collection;
            if (this.jc != null) {
                this.jc.ee();
                if (this.jc.jb != this.jd) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.jb.isEmpty() && (collection = (Collection) d.this.iO.get(this.ja)) != null) {
                this.jb = collection;
            }
        }

        final void ef() {
            if (this.jc != null) {
                this.jc.ef();
            } else if (this.jb.isEmpty()) {
                d.this.iO.remove(this.ja);
            }
        }

        final void eg() {
            if (this.jc == null) {
                d.this.iO.put(this.ja, this.jb);
            } else {
                this.jc.eg();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            ee();
            return this.jb.size();
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            ee();
            return this.jb.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            ee();
            return this.jb.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            ee();
            return this.jb.toString();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            ee();
            return new a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: repireall.jar:com/b/a/c/d$f$a.class */
        public class a implements Iterator<V> {
            final Iterator<V> jf;
            private Collection<V> jg;

            a() {
                this.jg = f.this.jb;
                this.jf = d.a(d.this, (Collection) f.this.jb);
            }

            a(g gVar, Iterator<V> it) {
                f.this = gVar;
                this.jg = f.this.jb;
                this.jf = it;
            }

            final void eh() {
                f.this.ee();
                if (f.this.jb != this.jg) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                eh();
                return this.jf.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                eh();
                return this.jf.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.jf.remove();
                d.b(d.this);
                f.this.ef();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            ee();
            boolean isEmpty = this.jb.isEmpty();
            boolean add = this.jb.add(v);
            if (add) {
                d.c(d.this);
                if (isEmpty) {
                    eg();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.jb.addAll(collection);
            if (addAll) {
                d.a(d.this, this.jb.size() - size);
                if (size == 0) {
                    eg();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            ee();
            return this.jb.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            ee();
            return this.jb.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.jb.clear();
            d.b(d.this, size);
            ef();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ee();
            boolean remove = this.jb.remove(obj);
            if (remove) {
                d.b(d.this);
                ef();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.jb.removeAll(collection);
            if (removeAll) {
                d.a(d.this, this.jb.size() - size);
                ef();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            com.b.a.a.i.i(collection);
            int size = size();
            boolean retainAll = this.jb.retainAll(collection);
            if (retainAll) {
                d.a(d.this, this.jb.size() - size);
                ef();
            }
            return retainAll;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$h.class */
    public class h extends f implements Set {
        h(K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // com.b.a.c.d.f, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean a = bt.a((Set) this.jb, collection);
            if (a) {
                d.a(d.this, this.jb.size() - size);
                ef();
            }
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$i.class */
    public class i extends f implements SortedSet {
        i(K k, SortedSet<V> sortedSet, d<K, V>.f fVar) {
            super(k, sortedSet, fVar);
        }

        private SortedSet<V> ek() {
            return (SortedSet) this.jb;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super V> comparator() {
            return ek().comparator();
        }

        @Override // java.util.SortedSet
        public final V first() {
            ee();
            return ek().first();
        }

        @Override // java.util.SortedSet
        public final V last() {
            ee();
            return ek().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> headSet(V v) {
            ee();
            return new i(this.ja, ek().headSet(v), this.jc == null ? this : this.jc);
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> subSet(V v, V v2) {
            ee();
            return new i(this.ja, ek().subSet(v, v2), this.jc == null ? this : this.jc);
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> tailSet(V v) {
            ee();
            return new i(this.ja, ek().tailSet(v), this.jc == null ? this : this.jc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$g.class */
    public class g extends f implements List {
        g(K k, List<V> list, d<K, V>.f fVar) {
            super(k, list, fVar);
        }

        final List<V> ei() {
            return (List) this.jb;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ei().addAll(i, collection);
            if (addAll) {
                d.a(d.this, this.jb.size() - size);
                if (size == 0) {
                    eg();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i) {
            ee();
            return ei().get(i);
        }

        @Override // java.util.List
        public V set(int i, V v) {
            ee();
            return ei().set(i, v);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            ee();
            boolean isEmpty = this.jb.isEmpty();
            ei().add(i, v);
            d.c(d.this);
            if (isEmpty) {
                eg();
            }
        }

        @Override // java.util.List
        public V remove(int i) {
            ee();
            V remove = ei().remove(i);
            d.b(d.this);
            ef();
            return remove;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            ee();
            return ei().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            ee();
            return ei().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            ee();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            ee();
            return new a(i);
        }

        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            ee();
            return d.this.a(this.ja, ei().subList(i, i2), this.jc == null ? this : this.jc);
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: repireall.jar:com/b/a/c/d$g$a.class */
        private class a extends f.a implements ListIterator {
            a() {
                super();
            }

            public a(int i) {
                super(g.this, g.this.ei().listIterator(i));
            }

            private ListIterator<V> ej() {
                eh();
                return (ListIterator) this.jf;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return ej().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return ej().previous();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return ej().nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return ej().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                ej().set(v);
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean isEmpty = g.this.isEmpty();
                ej().add(v);
                d.c(d.this);
                if (isEmpty) {
                    g.this.eg();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$c.class */
    public class c extends g implements RandomAccess {
        c(K k, List<V> list, d<K, V>.f fVar) {
            super(k, list, fVar);
        }
    }

    @Override // com.b.a.c.f
    final Set<K> dZ() {
        return this.iO instanceof SortedMap ? new e((SortedMap) this.iO) : new b(this.iO);
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$b.class */
    private class b extends ba.e<K, Collection<V>> {
        b(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.b.a.c.ba.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = ec().entrySet().iterator();
            return new Iterator<K>() { // from class: com.b.a.c.d.b.1
                private Map.Entry<K, Collection<V>> iW;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final K next() {
                    this.iW = (Map.Entry) it.next();
                    return this.iW.getKey();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    com.b.a.a.i.b(this.iW != null, "no calls to next() since the last call to remove()");
                    Collection<V> value = this.iW.getValue();
                    it.remove();
                    d.b(d.this, value.size());
                    value.clear();
                }
            };
        }

        @Override // com.b.a.c.ba.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i = 0;
            Collection<V> remove = ec().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                d.b(d.this, i);
            }
            return i > 0;
        }

        @Override // com.b.a.c.ba.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            av.l(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return ec().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || ec().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ec().keySet().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$e.class */
    public class e extends b implements SortedSet {
        e(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return ((SortedMap) super.ec()).comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return (K) ((SortedMap) super.ec()).firstKey();
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> headSet(K k) {
            return new e(((SortedMap) super.ec()).headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return (K) ((SortedMap) super.ec()).lastKey();
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> subSet(K k, K k2) {
            return new e(((SortedMap) super.ec()).subMap(k, k2));
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> tailSet(K k) {
            return new e(((SortedMap) super.ec()).tailMap(k));
        }
    }

    @Override // com.b.a.c.f
    final Map<K, Collection<V>> ea() {
        return this.iO instanceof SortedMap ? new C0008d((SortedMap) this.iO) : new a(this.iO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: repireall.jar:com/b/a/c/d$a.class */
    public class a extends ba.d<K, Collection<V>> {
        final transient Map<K, Collection<V>> iQ;

        @Override // java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object remove(Object obj) {
            Collection<V> remove = this.iQ.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> dY = d.this.dY();
            dY.addAll(remove);
            d.b(d.this, remove.size());
            remove.clear();
            return dY;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object get(Object obj) {
            Collection<V> collection = (Collection) ba.a((Map<?, Object>) this.iQ, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a((d) obj, (Collection) collection);
        }

        a(Map<K, Collection<V>> map) {
            this.iQ = map;
        }

        @Override // com.b.a.c.ba.d
        protected final Set<Map.Entry<K, Collection<V>>> eb() {
            return new C0007a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ba.b(this.iQ, obj);
        }

        @Override // com.b.a.c.ba.d, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.iQ.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.iQ.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.iQ.hashCode();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.iQ.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.iQ == d.this.iO) {
                d.this.clear();
            } else {
                av.l(new b());
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.b.a.c.d$a$a  reason: collision with other inner class name */
        /* loaded from: repireall.jar:com/b/a/c/d$a$a.class */
        class C0007a extends ba.c<K, Collection<V>> {
            C0007a() {
            }

            @Override // com.b.a.c.ba.c
            final Map<K, Collection<V>> ec() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // com.b.a.c.ba.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return o.a(a.this.iQ.entrySet(), obj);
            }

            @Override // com.b.a.c.ba.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.a(d.this, ((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: repireall.jar:com/b/a/c/d$a$b.class */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {
            private Iterator<Map.Entry<K, Collection<V>>> iT;
            private Collection<V> iU;

            b() {
                this.iT = a.this.iQ.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ Object next() {
                Map.Entry<K, Collection<V>> next = this.iT.next();
                this.iU = next.getValue();
                a aVar = a.this;
                K key = next.getKey();
                return ba.n(key, d.this.a((d) key, (Collection) next.getValue()));
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.iT.hasNext();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.iT.remove();
                d.b(d.this, this.iU.size());
                this.iU.clear();
            }
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.b.a.c.d$d  reason: collision with other inner class name */
    /* loaded from: repireall.jar:com/b/a/c/d$d.class */
    private class C0008d extends a implements SortedMap {
        private SortedSet<K> iZ;

        @Override // com.b.a.c.d.a, com.b.a.c.ba.d, java.util.AbstractMap, java.util.Map
        public final /* synthetic */ Set keySet() {
            SortedSet<K> sortedSet = this.iZ;
            if (sortedSet == null) {
                SortedSet<K> dZ = dZ();
                this.iZ = dZ;
                return dZ;
            }
            return sortedSet;
        }

        C0008d(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.iQ).comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return (K) ((SortedMap) this.iQ).firstKey();
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return (K) ((SortedMap) this.iQ).lastKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap<K, Collection<V>> headMap(K k) {
            return new C0008d(((SortedMap) this.iQ).headMap(k));
        }

        @Override // java.util.SortedMap
        public final SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C0008d(((SortedMap) this.iQ).subMap(k, k2));
        }

        @Override // java.util.SortedMap
        public final SortedMap<K, Collection<V>> tailMap(K k) {
            return new C0008d(((SortedMap) this.iQ).tailMap(k));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.b.a.c.ba.d
        /* renamed from: ed */
        public SortedSet<K> dZ() {
            return new e((SortedMap) this.iQ);
        }
    }
}