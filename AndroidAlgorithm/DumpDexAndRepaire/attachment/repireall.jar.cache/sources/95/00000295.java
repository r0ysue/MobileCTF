package org.jf.a;

/* compiled from: Utf8Utils.java */
/* loaded from: repireall.jar:org/jf/a/v.class */
public final class v {
    private static final ThreadLocal<char[]> Gq = new ThreadLocal<char[]>() { // from class: org.jf.a.v.1
        @Override // java.lang.ThreadLocal
        protected final /* bridge */ /* synthetic */ char[] initialValue() {
            return new char[org.jf.dexlib2.e.STATIC_FIELD_ACCESSOR];
        }
    };

    public static String a(byte[] bArr, int i, int i2, int[] iArr) {
        char c;
        char[] cArr = Gq.get();
        char[] cArr2 = cArr;
        if (cArr == null || cArr2.length < i2) {
            cArr2 = new char[i2];
            Gq.set(cArr2);
        }
        int i3 = 0;
        int i4 = i;
        while (i2 > 0) {
            int i5 = bArr[i4] & 255;
            switch (i5 >> 4) {
                case 0:
                case CAN_THROW:
                case ODEX_ONLY:
                case 3:
                case CAN_CONTINUE:
                case 5:
                case 6:
                case 7:
                    if (i5 == 0) {
                        return v(i5, i4);
                    }
                    c = (char) i5;
                    i4++;
                    break;
                case SETS_RESULT:
                case 9:
                case 10:
                case 11:
                default:
                    return v(i5, i4);
                case 12:
                case 13:
                    int i6 = bArr[i4 + 1] & 255;
                    if ((i6 & 192) == 128) {
                        int i7 = ((i5 & 31) << 6) | (i6 & 63);
                        if (i7 != 0 && i7 < 128) {
                            return v(i6, i4 + 1);
                        }
                        c = (char) i7;
                        i4 += 2;
                        break;
                    } else {
                        return v(i6, i4 + 1);
                    }
                case 14:
                    int i8 = bArr[i4 + 1] & 255;
                    if ((i8 & 192) != 128) {
                        return v(i8, i4 + 1);
                    }
                    int i9 = bArr[i4 + 2] & 255;
                    if ((i9 & 192) == 128) {
                        int i10 = ((i5 & 15) << 12) | ((i8 & 63) << 6) | (i9 & 63);
                        if (i10 < 2048) {
                            return v(i9, i4 + 2);
                        }
                        c = (char) i10;
                        i4 += 3;
                        break;
                    } else {
                        return v(i9, i4 + 2);
                    }
            }
            cArr2[i3] = c;
            i3++;
            i2--;
        }
        int length = iArr.length;
        iArr[0] = i4 - i;
        iArr[0] = i4 - i;
        return new String(cArr2, 0, i3);
    }

    private static String v(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + j.bU(i) + " at offset " + j.bS(i2));
    }
}