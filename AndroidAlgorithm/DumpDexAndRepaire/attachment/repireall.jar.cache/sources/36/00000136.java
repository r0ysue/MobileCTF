package com.b.a.c;

/* compiled from: Hashing.java */
/* loaded from: repireall.jar:com/b/a/c/ac.class */
final class ac {
    private static int jH = 1073741824;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(int i) {
        return 461845907 * Integer.rotateLeft(i * (-862048943), 15);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.2d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            return i2 > 0 ? i2 : jH;
        }
        return highestOneBit;
    }
}