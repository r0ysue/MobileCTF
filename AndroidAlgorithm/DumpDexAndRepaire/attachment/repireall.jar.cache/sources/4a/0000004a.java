package antlr;

/* compiled from: TreeWalkerGrammar.java */
/* loaded from: repireall.jar:antlr/ch.class */
final class ch extends ak {
    private boolean dD;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ch(String str, Tool tool, String str2) {
        super(str, tool, str2);
        this.dD = false;
    }

    @Override // antlr.ak
    public final void a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("-trace")) {
                this.bA = true;
                this.k.A(i);
            } else if (strArr[i].equals("-traceTreeParser")) {
                this.bA = true;
                this.k.A(i);
            }
        }
    }

    @Override // antlr.ak
    public final boolean a(String str, bs bsVar) {
        if (str.equals("buildAST")) {
            if (bsVar.V().equals("true")) {
                this.bk = true;
                return true;
            } else if (bsVar.V().equals("false")) {
                this.bk = false;
                return true;
            } else {
                this.k.a("buildAST option must be true or false", av(), bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("ASTLabelType")) {
            super.a(str, bsVar);
            return true;
        } else if (str.equals("className")) {
            super.a(str, bsVar);
            return true;
        } else if (super.a(str, bsVar)) {
            return true;
        } else {
            this.k.a(new StringBuffer("Invalid option: ").append(str).toString(), av(), bsVar.X(), bsVar.Y());
            return false;
        }
    }
}