package com.b.a.a;

/* compiled from: Strings.java */
/* loaded from: repireall.jar:com/b/a/a/n.class */
public final class n {
    public static String e(String str, int i) {
        i.i(str);
        if (i <= 1) {
            i.a(i >= 0, "invalid count: %s", Integer.valueOf(i));
            return i == 0 ? "" : str;
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(51).append("Required array size too large: ").append(j).toString());
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        int i3 = length;
        while (true) {
            int i4 = i3;
            if (i4 < i2 - i4) {
                System.arraycopy(cArr, 0, cArr, i4, i4);
                i3 = i4 << 1;
            } else {
                System.arraycopy(cArr, 0, cArr, i4, i2 - i4);
                return new String(cArr);
            }
        }
    }
}