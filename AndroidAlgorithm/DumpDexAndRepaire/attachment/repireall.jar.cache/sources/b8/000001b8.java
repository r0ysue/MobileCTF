package com.b.a.c;

import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: Range.java */
/* loaded from: repireall.jar:com/b/a/c/bh.class */
public final class bh<C extends Comparable> implements com.b.a.a.j<C>, Serializable {
    private static final com.b.a.a.d<bh, r> lL = new com.b.a.a.d<bh, r>() { // from class: com.b.a.c.bh.1
        @Override // com.b.a.a.d
        public final /* bridge */ /* synthetic */ r apply(bh bhVar) {
            return bhVar.lO;
        }
    };
    static final bf<bh<?>> lM;
    private static final bh<Comparable> lN;
    final r<C> lO;
    final r<C> lP;

    static {
        new com.b.a.a.d<bh, r>() { // from class: com.b.a.c.bh.2
            @Override // com.b.a.a.d
            public final /* bridge */ /* synthetic */ r apply(bh bhVar) {
                return bhVar.lP;
            }
        };
        lM = new bf<bh<?>>() { // from class: com.b.a.c.bh.3
            @Override // com.b.a.c.bf, java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                bh bhVar = (bh) obj;
                bh bhVar2 = (bh) obj2;
                return q.ep().a(bhVar.lO, bhVar2.lO).a(bhVar.lP, bhVar2.lP).eq();
            }
        };
        lN = new bh<>(r.ex(), r.ey());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable<?>> com.b.a.a.d<bh<C>, r<C>> fV() {
        return lL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable<?>> bh<C> b(r<C> rVar, r<C> rVar2) {
        return new bh<>(rVar, rVar2);
    }

    public static <C extends Comparable<?>> bh<C> a(C c, C c2) {
        return b(r.c(c), r.c(c2));
    }

    public static <C extends Comparable<?>> bh<C> a(C c, l lVar, C c2, l lVar2) {
        com.b.a.a.i.i(lVar);
        com.b.a.a.i.i(lVar2);
        return b(lVar == l.OPEN ? r.c(c) : r.b(c), lVar2 == l.OPEN ? r.b(c2) : r.c(c2));
    }

    public static <C extends Comparable<?>> bh<C> d(C c) {
        return b(r.ex(), r.c(c));
    }

    /* compiled from: Range.java */
    /* renamed from: com.b.a.c.bh$4  reason: invalid class name */
    /* loaded from: repireall.jar:com/b/a/c/bh$4.class */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] lQ = new int[l.values().length];

        static {
            try {
                lQ[l.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lQ[l.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static <C extends Comparable<?>> bh<C> a(C c, l lVar) {
        switch (AnonymousClass4.lQ[lVar.ordinal()]) {
            case CAN_THROW:
                return b(r.ex(), r.b(c));
            case ODEX_ONLY:
                return d(c);
            default:
                throw new AssertionError();
        }
    }

    public static <C extends Comparable<?>> bh<C> e(C c) {
        return b(r.b(c), r.ey());
    }

    public static <C extends Comparable<?>> bh<C> b(C c, l lVar) {
        switch (AnonymousClass4.lQ[lVar.ordinal()]) {
            case CAN_THROW:
                return b(r.c(c), r.ey());
            case ODEX_ONLY:
                return e(c);
            default:
                throw new AssertionError();
        }
    }

    public static <C extends Comparable<?>> bh<C> fW() {
        return (bh<C>) lN;
    }

    private bh(r<C> rVar, r<C> rVar2) {
        String str;
        if (rVar.a((r) rVar2) > 0 || rVar == r.ey() || rVar2 == r.ex()) {
            String valueOf = String.valueOf(c(rVar, rVar2));
            if (valueOf.length() != 0) {
                str = "Invalid range: ".concat(valueOf);
            } else {
                str = r3;
                String str2 = new String("Invalid range: ");
            }
            throw new IllegalArgumentException(str);
        }
        this.lO = (r) com.b.a.a.i.i(rVar);
        this.lP = (r) com.b.a.a.i.i(rVar2);
    }

    public final boolean fX() {
        return this.lO != r.ex();
    }

    public final boolean fY() {
        return this.lP != r.ey();
    }

    public final boolean fZ() {
        return this.lO.equals(this.lP);
    }

    @Override // com.b.a.a.j
    /* renamed from: f */
    public final boolean apply(C c) {
        com.b.a.a.i.i(c);
        return this.lO.a((r<C>) c) && !this.lP.a((r<C>) c);
    }

    public final boolean c(bh<C> bhVar) {
        return this.lO.a((r) bhVar.lP) <= 0 && bhVar.lO.a((r) this.lP) <= 0;
    }

    public final bh<C> d(bh<C> bhVar) {
        int a = this.lO.a((r) bhVar.lO);
        int a2 = this.lP.a((r) bhVar.lP);
        if (a >= 0 && a2 <= 0) {
            return this;
        }
        if (a <= 0 && a2 >= 0) {
            return bhVar;
        }
        return b(a >= 0 ? this.lO : bhVar.lO, a2 <= 0 ? this.lP : bhVar.lP);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bh) {
            bh bhVar = (bh) obj;
            return this.lO.equals(bhVar.lO) && this.lP.equals(bhVar.lP);
        }
        return false;
    }

    public final int hashCode() {
        return (this.lO.hashCode() * 31) + this.lP.hashCode();
    }

    public final String toString() {
        return c(this.lO, this.lP);
    }

    private static String c(r<?> rVar, r<?> rVar2) {
        StringBuilder sb = new StringBuilder(16);
        rVar.a(sb);
        sb.append((char) 8229);
        rVar2.b(sb);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}