package com.b.a.c;

import java.util.Collection;

/* compiled from: Collections2.java */
/* loaded from: repireall.jar:com/b/a/c/o.class */
public final class o {
    static final com.b.a.a.f jr = com.b.a.a.f.aD(", ").aE("null");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Collection<?> collection, Object obj) {
        com.b.a.a.i.i(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException unused) {
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder P(int i) {
        n.c(i, "size");
        return new StringBuilder((int) Math.min(i << 3, 1073741824L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Collection<T> a(Iterable<T> iterable) {
        return (Collection) iterable;
    }
}