package antlr;

/* compiled from: ASTPair.java */
/* loaded from: repireall.jar:antlr/k.class */
public final class k {
    public antlr.a.a A;
    public antlr.a.a B;

    public final void aa() {
        if (this.B != null) {
            while (this.B.U() != null) {
                this.B = this.B.U();
            }
        }
    }

    public final String toString() {
        return new StringBuffer("[").append(this.A == null ? "null" : this.A.V()).append(",").append(this.B == null ? "null" : this.B.V()).append("]").toString();
    }
}