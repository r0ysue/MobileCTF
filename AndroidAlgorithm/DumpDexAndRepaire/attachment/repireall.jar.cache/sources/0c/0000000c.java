package antlr;

/* compiled from: CommonAST.java */
/* loaded from: repireall.jar:antlr/ab.class */
public class ab extends p {
    private int aN = 0;
    private String aO;

    @Override // antlr.p, antlr.a.a
    public final String V() {
        return this.aO;
    }

    @Override // antlr.p, antlr.a.a
    public final int W() {
        return this.aN;
    }

    @Override // antlr.a.a
    public final void b(int i, String str) {
        this.aN = i;
        this.aO = str;
    }

    @Override // antlr.a.a
    public final void o(bs bsVar) {
        this.aO = bsVar.V();
        this.aN = bsVar.aO();
    }

    @Override // antlr.p
    public final void i(String str) {
        this.aO = str;
    }

    @Override // antlr.p
    public final void d(int i) {
        this.aN = i;
    }
}