package org.jf.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: SparseArray.java */
/* loaded from: repireall.jar:org/jf/a/q.class */
public final class q<E> {
    private static final Object FX = new Object();
    private boolean FY;
    private int[] FZ;
    private Object[] Ga;
    private int Gb;

    public q() {
        this(10);
    }

    public q(int i) {
        this.FY = false;
        this.FZ = new int[i];
        this.Ga = new Object[i];
        this.Gb = 0;
    }

    public final E bZ(int i) {
        return a(i, null);
    }

    private E a(int i, E e) {
        int a = a(this.FZ, 0, this.Gb, i);
        if (a >= 0 && this.Ga[a] != FX) {
            return (E) this.Ga[a];
        }
        return null;
    }

    public final void b(int i, E e) {
        int a = a(this.FZ, 0, this.Gb, i);
        if (a >= 0) {
            this.Ga[a] = e;
            return;
        }
        int i2 = a ^ (-1);
        if (i2 < this.Gb && this.Ga[i2] == FX) {
            this.FZ[i2] = i;
            this.Ga[i2] = e;
            return;
        }
        boolean z = this.FY;
        if (this.Gb >= this.FZ.length) {
            int max = Math.max(this.Gb + 1, this.FZ.length << 1);
            int[] iArr = new int[max];
            Object[] objArr = new Object[max];
            System.arraycopy(this.FZ, 0, iArr, 0, this.FZ.length);
            System.arraycopy(this.Ga, 0, objArr, 0, this.Ga.length);
            this.FZ = iArr;
            this.Ga = objArr;
        }
        if (this.Gb - i2 != 0) {
            int[] iArr2 = this.FZ;
            System.arraycopy(iArr2, i2, iArr2, i2 + 1, this.Gb - i2);
            Object[] objArr2 = this.Ga;
            System.arraycopy(objArr2, i2, objArr2, i2 + 1, this.Gb - i2);
        }
        this.FZ[i2] = i;
        this.Ga[i2] = e;
        this.Gb++;
    }

    public final int mV() {
        boolean z = this.FY;
        return this.Gb;
    }

    public final int ca(int i) {
        boolean z = this.FY;
        return this.FZ[i];
    }

    public final E cb(int i) {
        boolean z = this.FY;
        return (E) this.Ga[i];
    }

    public final int cc(int i) {
        boolean z = this.FY;
        return a(this.FZ, 0, this.Gb, i);
    }

    public final void c(int i, E e) {
        if (this.Gb != 0 && i <= this.FZ[this.Gb - 1]) {
            b(i, e);
            return;
        }
        boolean z = this.FY;
        int i2 = this.Gb;
        if (i2 >= this.FZ.length) {
            int max = Math.max(i2 + 1, this.FZ.length << 1);
            int[] iArr = new int[max];
            Object[] objArr = new Object[max];
            System.arraycopy(this.FZ, 0, iArr, 0, this.FZ.length);
            System.arraycopy(this.Ga, 0, objArr, 0, this.Ga.length);
            this.FZ = iArr;
            this.Ga = objArr;
        }
        this.FZ[i2] = i;
        this.Ga[i2] = e;
        this.Gb = i2 + 1;
    }

    public final void cd(int i) {
        boolean z = this.FY;
        if (this.FZ.length < i) {
            int[] iArr = new int[i];
            Object[] objArr = new Object[i];
            System.arraycopy(this.FZ, 0, iArr, 0, this.FZ.length);
            System.arraycopy(this.Ga, 0, objArr, 0, this.Ga.length);
            this.FZ = iArr;
            this.Ga = objArr;
        }
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

    public final List<E> mW() {
        return Collections.unmodifiableList(Arrays.asList(this.Ga));
    }
}