package com.b.a.a;

/* compiled from: Ticker.java */
/* loaded from: repireall.jar:com/b/a/a/q.class */
public abstract class q {
    private static final AnonymousClass1 gw = new q() { // from class: com.b.a.a.q.1
        @Override // com.b.a.a.q
        public final long db() {
            return System.nanoTime();
        }
    };

    public abstract long db();

    public static q dc() {
        return gw;
    }
}