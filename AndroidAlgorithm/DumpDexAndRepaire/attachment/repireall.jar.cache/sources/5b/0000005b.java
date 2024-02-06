package antlr;

/* compiled from: ActionElement.java */
/* loaded from: repireall.jar:antlr/l.class */
final class l extends o {
    private String C;
    protected boolean D;

    public l(ak akVar, bs bsVar) {
        super(akVar);
        this.D = false;
        this.C = bsVar.V();
        this.aP = bsVar.X();
        this.bH = bsVar.Y();
    }

    public final String toString() {
        return new StringBuffer(" ").append(this.C).append(this.D ? "?" : "").toString();
    }
}