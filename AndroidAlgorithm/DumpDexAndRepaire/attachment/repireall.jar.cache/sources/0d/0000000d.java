package antlr;

/* compiled from: CommonToken.java */
/* loaded from: repireall.jar:antlr/ac.class */
public class ac extends bs {
    private int aP;
    private String aO;
    private int aQ;

    public ac() {
        this.aO = null;
    }

    public ac(int i, String str) {
        this.aO = null;
        this.cZ = i;
        this.aO = str;
    }

    @Override // antlr.bs
    public final int X() {
        return this.aP;
    }

    @Override // antlr.bs
    public final String V() {
        return this.aO;
    }

    @Override // antlr.bs
    public final void k(int i) {
        this.aP = i;
    }

    @Override // antlr.bs
    public final void i(String str) {
        this.aO = str;
    }

    @Override // antlr.bs
    public String toString() {
        return new StringBuffer("[\"").append(this.aO).append("\",<").append(this.cZ).append(">,line=").append(this.aP).append(",col=").append(this.aQ).append("]").toString();
    }

    @Override // antlr.bs
    public final int Y() {
        return this.aQ;
    }

    @Override // antlr.bs
    public final void l(int i) {
        this.aQ = i;
    }
}