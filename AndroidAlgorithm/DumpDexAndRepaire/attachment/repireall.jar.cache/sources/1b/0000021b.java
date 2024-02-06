package com.b.a.c;

import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cut.java */
/* loaded from: repireall.jar:com/b/a/c/r.class */
public abstract class r<C extends Comparable> implements Serializable, Comparable<r<C>> {
    final C jx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a(C c2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract l eu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract l ev();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(StringBuilder sb);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(StringBuilder sb);

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        return a((r) ((r) obj));
    }

    r(C c2) {
        this.jx = c2;
    }

    public int a(r<C> rVar) {
        if (rVar == c.jz) {
            return 1;
        }
        if (rVar == a.jy) {
            return -1;
        }
        int a2 = bh.a(this.jx, rVar.jx);
        if (a2 != 0) {
            return a2;
        }
        return com.b.a.e.a.a(this instanceof b, rVar instanceof b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C ew() {
        return this.jx;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            try {
                return a((r) ((r) obj)) == 0;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable> r<C> ex() {
        return c.jz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    /* loaded from: repireall.jar:com/b/a/c/r$c.class */
    public static final class c extends r<Comparable<?>> {
        private static final c jz = new c();

        private c() {
            super(null);
        }

        @Override // com.b.a.c.r
        final Comparable<?> ew() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.b.a.c.r
        final boolean a(Comparable<?> comparable) {
            return true;
        }

        @Override // com.b.a.c.r
        final l eu() {
            throw new IllegalStateException();
        }

        @Override // com.b.a.c.r
        final l ev() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.b.a.c.r
        final void a(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.b.a.c.r
        final void b(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.b.a.c.r, java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(r<Comparable<?>> rVar) {
            return rVar == this ? 0 : -1;
        }

        public final String toString() {
            return "-∞";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable> r<C> ey() {
        return a.jy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    /* loaded from: repireall.jar:com/b/a/c/r$a.class */
    public static final class a extends r<Comparable<?>> {
        private static final a jy = new a();

        private a() {
            super(null);
        }

        @Override // com.b.a.c.r
        final Comparable<?> ew() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.b.a.c.r
        final boolean a(Comparable<?> comparable) {
            return false;
        }

        @Override // com.b.a.c.r
        final l eu() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.b.a.c.r
        final l ev() {
            throw new IllegalStateException();
        }

        @Override // com.b.a.c.r
        final void a(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.b.a.c.r
        final void b(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.b.a.c.r, java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(r<Comparable<?>> rVar) {
            return rVar == this ? 0 : 1;
        }

        public final String toString() {
            return "+∞";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable> r<C> b(C c2) {
        return new d(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    /* loaded from: repireall.jar:com/b/a/c/r$d.class */
    public static final class d<C extends Comparable> extends r<C> {
        @Override // com.b.a.c.r, java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return super.a((r) ((r) obj));
        }

        d(C c) {
            super((Comparable) com.b.a.a.i.i(c));
        }

        @Override // com.b.a.c.r
        final boolean a(C c) {
            return bh.a(this.jx, c) <= 0;
        }

        @Override // com.b.a.c.r
        final l eu() {
            return l.CLOSED;
        }

        @Override // com.b.a.c.r
        final l ev() {
            return l.OPEN;
        }

        @Override // com.b.a.c.r
        final void a(StringBuilder sb) {
            sb.append('[').append(this.jx);
        }

        @Override // com.b.a.c.r
        final void b(StringBuilder sb) {
            sb.append(this.jx).append(')');
        }

        public final int hashCode() {
            return this.jx.hashCode();
        }

        public final String toString() {
            String valueOf = String.valueOf(String.valueOf(this.jx));
            return new StringBuilder(2 + valueOf.length()).append("\\").append(valueOf).append("/").toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable> r<C> c(C c2) {
        return new b(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    /* loaded from: repireall.jar:com/b/a/c/r$b.class */
    public static final class b<C extends Comparable> extends r<C> {
        @Override // com.b.a.c.r, java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return super.a((r) ((r) obj));
        }

        b(C c) {
            super((Comparable) com.b.a.a.i.i(c));
        }

        @Override // com.b.a.c.r
        final boolean a(C c) {
            return bh.a(this.jx, c) < 0;
        }

        @Override // com.b.a.c.r
        final l eu() {
            return l.OPEN;
        }

        @Override // com.b.a.c.r
        final l ev() {
            return l.CLOSED;
        }

        @Override // com.b.a.c.r
        final void a(StringBuilder sb) {
            sb.append('(').append(this.jx);
        }

        @Override // com.b.a.c.r
        final void b(StringBuilder sb) {
            sb.append(this.jx).append(']');
        }

        public final int hashCode() {
            return this.jx.hashCode() ^ (-1);
        }

        public final String toString() {
            String valueOf = String.valueOf(String.valueOf(this.jx));
            return new StringBuilder(2 + valueOf.length()).append("/").append(valueOf).append("\\").toString();
        }
    }
}