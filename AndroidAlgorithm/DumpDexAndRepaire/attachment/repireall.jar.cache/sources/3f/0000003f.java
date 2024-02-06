package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TokenRefElement.java */
/* loaded from: repireall.jar:antlr/bx.class */
public final class bx extends al {
    public bx(ak akVar, bs bsVar, boolean z, int i) {
        super(akVar, bsVar, i);
        this.T = z;
        cc w = this.aH.bo.w(this.bE);
        if (w == null) {
            akVar.k.a(new StringBuffer("Undefined token symbol: ").append(this.bE).toString(), this.aH.av(), bsVar.X(), bsVar.Y());
        } else {
            this.bF = w.aT();
            w.aS();
        }
        this.aP = bsVar.X();
    }
}