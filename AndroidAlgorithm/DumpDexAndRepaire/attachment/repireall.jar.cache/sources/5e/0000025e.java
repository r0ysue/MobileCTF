package org.antlr.stringtemplate;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* compiled from: AutoIndentWriter.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/b.class */
public final class b implements f {
    private ArrayList nw;
    private int[] nx;
    private int ny;
    private String nz;
    private Writer nA;
    private boolean nB;
    private int nC;
    private int nD;
    private int nE;

    private b(Writer writer, String str) {
        this.nw = new ArrayList();
        this.nx = new int[10];
        this.ny = -1;
        this.nA = null;
        this.nB = true;
        this.nC = 0;
        this.nD = -1;
        this.nE = 0;
        this.nA = writer;
        this.nw.add(null);
        this.nz = str;
    }

    public b(Writer writer) {
        this(writer, System.getProperty("line.separator"));
    }

    @Override // org.antlr.stringtemplate.f
    public final void Y(int i) {
        this.nD = i;
    }

    @Override // org.antlr.stringtemplate.f
    public final void aJ(String str) {
        int i = 0;
        for (int i2 = 0; i2 < this.nw.size(); i2++) {
            String str2 = (String) this.nw.get(i2);
            if (str2 != null) {
                i += str2.length();
            }
        }
        int i3 = i;
        if (this.ny >= 0 && this.nx[this.ny] > i3) {
            int i4 = this.nx[this.ny] - i3;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i5 = 1; i5 <= i4; i5++) {
                stringBuffer.append(' ');
            }
            if (str != null) {
                stringBuffer.append(str);
            }
            this.nw.add(stringBuffer.toString());
            return;
        }
        this.nw.add(str);
    }

    @Override // org.antlr.stringtemplate.f
    public final String gt() {
        return (String) this.nw.remove(this.nw.size() - 1);
    }

    @Override // org.antlr.stringtemplate.f
    public final void gu() {
        if (this.ny + 1 >= this.nx.length) {
            int[] iArr = new int[this.nx.length << 1];
            System.arraycopy(this.nx, 0, iArr, 0, this.nx.length - 1);
            this.nx = iArr;
        }
        this.ny++;
        this.nx[this.ny] = this.nC;
    }

    @Override // org.antlr.stringtemplate.f
    public final void gv() {
        this.ny--;
    }

    @Override // org.antlr.stringtemplate.f
    public final int aK(String str) throws IOException {
        int i = 0;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == '\r' || charAt == '\n') {
                this.nB = true;
                this.nC = -1;
                i += this.nz.length();
                this.nA.write(this.nz);
                this.nC += i;
                if (charAt == '\r' && i2 + 1 < str.length() && str.charAt(i2 + 1) == '\n') {
                    i2++;
                }
            } else {
                if (this.nB) {
                    i += gw();
                    this.nB = false;
                }
                i++;
                this.nA.write(charAt);
                this.nC++;
            }
            i2++;
        }
        return i;
    }

    @Override // org.antlr.stringtemplate.f
    public final int aL(String str) throws IOException {
        return aK(str);
    }

    @Override // org.antlr.stringtemplate.f
    public final int e(String str, String str2) throws IOException {
        return aM(str2) + aK(str);
    }

    @Override // org.antlr.stringtemplate.f
    public final int aM(String str) throws IOException {
        int i = 0;
        if (this.nD != -1 && str != null && !this.nB && this.nC >= this.nD) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '\n') {
                    this.nA.write(charAt);
                    this.nC = 0;
                    i = i + 1 + gw();
                } else {
                    i++;
                    this.nA.write(charAt);
                    this.nC++;
                }
            }
        }
        return i;
    }

    private int gw() throws IOException {
        int i = 0;
        for (int i2 = 0; i2 < this.nw.size(); i2++) {
            String str = (String) this.nw.get(i2);
            if (str != null) {
                i += str.length();
                this.nA.write(str);
            }
        }
        this.nC += i;
        return i;
    }
}