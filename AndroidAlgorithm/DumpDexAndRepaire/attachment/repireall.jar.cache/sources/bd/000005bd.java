package org.jf.dexlib2.i;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DexDataWriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/e.class */
public final class e extends BufferedOutputStream {
    private int Dl;
    private byte[] Dm;
    private byte[] Dn;

    public e(OutputStream outputStream, int i) {
        this(outputStream, i, 262144);
    }

    private e(OutputStream outputStream, int i, int i2) {
        super(outputStream, 262144);
        this.Dm = new byte[8];
        this.Dn = new byte[3];
        this.Dl = i;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.Dl++;
        super.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.Dl += i2;
        super.write(bArr, i, i2);
    }

    public final void j(long j) throws IOException {
        a(this, (int) j);
        a(this, (int) (j >> 32));
    }

    public static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i);
        outputStream.write(i >> 8);
        outputStream.write(i >> 16);
        outputStream.write(i >> 24);
    }

    public final void bG(int i) throws IOException {
        if (i < -32768 || i > 32767) {
            throw new org.jf.a.i("Short value out of range: %d", Integer.valueOf(i));
        }
        write(i);
        write(i >> 8);
    }

    public final void bH(int i) throws IOException {
        if (i < 0 || i > 65535) {
            throw new org.jf.a.i("Unsigned short value out of range: %d", Integer.valueOf(i));
        }
        write(i);
        write(i >> 8);
    }

    public final void bI(int i) throws IOException {
        if (i < 0 || i > 255) {
            throw new org.jf.a.i("Unsigned byte value out of range: %d", Integer.valueOf(i));
        }
        write(i);
    }

    public static void b(OutputStream outputStream, int i) throws IOException {
        while ((i & 4294967295L) > 127) {
            outputStream.write((i & 127) | org.jf.dexlib2.e.VOLATILE_FIELD_ACCESSOR);
            i >>>= 7;
        }
        outputStream.write(i);
    }

    public static void c(OutputStream outputStream, int i) throws IOException {
        if (i >= 0) {
            while (i > 63) {
                outputStream.write((i & 127) | org.jf.dexlib2.e.VOLATILE_FIELD_ACCESSOR);
                i >>>= 7;
            }
            outputStream.write(i & 127);
            return;
        }
        while (i < -64) {
            outputStream.write((i & 127) | org.jf.dexlib2.e.VOLATILE_FIELD_ACCESSOR);
            i >>= 7;
        }
        outputStream.write(i & 127);
    }

    public final void n(int i, int i2) throws IOException {
        write(i | (i2 << 5));
    }

    public final void o(int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 >= 0) {
            while (i2 > 127) {
                int i4 = i3;
                i3++;
                this.Dm[i4] = (byte) i2;
                i2 >>= 8;
            }
        } else {
            while (i2 < -128) {
                int i5 = i3;
                i3++;
                this.Dm[i5] = (byte) i2;
                i2 >>= 8;
            }
        }
        int i6 = i3;
        int i7 = i3 + 1;
        this.Dm[i6] = (byte) i2;
        n(i, i7 - 1);
        write(this.Dm, 0, i7);
    }

    public final void a(int i, long j) throws IOException {
        int i2 = 0;
        if (j >= 0) {
            while (j > 127) {
                int i3 = i2;
                i2++;
                this.Dm[i3] = (byte) j;
                j >>= 8;
            }
        } else {
            while (j < -128) {
                int i4 = i2;
                i2++;
                this.Dm[i4] = (byte) j;
                j >>= 8;
            }
        }
        int i5 = i2;
        int i6 = i2 + 1;
        this.Dm[i5] = (byte) j;
        n(6, i6 - 1);
        write(this.Dm, 0, i6);
    }

    public final void p(int i, int i2) throws IOException {
        int i3;
        int i4 = 0;
        do {
            int i5 = i4;
            i4++;
            this.Dm[i5] = (byte) i2;
            i3 = i2 >>> 8;
            i2 = i3;
        } while (i3 != 0);
        n(i, i4 - 1);
        write(this.Dm, 0, i4);
    }

    public final void a(int i, float f) throws IOException {
        int i2;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i3 = 3;
        do {
            int i4 = i3;
            i3--;
            this.Dm[i4] = (byte) ((floatToRawIntBits & (-16777216)) >>> 24);
            i2 = floatToRawIntBits << 8;
            floatToRawIntBits = i2;
        } while (i2 != 0);
        int i5 = i3 + 1;
        int i6 = 4 - i5;
        n(16, i6 - 1);
        write(this.Dm, i5, i6);
    }

    public final void b(int i, double d) throws IOException {
        long j;
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = 7;
        do {
            int i3 = i2;
            i2--;
            this.Dm[i3] = (byte) ((doubleToRawLongBits & (-72057594037927936L)) >>> 56);
            j = doubleToRawLongBits << 8;
            doubleToRawLongBits = j;
        } while (j != 0);
        int i4 = i2 + 1;
        int i5 = 8 - i4;
        n(17, i5 - 1);
        write(this.Dm, i4, i5);
    }

    public final void by(String str) throws IOException {
        int length = str.length();
        if (this.Dm.length <= str.length() * 3) {
            this.Dm = new byte[str.length() * 3];
        }
        byte[] bArr = this.Dm;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != 0 && charAt < 128) {
                int i3 = i;
                i++;
                bArr[i3] = (byte) charAt;
            } else if (charAt < 2048) {
                int i4 = i;
                int i5 = i + 1;
                bArr[i4] = (byte) (((charAt >> 6) & 31) | 192);
                i = i5 + 1;
                bArr[i5] = (byte) ((charAt & '?') | org.jf.dexlib2.e.VOLATILE_FIELD_ACCESSOR);
            } else {
                int i6 = i;
                int i7 = i + 1;
                bArr[i6] = (byte) (((charAt >> '\f') & 15) | 224);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((charAt >> 6) & 63) | org.jf.dexlib2.e.VOLATILE_FIELD_ACCESSOR);
                i = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | org.jf.dexlib2.e.VOLATILE_FIELD_ACCESSOR);
            }
        }
        write(bArr, 0, i);
    }

    public final void mr() throws IOException {
        int i = (-this.Dl) & 3;
        if (i > 0) {
            write(this.Dn, 0, i);
        }
    }

    public final int ms() {
        return this.Dl;
    }
}