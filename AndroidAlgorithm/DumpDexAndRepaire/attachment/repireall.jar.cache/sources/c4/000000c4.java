package com.b.a.a;

import java.io.Serializable;
import java.util.Collection;

/* compiled from: Predicates.java */
/* loaded from: repireall.jar:com/b/a/a/k.class */
public final class k {
    public static <T> j<T> cX() {
        return c.NOT_NULL.withNarrowedType();
    }

    public static <T> j<T> j(T t) {
        return t == null ? c.IS_NULL.withNarrowedType() : new b(t, (byte) 0);
    }

    public static <T> j<T> c(Collection<? extends T> collection) {
        return new a(collection, (byte) 0);
    }

    /* compiled from: Predicates.java */
    /* loaded from: repireall.jar:com/b/a/a/k$c.class */
    enum c implements j<Object> {
        ALWAYS_TRUE { // from class: com.b.a.a.k.c.1
            @Override // com.b.a.a.j
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.b.a.a.k.c.2
            @Override // com.b.a.a.j
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.b.a.a.k.c.3
            @Override // com.b.a.a.j
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.b.a.a.k.c.4
            @Override // com.b.a.a.j
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        };

        <T> j<T> withNarrowedType() {
            return this;
        }
    }

    static {
        f.h(',');
    }

    /* compiled from: Predicates.java */
    /* loaded from: repireall.jar:com/b/a/a/k$b.class */
    private static class b<T> implements j<T>, Serializable {
        private final T ge;

        /* synthetic */ b(Object obj, byte b) {
            this(obj);
        }

        private b(T t) {
            this.ge = t;
        }

        @Override // com.b.a.a.j
        public final boolean apply(T t) {
            return this.ge.equals(t);
        }

        public final int hashCode() {
            return this.ge.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.ge.equals(((b) obj).ge);
            }
            return false;
        }

        public final String toString() {
            String valueOf = String.valueOf(String.valueOf(this.ge));
            return new StringBuilder(20 + valueOf.length()).append("Predicates.equalTo(").append(valueOf).append(")").toString();
        }
    }

    /* compiled from: Predicates.java */
    /* loaded from: repireall.jar:com/b/a/a/k$a.class */
    private static class a<T> implements j<T>, Serializable {
        private final Collection<?> gd;

        /* synthetic */ a(Collection collection, byte b) {
            this(collection);
        }

        private a(Collection<?> collection) {
            this.gd = (Collection) i.i(collection);
        }

        @Override // com.b.a.a.j
        public final boolean apply(T t) {
            try {
                return this.gd.contains(t);
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.gd.equals(((a) obj).gd);
            }
            return false;
        }

        public final int hashCode() {
            return this.gd.hashCode();
        }

        public final String toString() {
            String valueOf = String.valueOf(String.valueOf(this.gd));
            return new StringBuilder(15 + valueOf.length()).append("Predicates.in(").append(valueOf).append(")").toString();
        }
    }
}