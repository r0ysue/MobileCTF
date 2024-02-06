package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringLiteralElement.java */
/* loaded from: repireall.jar:antlr/bo.class */
public final class bo extends al {
    private String cY;

    public bo(ak akVar, bs bsVar, int i) {
        super(akVar, bsVar, i);
        if (!(akVar instanceof at)) {
            cc w = this.aH.bo.w(this.bE);
            if (w == null) {
                akVar.k.a(new StringBuffer("Undefined literal: ").append(this.bE).toString(), this.aH.av(), bsVar.X(), bsVar.Y());
            } else {
                this.bF = w.aT();
            }
        }
        this.aP = bsVar.X();
        this.cY = new String();
        int i2 = 1;
        while (i2 < this.bE.length() - 1) {
            char charAt = this.bE.charAt(i2);
            char c = charAt;
            if (charAt == '\\' && i2 + 1 < this.bE.length() - 1) {
                i2++;
                char charAt2 = this.bE.charAt(i2);
                c = charAt2;
                switch (charAt2) {
                    case 'n':
                        c = '\n';
                        break;
                    case 'r':
                        c = '\r';
                        break;
                    case 't':
                        c = '\t';
                        break;
                }
            }
            if (akVar instanceof at) {
                ((at) akVar).bS.B(c);
            }
            this.cY = new StringBuffer().append(this.cY).append(c).toString();
            i2++;
        }
    }
}