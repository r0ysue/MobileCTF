package antlr;

/* compiled from: TreeElement.java */
/* loaded from: repireall.jar:antlr/ce.class */
final class ce extends n {
    al dz;

    public ce(ak akVar, bs bsVar) {
        super(akVar, bsVar, false);
    }

    @Override // antlr.n
    public final String toString() {
        String stringBuffer = new StringBuffer(" #(").append(this.dz).toString();
        o oVar = ((m) this.N.G(0)).E;
        while (true) {
            o oVar2 = oVar;
            if (oVar2 != null) {
                stringBuffer = new StringBuffer().append(stringBuffer).append(oVar2).toString();
                oVar = oVar2.Z;
            } else {
                return new StringBuffer().append(stringBuffer).append(" )").toString();
            }
        }
    }
}