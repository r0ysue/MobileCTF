package antlr;

/* compiled from: TokenQueue.java */
/* loaded from: repireall.jar:antlr/bv.class */
final class bv {
    private bs[] dd = new bs[2];
    private int am = 2 - 1;
    private int an = 0;
    protected int ao = 0;

    public bv(int i) {
    }

    public final void r(bs bsVar) {
        if (this.ao == this.dd.length) {
            bs[] bsVarArr = new bs[this.dd.length << 1];
            for (int i = 0; i < this.dd.length; i++) {
                bsVarArr[i] = y(i);
            }
            this.dd = bsVarArr;
            this.am = this.dd.length - 1;
            this.an = 0;
        }
        this.dd[(this.an + this.ao) & this.am] = bsVar;
        this.ao++;
    }

    public final bs y(int i) {
        return this.dd[(this.an + i) & this.am];
    }

    public final void aR() {
        this.an = (this.an + 1) & this.am;
        this.ao--;
    }
}