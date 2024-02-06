package org.jf.dexlib2.d.b;

/* compiled from: OdexHeaderItem.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/b/o.class */
public final class o {
    private static final byte[] yz = {100, 101, 121, 10, 0, 0, 0, 0};
    private static final int[] yA = {35, 36};

    public static int a(byte[] bArr, int i) {
        boolean z;
        if (bArr.length - i < 8) {
            z = false;
        } else {
            int i2 = 0;
            while (true) {
                if (i2 < 4) {
                    if (bArr[i + i2] == yz[i2]) {
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                } else {
                    for (int i3 = 4; i3 < 7; i3++) {
                        if (bArr[i + i3] < 48 || bArr[i + i3] > 57) {
                            z = false;
                            break;
                        }
                    }
                    if (bArr[i + 7] != yz[7]) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            return -1;
        }
        return ((bArr[i + 4] - 48) * 100) + ((bArr[i + 5] - 48) * 10) + (bArr[i + 6] - 48);
    }

    public static boolean bh(int i) {
        for (int i2 = 0; i2 < yA.length; i2++) {
            if (yA[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static int b(byte[] bArr) {
        return new org.jf.dexlib2.d.a(bArr).ax(8);
    }

    public static int c(byte[] bArr) {
        return new org.jf.dexlib2.d.a(bArr).ax(16);
    }
}