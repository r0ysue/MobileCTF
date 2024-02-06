package antlr;

/* compiled from: WildcardElement.java */
/* loaded from: repireall.jar:antlr/cj.class */
final class cj extends al {
    private String O;

    public cj(ak akVar, bs bsVar, int i) {
        super(akVar, bsVar, i);
        this.aP = bsVar.X();
    }

    @Override // antlr.al, antlr.o
    public final String ac() {
        return this.O;
    }

    @Override // antlr.al, antlr.o
    public final void h(String str) {
        this.O = str;
    }

    @Override // antlr.al
    public final String toString() {
        String str;
        str = " ";
        return new StringBuffer().append(this.O != null ? new StringBuffer().append(str).append(this.O).append(":").toString() : " ").append(".").toString();
    }
}