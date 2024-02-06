package com.b.a.c;

/* compiled from: CollectPreconditions.java */
/* loaded from: repireall.jar:com/b/a/c/n.class */
final class n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(String.valueOf(obj2));
            throw new NullPointerException(new StringBuilder(24 + valueOf.length()).append("null key in entry: null=").append(valueOf).toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(String.valueOf(obj));
            throw new NullPointerException(new StringBuilder(26 + valueOf2.length()).append("null value in entry: ").append(valueOf2).append("=null").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, String str) {
        if (i < 0) {
            String valueOf = String.valueOf(String.valueOf(str));
            throw new IllegalArgumentException(new StringBuilder(40 + valueOf.length()).append(valueOf).append(" cannot be negative but was: ").append(i).toString());
        }
        return i;
    }
}