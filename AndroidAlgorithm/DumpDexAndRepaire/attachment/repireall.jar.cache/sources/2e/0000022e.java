package com.b.a.e;

import java.util.Arrays;
import org.jf.dexlib2.e;

/* compiled from: Ints.java */
/* loaded from: repireall.jar:com/b/a/e/b.class */
public final class b {
    private static final byte[] nd;

    public static int g(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    static {
        byte[] bArr = new byte[e.VOLATILE_FIELD_ACCESSOR];
        nd = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i <= 9; i++) {
            nd[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 <= 26; i2++) {
            nd[i2 + 65] = (byte) (i2 + 10);
            nd[i2 + 97] = (byte) (i2 + 10);
        }
    }
}