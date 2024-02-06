package antlr;

/* compiled from: InputBuffer.java */
/* loaded from: repireall.jar:antlr/ap.class */
public abstract class ap {
    private int bK = 0;
    protected int bL = 0;
    private int bM = 0;
    protected v bN = new v(1);

    public abstract void e(int i) throws y;

    public final void aB() {
        this.bM++;
    }

    public final char m(int i) throws y {
        e(i);
        return this.bN.f((this.bL + i) - 1);
    }

    public final int aC() {
        aD();
        this.bK++;
        return this.bL;
    }

    public final void n(int i) {
        aD();
        this.bL = i;
        this.bK--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aD() {
        while (this.bM > 0) {
            if (this.bK > 0) {
                this.bL++;
            } else {
                this.bN.ah();
            }
            this.bM--;
        }
    }
}