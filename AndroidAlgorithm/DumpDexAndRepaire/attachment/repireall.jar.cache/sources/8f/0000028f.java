package org.jf.a;

/* compiled from: SparseIntArray.java */
/* loaded from: repireall.jar:org/jf/a/r.class */
public final class r {
    private int[] FZ;
    private int[] Gc;
    private int Gb;

    public r() {
        this(10);
    }

    public r(int i) {
        this.FZ = new int[i];
        this.Gc = new int[i];
        this.Gb = 0;
    }

    public final int t(int i, int i2) {
        int a = a(this.FZ, 0, this.Gb, i);
        if (a >= 0) {
            return this.Gc[a];
        }
        return -1;
    }

    public final void u(int i, int i2) {
        if (this.Gb == 0 || i > this.FZ[this.Gb - 1]) {
            int i3 = this.Gb;
            if (i3 >= this.FZ.length) {
                int max = Math.max(i3 + 1, this.FZ.length << 1);
                int[] iArr = new int[max];
                int[] iArr2 = new int[max];
                System.arraycopy(this.FZ, 0, iArr, 0, this.FZ.length);
                System.arraycopy(this.Gc, 0, iArr2, 0, this.Gc.length);
                this.FZ = iArr;
                this.Gc = iArr2;
            }
            this.FZ[i3] = i;
            this.Gc[i3] = i2;
            this.Gb = i3 + 1;
            return;
        }
        int a = a(this.FZ, 0, this.Gb, i);
        if (a >= 0) {
            this.Gc[a] = i2;
            return;
        }
        int i4 = a ^ (-1);
        if (this.Gb >= this.FZ.length) {
            int max2 = Math.max(this.Gb + 1, this.FZ.length << 1);
            int[] iArr3 = new int[max2];
            int[] iArr4 = new int[max2];
            System.arraycopy(this.FZ, 0, iArr3, 0, this.FZ.length);
            System.arraycopy(this.Gc, 0, iArr4, 0, this.Gc.length);
            this.FZ = iArr3;
            this.Gc = iArr4;
        }
        if (this.Gb - i4 != 0) {
            int[] iArr5 = this.FZ;
            System.arraycopy(iArr5, i4, iArr5, i4 + 1, this.Gb - i4);
            int[] iArr6 = this.Gc;
            System.arraycopy(iArr6, i4, iArr6, i4 + 1, this.Gb - i4);
        }
        this.FZ[i4] = i;
        this.Gc[i4] = i2;
        this.Gb++;
    }

    private static int a(int[] iArr, int i, int i2, int i3) {
        int i4 = i2 + 0;
        int i5 = -1;
        while (i4 - i5 > 1) {
            int i6 = (i4 + i5) / 2;
            if (iArr[i6] < i3) {
                i5 = i6;
            } else {
                i4 = i6;
            }
        }
        if (i4 == i2 + 0) {
            return (i2 + 0) ^ (-1);
        }
        if (iArr[i4] == i3) {
            return i4;
        }
        return i4 ^ (-1);
    }
}