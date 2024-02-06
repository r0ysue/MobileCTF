package antlr;

/* compiled from: ANTLRStringBuffer.java */
/* loaded from: repireall.jar:antlr/f.class */
public final class f {
    private char[] u;
    private int v = 0;

    public f() {
        this.u = null;
        this.u = new char[50];
    }

    public final void a(char c) {
        int i;
        if (this.v >= this.u.length) {
            int length = this.u.length;
            while (true) {
                i = length;
                if (this.v < i) {
                    break;
                }
                length = i << 1;
            }
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < this.v; i2++) {
                cArr[i2] = this.u[i2];
            }
            this.u = cArr;
        }
        this.u[this.v] = c;
        this.v++;
    }

    public final void d(String str) {
        for (int i = 0; i < str.length(); i++) {
            a(str.charAt(i));
        }
    }

    public final char[] N() {
        return this.u;
    }

    public final int O() {
        return this.v;
    }

    public final void a(int i) {
        if (i < this.v) {
            this.v = i;
            return;
        }
        while (i > this.v) {
            a((char) 0);
        }
    }

    public final String toString() {
        return new String(this.u, 0, this.v);
    }
}