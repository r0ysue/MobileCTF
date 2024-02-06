package antlr;

import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: Grammar.java */
/* loaded from: repireall.jar:antlr/ak.class */
public abstract class ak {
    protected Tool k;
    private String bn;
    protected bu bo;
    private String bu;
    protected boolean bk = false;
    private boolean bl = false;
    protected boolean bm = false;
    protected String bp = null;
    protected String bq = null;
    protected bs bt = new ac(0, "");
    private String bv = null;
    protected bs bw = new ac(0, "");
    protected boolean bx = false;
    private boolean by = false;
    protected int bz = 1;
    protected boolean bA = false;
    protected boolean bB = false;
    protected boolean bC = true;
    protected String bD = null;
    private Hashtable bj = new Hashtable();
    private Hashtable br = new Hashtable();
    private antlr.a.a.f bs = new antlr.a.a.f(100);

    public abstract void a(String[] strArr);

    public ak(String str, Tool tool, String str2) {
        this.bn = null;
        this.bu = null;
        this.bu = str;
        this.k = tool;
        this.bn = str2;
    }

    public final void a(bl blVar) {
        this.bs.a(blVar);
        this.bj.put(blVar.az(), blVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String at() {
        return this.bu;
    }

    public final boolean au() {
        return this.bC;
    }

    public final String av() {
        return this.bv;
    }

    private int p(String str) throws NumberFormatException {
        bs bsVar = (bs) this.br.get(str);
        if (bsVar == null || bsVar.aO() != 20) {
            throw new NumberFormatException();
        }
        return Integer.parseInt(bsVar.V());
    }

    public final an q(String str) {
        return (an) this.bj.get(str);
    }

    public final boolean r(String str) {
        return this.bj.containsKey(str);
    }

    public final void s(String str) {
        this.bv = str;
    }

    public boolean a(String str, bs bsVar) {
        this.br.put(str, bsVar);
        String V = bsVar.V();
        if (str.equals("k")) {
            try {
                this.bz = p("k");
                if (this.bz <= 0) {
                    this.k.a(new StringBuffer("option 'k' must be greater than 0 (was ").append(bsVar.V()).append(")").toString(), this.bv, bsVar.X(), bsVar.Y());
                    this.bz = 1;
                }
                return true;
            } catch (NumberFormatException unused) {
                this.k.a(new StringBuffer("option 'k' must be an integer (was ").append(bsVar.V()).append(")").toString(), this.bv, bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("codeGenMakeSwitchThreshold")) {
            try {
                p("codeGenMakeSwitchThreshold");
                return true;
            } catch (NumberFormatException unused2) {
                this.k.a("option 'codeGenMakeSwitchThreshold' must be an integer", this.bv, bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("codeGenBitsetTestThreshold")) {
            try {
                p("codeGenBitsetTestThreshold");
                return true;
            } catch (NumberFormatException unused3) {
                this.k.a("option 'codeGenBitsetTestThreshold' must be an integer", this.bv, bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("defaultErrorHandler")) {
            if (V.equals("true")) {
                this.bC = true;
                return true;
            } else if (V.equals("false")) {
                this.bC = false;
                return true;
            } else {
                this.k.a("Value for defaultErrorHandler must be true or false", this.bv, bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("analyzerDebug")) {
            if (V.equals("true")) {
                this.bl = true;
                return true;
            } else if (V.equals("false")) {
                this.bl = false;
                return true;
            } else {
                this.k.a("option 'analyzerDebug' must be true or false", this.bv, bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("codeGenDebug")) {
            if (V.equals("true")) {
                this.bl = true;
                return true;
            } else if (V.equals("false")) {
                this.bl = false;
                return true;
            } else {
                this.k.a("option 'codeGenDebug' must be true or false", this.bv, bsVar.X(), bsVar.Y());
                return true;
            }
        } else if (str.equals("classHeaderSuffix") || str.equals("classHeaderPrefix") || str.equals("namespaceAntlr") || str.equals("namespaceStd") || str.equals("genHashLines") || str.equals("noConstructors")) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(bu buVar) {
        this.bo = buVar;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(20000);
        Enumeration bb = this.bs.bb();
        while (bb.hasMoreElements()) {
            bl blVar = (bl) bb.nextElement();
            if (!blVar.bI.equals("mnextToken")) {
                stringBuffer.append(blVar.cP.toString());
                stringBuffer.append("\n\n");
            }
        }
        return stringBuffer.toString();
    }
}