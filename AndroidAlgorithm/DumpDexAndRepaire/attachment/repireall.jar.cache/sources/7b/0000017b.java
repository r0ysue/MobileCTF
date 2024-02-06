package com.b.a.c;

import com.b.a.c.ay;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapMakerInternalMap.java */
/* loaded from: repireall.jar:com/b/a/c/az.class */
public class az<K, V> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
    private transient int hc;
    private transient int hd;
    final transient i<K, V>[] kT;
    final com.b.a.a.c<Object> kU;
    final com.b.a.a.c<Object> kV;
    private k kP;
    final k kW;
    private int kO;
    final long kX;
    final long kY;
    final Queue<ay.c<K, V>> kZ;
    private ay.b<K, V> jG;
    final transient a la;
    final com.b.a.a.q lb;
    private transient Set<K> le;
    private transient Collection<V> lf;
    private transient Set<Map.Entry<K, V>> lg;
    private static final Logger kS = Logger.getLogger(az.class.getName());
    private static r<Object, Object> lc = new r<Object, Object>() { // from class: com.b.a.c.az.1
        @Override // com.b.a.c.az.r
        public final Object get() {
            return null;
        }

        @Override // com.b.a.c.az.r
        public final h<Object, Object> fC() {
            return null;
        }

        @Override // com.b.a.c.az.r
        public final r<Object, Object> a(ReferenceQueue<Object> referenceQueue, Object obj, h<Object, Object> hVar) {
            return this;
        }

        @Override // com.b.a.c.az.r
        public final void fD() {
        }
    };
    static final Queue<? extends Object> ld = new AbstractQueue<Object>() { // from class: com.b.a.c.az.2
        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return av.fq();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$h.class */
    public interface h<K, V> {
        r<K, V> getValueReference();

        void setValueReference(r<K, V> rVar);

        h<K, V> getNext();

        int getHash();

        K getKey();

        long getExpirationTime();

        void setExpirationTime(long j);

        h<K, V> getNextExpirable();

        void setNextExpirable(h<K, V> hVar);

        h<K, V> getPreviousExpirable();

        void setPreviousExpirable(h<K, V> hVar);

        h<K, V> getNextEvictable();

        void setNextEvictable(h<K, V> hVar);

        h<K, V> getPreviousEvictable();

        void setPreviousEvictable(h<K, V> hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$k.class */
    public enum k {
        STRONG { // from class: com.b.a.c.az.k.1
            @Override // com.b.a.c.az.k
            final <K, V> r<K, V> referenceValue(i<K, V> iVar, h<K, V> hVar, V v) {
                return new p(v);
            }

            @Override // com.b.a.c.az.k
            final com.b.a.a.c<Object> defaultEquivalence() {
                return com.b.a.a.c.cT();
            }
        },
        SOFT { // from class: com.b.a.c.az.k.2
            @Override // com.b.a.c.az.k
            final <K, V> r<K, V> referenceValue(i<K, V> iVar, h<K, V> hVar, V v) {
                return new j(iVar.lp, v, hVar);
            }

            @Override // com.b.a.c.az.k
            final com.b.a.a.c<Object> defaultEquivalence() {
                return com.b.a.a.c.cU();
            }
        },
        WEAK { // from class: com.b.a.c.az.k.3
            @Override // com.b.a.c.az.k
            final <K, V> r<K, V> referenceValue(i<K, V> iVar, h<K, V> hVar, V v) {
                return new x(iVar.lp, v, hVar);
            }

            @Override // com.b.a.c.az.k
            final com.b.a.a.c<Object> defaultEquivalence() {
                return com.b.a.a.c.cU();
            }
        };

        abstract <K, V> r<K, V> referenceValue(i<K, V> iVar, h<K, V> hVar, V v);

        abstract com.b.a.a.c<Object> defaultEquivalence();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$r.class */
    public interface r<K, V> {
        V get();

        h<K, V> fC();

        r<K, V> a(ReferenceQueue<V> referenceQueue, V v, h<K, V> hVar);

        void fD();
    }

    final boolean fu() {
        return this.kO != -1;
    }

    final boolean fv() {
        return dj() || fw();
    }

    private boolean dj() {
        return this.kY > 0;
    }

    final boolean fw() {
        return this.kX > 0;
    }

    final boolean fx() {
        return this.kP != k.STRONG;
    }

    final boolean fy() {
        return this.kW != k.STRONG;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$a.class */
    public enum a {
        STRONG { // from class: com.b.a.c.az.a.1
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new l(k, i, hVar);
            }
        },
        STRONG_EXPIRABLE { // from class: com.b.a.c.az.a.2
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new n(k, i, hVar);
            }

            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> copyEntry(i<K, V> iVar, h<K, V> hVar, h<K, V> hVar2) {
                h<K, V> copyEntry = super.copyEntry(iVar, hVar, hVar2);
                copyExpirableEntry(hVar, copyEntry);
                return copyEntry;
            }
        },
        STRONG_EVICTABLE { // from class: com.b.a.c.az.a.3
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new m(k, i, hVar);
            }

            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> copyEntry(i<K, V> iVar, h<K, V> hVar, h<K, V> hVar2) {
                h<K, V> copyEntry = super.copyEntry(iVar, hVar, hVar2);
                copyEvictableEntry(hVar, copyEntry);
                return copyEntry;
            }
        },
        STRONG_EXPIRABLE_EVICTABLE { // from class: com.b.a.c.az.a.4
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new o(k, i, hVar);
            }

            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> copyEntry(i<K, V> iVar, h<K, V> hVar, h<K, V> hVar2) {
                h<K, V> copyEntry = super.copyEntry(iVar, hVar, hVar2);
                copyExpirableEntry(hVar, copyEntry);
                copyEvictableEntry(hVar, copyEntry);
                return copyEntry;
            }
        },
        WEAK { // from class: com.b.a.c.az.a.5
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new t(iVar.lo, k, i, hVar);
            }
        },
        WEAK_EXPIRABLE { // from class: com.b.a.c.az.a.6
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new v(iVar.lo, k, i, hVar);
            }

            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> copyEntry(i<K, V> iVar, h<K, V> hVar, h<K, V> hVar2) {
                h<K, V> copyEntry = super.copyEntry(iVar, hVar, hVar2);
                copyExpirableEntry(hVar, copyEntry);
                return copyEntry;
            }
        },
        WEAK_EVICTABLE { // from class: com.b.a.c.az.a.7
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new u(iVar.lo, k, i, hVar);
            }

            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> copyEntry(i<K, V> iVar, h<K, V> hVar, h<K, V> hVar2) {
                h<K, V> copyEntry = super.copyEntry(iVar, hVar, hVar2);
                copyEvictableEntry(hVar, copyEntry);
                return copyEntry;
            }
        },
        WEAK_EXPIRABLE_EVICTABLE { // from class: com.b.a.c.az.a.8
            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar) {
                return new w(iVar.lo, k, i, hVar);
            }

            @Override // com.b.a.c.az.a
            final <K, V> h<K, V> copyEntry(i<K, V> iVar, h<K, V> hVar, h<K, V> hVar2) {
                h<K, V> copyEntry = super.copyEntry(iVar, hVar, hVar2);
                copyExpirableEntry(hVar, copyEntry);
                copyEvictableEntry(hVar, copyEntry);
                return copyEntry;
            }
        };
        
        static final int EXPIRABLE_MASK = 1;
        static final int EVICTABLE_MASK = 2;
        static final a[][] factories = {new a[]{STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE}, new a[0], new a[]{WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE}};

        abstract <K, V> h<K, V> newEntry(i<K, V> iVar, K k, int i, h<K, V> hVar);

        static a getFactory(k kVar, boolean z, boolean z2) {
            return factories[kVar.ordinal()][(z ? (char) 1 : (char) 0) | (z2 ? (char) 2 : (char) 0)];
        }

        <K, V> h<K, V> copyEntry(i<K, V> iVar, h<K, V> hVar, h<K, V> hVar2) {
            return newEntry(iVar, hVar.getKey(), hVar.getHash(), hVar2);
        }

        <K, V> void copyExpirableEntry(h<K, V> hVar, h<K, V> hVar2) {
            hVar2.setExpirationTime(hVar.getExpirationTime());
            az.a(hVar.getPreviousExpirable(), hVar2);
            az.a(hVar2, hVar.getNextExpirable());
            az.c(hVar);
        }

        <K, V> void copyEvictableEntry(h<K, V> hVar, h<K, V> hVar2) {
            az.b(hVar.getPreviousEvictable(), hVar2);
            az.b(hVar2, hVar.getNextEvictable());
            az.d(hVar);
        }
    }

    static <K, V> r<K, V> fz() {
        return (r<K, V>) lc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$g.class */
    public enum g implements h<Object, Object> {
        INSTANCE;

        @Override // com.b.a.c.az.h
        public final r<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.b.a.c.az.h
        public final void setValueReference(r<Object, Object> rVar) {
        }

        @Override // com.b.a.c.az.h
        public final h<Object, Object> getNext() {
            return null;
        }

        @Override // com.b.a.c.az.h
        public final int getHash() {
            return 0;
        }

        @Override // com.b.a.c.az.h
        public final Object getKey() {
            return null;
        }

        @Override // com.b.a.c.az.h
        public final long getExpirationTime() {
            return 0L;
        }

        @Override // com.b.a.c.az.h
        public final void setExpirationTime(long j) {
        }

        @Override // com.b.a.c.az.h
        public final h<Object, Object> getNextExpirable() {
            return this;
        }

        @Override // com.b.a.c.az.h
        public final void setNextExpirable(h<Object, Object> hVar) {
        }

        @Override // com.b.a.c.az.h
        public final h<Object, Object> getPreviousExpirable() {
            return this;
        }

        @Override // com.b.a.c.az.h
        public final void setPreviousExpirable(h<Object, Object> hVar) {
        }

        @Override // com.b.a.c.az.h
        public final h<Object, Object> getNextEvictable() {
            return this;
        }

        @Override // com.b.a.c.az.h
        public final void setNextEvictable(h<Object, Object> hVar) {
        }

        @Override // com.b.a.c.az.h
        public final h<Object, Object> getPreviousEvictable() {
            return this;
        }

        @Override // com.b.a.c.az.h
        public final void setPreviousEvictable(h<Object, Object> hVar) {
        }
    }

    static <K, V> h<K, V> fA() {
        return g.INSTANCE;
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$l.class */
    static class l<K, V> implements h<K, V> {
        private K il;
        private int im;
        private h<K, V> lu;
        private volatile r<K, V> lv = az.fz();

        l(K k, int i, h<K, V> hVar) {
            this.il = k;
            this.im = i;
            this.lu = hVar;
        }

        @Override // com.b.a.c.az.h
        public K getKey() {
            return this.il;
        }

        @Override // com.b.a.c.az.h
        public long getExpirationTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setExpirationTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getNextExpirable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setNextExpirable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getPreviousExpirable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setPreviousExpirable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getNextEvictable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setNextEvictable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getPreviousEvictable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setPreviousEvictable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public r<K, V> getValueReference() {
            return this.lv;
        }

        @Override // com.b.a.c.az.h
        public void setValueReference(r<K, V> rVar) {
            r<K, V> rVar2 = this.lv;
            this.lv = rVar;
            rVar2.fD();
        }

        @Override // com.b.a.c.az.h
        public int getHash() {
            return this.im;
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getNext() {
            return this.lu;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$n.class */
    static final class n<K, V> extends l<K, V> {
        private volatile long ly;
        private h<K, V> lz;
        private h<K, V> lA;

        n(K k, int i, h<K, V> hVar) {
            super(k, i, hVar);
            this.ly = Long.MAX_VALUE;
            this.lz = az.fA();
            this.lA = az.fA();
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final long getExpirationTime() {
            return this.ly;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setExpirationTime(long j) {
            this.ly = j;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getNextExpirable() {
            return this.lz;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setNextExpirable(h<K, V> hVar) {
            this.lz = hVar;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getPreviousExpirable() {
            return this.lA;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setPreviousExpirable(h<K, V> hVar) {
            this.lA = hVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$m.class */
    static final class m<K, V> extends l<K, V> {
        private h<K, V> lw;
        private h<K, V> lx;

        m(K k, int i, h<K, V> hVar) {
            super(k, i, hVar);
            this.lw = az.fA();
            this.lx = az.fA();
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getNextEvictable() {
            return this.lw;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setNextEvictable(h<K, V> hVar) {
            this.lw = hVar;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getPreviousEvictable() {
            return this.lx;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setPreviousEvictable(h<K, V> hVar) {
            this.lx = hVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$o.class */
    static final class o<K, V> extends l<K, V> {
        private volatile long ly;
        private h<K, V> lz;
        private h<K, V> lA;
        private h<K, V> lw;
        private h<K, V> lx;

        o(K k, int i, h<K, V> hVar) {
            super(k, i, hVar);
            this.ly = Long.MAX_VALUE;
            this.lz = az.fA();
            this.lA = az.fA();
            this.lw = az.fA();
            this.lx = az.fA();
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final long getExpirationTime() {
            return this.ly;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setExpirationTime(long j) {
            this.ly = j;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getNextExpirable() {
            return this.lz;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setNextExpirable(h<K, V> hVar) {
            this.lz = hVar;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getPreviousExpirable() {
            return this.lA;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setPreviousExpirable(h<K, V> hVar) {
            this.lA = hVar;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getNextEvictable() {
            return this.lw;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setNextEvictable(h<K, V> hVar) {
            this.lw = hVar;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final h<K, V> getPreviousEvictable() {
            return this.lx;
        }

        @Override // com.b.a.c.az.l, com.b.a.c.az.h
        public final void setPreviousEvictable(h<K, V> hVar) {
            this.lx = hVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$t.class */
    static class t<K, V> extends WeakReference<K> implements h<K, V> {
        private int im;
        private h<K, V> lu;
        private volatile r<K, V> lv;

        t(ReferenceQueue<K> referenceQueue, K k, int i, h<K, V> hVar) {
            super(k, referenceQueue);
            this.lv = az.fz();
            this.im = i;
            this.lu = hVar;
        }

        @Override // com.b.a.c.az.h
        public K getKey() {
            return (K) get();
        }

        @Override // com.b.a.c.az.h
        public long getExpirationTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setExpirationTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getNextExpirable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setNextExpirable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getPreviousExpirable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setPreviousExpirable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getNextEvictable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setNextEvictable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getPreviousEvictable() {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public void setPreviousEvictable(h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.b.a.c.az.h
        public r<K, V> getValueReference() {
            return this.lv;
        }

        @Override // com.b.a.c.az.h
        public void setValueReference(r<K, V> rVar) {
            r<K, V> rVar2 = this.lv;
            this.lv = rVar;
            rVar2.fD();
        }

        @Override // com.b.a.c.az.h
        public int getHash() {
            return this.im;
        }

        @Override // com.b.a.c.az.h
        public h<K, V> getNext() {
            return this.lu;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$v.class */
    static final class v<K, V> extends t<K, V> {
        private volatile long ly;
        private h<K, V> lz;
        private h<K, V> lA;

        v(ReferenceQueue<K> referenceQueue, K k, int i, h<K, V> hVar) {
            super(referenceQueue, k, i, hVar);
            this.ly = Long.MAX_VALUE;
            this.lz = az.fA();
            this.lA = az.fA();
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final long getExpirationTime() {
            return this.ly;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setExpirationTime(long j) {
            this.ly = j;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getNextExpirable() {
            return this.lz;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setNextExpirable(h<K, V> hVar) {
            this.lz = hVar;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getPreviousExpirable() {
            return this.lA;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setPreviousExpirable(h<K, V> hVar) {
            this.lA = hVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$u.class */
    static final class u<K, V> extends t<K, V> {
        private h<K, V> lw;
        private h<K, V> lx;

        u(ReferenceQueue<K> referenceQueue, K k, int i, h<K, V> hVar) {
            super(referenceQueue, k, i, hVar);
            this.lw = az.fA();
            this.lx = az.fA();
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getNextEvictable() {
            return this.lw;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setNextEvictable(h<K, V> hVar) {
            this.lw = hVar;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getPreviousEvictable() {
            return this.lx;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setPreviousEvictable(h<K, V> hVar) {
            this.lx = hVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$w.class */
    static final class w<K, V> extends t<K, V> {
        private volatile long ly;
        private h<K, V> lz;
        private h<K, V> lA;
        private h<K, V> lw;
        private h<K, V> lx;

        w(ReferenceQueue<K> referenceQueue, K k, int i, h<K, V> hVar) {
            super(referenceQueue, k, i, hVar);
            this.ly = Long.MAX_VALUE;
            this.lz = az.fA();
            this.lA = az.fA();
            this.lw = az.fA();
            this.lx = az.fA();
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final long getExpirationTime() {
            return this.ly;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setExpirationTime(long j) {
            this.ly = j;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getNextExpirable() {
            return this.lz;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setNextExpirable(h<K, V> hVar) {
            this.lz = hVar;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getPreviousExpirable() {
            return this.lA;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setPreviousExpirable(h<K, V> hVar) {
            this.lA = hVar;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getNextEvictable() {
            return this.lw;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setNextEvictable(h<K, V> hVar) {
            this.lw = hVar;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final h<K, V> getPreviousEvictable() {
            return this.lx;
        }

        @Override // com.b.a.c.az.t, com.b.a.c.az.h
        public final void setPreviousEvictable(h<K, V> hVar) {
            this.lx = hVar;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$x.class */
    static final class x<K, V> extends WeakReference<V> implements r<K, V> {
        private h<K, V> lt;

        x(ReferenceQueue<V> referenceQueue, V v, h<K, V> hVar) {
            super(v, referenceQueue);
            this.lt = hVar;
        }

        @Override // com.b.a.c.az.r
        public final h<K, V> fC() {
            return this.lt;
        }

        @Override // com.b.a.c.az.r
        public final void fD() {
            clear();
        }

        @Override // com.b.a.c.az.r
        public final r<K, V> a(ReferenceQueue<V> referenceQueue, V v, h<K, V> hVar) {
            return new x(referenceQueue, v, hVar);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$j.class */
    static final class j<K, V> extends SoftReference<V> implements r<K, V> {
        private h<K, V> lt;

        j(ReferenceQueue<V> referenceQueue, V v, h<K, V> hVar) {
            super(v, referenceQueue);
            this.lt = hVar;
        }

        @Override // com.b.a.c.az.r
        public final h<K, V> fC() {
            return this.lt;
        }

        @Override // com.b.a.c.az.r
        public final void fD() {
            clear();
        }

        @Override // com.b.a.c.az.r
        public final r<K, V> a(ReferenceQueue<V> referenceQueue, V v, h<K, V> hVar) {
            return new j(referenceQueue, v, hVar);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$p.class */
    static final class p<K, V> implements r<K, V> {
        private V ip;

        p(V v) {
            this.ip = v;
        }

        @Override // com.b.a.c.az.r
        public final V get() {
            return this.ip;
        }

        @Override // com.b.a.c.az.r
        public final h<K, V> fC() {
            return null;
        }

        @Override // com.b.a.c.az.r
        public final r<K, V> a(ReferenceQueue<V> referenceQueue, V v, h<K, V> hVar) {
            return this;
        }

        @Override // com.b.a.c.az.r
        public final void fD() {
        }
    }

    private int e(Object obj) {
        int e2 = this.kU.e(obj);
        int i2 = e2 + ((e2 << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    final void a(r<K, V> rVar) {
        h<K, V> fC = rVar.fC();
        int hash = fC.getHash();
        W(hash).a((i<K, V>) fC.getKey(), hash, (r<i<K, V>, V>) rVar);
    }

    final void a(h<K, V> hVar) {
        int hash = hVar.getHash();
        W(hash).a(hVar, hash);
    }

    private i<K, V> W(int i2) {
        return this.kT[(i2 >>> this.hd) & this.hc];
    }

    final boolean b(h<K, V> hVar) {
        return a(hVar, this.lb.db());
    }

    static boolean a(h<K, V> hVar, long j2) {
        return j2 - hVar.getExpirationTime() > 0;
    }

    static <K, V> void a(h<K, V> hVar, h<K, V> hVar2) {
        hVar.setNextExpirable(hVar2);
        hVar2.setPreviousExpirable(hVar);
    }

    final void fB() {
        while (true) {
            ay.c<K, V> poll = this.kZ.poll();
            if (poll != null) {
                try {
                    this.jG.a(poll);
                } catch (Exception e2) {
                    kS.log(Level.WARNING, "Exception thrown by removal listener", (Throwable) e2);
                }
            } else {
                return;
            }
        }
    }

    static <K, V> void b(h<K, V> hVar, h<K, V> hVar2) {
        hVar.setNextEvictable(hVar2);
        hVar2.setPreviousEvictable(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$i.class */
    public static class i<K, V> extends ReentrantLock {
        final az<K, V> lm;
        volatile int hO;
        int hQ;
        private int hR;
        volatile AtomicReferenceArray<h<K, V>> hS;
        private int ln;
        final ReferenceQueue<K> lo;
        final ReferenceQueue<V> lp;
        private Queue<h<K, V>> hW;
        final AtomicInteger lq;
        final Queue<h<K, V>> lr;
        final Queue<h<K, V>> ls;

        private static AtomicReferenceArray<h<K, V>> N(int i) {
            return new AtomicReferenceArray<>(i);
        }

        private h<K, V> c(h<K, V> hVar, h<K, V> hVar2) {
            r<K, V> valueReference;
            V v;
            if (hVar.getKey() == null || (v = (valueReference = hVar.getValueReference()).get()) == null) {
                return null;
            }
            h<K, V> copyEntry = this.lm.la.copyEntry(this, hVar, hVar2);
            copyEntry.setValueReference(valueReference.a(this.lp, v, copyEntry));
            return copyEntry;
        }

        private void a(h<K, V> hVar, V v) {
            hVar.setValueReference(this.lm.kW.referenceValue(this, hVar, v));
            dJ();
            this.lr.add(hVar);
            if (!this.lm.fv()) {
                return;
            }
            b(hVar, this.lm.fw() ? this.lm.kX : this.lm.kY);
            this.ls.add(hVar);
        }

        final void fF() {
            if (tryLock()) {
                try {
                    dG();
                } finally {
                    unlock();
                }
            }
        }

        private void dG() {
            if (this.lm.fx()) {
                dH();
            }
            if (this.lm.fy()) {
                dI();
            }
        }

        private void dH() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.lo.poll();
                if (poll != null) {
                    this.lm.a((h) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        private void dI() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.lp.poll();
                if (poll != null) {
                    this.lm.a((r) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        private void f(h<K, V> hVar) {
            this.lr.add(hVar);
            if (this.lm.fw()) {
                b(hVar, this.lm.kX);
                this.ls.add(hVar);
            }
        }

        private void dJ() {
            while (true) {
                h<K, V> poll = this.hW.poll();
                if (poll != null) {
                    if (this.lr.contains(poll)) {
                        this.lr.add(poll);
                    }
                    if (this.lm.fw() && this.ls.contains(poll)) {
                        this.ls.add(poll);
                    }
                } else {
                    return;
                }
            }
        }

        private void b(h<K, V> hVar, long j) {
            hVar.setExpirationTime(this.lm.lb.db() + j);
        }

        final void fG() {
            if (tryLock()) {
                try {
                    fH();
                } finally {
                    unlock();
                }
            }
        }

        private void fH() {
            h<K, V> peek;
            dJ();
            if (this.ls.isEmpty()) {
                return;
            }
            long db = this.lm.lb.db();
            do {
                peek = this.ls.peek();
                if (peek == null) {
                    return;
                }
                az<K, V> azVar = this.lm;
                if (!az.a(peek, db)) {
                    return;
                }
            } while (a(peek, peek.getHash(), ay.a.EXPIRED));
            throw new AssertionError();
        }

        final void a(h<K, V> hVar, ay.a aVar) {
            K key = hVar.getKey();
            hVar.getHash();
            a((i<K, V>) key, (K) hVar.getValueReference().get(), aVar);
        }

        private void a(K k, V v, ay.a aVar) {
            if (this.lm.kZ != az.ld) {
                this.lm.kZ.offer(new ay.c<>(k, v, aVar));
            }
        }

        private h<K, V> e(Object obj, int i) {
            if (this.hO != 0) {
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                h<K, V> hVar = atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
                while (true) {
                    h<K, V> hVar2 = hVar;
                    if (hVar2 != null) {
                        if (hVar2.getHash() == i) {
                            K key = hVar2.getKey();
                            if (key != null) {
                                if (this.lm.kU.b(obj, key)) {
                                    return hVar2;
                                }
                            } else {
                                fF();
                            }
                        }
                        hVar = hVar2.getNext();
                    } else {
                        return null;
                    }
                }
            } else {
                return null;
            }
        }

        private h<K, V> f(Object obj, int i) {
            h<K, V> e = e(obj, i);
            if (e == null) {
                return null;
            }
            if (this.lm.fv() && this.lm.b(e)) {
                fG();
                return null;
            }
            return e;
        }

        final V g(Object obj, int i) {
            try {
                h<K, V> f = f(obj, i);
                if (f != null) {
                    V v = f.getValueReference().get();
                    if (v != null) {
                        if (this.lm.fw()) {
                            b(f, this.lm.kX);
                        }
                        this.hW.add(f);
                    } else {
                        fF();
                    }
                    return v;
                }
                fI();
                return null;
            } finally {
                fI();
            }
        }

        final boolean h(Object obj, int i) {
            try {
                if (this.hO != 0) {
                    h<K, V> f = f(obj, i);
                    if (f != null) {
                        return f.getValueReference().get() != null;
                    }
                    fI();
                    return false;
                }
                fI();
                return false;
            } finally {
                fI();
            }
        }

        final V b(K k, int i, V v, boolean z) {
            boolean z2;
            lock();
            try {
                fK();
                int i2 = this.hO + 1;
                int i3 = i2;
                if (i2 > this.hR) {
                    AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                    int length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i4 = this.hO;
                        AtomicReferenceArray<h<K, V>> N = N(length << 1);
                        this.hR = (N.length() * 3) / 4;
                        int length2 = N.length() - 1;
                        for (int i5 = 0; i5 < length; i5++) {
                            h<K, V> hVar = atomicReferenceArray.get(i5);
                            if (hVar != null) {
                                h<K, V> next = hVar.getNext();
                                int hash = hVar.getHash() & length2;
                                if (next == null) {
                                    N.set(hash, hVar);
                                } else {
                                    h<K, V> hVar2 = hVar;
                                    int i6 = hash;
                                    for (h<K, V> hVar3 = next; hVar3 != null; hVar3 = hVar3.getNext()) {
                                        int hash2 = hVar3.getHash() & length2;
                                        if (hash2 != i6) {
                                            i6 = hash2;
                                            hVar2 = hVar3;
                                        }
                                    }
                                    N.set(i6, hVar2);
                                    for (h<K, V> hVar4 = hVar; hVar4 != hVar2; hVar4 = hVar4.getNext()) {
                                        int hash3 = hVar4.getHash() & length2;
                                        h<K, V> c = c(hVar4, N.get(hash3));
                                        if (c != null) {
                                            N.set(hash3, c);
                                        } else {
                                            g(hVar4);
                                            i4--;
                                        }
                                    }
                                }
                            }
                        }
                        this.hS = N;
                        this.hO = i4;
                    }
                    i3 = this.hO + 1;
                }
                AtomicReferenceArray<h<K, V>> atomicReferenceArray2 = this.hS;
                int length3 = i & (atomicReferenceArray2.length() - 1);
                h<K, V> hVar5 = atomicReferenceArray2.get(length3);
                for (h<K, V> hVar6 = hVar5; hVar6 != null; hVar6 = hVar6.getNext()) {
                    K key = hVar6.getKey();
                    if (hVar6.getHash() == i && key != null && this.lm.kU.b(k, key)) {
                        V v2 = hVar6.getValueReference().get();
                        if (v2 == null) {
                            this.hQ++;
                            a((h<K, h<K, V>>) hVar6, (h<K, V>) v);
                            a((i<K, V>) k, (K) v2, ay.a.COLLECTED);
                            this.hO = this.hO;
                            unlock();
                            fL();
                            return null;
                        } else if (z) {
                            f(hVar6);
                            return v2;
                        } else {
                            this.hQ++;
                            a((i<K, V>) k, (K) v2, ay.a.REPLACED);
                            a((h<K, h<K, V>>) hVar6, (h<K, V>) v);
                            return v2;
                        }
                    }
                }
                this.hQ++;
                h<K, V> newEntry = this.lm.la.newEntry(this, k, i, hVar5);
                a((h<K, h<K, V>>) newEntry, (h<K, V>) v);
                atomicReferenceArray2.set(length3, newEntry);
                if (!this.lm.fu() || this.hO < this.ln) {
                    z2 = false;
                } else {
                    dJ();
                    h<K, V> remove = this.lr.remove();
                    if (!a(remove, remove.getHash(), ay.a.SIZE)) {
                        throw new AssertionError();
                    }
                    z2 = true;
                }
                if (z2) {
                    i3 = this.hO + 1;
                }
                this.hO = i3;
                unlock();
                fL();
                return null;
            } finally {
                unlock();
                fL();
            }
        }

        final boolean b(K k, int i, V v, V v2) {
            lock();
            try {
                fK();
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                int length = i & (atomicReferenceArray.length() - 1);
                h<K, V> hVar = atomicReferenceArray.get(length);
                for (h<K, V> hVar2 = hVar; hVar2 != null; hVar2 = hVar2.getNext()) {
                    K key = hVar2.getKey();
                    if (hVar2.getHash() == i && key != null && this.lm.kU.b(k, key)) {
                        r<K, V> valueReference = hVar2.getValueReference();
                        V v3 = valueReference.get();
                        if (v3 == null) {
                            if (b(valueReference)) {
                                int i2 = this.hO;
                                this.hQ++;
                                a((i<K, V>) key, (K) v3, ay.a.COLLECTED);
                                atomicReferenceArray.set(length, d(hVar, hVar2));
                                this.hO--;
                            }
                            unlock();
                            fL();
                            return false;
                        } else if (!this.lm.kV.b(v, v3)) {
                            f(hVar2);
                            unlock();
                            fL();
                            return false;
                        } else {
                            this.hQ++;
                            a((i<K, V>) k, (K) v3, ay.a.REPLACED);
                            a((h<K, h<K, V>>) hVar2, (h<K, V>) v2);
                            unlock();
                            fL();
                            return true;
                        }
                    }
                }
                unlock();
                fL();
                return false;
            } catch (Throwable th) {
                unlock();
                fL();
                throw th;
            }
        }

        final V c(K k, int i, V v) {
            lock();
            try {
                fK();
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                int length = i & (atomicReferenceArray.length() - 1);
                h<K, V> hVar = atomicReferenceArray.get(length);
                for (h<K, V> hVar2 = hVar; hVar2 != null; hVar2 = hVar2.getNext()) {
                    K key = hVar2.getKey();
                    if (hVar2.getHash() == i && key != null && this.lm.kU.b(k, key)) {
                        r<K, V> valueReference = hVar2.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 != null) {
                            this.hQ++;
                            a((i<K, V>) k, (K) v2, ay.a.REPLACED);
                            a((h<K, h<K, V>>) hVar2, (h<K, V>) v);
                            return v2;
                        }
                        if (b(valueReference)) {
                            int i2 = this.hO;
                            this.hQ++;
                            a((i<K, V>) key, (K) v2, ay.a.COLLECTED);
                            atomicReferenceArray.set(length, d(hVar, hVar2));
                            this.hO--;
                        }
                        unlock();
                        fL();
                        return null;
                    }
                }
                unlock();
                fL();
                return null;
            } finally {
                unlock();
                fL();
            }
        }

        final V i(Object obj, int i) {
            ay.a aVar;
            lock();
            try {
                fK();
                int i2 = this.hO;
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                int length = i & (atomicReferenceArray.length() - 1);
                h<K, V> hVar = atomicReferenceArray.get(length);
                for (h<K, V> hVar2 = hVar; hVar2 != null; hVar2 = hVar2.getNext()) {
                    K key = hVar2.getKey();
                    if (hVar2.getHash() == i && key != null && this.lm.kU.b(obj, key)) {
                        r<K, V> valueReference = hVar2.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            aVar = ay.a.EXPLICIT;
                        } else if (!b(valueReference)) {
                            unlock();
                            fL();
                            return null;
                        } else {
                            aVar = ay.a.COLLECTED;
                        }
                        this.hQ++;
                        a((i<K, V>) key, (K) v, aVar);
                        atomicReferenceArray.set(length, d(hVar, hVar2));
                        this.hO--;
                        return v;
                    }
                }
                unlock();
                fL();
                return null;
            } finally {
                unlock();
                fL();
            }
        }

        final boolean d(Object obj, int i, Object obj2) {
            ay.a aVar;
            lock();
            try {
                fK();
                int i2 = this.hO;
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                int length = i & (atomicReferenceArray.length() - 1);
                h<K, V> hVar = atomicReferenceArray.get(length);
                for (h<K, V> hVar2 = hVar; hVar2 != null; hVar2 = hVar2.getNext()) {
                    K key = hVar2.getKey();
                    if (hVar2.getHash() == i && key != null && this.lm.kU.b(obj, key)) {
                        r<K, V> valueReference = hVar2.getValueReference();
                        V v = valueReference.get();
                        if (this.lm.kV.b(obj2, v)) {
                            aVar = ay.a.EXPLICIT;
                        } else if (!b(valueReference)) {
                            unlock();
                            fL();
                            return false;
                        } else {
                            aVar = ay.a.COLLECTED;
                        }
                        this.hQ++;
                        a((i<K, V>) key, (K) v, aVar);
                        atomicReferenceArray.set(length, d(hVar, hVar2));
                        this.hO--;
                        return aVar == ay.a.EXPLICIT;
                    }
                }
                unlock();
                fL();
                return false;
            } finally {
                unlock();
                fL();
            }
        }

        private h<K, V> d(h<K, V> hVar, h<K, V> hVar2) {
            this.lr.remove(hVar2);
            this.ls.remove(hVar2);
            int i = this.hO;
            h<K, V> next = hVar2.getNext();
            h<K, V> hVar3 = hVar;
            while (true) {
                h<K, V> hVar4 = hVar3;
                if (hVar4 != hVar2) {
                    h<K, V> c = c(hVar4, next);
                    if (c != null) {
                        next = c;
                    } else {
                        g(hVar4);
                        i--;
                    }
                    hVar3 = hVar4.getNext();
                } else {
                    this.hO = i;
                    return next;
                }
            }
        }

        private void g(h<K, V> hVar) {
            a((h) hVar, ay.a.COLLECTED);
            this.lr.remove(hVar);
            this.ls.remove(hVar);
        }

        final boolean a(h<K, V> hVar, int i) {
            lock();
            try {
                int i2 = this.hO;
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                int length = i & (atomicReferenceArray.length() - 1);
                h<K, V> hVar2 = atomicReferenceArray.get(length);
                for (h<K, V> hVar3 = hVar2; hVar3 != null; hVar3 = hVar3.getNext()) {
                    if (hVar3 == hVar) {
                        this.hQ++;
                        a((i<K, V>) hVar3.getKey(), (K) hVar3.getValueReference().get(), ay.a.COLLECTED);
                        atomicReferenceArray.set(length, d(hVar2, hVar3));
                        this.hO--;
                        unlock();
                        fL();
                        return true;
                    }
                }
                unlock();
                fL();
                return false;
            } catch (Throwable th) {
                unlock();
                fL();
                throw th;
            }
        }

        final boolean a(K k, int i, r<K, V> rVar) {
            lock();
            try {
                int i2 = this.hO;
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
                int length = i & (atomicReferenceArray.length() - 1);
                h<K, V> hVar = atomicReferenceArray.get(length);
                for (h<K, V> hVar2 = hVar; hVar2 != null; hVar2 = hVar2.getNext()) {
                    K key = hVar2.getKey();
                    if (hVar2.getHash() == i && key != null && this.lm.kU.b(k, key)) {
                        if (hVar2.getValueReference() == rVar) {
                            this.hQ++;
                            a((i<K, V>) k, (K) rVar.get(), ay.a.COLLECTED);
                            atomicReferenceArray.set(length, d(hVar, hVar2));
                            this.hO--;
                        }
                        unlock();
                        if (isHeldByCurrentThread()) {
                            return false;
                        }
                        fL();
                        return false;
                    }
                }
                unlock();
                if (isHeldByCurrentThread()) {
                    return false;
                }
                fL();
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    fL();
                }
            }
        }

        private boolean a(h<K, V> hVar, int i, ay.a aVar) {
            int i2 = this.hO;
            AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hS;
            int length = i & (atomicReferenceArray.length() - 1);
            h<K, V> hVar2 = atomicReferenceArray.get(length);
            while (true) {
                h<K, V> hVar3 = hVar2;
                if (hVar3 != null) {
                    if (hVar3 != hVar) {
                        hVar2 = hVar3.getNext();
                    } else {
                        this.hQ++;
                        a((i<K, V>) hVar3.getKey(), (K) hVar3.getValueReference().get(), aVar);
                        atomicReferenceArray.set(length, d(hVar2, hVar3));
                        this.hO--;
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        private static boolean b(r<K, V> rVar) {
            return rVar.get() == null;
        }

        final void fI() {
            if ((this.lq.incrementAndGet() & 63) == 0) {
                fJ();
            }
        }

        private void fJ() {
            fK();
            fL();
        }

        private void fK() {
            if (tryLock()) {
                try {
                    dG();
                    fH();
                    this.lq.set(0);
                } finally {
                    unlock();
                }
            }
        }

        final void fL() {
            if (!isHeldByCurrentThread()) {
                this.lm.fB();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        long j2 = 0;
        i<K, V>[] iVarArr = this.kT;
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            if (iVarArr[i2].hO != 0) {
                return false;
            }
            j2 += iVarArr[i2].hQ;
        }
        if (j2 != 0) {
            for (int i3 = 0; i3 < iVarArr.length; i3++) {
                if (iVarArr[i3].hO != 0) {
                    return false;
                }
                j2 -= iVarArr[i3].hQ;
            }
            if (j2 != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        i<K, V>[] iVarArr;
        long j2 = 0;
        for (int i2 = 0; i2 < this.kT.length; i2++) {
            j2 += iVarArr[i2].hO;
        }
        return com.b.a.e.b.g(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int e2 = e(obj);
        return W(e2).g(obj, e2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int e2 = e(obj);
        return W(e2).h(obj, e2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
        r18 = r18 + 1;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsValue(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.c.az.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        com.b.a.a.i.i(k2);
        com.b.a.a.i.i(v2);
        int e2 = e(k2);
        return W(e2).b((i<K, V>) k2, e2, (int) v2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        com.b.a.a.i.i(k2);
        com.b.a.a.i.i(v2);
        int e2 = e(k2);
        return W(e2).b((i<K, V>) k2, e2, (int) v2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int e2 = e(obj);
        return W(e2).i(obj, e2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int e2 = e(obj);
        return W(e2).d(obj, e2, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, V v2, V v3) {
        com.b.a.a.i.i(k2);
        com.b.a.a.i.i(v3);
        if (v2 == null) {
            return false;
        }
        int e2 = e(k2);
        return W(e2).b((i<K, V>) k2, e2, v2, v3);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v2) {
        com.b.a.a.i.i(k2);
        com.b.a.a.i.i(v2);
        int e2 = e(k2);
        return W(e2).c(k2, e2, v2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #0 {all -> 0x010a, blocks: (B:8:0x0023, B:11:0x003b, B:13:0x0045, B:16:0x0056, B:17:0x0074, B:19:0x007d, B:21:0x0087, B:22:0x0095, B:25:0x00a7, B:27:0x00b2, B:30:0x00c1, B:32:0x00cc), top: B:39:0x0023 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void clear() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.c.az.clear():void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.le;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.le = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.lf;
        if (collection != null) {
            return collection;
        }
        s sVar = new s();
        this.lf = sVar;
        return sVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.lg;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.lg = cVar;
        return cVar;
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$d.class */
    abstract class d<E> implements Iterator<E> {
        private int hB;
        private int hC = -1;
        private i<K, V> li;
        private AtomicReferenceArray<h<K, V>> hE;
        private h<K, V> lj;
        private az<K, V>.y lk;
        private az<K, V>.y ll;

        d() {
            this.hB = az.this.kT.length - 1;
            dA();
        }

        private void dA() {
            this.lk = null;
            if (dB() || dC()) {
                return;
            }
            while (this.hB >= 0) {
                i<K, V>[] iVarArr = az.this.kT;
                int i = this.hB;
                this.hB = i - 1;
                this.li = iVarArr[i];
                if (this.li.hO != 0) {
                    this.hE = this.li.hS;
                    this.hC = this.hE.length() - 1;
                    if (dC()) {
                        return;
                    }
                }
            }
        }

        private boolean dB() {
            if (this.lj != null) {
                this.lj = this.lj.getNext();
                while (this.lj != null) {
                    if (!e(this.lj)) {
                        this.lj = this.lj.getNext();
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private boolean dC() {
            while (this.hC >= 0) {
                AtomicReferenceArray<h<K, V>> atomicReferenceArray = this.hE;
                int i = this.hC;
                this.hC = i - 1;
                h<K, V> hVar = atomicReferenceArray.get(i);
                this.lj = hVar;
                if (hVar != null && (e(this.lj) || dB())) {
                    return true;
                }
            }
            return false;
        }

        private boolean e(h<K, V> hVar) {
            V v;
            try {
                K key = hVar.getKey();
                az azVar = az.this;
                if (hVar.getKey() == null) {
                    v = null;
                } else {
                    V v2 = hVar.getValueReference().get();
                    if (v2 == null) {
                        v = null;
                    } else if (azVar.fv() && azVar.b(hVar)) {
                        v = null;
                    } else {
                        v = v2;
                    }
                }
                V v3 = v;
                if (v != null) {
                    this.lk = new y(key, v3);
                    this.li.fI();
                    return true;
                }
                this.li.fI();
                return false;
            } catch (Throwable th) {
                this.li.fI();
                throw th;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.lk != null;
        }

        final az<K, V>.y fE() {
            if (this.lk == null) {
                throw new NoSuchElementException();
            }
            this.ll = this.lk;
            dA();
            return this.ll;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.b.a.a.i.b(this.ll != null, "no calls to next() since the last call to remove()");
            az.this.remove(this.ll.getKey());
            this.ll = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$e.class */
    final class e extends d {
        e() {
            super();
        }

        @Override // java.util.Iterator
        public final K next() {
            return fE().getKey();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$q.class */
    final class q extends d {
        q() {
            super();
        }

        @Override // java.util.Iterator
        public final V next() {
            return fE().getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$y.class */
    public final class y extends com.b.a.c.e<K, V> {
        private K il;
        private V gb;

        y(K k, V v) {
            this.il = k;
            this.gb = v;
        }

        @Override // com.b.a.c.e, java.util.Map.Entry
        public final K getKey() {
            return this.il;
        }

        @Override // com.b.a.c.e, java.util.Map.Entry
        public final V getValue() {
            return this.gb;
        }

        @Override // com.b.a.c.e, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.il.equals(entry.getKey()) && this.gb.equals(entry.getValue());
            }
            return false;
        }

        @Override // com.b.a.c.e, java.util.Map.Entry
        public final int hashCode() {
            return this.il.hashCode() ^ this.gb.hashCode();
        }

        @Override // com.b.a.c.e, java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) az.this.put(this.il, v);
            this.gb = v;
            return v2;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$b.class */
    final class b extends d {
        b() {
            super();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            return fE();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$f.class */
    final class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return az.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return az.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return az.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return az.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            az.this.clear();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$s.class */
    final class s extends AbstractCollection<V> {
        s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return az.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return az.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return az.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            az.this.clear();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: repireall.jar:com/b/a/c/az$c.class */
    final class c extends AbstractSet<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = az.this.get(key)) != null && az.this.kV.b(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && az.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return az.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return az.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            az.this.clear();
        }
    }

    static <K, V> void c(h<K, V> hVar) {
        g gVar = g.INSTANCE;
        hVar.setNextExpirable(gVar);
        hVar.setPreviousExpirable(gVar);
    }

    static <K, V> void d(h<K, V> hVar) {
        g gVar = g.INSTANCE;
        hVar.setNextEvictable(gVar);
        hVar.setPreviousEvictable(gVar);
    }
}