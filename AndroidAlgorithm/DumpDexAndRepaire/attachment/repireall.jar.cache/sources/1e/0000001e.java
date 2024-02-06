package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LexerGrammar.java */
/* loaded from: repireall.jar:antlr/at.class */
public final class at extends ak {
    protected antlr.a.a.b bS;
    private boolean bT;
    private boolean ax;
    protected boolean aw;
    private boolean bU;
    private String bV;

    /* JADX INFO: Access modifiers changed from: package-private */
    public at(String str, Tool tool, String str2) {
        super(str, tool, str2);
        this.bT = true;
        this.ax = true;
        this.aw = true;
        this.bU = false;
        this.bV = null;
        antlr.a.a.b bVar = new antlr.a.a.b();
        for (int i = 0; i <= 127; i++) {
            bVar.B(i);
        }
        this.bS = bVar;
        this.bC = false;
    }

    @Override // antlr.ak
    public final void a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("-trace")) {
                this.bA = true;
                this.k.A(i);
            } else if (strArr[i].equals("-traceLexer")) {
                this.bA = true;
                this.k.A(i);
            } else if (strArr[i].equals("-debug")) {
                this.bB = true;
                this.k.A(i);
            }
        }
    }

    public final void c(antlr.a.a.b bVar) {
        this.bS = bVar;
    }

    @Override // antlr.ak
    public final boolean a(String str, bs bsVar) {
        String V = bsVar.V();
        if (str.equals("buildAST")) {
            Tool tool = this.k;
            Tool.b("buildAST option is not valid for lexer", av(), bsVar.X(), bsVar.Y());
            return true;
        } else if (str.equals("testLiterals")) {
            if (V.equals("true")) {
                this.bT = true;
                return true;
            } else if (V.equals("false")) {
                this.bT = false;
                return true;
            } else {
                Tool tool2 = this.k;
                Tool.b("testLiterals option must be true or false", av(), bsVar.X(), bsVar.Y());
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
        } else if (str.equals("caseSensitive")) {
            if (V.equals("true")) {
                this.aw = true;
                return true;
            } else if (V.equals("false")) {
                this.aw = false;
                return true;
            } else {
                Tool tool3 = this.k;
                Tool.b("caseSensitive option must be true or false", av(), bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("caseSensitiveLiterals")) {
            if (V.equals("true")) {
                this.ax = true;
                return true;
            } else if (V.equals("false")) {
                this.ax = false;
                return true;
            } else {
                Tool tool4 = this.k;
                Tool.b("caseSensitiveLiterals option must be true or false", av(), bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("filter")) {
            if (V.equals("true")) {
                this.bU = true;
                return true;
            } else if (V.equals("false")) {
                this.bU = false;
                return true;
            } else if (bsVar.aO() == 24) {
                this.bU = true;
                this.bV = V;
                return true;
            } else {
                Tool tool5 = this.k;
                Tool.b("filter option must be true, false, or a lexer rule name", av(), bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("longestPossible")) {
            Tool tool6 = this.k;
            Tool.b("longestPossible option has been deprecated; ignoring it...", av(), bsVar.X(), bsVar.Y());
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