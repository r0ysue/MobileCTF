package com.b.a.c;

import java.lang.reflect.Array;

/* compiled from: ObjectArrays.java */
/* loaded from: repireall.jar:com/b/a/c/be.class */
public final class be {
    static final Object[] lK = new Object[0];

    public static <T> T[] c(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] d(T[] tArr, int i) {
        T[] tArr2 = (T[]) c(tArr, i);
        System.arraycopy(tArr, 0, tArr2, 0, Math.min(tArr.length, i));
        return tArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] e(Object... objArr) {
        return e(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] e(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            j(objArr[i2], i2);
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object j(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(new StringBuilder(20).append("at index ").append(i).toString());
        }
        return obj;
    }
}