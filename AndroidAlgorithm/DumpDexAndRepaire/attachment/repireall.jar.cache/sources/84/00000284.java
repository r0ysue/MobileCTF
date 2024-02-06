package org.jf.a;

/* compiled from: Hex.java */
/* loaded from: repireall.jar:org/jf/a/j.class */
public final class j {
    public static String bS(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    private static String bT(int i) {
        char[] cArr = new char[6];
        for (int i2 = 0; i2 < 6; i2++) {
            cArr[5 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String bU(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String a(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2;
        if ((i | i2 | i6) < 0 || i6 > bArr.length) {
            throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i + "..!" + i6);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("outOffset < 0");
        }
        if (i2 == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer((i2 << 2) + 6);
        int i7 = 0;
        while (i2 > 0) {
            if (i7 == 0) {
                stringBuffer.append(bT(i3));
                stringBuffer.append(": ");
            } else if ((i7 & 1) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append(bU(bArr[i]));
            i3++;
            i++;
            i7++;
            if (i7 == i4) {
                stringBuffer.append('\n');
                i7 = 0;
            }
            i2--;
        }
        if (i7 != 0) {
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}