package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CharRangeElement.java */
/* loaded from: repireall.jar:antlr/w.class */
public final class w extends o {
    private String O;
    private char ap;
    private char aq;
    private String ar;
    private String as;

    public w(at atVar, bs bsVar, bs bsVar2, int i) {
        super(atVar);
        this.ap = (char) 0;
        this.aq = (char) 0;
        this.ap = (char) d.c(bsVar.V());
        this.ar = bsVar.V();
        this.aq = (char) d.c(bsVar2.V());
        this.as = bsVar2.V();
        this.aP = bsVar.X();
        for (int i2 = this.ap; i2 <= this.aq; i2++) {
            atVar.bS.B(i2);
        }
        this.aa = i;
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