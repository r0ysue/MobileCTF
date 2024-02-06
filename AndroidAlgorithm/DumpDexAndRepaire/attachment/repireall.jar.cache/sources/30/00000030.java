package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RuleRefElement.java */
/* loaded from: repireall.jar:antlr/bk.class */
public final class bk extends o {
    protected String cM;
    private String cN;
    private String cO;
    private String O;

    public bk(ak akVar, bs bsVar, int i) {
        super(akVar, bsVar, i);
        this.cN = null;
        this.cO = null;
        this.cM = bsVar.V();
        if (bsVar.cZ == 24) {
            this.cM = aa.o(this.cM);
        }
    }

    @Override // antlr.o
    public final String ac() {
        return this.O;
    }

    public final void v(String str) {
        this.cN = str;
    }

    @Override // antlr.o
    public final void h(String str) {
        this.O = str;
    }

    public final String toString() {
        if (this.cN != null) {
            return new StringBuffer(" ").append(this.cM).append(this.cN).toString();
        }
        return new StringBuffer(" ").append(this.cM).toString();
    }
}