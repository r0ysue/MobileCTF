package org.jf.dexlib2.d;

import org.jf.a.v;
import org.jf.dexlib2.d.a;

/* compiled from: BaseDexReader.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/b.class */
public class b<T extends a> {
    public final T vA;
    private int an;

    public b(T t, int i) {
        this.vA = t;
        this.an = i;
    }

    public final int kd() {
        return this.an;
    }

    public final void aG(int i) {
        this.an = i;
    }

    public final int ke() {
        int i;
        int i2 = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            i3++;
            int i5 = bArr[i3] & 255;
            int i6 = (i4 & 127) | ((i5 & 127) << 7);
            if (i5 <= 127) {
                i = (i6 << 18) >> 18;
            } else {
                i3++;
                int i7 = bArr[i3] & 255;
                int i8 = i6 | ((i7 & 127) << 14);
                if (i7 <= 127) {
                    i = (i8 << 11) >> 11;
                } else {
                    i3++;
                    int i9 = bArr[i3] & 255;
                    int i10 = i8 | ((i9 & 127) << 21);
                    if (i9 <= 127) {
                        i = (i10 << 4) >> 4;
                    } else {
                        i3++;
                        int i11 = bArr[i3] & 255;
                        if (i11 > 127) {
                            throw new org.jf.a.i("Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.an));
                        }
                        i = i10 | (i11 << 28);
                    }
                }
            }
        }
        this.an = i3 - this.vA.vz;
        return i;
    }

    public final int kf() {
        return R(false);
    }

    private int R(boolean z) {
        int i = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i3;
        if (i3 > 127) {
            i2++;
            int i5 = bArr[i2] & 255;
            i4 = (i4 & 127) | ((i5 & 127) << 7);
            if (i5 > 127) {
                i2++;
                int i6 = bArr[i2] & 255;
                i4 |= (i6 & 127) << 14;
                if (i6 > 127) {
                    i2++;
                    int i7 = bArr[i2] & 255;
                    i4 |= (i7 & 127) << 21;
                    if (i7 > 127) {
                        i2++;
                        byte b = bArr[i2];
                        if (b < 0) {
                            throw new org.jf.a.i("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.an));
                        }
                        if ((b & 15) > 7 && !z) {
                            throw new org.jf.a.i("Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.an));
                        }
                        i4 |= b << 28;
                    }
                }
            }
        }
        this.an = i2 - this.vA.vz;
        return i4;
    }

    public final int kg() {
        return R(true);
    }

    public final int kh() {
        int i = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i3;
        if (i3 > 127) {
            i2++;
            int i5 = bArr[i2] & 255;
            i4 = (i4 & 127) | ((i5 & 127) << 7);
            if (i5 > 127) {
                i2++;
                int i6 = bArr[i2] & 255;
                i4 |= (i6 & 127) << 14;
                if (i6 > 127) {
                    i2++;
                    int i7 = bArr[i2] & 255;
                    i4 |= (i7 & 127) << 21;
                    if (i7 > 127) {
                        i2++;
                        byte b = bArr[i2];
                        if (b < 0) {
                            throw new org.jf.a.i("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.an));
                        }
                        i4 |= b << 28;
                    }
                }
            }
        }
        this.an = i2 - this.vA.vz;
        return i4;
    }

    public final void ki() {
        int i = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        int i2 = i + 1;
        if (bArr[i] < 0) {
            i2++;
            if (bArr[i2] < 0) {
                i2++;
                if (bArr[i2] < 0) {
                    i2++;
                    if (bArr[i2] < 0) {
                        i2++;
                        if (bArr[i2] < 0) {
                            throw new org.jf.a.i("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.an));
                        }
                    }
                }
            }
        }
        this.an = i2 - this.vA.vz;
    }

    public final int kj() {
        int i = this.an;
        int ax = this.vA.ax(i);
        this.an = i + 4;
        return ax;
    }

    public final int kk() {
        return this.vA.az(this.an);
    }

    public final int kl() {
        int i = this.an;
        int az = this.vA.az(this.an);
        this.an = i + 2;
        return az;
    }

    public final int km() {
        return this.vA.aA(this.an);
    }

    public final int kn() {
        int i = this.an;
        int aA = this.vA.aA(this.an);
        this.an = i + 1;
        return aA;
    }

    public final int ko() {
        int i = this.an;
        int aD = this.vA.aD(this.an);
        this.an = i + 4;
        return aD;
    }

    public final int kp() {
        int i = this.an;
        int aF = this.vA.aF(this.an);
        this.an = i + 1;
        return aF;
    }

    public final void kq() {
        this.an++;
    }

    public final void aH(int i) {
        this.an += i;
    }

    public final int aI(int i) {
        byte b;
        int i2 = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        switch (i) {
            case CAN_THROW:
                b = bArr[i2];
                break;
            case ODEX_ONLY:
                b = (bArr[i2] & 255) | (bArr[i2 + 1] << 8);
                break;
            case 3:
                b = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] << 16);
                break;
            case CAN_CONTINUE:
                b = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
                break;
            default:
                throw new org.jf.a.i("Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.an));
        }
        this.an = (i2 + i) - this.vA.vz;
        return b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int aJ(int i) {
        int i2 = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        int i3 = 0;
        switch (i) {
            case CAN_THROW:
                break;
            case ODEX_ONLY:
                i3 |= (bArr[i2 + 1] & 255) << 8;
                break;
            case 3:
                i3 |= (bArr[i2 + 2] & 255) << 16;
                i3 |= (bArr[i2 + 1] & 255) << 8;
                break;
            case CAN_CONTINUE:
                byte b = bArr[i2 + 3];
                if (b < 0) {
                    throw new org.jf.a.i("Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(this.an));
                }
                i3 = b << 24;
                i3 |= (bArr[i2 + 2] & 255) << 16;
                i3 |= (bArr[i2 + 1] & 255) << 8;
                break;
            default:
                throw new org.jf.a.i("Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.an));
        }
        int i4 = i3 | (bArr[i2] & 255);
        this.an = (i2 + i) - this.vA.vz;
        return i4;
    }

    public final int aK(int i) {
        int i2;
        int i3 = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        switch (i) {
            case CAN_THROW:
                i2 = bArr[i3] << 24;
                break;
            case ODEX_ONLY:
                i2 = ((bArr[i3] & 255) << 16) | (bArr[i3 + 1] << 24);
                break;
            case 3:
                i2 = ((bArr[i3] & 255) << 8) | ((bArr[i3 + 1] & 255) << 16) | (bArr[i3 + 2] << 24);
                break;
            case CAN_CONTINUE:
                i2 = (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | (bArr[i3 + 3] << 24);
                break;
            default:
                throw new org.jf.a.i("Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.an));
        }
        this.an = (i3 + i) - this.vA.vz;
        return i2;
    }

    public final long aL(int i) {
        long j;
        int i2 = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        switch (i) {
            case CAN_THROW:
                j = bArr[i2] << 56;
                break;
            case ODEX_ONLY:
                j = ((bArr[i2] & 255) << 48) | (bArr[i2 + 1] << 56);
                break;
            case 3:
                j = ((bArr[i2] & 255) << 40) | ((bArr[i2 + 1] & 255) << 48) | (bArr[i2 + 2] << 56);
                break;
            case CAN_CONTINUE:
                j = ((bArr[i2] & 255) << 32) | ((bArr[i2 + 1] & 255) << 40) | ((bArr[i2 + 2] & 255) << 48) | (bArr[i2 + 3] << 56);
                break;
            case 5:
                j = ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 32) | ((bArr[i2 + 2] & 255) << 40) | ((bArr[i2 + 3] & 255) << 48) | (bArr[i2 + 4] << 56);
                break;
            case 6:
                j = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 24) | ((bArr[i2 + 2] & 255) << 32) | ((bArr[i2 + 3] & 255) << 40) | ((bArr[i2 + 4] & 255) << 48) | (bArr[i2 + 5] << 56);
                break;
            case 7:
                j = ((bArr[i2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 24) | ((bArr[i2 + 3] & 255) << 32) | ((bArr[i2 + 4] & 255) << 40) | ((bArr[i2 + 5] & 255) << 48) | (bArr[i2 + 6] << 56);
                break;
            case SETS_RESULT:
                j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | (bArr[i2 + 7] << 56);
                break;
            default:
                throw new org.jf.a.i("Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.an));
        }
        this.an = (i2 + i) - this.vA.vz;
        return j;
    }

    public final long aM(int i) {
        long j;
        int i2 = this.vA.vz + this.an;
        byte[] bArr = this.vA.rw;
        switch (i) {
            case CAN_THROW:
                j = bArr[i2];
                break;
            case ODEX_ONLY:
                j = (bArr[i2] & 255) | (bArr[i2 + 1] << 8);
                break;
            case 3:
                j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] << 16);
                break;
            case CAN_CONTINUE:
                j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
                break;
            case 5:
                j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | (bArr[i2 + 4] << 32);
                break;
            case 6:
                j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | (bArr[i2 + 5] << 40);
                break;
            case 7:
                j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | (bArr[i2 + 6] << 48);
                break;
            case SETS_RESULT:
                j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | (bArr[i2 + 7] << 56);
                break;
            default:
                throw new org.jf.a.i("Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.an));
        }
        this.an = (i2 + i) - this.vA.vz;
        return j;
    }

    public final String aN(int i) {
        int[] iArr = new int[1];
        String a = v.a(this.vA.rw, this.vA.vz + this.an, i, iArr);
        this.an += iArr[0];
        return a;
    }
}