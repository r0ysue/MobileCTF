package com.b.a.a;

import java.io.Serializable;

/* compiled from: Equivalence.java */
/* loaded from: repireall.jar:com/b/a/a/c.class */
public abstract class c<T> {
    protected abstract boolean c(T t, T t2);

    protected abstract int f(T t);

    protected c() {
    }

    public final boolean b(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return c(t, t2);
    }

    public final int e(T t) {
        if (t == null) {
            return 0;
        }
        return f(t);
    }

    public static c<Object> cT() {
        return a.fQ;
    }

    public static c<Object> cU() {
        return b.fR;
    }

    /* compiled from: Equivalence.java */
    /* loaded from: repireall.jar:com/b/a/a/c$a.class */
    static final class a extends c<Object> implements Serializable {
        static final a fQ = new a();

        a() {
        }

        @Override // com.b.a.a.c
        protected final boolean c(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.b.a.a.c
        protected final int f(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* loaded from: repireall.jar:com/b/a/a/c$b.class */
    static final class b extends c<Object> implements Serializable {
        static final b fR = new b();

        b() {
        }

        @Override // com.b.a.a.c
        protected final boolean c(Object obj, Object obj2) {
            return false;
        }

        @Override // com.b.a.a.c
        protected final int f(Object obj) {
            return System.identityHashCode(obj);
        }
    }
}