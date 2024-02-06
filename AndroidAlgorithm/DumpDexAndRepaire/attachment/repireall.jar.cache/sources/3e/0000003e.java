package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TokenRangeElement.java */
/* loaded from: repireall.jar:antlr/bw.class */
public final class bw extends o {
    private String O;
    protected int de;
    protected int df;
    private String ar;
    private String as;

    public bw(ak akVar, bs bsVar, bs bsVar2, int i) {
        super(akVar, bsVar, i);
        this.de = 0;
        this.df = 0;
        this.de = this.aH.bo.w(bsVar.V()).aT();
        this.ar = bsVar.V();
        this.df = this.aH.bo.w(bsVar2.V()).aT();
        this.as = bsVar2.V();
        this.aP = bsVar.X();
    }

    @Override // antlr.o
    public final String ac() {
        return this.O;
    }

    @Override // antlr.o
    public final void h(String str) {
        this.O = str;
    }

    public final String toString() {
        if (this.O != null) {
            return new StringBuffer(" ").append(this.O).append(":").append(this.ar).append("..").append(this.as).toString();
        }
        return new StringBuffer(" ").append(this.ar).append("..").append(this.as).toString();
    }
}