package org.jf.dexlib2.d;

/* compiled from: BaseDexBuffer.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/a.class */
public class a {
    byte[] rw;
    final int vz;

    public a(byte[] bArr) {
        this(bArr, 0);
    }

    public a(byte[] bArr, int i) {
        this.rw = bArr;
        this.vz = i;
    }

    public final int ax(int i) {
        byte[] bArr = this.rw;
        int i2 = i + this.vz;
        int i3 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
        if (i3 < 0) {
            throw new org.jf.a.i("Encountered small uint that is out of range at offset 0x%x", Integer.valueOf(i2));
        }
        return i3;
    }

    public final int ay(int i) {
        byte[] bArr = this.rw;
        int i2 = i + this.vz;
        int i3 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
        if (i3 < -1) {
            throw new org.jf.a.i("Encountered optional uint that is out of range at offset 0x%x", Integer.valueOf(i2));
        }
        return i3;
    }

    public final int az(int i) {
        byte[] bArr = this.rw;
        int i2 = i + this.vz;
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8);
    }

    public final int aA(int i) {
        return this.rw[i + this.vz] & 255;
    }

    public final long aB(int i) {
        byte[] bArr = this.rw;
        int i2 = i + this.vz;
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | (bArr[i2 + 7] << 56);
    }

    public final int aC(int i) {
        byte[] bArr = this.rw;
        int i2 = i + this.vz;
        long j = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | (bArr[i2 + 7] << 56);
        if (j < 0 || j > 2147483647L) {
            throw new org.jf.a.i("Encountered out-of-range ulong at offset 0x%x", Integer.valueOf(i2));
        }
        return (int) j;
    }

    public final int aD(int i) {
        byte[] bArr = this.rw;
        int i2 = i + this.vz;
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
    }

    public final int aE(int i) {
        byte[] bArr = this.rw;
        int i2 = i + this.vz;
        return (bArr[i2] & 255) | (bArr[i2 + 1] << 8);
    }

    public final int aF(int i) {
        return this.rw[this.vz + i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] kc() {
        return this.rw;
    }
}