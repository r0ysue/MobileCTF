package com.b.a.c;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: TreeRangeMap.java */
/* loaded from: repireall.jar:com/b/a/c/cc.class */
public final class cc<K extends Comparable, V> implements bi<K, V> {
    private final NavigableMap<r<K>, b<K, V>> mF = ba.fP();

    public static <K extends Comparable, V> cc<K, V> gc() {
        return new cc<>();
    }

    private cc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TreeRangeMap.java */
    /* loaded from: repireall.jar:com/b/a/c/cc$b.class */
    public static final class b<K extends Comparable, V> extends e<bh<K>, V> {
        private final bh<K> mI;
        private final V mJ;

        @Override // com.b.a.c.e, java.util.Map.Entry
        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.mI;
        }

        b(r<K> rVar, r<K> rVar2, V v) {
            this(bh.b(rVar, rVar2), v);
        }

        b(bh<K> bhVar, V v) {
            this.mI = bhVar;
            this.mJ = v;
        }

        public final bh<K> gd() {
            return this.mI;
        }

        @Override // com.b.a.c.e, java.util.Map.Entry
        public final V getValue() {
            return this.mJ;
        }

        public final boolean g(K k) {
            return this.mI.apply(k);
        }

        final r<K> ge() {
            return this.mI.lO;
        }

        final r<K> gf() {
            return this.mI.lP;
        }
    }

    @Override // com.b.a.c.bi
    public final V a(K k) {
        b<K, V> bVar;
        Map.Entry<r<K>, b<K, V>> floorEntry = this.mF.floorEntry(r.b(k));
        if (floorEntry != null && floorEntry.getValue().g(k)) {
            bVar = floorEntry.getValue();
        } else {
            bVar = null;
        }
        b<K, V> bVar2 = bVar;
        if (bVar == null) {
            return null;
        }
        return bVar2.getValue();
    }

    @Override // com.b.a.c.bi
    public final void a(bh<K> bhVar, V v) {
        if (!bhVar.fZ()) {
            com.b.a.a.i.i(v);
            if (!bhVar.fZ()) {
                Map.Entry<r<K>, b<K, V>> lowerEntry = this.mF.lowerEntry(bhVar.lO);
                if (lowerEntry != null) {
                    b<K, V> value = lowerEntry.getValue();
                    if (value.gf().a(bhVar.lO) > 0) {
                        if (value.gf().a(bhVar.lP) > 0) {
                            a(bhVar.lP, value.gf(), lowerEntry.getValue().getValue());
                        }
                        a(value.ge(), bhVar.lO, lowerEntry.getValue().getValue());
                    }
                }
                Map.Entry<r<K>, b<K, V>> lowerEntry2 = this.mF.lowerEntry(bhVar.lP);
                if (lowerEntry2 != null) {
                    b<K, V> value2 = lowerEntry2.getValue();
                    if (value2.gf().a(bhVar.lP) > 0) {
                        a(bhVar.lP, value2.gf(), lowerEntry2.getValue().getValue());
                        this.mF.remove(bhVar.lO);
                    }
                }
                this.mF.subMap(bhVar.lO, bhVar.lP).clear();
            }
            this.mF.put(bhVar.lO, new b(bhVar, v));
        }
    }

    private void a(r<K> rVar, r<K> rVar2, V v) {
        this.mF.put(rVar, new b(rVar, rVar2, v));
    }

    @Override // com.b.a.c.bi
    public final Map<bh<K>, V> fj() {
        return new a(this, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TreeRangeMap.java */
    /* loaded from: repireall.jar:com/b/a/c/cc$a.class */
    public final class a extends AbstractMap<bh<K>, V> {
        private a() {
        }

        /* synthetic */ a(cc ccVar, byte b) {
            this();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V get(Object obj) {
            if (obj instanceof bh) {
                bh bhVar = (bh) obj;
                b bVar = (b) cc.this.mF.get(bhVar.lO);
                if (bVar != null && bVar.gd().equals(bhVar)) {
                    return (V) bVar.getValue();
                }
                return null;
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<bh<K>, V>> entrySet() {
            return new AbstractSet<Map.Entry<bh<K>, V>>() { // from class: com.b.a.c.cc.a.1
                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator<Map.Entry<bh<K>, V>> iterator() {
                    return (Iterator<V>) cc.this.mF.values().iterator();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return cc.this.mF.size();
                }
            };
        }
    }

    static {
        new bi() { // from class: com.b.a.c.cc.1
            @Override // com.b.a.c.bi
            public final Object a(Integer num) {
                return null;
            }

            @Override // com.b.a.c.bi
            public final void a(bh bhVar, Object obj) {
                com.b.a.a.i.i(bhVar);
                String valueOf = String.valueOf(String.valueOf(bhVar));
                throw new IllegalArgumentException(new StringBuilder(46 + valueOf.length()).append("Cannot insert range ").append(valueOf).append(" into an empty subRangeMap").toString());
            }

            @Override // com.b.a.c.bi
            public final Map<bh, Object> fj() {
                return Collections.emptyMap();
            }
        };
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bi) {
            return fj().equals(((bi) obj).fj());
        }
        return false;
    }

    public final int hashCode() {
        return fj().hashCode();
    }

    public final String toString() {
        return this.mF.values().toString();
    }
}