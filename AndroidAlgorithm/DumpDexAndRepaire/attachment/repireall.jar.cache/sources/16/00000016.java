package antlr;

/* compiled from: GrammarAtom.java */
/* loaded from: repireall.jar:antlr/al.class */
abstract class al extends o {
    private String O;
    protected String bE;
    protected int bF;
    protected boolean T;
    private String bG;

    public al(ak akVar, bs bsVar, int i) {
        super(akVar, bsVar, i);
        this.bF = 0;
        this.T = false;
        this.bG = null;
        this.bE = bsVar.V();
    }

    @Override // antlr.o
    public String ac() {
        return this.O;
    }

    public final int aw() {
        return this.bF;
    }

    @Override // antlr.o
    public void h(String str) {
        this.O = str;
    }

    public final void i(bs bsVar, bs bsVar2) {
        if (bsVar.V().equals("AST")) {
            bsVar2.V();
        } else {
            this.aH.k.a(new StringBuffer("Invalid element option:").append(bsVar.V()).toString(), this.aH.av(), bsVar.X(), bsVar.Y());
        }
    }

    public String toString() {
        String str;
        str = " ";
        str = this.O != null ? new StringBuffer().append(str).append(this.O).append(":").toString() : " ";
        if (this.T) {
            str = new StringBuffer().append(str).append("~").toString();
        }
        return new StringBuffer().append(str).append(this.bE).toString();
    }
}