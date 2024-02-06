package org.jf.a;

import java.io.IOException;
import java.io.Writer;

/* compiled from: IndentingWriter.java */
/* loaded from: repireall.jar:org/jf/a/m.class */
public class m extends Writer {
    protected final Writer FJ;
    private char[] u = new char[24];
    private int CC = 0;
    private boolean FK = true;
    private static final String FL = System.getProperty("line.separator");

    public m(Writer writer) {
        this.FJ = writer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hJ() throws IOException {
        for (int i = 0; i < this.CC; i++) {
            this.FJ.write(32);
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        if (i == 10) {
            this.FJ.write(FL);
            this.FK = true;
            return;
        }
        if (this.FK) {
            hJ();
        }
        this.FK = false;
        this.FJ.write(i);
    }

    private void a(char[] cArr, int i, int i2) throws IOException {
        if (this.FK && i2 > 0) {
            hJ();
            this.FK = false;
        }
        this.FJ.write(cArr, i, i2);
    }

    private void b(String str, int i, int i2) throws IOException {
        if (this.FK && i2 > 0) {
            hJ();
            this.FK = false;
        }
        this.FJ.write(str, i, i2);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            if (cArr[i4] == '\n') {
                a(cArr, i, i4 - i);
                this.FJ.write(FL);
                this.FK = true;
                i4++;
                i = i4;
            } else {
                i4++;
            }
        }
        a(cArr, i, i4 - i);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            int indexOf = str.indexOf(10, i);
            i4 = indexOf;
            if (indexOf == -1 || i4 >= i3) {
                b(str, i, i3 - i);
                return;
            }
            b(str, i, i4 - i);
            this.FJ.write(FL);
            this.FK = true;
            i = i4 + 1;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        write(charSequence.toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        write(charSequence.subSequence(i, i2).toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.FJ.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.FJ.close();
    }

    public final void bV(int i) {
        this.CC += 4;
        if (this.CC < 0) {
            this.CC = 0;
        }
    }

    public final void bW(int i) {
        this.CC -= 4;
        if (this.CC < 0) {
            this.CC = 0;
        }
    }

    public final void l(long j) throws IOException {
        long j2;
        int i = 23;
        do {
            int i2 = (int) (j & 15);
            if (i2 < 10) {
                int i3 = i;
                i--;
                this.u[i3] = (char) (i2 + 48);
            } else {
                int i4 = i;
                i--;
                this.u[i4] = (char) ((i2 - 10) + 97);
            }
            j2 = j >>> 4;
            j = j2;
        } while (j2 != 0);
        int i5 = i + 1;
        a(this.u, i5, 24 - i5);
    }

    public final void m(long j) throws IOException {
        long j2;
        int i = 23;
        if (j < 0) {
            j = -j;
            write(45);
        }
        do {
            int i2 = i;
            i--;
            this.u[i2] = (char) ((j % 10) + 48);
            j2 = j / 10;
            j = j2;
        } while (j2 != 0);
        int i3 = i + 1;
        a(this.u, i3, 24 - i3);
    }

    public final void bX(int i) throws IOException {
        int i2;
        int i3 = 15;
        if (i < 0) {
            i = -i;
            write(45);
        }
        do {
            int i4 = i3;
            i3--;
            this.u[i4] = (char) ((i % 10) + 48);
            i2 = i / 10;
            i = i2;
        } while (i2 != 0);
        int i5 = i3 + 1;
        a(this.u, i5, 16 - i5);
    }
}