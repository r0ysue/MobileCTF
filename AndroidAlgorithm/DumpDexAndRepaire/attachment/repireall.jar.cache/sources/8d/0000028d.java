package org.jf.a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* compiled from: RandomAccessFileOutputStream.java */
/* loaded from: repireall.jar:org/jf/a/p.class */
public final class p extends OutputStream {
    private int Dl;
    private final RandomAccessFile FW;

    public p(RandomAccessFile randomAccessFile, int i) {
        this.Dl = i;
        this.FW = randomAccessFile;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.FW.seek(this.Dl);
        this.Dl++;
        this.FW.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.FW.seek(this.Dl);
        this.Dl += bArr.length;
        this.FW.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.FW.seek(this.Dl);
        this.Dl += i2;
        this.FW.write(bArr, i, i2);
    }
}