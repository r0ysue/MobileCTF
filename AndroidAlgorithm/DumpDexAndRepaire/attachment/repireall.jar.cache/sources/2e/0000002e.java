package antlr;

import java.util.Hashtable;

/* compiled from: RuleBlock.java */
/* loaded from: repireall.jar:antlr/bi.class */
public final class bi extends n {
    protected String cE;
    protected String cF;
    protected String cG;
    protected String cH;
    private bj cI;
    private boolean bT;
    antlr.a.a.f cJ;
    private boolean[] aj;
    private av[] J;
    private Hashtable cK;
    private boolean bC;
    private String cL;

    private bi(ak akVar, String str) {
        super(akVar);
        this.cF = null;
        this.cG = null;
        this.cH = null;
        this.bT = false;
        this.bC = true;
        this.cL = null;
        this.cE = str;
        this.cJ = new antlr.a.a.f();
        this.J = new av[akVar.bz + 1];
        this.cK = new Hashtable();
    }

    public bi(ak akVar, String str, int i, boolean z) {
        this(akVar, str);
        this.aP = i;
    }

    public final void a(ah ahVar) {
        bs bsVar = ahVar.bg;
        if (((ah) this.cK.get(bsVar == null ? "" : bsVar.V())) != null) {
            if (ahVar.bg != null) {
                this.aH.k.B(new StringBuffer("Rule '").append(this.cE).append("' already has an exception handler for label: ").append(ahVar.bg).toString());
                return;
            } else {
                this.aH.k.B(new StringBuffer("Rule '").append(this.cE).append("' already has an exception handler").toString());
                return;
            }
        }
        this.cK.put(ahVar.bg == null ? "" : ahVar.bg.V(), ahVar);
    }

    public final String aK() {
        return this.cL;
    }

    public final String aL() {
        return this.cE;
    }

    @Override // antlr.n
    public final void ad() {
        super.ad();
        this.aj = new boolean[this.aH.bz + 1];
    }

    public final void a(bj bjVar) {
        this.cI = bjVar;
    }

    @Override // antlr.n
    public final void h(bs bsVar, bs bsVar2) {
        if (bsVar.V().equals("defaultErrorHandler")) {
            if (bsVar2.V().equals("true")) {
                this.bC = true;
            } else if (bsVar2.V().equals("false")) {
                this.bC = false;
            } else {
                this.aH.k.a("Value for defaultErrorHandler must be true or false", this.aH.av(), bsVar.X(), bsVar.Y());
            }
        } else if (bsVar.V().equals("testLiterals")) {
            if (!(this.aH instanceof at)) {
                this.aH.k.a("testLiterals option only valid for lexer rules", this.aH.av(), bsVar.X(), bsVar.Y());
            } else if (bsVar2.V().equals("true")) {
                this.bT = true;
            } else if (bsVar2.V().equals("false")) {
                this.bT = false;
            } else {
                this.aH.k.a("Value for testLiterals must be true or false", this.aH.av(), bsVar.X(), bsVar.Y());
            }
        } else if (bsVar.V().equals("ignore")) {
            if (!(this.aH instanceof at)) {
                this.aH.k.a("ignore option only valid for lexer rules", this.aH.av(), bsVar.X(), bsVar.Y());
            } else {
                this.cL = bsVar2.V();
            }
        } else if (bsVar.V().equals("paraphrase")) {
            if (!(this.aH instanceof at)) {
                this.aH.k.a("paraphrase option only valid for lexer rules", this.aH.av(), bsVar.X(), bsVar.Y());
                return;
            }
            if (this.aH.bo.w(this.cE) == null) {
                this.aH.k.F(new StringBuffer("cannot find token associated with rule ").append(this.cE).toString());
            }
            bsVar2.V();
        } else if (bsVar.V().equals("generateAmbigWarnings")) {
            if (bsVar2.V().equals("true")) {
                this.Y = true;
            } else if (bsVar2.V().equals("false")) {
                this.Y = false;
            } else {
                this.aH.k.a("Value for generateAmbigWarnings must be true or false", this.aH.av(), bsVar.X(), bsVar.Y());
            }
        } else {
            this.aH.k.a(new StringBuffer("Invalid rule option: ").append(bsVar.V()).toString(), this.aH.av(), bsVar.X(), bsVar.Y());
        }
    }

    @Override // antlr.n
    public final String toString() {
        String str = " FOLLOW={";
        av[] avVarArr = this.cI.J;
        int i = this.aH.bz;
        boolean z = true;
        for (int i2 = 1; i2 <= i; i2++) {
            if (avVarArr[i2] != null) {
                str = new StringBuffer().append(str).append(avVarArr[i2].a(",", this.aH.bo.aM())).toString();
                z = false;
                if (i2 < i && avVarArr[i2 + 1] != null) {
                    str = new StringBuffer().append(str).append(";").toString();
                }
            }
        }
        String stringBuffer = new StringBuffer().append(str).append("}").toString();
        if (z) {
            stringBuffer = "";
        }
        return new StringBuffer().append(this.cE).append(": ").append(super.toString()).append(" ;").append(stringBuffer).toString();
    }
}