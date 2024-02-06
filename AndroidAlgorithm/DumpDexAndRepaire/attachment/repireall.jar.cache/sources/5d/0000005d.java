package antlr;

/* compiled from: AlternativeBlock.java */
/* loaded from: repireall.jar:antlr/n.class */
class n extends o {
    protected String M;
    protected antlr.a.a.f N;
    protected String O;
    protected boolean P;
    protected boolean Q;
    private int R;
    private static int S;
    boolean T;
    boolean U;
    boolean V;
    private boolean W;
    protected boolean X;
    protected boolean Y;

    public n(ak akVar) {
        super(akVar);
        this.M = null;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.T = false;
        this.U = true;
        this.V = false;
        this.W = true;
        this.X = true;
        this.Y = true;
        this.N = new antlr.a.a.f(5);
        this.T = false;
        S++;
        this.R = S;
    }

    public n(ak akVar, bs bsVar, boolean z) {
        super(akVar, bsVar);
        this.M = null;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.T = false;
        this.U = true;
        this.V = false;
        this.W = true;
        this.X = true;
        this.Y = true;
        this.N = new antlr.a.a.f(5);
        this.T = z;
        S++;
        this.R = S;
    }

    public final void a(m mVar) {
        this.N.a(mVar);
    }

    public final m c(int i) {
        return (m) this.N.G(i);
    }

    public final antlr.a.a.f ab() {
        return this.N;
    }

    @Override // antlr.o
    public final String ac() {
        return this.O;
    }

    public void ad() {
        for (int i = 0; i < this.N.bc(); i++) {
            m mVar = (m) this.N.G(i);
            mVar.J = new av[this.aH.bz + 1];
            mVar.K = -1;
        }
    }

    public final void a(ak akVar) {
        for (int i = 0; i < this.N.bc(); i++) {
            o oVar = c(i).E;
            while (true) {
                o oVar2 = oVar;
                if (oVar2 != null) {
                    if (oVar2 instanceof bk) {
                        bk bkVar = (bk) oVar2;
                        bl blVar = (bl) akVar.q(bkVar.cM);
                        if (blVar == null) {
                            this.aH.k.B(new StringBuffer("rule ").append(bkVar.cM).append(" referenced in (...)=>, but not defined").toString());
                        } else {
                            blVar.cR.a(bkVar);
                        }
                    } else if (oVar2 instanceof n) {
                        ((n) oVar2).a(akVar);
                    }
                    oVar = oVar2.Z;
                }
            }
        }
    }

    public final void a(antlr.a.a.f fVar) {
        this.N = fVar;
    }

    public final void g(String str) {
        this.M = str;
    }

    @Override // antlr.o
    public final void h(String str) {
        this.O = str;
    }

    public void h(bs bsVar, bs bsVar2) {
        if (bsVar.V().equals("warnWhenFollowAmbig")) {
            if (bsVar2.V().equals("true")) {
                this.X = true;
            } else if (bsVar2.V().equals("false")) {
                this.X = false;
            } else {
                this.aH.k.a("Value for warnWhenFollowAmbig must be true or false", this.aH.av(), bsVar.X(), bsVar.Y());
            }
        } else if (bsVar.V().equals("generateAmbigWarnings")) {
            if (bsVar2.V().equals("true")) {
                this.Y = true;
            } else if (bsVar2.V().equals("false")) {
                this.Y = false;
            } else {
                this.aH.k.a("Value for generateAmbigWarnings must be true or false", this.aH.av(), bsVar.X(), bsVar.Y());
            }
        } else if (bsVar.V().equals("greedy")) {
            if (bsVar2.V().equals("true")) {
                this.U = true;
                this.V = true;
            } else if (bsVar2.V().equals("false")) {
                this.U = false;
                this.V = true;
            } else {
                this.aH.k.a("Value for greedy must be true or false", this.aH.av(), bsVar.X(), bsVar.Y());
            }
        } else {
            this.aH.k.a(new StringBuffer("Invalid subrule option: ").append(bsVar.V()).toString(), this.aH.av(), bsVar.X(), bsVar.Y());
        }
    }

    public String toString() {
        String str = " (";
        if (this.M != null) {
            str = new StringBuffer().append(str).append(this.M).toString();
        }
        for (int i = 0; i < this.N.bc(); i++) {
            m c = c(i);
            av[] avVarArr = c.J;
            int i2 = c.K;
            if (i2 != -1) {
                if (i2 == Integer.MAX_VALUE) {
                    str = new StringBuffer().append(str).append("{?}:").toString();
                } else {
                    String stringBuffer = new StringBuffer().append(str).append(" {").toString();
                    for (int i3 = 1; i3 <= i2; i3++) {
                        stringBuffer = new StringBuffer().append(stringBuffer).append(avVarArr[i3].a(",", this.aH.bo.aM())).toString();
                        if (i3 < i2 && avVarArr[i3 + 1] != null) {
                            stringBuffer = new StringBuffer().append(stringBuffer).append(";").toString();
                        }
                    }
                    str = new StringBuffer().append(stringBuffer).append("}:").toString();
                }
            }
            String str2 = c.H;
            if (str2 != null) {
                str = new StringBuffer().append(str).append(str2).toString();
            }
            for (o oVar = c.E; oVar != null; oVar = oVar.Z) {
                str = new StringBuffer().append(str).append(oVar).toString();
            }
            if (i < this.N.bc() - 1) {
                str = new StringBuffer().append(str).append(" |").toString();
            }
        }
        return new StringBuffer().append(str).append(" )").toString();
    }
}