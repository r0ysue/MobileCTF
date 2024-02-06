package com.b.a.c;

/* compiled from: ComparisonChain.java */
/* loaded from: repireall.jar:com/b/a/c/q.class */
public abstract class q {
    private static final AnonymousClass1 jt = new q() { // from class: com.b.a.c.q.1
        @Override // com.b.a.c.q
        public final q a(r rVar, r rVar2) {
            int compareTo = rVar.compareTo(rVar2);
            if (compareTo < 0) {
                return q.ju;
            }
            return compareTo > 0 ? q.jv : q.jt;
        }

        @Override // com.b.a.c.q
        public final int eq() {
            return 0;
        }
    };
    private static final a ju = new a(-1);
    private static final a jv = new a(1);

    public abstract q a(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract int eq();

    /* synthetic */ q(byte b) {
        this();
    }

    private q() {
    }

    public static q ep() {
        return jt;
    }

    /* compiled from: ComparisonChain.java */
    /* loaded from: repireall.jar:com/b/a/c/q$a.class */
    private static final class a extends q {
        private int jw;

        a(int i) {
            super((byte) 0);
            this.jw = i;
        }

        @Override // com.b.a.c.q
        public final q a(r rVar, r rVar2) {
            return this;
        }

        @Override // com.b.a.c.q
        public final int eq() {
            return this.jw;
        }
    }
}