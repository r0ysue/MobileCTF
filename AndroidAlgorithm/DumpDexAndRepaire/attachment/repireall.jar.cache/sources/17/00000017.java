package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GrammarElement.java */
/* loaded from: repireall.jar:antlr/am.class */
public abstract class am {
    protected ak aH;
    protected int aP;
    protected int bH;

    public am(ak akVar) {
        this.aH = akVar;
        this.aP = -1;
        this.bH = -1;
    }

    public am(ak akVar, bs bsVar) {
        this.aH = akVar;
        this.aP = bsVar.X();
        this.bH = bsVar.Y();
    }

    public final int ax() {
        return this.aP;
    }

    public final int ay() {
        return this.bH;
    }
}