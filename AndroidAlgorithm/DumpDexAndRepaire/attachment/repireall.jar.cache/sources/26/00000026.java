package antlr;

/* compiled from: NoViableAltException.java */
/* loaded from: repireall.jar:antlr/ba.class */
public final class ba extends bh {
    public bs cr;
    private antlr.a.a cs;

    public ba(antlr.a.a aVar) {
        super("NoViableAlt", "<AST>", aVar.X(), aVar.Y());
        this.cs = aVar;
    }

    public ba(bs bsVar, String str) {
        super("NoViableAlt", str, bsVar.X(), bsVar.Y());
        this.cr = bsVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.cr != null) {
            return new StringBuffer("unexpected token: ").append(this.cr.V()).toString();
        }
        if (this.cs == cf.dA) {
            return "unexpected end of subtree";
        }
        return new StringBuffer("unexpected AST node: ").append(this.cs.toString()).toString();
    }
}