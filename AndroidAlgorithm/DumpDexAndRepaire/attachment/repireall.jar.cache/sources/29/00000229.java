package com.b.a.d;

import com.b.a.a.i;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: ByteStreams.java */
/* loaded from: repireall.jar:com/b/a/d/a.class */
public final class a {
    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i.i(inputStream);
        i.i(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            long j2 = j;
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
            j = j2 + read;
        }
    }

    static {
        new OutputStream() { // from class: com.b.a.d.a.1
            @Override // java.io.OutputStream
            public final void write(int i) {
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr) {
                i.i(bArr);
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                i.i(bArr);
            }

            public final String toString() {
                return "ByteStreams.nullOutputStream()";
            }
        };
    }

    public static void a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int read;
        int length = bArr.length;
        i.i(inputStream);
        i.i(bArr);
        if (length < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= length || (read = inputStream.read(bArr, 0 + i, length - i)) == -1) {
                break;
            }
            i2 = i + read;
        }
        if (i == length) {
            return;
        }
        throw new EOFException(new StringBuilder(81).append("reached end of stream after reading ").append(i).append(" bytes; ").append(length).append(" bytes expected").toString());
    }

    public static void a(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip != 0) {
                j -= skip;
            } else if (inputStream.read() == -1) {
                throw new EOFException(new StringBuilder(100).append("reached end of stream after skipping ").append(j - j).append(" bytes; ").append(j).append(" bytes expected").toString());
            } else {
                j--;
            }
        }
    }
}