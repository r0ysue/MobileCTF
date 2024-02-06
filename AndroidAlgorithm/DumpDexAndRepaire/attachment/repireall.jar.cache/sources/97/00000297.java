package org.jf.a;

import com.b.a.c.ax;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* compiled from: WrappedIndentingWriter.java */
/* loaded from: repireall.jar:org/jf/a/w.class */
public final class w extends FilterWriter {
    private final int Gr;
    private final int Gs;
    private int Gt;
    private final StringBuilder Gu;

    public w(StringWriter stringWriter, int i, int i2) {
        super(stringWriter);
        this.Gt = 0;
        this.Gu = new StringBuilder();
        this.Gr = i;
        this.Gs = i2;
    }

    private void hJ() throws IOException {
        int i;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (this.Gt >= 0) {
                if (this.Gt > this.Gr) {
                    i = this.Gr;
                } else {
                    i = this.Gt;
                }
            } else {
                i = 0;
            }
            if (i3 < i) {
                write(32);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void ce(int i) {
        this.Gt += i;
    }

    public final void cf(int i) {
        this.Gt -= i;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) throws IOException {
        if (i == 10) {
            this.out.write(this.Gu.toString());
            this.out.write(i);
            this.Gu.replace(0, this.Gu.length(), "");
            hJ();
            return;
        }
        this.Gu.append((char) i);
        if (this.Gu.length() <= this.Gs) {
            return;
        }
        ArrayList j = ax.j(t.j(this.Gu.toString(), this.Gs));
        this.out.write((String) j.get(0), 0, ((String) j.get(0)).length());
        this.out.write(10);
        this.Gu.replace(0, this.Gu.length(), "");
        hJ();
        for (int i2 = 1; i2 < j.size(); i2++) {
            if (i2 > 1) {
                write(10);
            }
            write((String) j.get(i2));
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            write(cArr[i3 + i]);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            write(str.charAt(i3 + i));
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.out.write(this.Gu.toString());
        this.Gu.replace(0, this.Gu.length(), "");
    }
}