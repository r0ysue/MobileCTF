package antlr;

/* compiled from: CharQueue.java */
/* loaded from: repireall.jar:antlr/v.class */
public final class v {
    private char[] u = new char[2];
    private int am = 2 - 1;
    private int an = 0;
    protected int ao = 0;

    public v(int i) {
    }

    public final void b(char c) {
        if (this.ao == this.u.length) {
            char[] cArr = new char[this.u.length << 1];
            for (int i = 0; i < this.u.length; i++) {
                cArr[i] = f(i);
            }
            this.u = cArr;
            this.am = this.u.length - 1;
            this.an = 0;
        }
        this.u[(this.an + this.ao) & this.am] = c;
        this.ao++;
    }

    public final char f(int i) {
        return this.u[(this.an + i) & this.am];
    }

    public final void ah() {
        this.an = (this.an + 1) & this.am;
        this.ao--;
    }
}