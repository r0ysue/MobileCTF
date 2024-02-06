package com.b.a.c;

import com.b.a.a.g;
import com.b.a.c.az;

/* compiled from: MapMaker.java */
/* loaded from: repireall.jar:com/b/a/c/ay.class */
public final class ay extends ab<Object, Object> {
    boolean kN;
    private az.k kP;
    az.k kQ;
    com.b.a.a.c<Object> gR;
    private int gH = -1;
    private int gI = -1;
    int kO = -1;
    long gO = -1;
    long gP = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMaker.java */
    /* loaded from: repireall.jar:com/b/a/c/ay$a.class */
    public enum a {
        EXPLICIT { // from class: com.b.a.c.ay.a.1
            @Override // com.b.a.c.ay.a
            final boolean wasEvicted() {
                return false;
            }
        },
        REPLACED { // from class: com.b.a.c.ay.a.2
            @Override // com.b.a.c.ay.a
            final boolean wasEvicted() {
                return false;
            }
        },
        COLLECTED { // from class: com.b.a.c.ay.a.3
            @Override // com.b.a.c.ay.a
            final boolean wasEvicted() {
                return true;
            }
        },
        EXPIRED { // from class: com.b.a.c.ay.a.4
            @Override // com.b.a.c.ay.a
            final boolean wasEvicted() {
                return true;
            }
        },
        SIZE { // from class: com.b.a.c.ay.a.5
            @Override // com.b.a.c.ay.a
            final boolean wasEvicted() {
                return true;
            }
        };

        abstract boolean wasEvicted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMaker.java */
    /* loaded from: repireall.jar:com/b/a/c/ay$b.class */
    public interface b<K, V> {
        void a(c<K, V> cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int fs() {
        if (this.gH == -1) {
            return 16;
        }
        return this.gH;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ft() {
        if (this.gI == -1) {
            return 4;
        }
        return this.gI;
    }

    public final String toString() {
        g.a h = com.b.a.a.g.h(this);
        if (this.gH != -1) {
            h.d("initialCapacity", this.gH);
        }
        if (this.gI != -1) {
            h.d("concurrencyLevel", this.gI);
        }
        if (this.kO != -1) {
            h.d("maximumSize", this.kO);
        }
        if (this.gO != -1) {
            h.d("expireAfterWrite", new StringBuilder(22).append(this.gO).append("ns").toString());
        }
        if (this.gP != -1) {
            h.d("expireAfterAccess", new StringBuilder(22).append(this.gP).append("ns").toString());
        }
        az.k kVar = this.kP;
        az.k kVar2 = this.kQ;
        com.b.a.a.c<Object> cVar = this.gR;
        Object obj = this.jG;
        return h.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMaker.java */
    /* loaded from: repireall.jar:com/b/a/c/ay$c.class */
    public static final class c<K, V> extends ag<K, V> {
        private final a kR;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(K k, V v, a aVar) {
            super(k, v);
            this.kR = aVar;
        }
    }
}