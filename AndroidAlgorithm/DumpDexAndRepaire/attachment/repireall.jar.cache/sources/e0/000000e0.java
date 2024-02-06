package com.b.a.b;

import com.b.a.a.g;
import com.b.a.a.p;
import com.b.a.a.q;
import com.b.a.b.a;
import com.b.a.b.g;
import java.util.logging.Logger;

/* compiled from: CacheBuilder.java */
/* loaded from: repireall.jar:com/b/a/b/c.class */
public final class c<K, V> {
    private static com.b.a.a.o<? extends a.b> gD = p.a((AnonymousClass1) new a.b() { // from class: com.b.a.b.c.1
        @Override // com.b.a.b.a.b
        public final void K(int i) {
        }

        @Override // com.b.a.b.a.b
        public final void L(int i) {
        }

        @Override // com.b.a.b.a.b
        public final void a(long j) {
        }

        @Override // com.b.a.b.a.b
        public final void b(long j) {
        }

        @Override // com.b.a.b.a.b
        public final void dd() {
        }
    });
    static final AnonymousClass3 gE;
    private static final Logger gF;
    o<? super K, ? super V> gL;
    private g.q gM;
    private g.q gN;
    com.b.a.a.c<Object> gR;
    com.b.a.a.c<Object> gS;
    l<? super K, ? super V> gT;
    q go;
    private boolean gG = true;
    int gH = -1;
    int gI = -1;
    long gJ = -1;
    private long gK = -1;
    long gO = -1;
    long gP = -1;
    long gQ = -1;
    com.b.a.a.o<? extends a.b> gU = gD;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.b.a.b.c$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.b.a.b.c$3] */
    static {
        new e(0L, 0L, 0L, 0L, 0L, 0L);
        new com.b.a.a.o<a.b>() { // from class: com.b.a.b.c.2
            @Override // com.b.a.a.o
            public final /* synthetic */ a.b get() {
                return new a.C0004a();
            }
        };
        gE = new q() { // from class: com.b.a.b.c.3
            @Override // com.b.a.a.q
            public final long db() {
                return 0L;
            }
        };
        gF = Logger.getLogger(c.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheBuilder.java */
    /* loaded from: repireall.jar:com/b/a/b/c$a.class */
    public enum a implements l<Object, Object> {
        INSTANCE;

        @Override // com.b.a.b.l
        public final void onRemoval(m<Object, Object> mVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheBuilder.java */
    /* loaded from: repireall.jar:com/b/a/b/c$b.class */
    public enum b implements o<Object, Object> {
        INSTANCE;

        @Override // com.b.a.b.o
        public final int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    c() {
    }

    public static c<Object, Object> de() {
        return new c<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g.q df() {
        return (g.q) com.b.a.a.g.d(this.gM, g.q.STRONG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g.q dg() {
        return (g.q) com.b.a.a.g.d(this.gN, g.q.STRONG);
    }

    public final <K1 extends K, V1 extends V> f<K1, V1> a(d<? super K1, V1> dVar) {
        o<? super K, ? super V> oVar = this.gL;
        com.b.a.a.i.b(this.gK == -1, "maximumWeight requires weigher");
        return new g.k(this, dVar);
    }

    public final String toString() {
        g.a h = com.b.a.a.g.h(this);
        if (this.gH != -1) {
            h.d("initialCapacity", this.gH);
        }
        if (this.gI != -1) {
            h.d("concurrencyLevel", this.gI);
        }
        if (this.gJ != -1) {
            h.a("maximumSize", this.gJ);
        }
        if (this.gK != -1) {
            h.a("maximumWeight", this.gK);
        }
        if (this.gO != -1) {
            h.d("expireAfterWrite", new StringBuilder(22).append(this.gO).append("ns").toString());
        }
        if (this.gP != -1) {
            h.d("expireAfterAccess", new StringBuilder(22).append(this.gP).append("ns").toString());
        }
        g.q qVar = this.gM;
        g.q qVar2 = this.gN;
        com.b.a.a.c<Object> cVar = this.gR;
        com.b.a.a.c<Object> cVar2 = this.gS;
        l<? super K, ? super V> lVar = this.gT;
        return h.toString();
    }
}