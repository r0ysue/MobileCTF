package com.b.a.b;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LongAddables.java */
/* loaded from: repireall.jar:com/b/a/b/i.class */
final class i {
    private static final com.b.a.a.o<h> iu;

    static {
        com.b.a.a.o<h> oVar;
        try {
            new j();
            oVar = new com.b.a.a.o<h>() { // from class: com.b.a.b.i.1
                @Override // com.b.a.a.o
                public final /* synthetic */ h get() {
                    return new j();
                }
            };
        } catch (Throwable unused) {
            oVar = new com.b.a.a.o<h>() { // from class: com.b.a.b.i.2
                @Override // com.b.a.a.o
                public final /* synthetic */ h get() {
                    return new a((byte) 0);
                }
            };
        }
        iu = oVar;
    }

    public static h dQ() {
        return iu.get();
    }

    /* compiled from: LongAddables.java */
    /* loaded from: repireall.jar:com/b/a/b/i$a.class */
    private static final class a extends AtomicLong implements h {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // com.b.a.b.h
        public final void dP() {
            getAndIncrement();
        }

        @Override // com.b.a.b.h
        public final void f(long j) {
            getAndAdd(j);
        }
    }
}