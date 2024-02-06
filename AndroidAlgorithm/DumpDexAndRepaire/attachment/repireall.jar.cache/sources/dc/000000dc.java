package com.b.a.b;

/* compiled from: AbstractCache.java */
/* loaded from: repireall.jar:com/b/a/b/a.class */
public abstract class a<K, V> implements com.b.a.b.b<K, V> {

    /* compiled from: AbstractCache.java */
    /* loaded from: repireall.jar:com/b/a/b/a$b.class */
    public interface b {
        void K(int i);

        void L(int i);

        void a(long j);

        void b(long j);

        void dd();
    }

    /* compiled from: AbstractCache.java */
    /* renamed from: com.b.a.b.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:com/b/a/b/a$a.class */
    public static final class C0004a implements b {
        private final h gx = i.dQ();
        private final h gy = i.dQ();
        private final h gz = i.dQ();
        private final h gA = i.dQ();
        private final h gB = i.dQ();
        private final h gC = i.dQ();

        @Override // com.b.a.b.a.b
        public final void K(int i) {
            this.gx.f(1L);
        }

        @Override // com.b.a.b.a.b
        public final void L(int i) {
            this.gy.f(1L);
        }

        @Override // com.b.a.b.a.b
        public final void a(long j) {
            this.gz.dP();
            this.gB.f(j);
        }

        @Override // com.b.a.b.a.b
        public final void b(long j) {
            this.gA.dP();
            this.gB.f(j);
        }

        @Override // com.b.a.b.a.b
        public final void dd() {
            this.gC.dP();
        }
    }
}