package com.b.a.a;

import com.b.a.b.c;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: Suppliers.java */
/* loaded from: repireall.jar:com/b/a/a/p.class */
public final class p {
    public static <T> o<T> a(o<T> oVar) {
        return oVar instanceof a ? oVar : new a((o) i.i(oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Suppliers.java */
    /* loaded from: repireall.jar:com/b/a/a/p$a.class */
    public static class a<T> implements o<T>, Serializable {
        private o<T> gt;
        private volatile transient boolean gu;
        private transient T gb;

        a(o<T> oVar) {
            this.gt = oVar;
        }

        @Override // com.b.a.a.o
        public final T get() {
            if (!this.gu) {
                synchronized (this) {
                    if (!this.gu) {
                        T t = this.gt.get();
                        this.gb = t;
                        this.gu = true;
                        return t;
                    }
                }
            }
            return this.gb;
        }

        public final String toString() {
            String valueOf = String.valueOf(String.valueOf(this.gt));
            return new StringBuilder(19 + valueOf.length()).append("Suppliers.memoize(").append(valueOf).append(")").toString();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;)Lcom/b/a/a/o<TT;>; */
    public static o a(c.AnonymousClass1 anonymousClass1) {
        return new b(anonymousClass1);
    }

    /* compiled from: Suppliers.java */
    /* loaded from: repireall.jar:com/b/a/a/p$b.class */
    private static class b<T> implements o<T>, Serializable {
        private T gv;

        b(T t) {
            this.gv = t;
        }

        @Override // com.b.a.a.o
        public final T get() {
            return this.gv;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return h.e(this.gv, ((b) obj).gv);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.gv});
        }

        public final String toString() {
            String valueOf = String.valueOf(String.valueOf(this.gv));
            return new StringBuilder(22 + valueOf.length()).append("Suppliers.ofInstance(").append(valueOf).append(")").toString();
        }
    }
}