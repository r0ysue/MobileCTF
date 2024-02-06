package com.b.a.c;

import com.b.a.a.f;
import com.b.a.c.bt;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Maps.java */
/* loaded from: repireall.jar:com/b/a/c/ba.class */
public final class ba {
    private static f.a lB = o.jr.aF("=");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$b.class */
    public enum b implements com.b.a.a.d<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.b.a.c.ba.b.1
            @Override // com.b.a.a.d
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.b.a.c.ba.b.2
            @Override // com.b.a.a.d
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static <K, V> Iterator<K> p(Iterator<Map.Entry<K, V>> it) {
        return av.a((Iterator) it, (com.b.a.a.d) b.KEY);
    }

    static <K, V> Iterator<V> q(Iterator<Map.Entry<K, V>> it) {
        return av.a((Iterator) it, (com.b.a.a.d) b.VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> cf<V> a(final cf<Map.Entry<K, V>> cfVar) {
        return new cf<V>() { // from class: com.b.a.c.ba.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return cf.this.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return (V) ((Map.Entry) cf.this.next()).getValue();
            }
        };
    }

    public static <K, V> HashMap<K, V> fM() {
        return new HashMap<>();
    }

    static int X(int i) {
        if (i < 3) {
            n.c(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return i + (i / 3);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static <K, V> LinkedHashMap<K, V> fN() {
        return new LinkedHashMap<>();
    }

    public static <K, V> ConcurrentMap<K, V> fO() {
        ay ayVar = new ay();
        boolean z = ayVar.kN;
        return new ConcurrentHashMap(ayVar.fs(), 0.75f, ayVar.ft());
    }

    public static <K extends Comparable, V> TreeMap<K, V> fP() {
        return new TreeMap<>();
    }

    public static <K, V> Map.Entry<K, V> n(K k, V v) {
        return new ag(k, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$d.class */
    public static abstract class d<K, V> extends AbstractMap<K, V> {
        private transient Set<Map.Entry<K, V>> lE;
        private transient Set<K> jk;
        private transient Collection<V> lH;

        abstract Set<Map.Entry<K, V>> eb();

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.lE;
            if (set == null) {
                Set<Map.Entry<K, V>> eb = eb();
                this.lE = eb;
                return eb;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.jk;
            if (set == null) {
                Set<K> dZ = dZ();
                this.jk = dZ;
                return dZ;
            }
            return set;
        }

        Set<K> dZ() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.lH;
            if (collection != null) {
                return collection;
            }
            h hVar = new h(this);
            this.lH = hVar;
            return hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V a(Map<?, V> map, Object obj) {
        com.b.a.a.i.i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException unused) {
            return null;
        } catch (NullPointerException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Map<?, ?> map, Object obj) {
        com.b.a.a.i.i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException unused) {
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V c(Map<?, V> map, Object obj) {
        com.b.a.a.i.i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException unused) {
            return null;
        } catch (NullPointerException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Map<?, ?> map) {
        StringBuilder append = o.P(map.size()).append('{');
        lB.b(append, map.entrySet().iterator());
        return append.append('}').toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$e.class */
    public static class e<K, V> extends bt.a<K> {
        final Map<K, V> lI;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Map<K, V> map) {
            this.lI = (Map) com.b.a.a.i.i(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map<K, V> ec() {
            return this.lI;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return ba.p(ec().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ec().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ec().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ec().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                ec().remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ec().clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K> K a(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$g.class */
    static class g<K, V> extends e<K, V> implements SortedSet<K> {
        g(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.b.a.c.ba.e
        /* renamed from: fQ */
        public SortedMap<K, V> ec() {
            return (SortedMap) super.ec();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return ec().comparator();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new g(ec().subMap(k, k2));
        }

        public SortedSet<K> headSet(K k) {
            return new g(ec().headMap(k));
        }

        public SortedSet<K> tailSet(K k) {
            return new g(ec().tailMap(k));
        }

        @Override // java.util.SortedSet
        public K first() {
            return ec().firstKey();
        }

        @Override // java.util.SortedSet
        public K last() {
            return ec().lastKey();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$f.class */
    public static class f<K, V> extends g<K, V> implements NavigableSet<K> {
        @Override // com.b.a.c.ba.g
        final /* bridge */ /* synthetic */ SortedMap fQ() {
            return (NavigableMap) this.lI;
        }

        @Override // com.b.a.c.ba.g, com.b.a.c.ba.e
        final /* bridge */ /* synthetic */ Map ec() {
            return (NavigableMap) this.lI;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return (K) ((NavigableMap) this.lI).lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return (K) ((NavigableMap) this.lI).floorKey(k);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return (K) ((NavigableMap) this.lI).ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return (K) ((NavigableMap) this.lI).higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            return (K) ba.a(((NavigableMap) this.lI).pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            return (K) ba.a(((NavigableMap) this.lI).pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return ((NavigableMap) this.lI).descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return ((NavigableMap) this.lI).subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return ((NavigableMap) this.lI).headMap(k, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return ((NavigableMap) this.lI).tailMap(k, z).navigableKeySet();
        }

        @Override // com.b.a.c.ba.g, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.b.a.c.ba.g, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // com.b.a.c.ba.g, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }

    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$h.class */
    static class h<K, V> extends AbstractCollection<V> {
        private Map<K, V> iO;

        h(Map<K, V> map) {
            this.iO = (Map) com.b.a.a.i.i(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return ba.q(this.iO.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.iO.entrySet()) {
                    if (com.b.a.a.h.e(obj, entry.getValue())) {
                        this.iO.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.b.a.a.i.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.iO.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.iO.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.b.a.a.i.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.iO.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.iO.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.iO.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.iO.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.iO.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.iO.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$c.class */
    public static abstract class c<K, V> extends bt.a<Map.Entry<K, V>> {
        abstract Map<K, V> ec();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ec().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ec().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object a = ba.a((Map<?, Object>) ec(), key);
                if (com.b.a.a.h.e(a, entry.getValue())) {
                    return a != null || ec().containsKey(key);
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ec().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return ec().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.b.a.c.bt.a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.b.a.a.i.i(collection));
            } catch (UnsupportedOperationException unused) {
                return bt.a(this, collection.iterator());
            }
        }

        @Override // com.b.a.c.bt.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.b.a.a.i.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(ba.X(collection.size()));
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return ec().keySet().retainAll(hashSet);
            }
        }
    }

    /* compiled from: Maps.java */
    /* loaded from: repireall.jar:com/b/a/c/ba$a.class */
    static abstract class a<K, V> extends z<K, V> implements NavigableMap<K, V> {
        private transient Comparator<? super K> lD;
        private transient Set<Map.Entry<K, V>> lE;
        private transient NavigableSet<K> lF;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.b.a.c.z, com.b.a.c.aa
        /* renamed from: en */
        public abstract NavigableMap<K, V> eQ();

        abstract Iterator<Map.Entry<K, V>> el();

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.b.a.c.z
        public final Map<K, V> eR() {
            return eQ();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.lD;
            bf bfVar = comparator;
            if (comparator == null) {
                Comparator<? super K> comparator2 = eQ().comparator();
                bf bfVar2 = comparator2;
                if (comparator2 == null) {
                    bfVar2 = bf.fT();
                }
                bf fS = bf.c(bfVar2).fS();
                this.lD = fS;
                bfVar = fS;
            }
            return bfVar;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return eQ().lastKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return eQ().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return eQ().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return eQ().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return eQ().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return eQ().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return eQ().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return eQ().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return eQ().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return eQ().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return eQ().lastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return eQ().firstEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return eQ().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return eQ().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return eQ();
        }

        @Override // com.b.a.c.z, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.lE;
            if (set != null) {
                return set;
            }
            c<K, V> cVar = new c<K, V>() { // from class: com.b.a.c.ba.a.1
                @Override // com.b.a.c.ba.c
                final Map<K, V> ec() {
                    return a.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator<Map.Entry<K, V>> iterator() {
                    return a.this.el();
                }
            };
            this.lE = cVar;
            return cVar;
        }

        @Override // com.b.a.c.z, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.lF;
            if (navigableSet == null) {
                f fVar = new f(this);
                this.lF = fVar;
                return fVar;
            }
            return navigableSet;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return eQ().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return eQ().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return eQ().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return eQ().headMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // com.b.a.c.z, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new h(this);
        }

        @Override // com.b.a.c.aa
        public String toString() {
            return ba.a(this);
        }
    }
}