package antlr;

/* compiled from: ParserGrammar.java */
/* loaded from: repireall.jar:antlr/be.class */
final class be extends ak {
    /* JADX INFO: Access modifiers changed from: package-private */
    public be(String str, Tool tool, String str2) {
        super(str, tool, str2);
    }

    @Override // antlr.ak
    public final void a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("-trace")) {
                this.bA = true;
                this.k.A(i);
            } else if (strArr[i].equals("-traceParser")) {
                this.bA = true;
                this.k.A(i);
            } else if (strArr[i].equals("-debug")) {
                this.bB = true;
                this.k.A(i);
            }
        }
    }

    @Override // antlr.ak
    public final boolean a(String str, bs bsVar) {
        String V = bsVar.V();
        if (str.equals("buildAST")) {
            if (V.equals("true")) {
                this.bk = true;
                return true;
            } else if (V.equals("false")) {
                this.bk = false;
                return true;
            } else {
                this.k.a("buildAST option must be true or false", av(), bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("interactive")) {
            if (V.equals("true")) {
                this.bm = true;
                return true;
            } else if (V.equals("false")) {
                this.bm = false;
                return true;
            } else {
                this.k.a("interactive option must be true or false", av(), bsVar.X(), bsVar.Y());
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