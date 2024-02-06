package org.jf.dexlib2.h;

/* compiled from: SyntheticAccessorFSM.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/h.class */
public final class h {
    private static final byte[] CR = {0, 1, 0, 1, 1, 1, 2, 1, 13, 1, 14, 1, 15, 1, 16, 1, 17, 1, 18, 1, 19, 1, 20, 1, 21, 1, 25, 2, 3, 7, 2, 4, 7, 2, 5, 7, 2, 6, 7, 2, 8, 12, 2, 9, 12, 2, 10, 12, 2, 11, 12, 2, 22, 23, 2, 22, 24, 2, 22, 25, 2, 22, 26, 2, 22, 27, 2, 22, 28};
    private static final short[] CS = {0, 0, 12, 82, 98, 102, 104, 166, 172, 174, 180, 184, 190, 192, 196, 198, 201, 203};
    private static final short[] CT = {82, 88, 89, 95, 96, 102, 103, 109, 110, 114, 116, 120, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 177, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 201, 202, 203, 204, 206, 207, 208, 216, 15, 17, 18, 25, 129, 143, 144, 176, 178, 205, 144, 145, 155, 156, 166, 167, 171, 172, 176, 177, 187, 188, 198, 199, 203, 204, 89, 95, 103, 109, 15, 17, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 177, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 201, 202, 203, 204, 206, 207, 144, 176, 178, 205, 89, 95, 103, 109, 129, 143, 15, 17, 89, 95, 103, 109, 129, 143, 89, 95, 103, 109, 89, 95, 103, 109, 129, 143, 15, 17, 89, 95, 103, 109, 15, 17, 14, 10, 12, 15, 17, 0};
    private static final byte[] CU = {0, 0, 60, 16, 0, 0, 58, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
    private static final byte[] CV = {0, 6, 5, 0, 2, 1, 2, 3, 1, 3, 2, 3, 1, 2, 1, 1, 1, 0};
    private static final short[] CW = {0, 0, 7, 73, 90, 93, 95, 156, 160, 162, 166, 169, 173, 175, 178, 180, 183, 185};
    private static final byte[] CX = {0, 2, 0, 2, 3, 3, 1, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 9, 10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 9, 10, 11, 22, 23, 9, 10, 11, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 10, 11, 22, 23, 10, 11, 24, 24, 4, 5, 6, 7, 9, 1, 25, 26, 27, 28, 29, 30, 31, 32, 25, 26, 27, 28, 29, 30, 31, 32, 1, 33, 33, 1, 34, 1, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 9, 10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 9, 10, 11, 22, 23, 9, 10, 11, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 10, 11, 22, 23, 10, 11, 7, 9, 1, 35, 35, 36, 1, 37, 1, 35, 35, 38, 1, 35, 35, 1, 39, 39, 40, 1, 41, 1, 39, 39, 1, 42, 1, 44, 43, 1, 45, 1, 1, 0};
    private static final byte[] CY = {2, 0, 14, 15, 17, 3, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 11, 4, 4, 4, 4, 4, 4, 4, 4, 5, 17, 8, 9, 17, 10, 12, 13, 17, 17, 16, 17, 17};
    private static final byte[] CZ = {0, 0, 1, 0, 51, 3, 0, 27, 39, 7, 9, 11, 13, 15, 17, 19, 21, 23, 30, 42, 33, 45, 36, 48, 5, 27, 39, 30, 42, 33, 45, 36, 48, 1, 63, 1, 0, 66, 0, 1, 0, 60, 54, 0, 25, 57};
    private final org.jf.dexlib2.f Da;

    public h(org.jf.dexlib2.f fVar) {
        this.Da = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x038a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v118, types: [int] */
    /* JADX WARN: Type inference failed for: r0v120, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.util.List<? extends org.jf.dexlib2.e.b.f> r8) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jf.dexlib2.h.h.a(com.b.a.c.ah):int");
    }

    private static int a(int i, int i2, long j, int i3, int i4) {
        boolean z = i3 == i4;
        boolean z2 = false;
        switch (i2) {
            case 0:
            case CAN_THROW:
                if (j == 1) {
                    z2 = false;
                    break;
                } else if (j == -1) {
                    z2 = true;
                    break;
                } else {
                    return -1;
                }
            case ODEX_ONLY:
                float intBitsToFloat = Float.intBitsToFloat((int) j);
                if (intBitsToFloat == 1.0f) {
                    z2 = false;
                    break;
                } else if (intBitsToFloat == -1.0f) {
                    z2 = true;
                    break;
                } else {
                    return -1;
                }
            case 3:
                double longBitsToDouble = Double.longBitsToDouble(j);
                if (longBitsToDouble == 1.0d) {
                    z2 = false;
                    break;
                } else if (longBitsToDouble == -1.0d) {
                    z2 = true;
                    break;
                } else {
                    return -1;
                }
        }
        boolean z3 = (i == 7 && !z2) || (i == 8 && z2);
        if (z) {
            if (z3) {
                return 4;
            }
            return 6;
        } else if (z3) {
            return 3;
        } else {
            return 5;
        }
    }
}