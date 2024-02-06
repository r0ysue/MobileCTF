package org.jf.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: RandomAccessFileInputStream.java */
/* loaded from: repireall.jar:org/jf/a/o.class */
public final class o extends InputStream {
    private int Dl;
    private final RandomAccessFile FV;

    public o(RandomAccessFile randomAccessFile, int i) {
        this.Dl = i;
        this.FV = randomAccessFile;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        this.FV.seek(this.Dl);
        this.Dl++;
        return this.FV.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        this.FV.seek(this.Dl);
        int read = this.FV.read(bArr);
        this.Dl += read;
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.FV.seek(this.Dl);
        int read = this.FV.read(bArr, i, i2);
        this.Dl += read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int min = Math.min((int) j, available());
        this.Dl += min;
        return min;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return ((int) this.FV.length()) - this.Dl;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }
}