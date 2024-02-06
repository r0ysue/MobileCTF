package antlr.preprocessor;

import antlr.aa;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Grammar.java */
/* loaded from: repireall.jar:antlr/preprocessor/a.class */
public final class a {
    private String cW;
    private String bv;
    private String ea;
    private String eb;
    private antlr.a.a.c ec;
    private antlr.a.a.c ed;
    private String ee;
    private String ef;
    private String eg;
    private c eh;
    private boolean ei = false;
    private boolean ej = false;
    protected boolean ek = false;
    protected String bn = null;
    protected String bq = null;
    protected String bp = null;
    private antlr.Tool k;

    public a(antlr.Tool tool, String str, String str2, antlr.a.a.c cVar) {
        this.cW = str;
        this.ea = str2;
        this.ec = cVar;
        this.k = tool;
    }

    private void a(d dVar) {
        if (this.ed == null) {
            this.ed = new antlr.a.a.c();
        }
        this.ed.a(dVar.bn(), dVar);
    }

    public final void a(g gVar) {
        this.ec.a(gVar.bz(), gVar);
    }

    public final void bd() {
        a bg;
        if (this.ej || (bg = bg()) == null) {
            return;
        }
        if (this.bp == null) {
            this.bp = this.cW;
        }
        if (bg.ei) {
            return;
        }
        bg.bd();
        this.ej = true;
        this.eh.X(this.bv).p(true);
        Enumeration ba = bg.ec.ba();
        while (ba.hasMoreElements()) {
            g gVar = (g) ba.nextElement();
            g gVar2 = (g) this.ec.O(gVar.bz());
            if (gVar2 != null) {
                if (!gVar2.b(gVar)) {
                    antlr.Tool tool = this.k;
                    antlr.Tool.J(new StringBuffer("rule ").append(this.cW).append(".").append(gVar2.bz()).append(" has different signature than ").append(bg.cW).append(".").append(gVar2.bz()).toString());
                }
            } else {
                a(gVar);
            }
        }
        antlr.a.a.c cVar = bg.ed;
        if (cVar != null) {
            Enumeration ba2 = cVar.ba();
            while (ba2.hasMoreElements()) {
                d dVar = (d) ba2.nextElement();
                if (!dVar.bn().equals("importVocab") && !dVar.bn().equals("exportVocab")) {
                    d dVar2 = null;
                    if (this.ed != null) {
                        dVar2 = (d) this.ed.O(dVar.bn());
                    }
                    if (dVar2 == null) {
                        a(dVar);
                    }
                }
            }
        }
        if ((this.ed != null && this.ed.O("importVocab") == null) || this.ed == null) {
            a(new d("importVocab", new StringBuffer().append(bg.bp).append(";").toString(), this));
            String str = bg.bv;
            antlr.Tool tool2 = this.k;
            String G = antlr.Tool.G(str);
            String stringBuffer = new StringBuffer().append(G).append(bg.bp).append(aa.aL).append(aa.aM).toString();
            antlr.Tool tool3 = this.k;
            String C = antlr.Tool.C(stringBuffer);
            if (!G.equals(new StringBuffer(".").append(System.getProperty("file.separator")).toString())) {
                try {
                    this.k.a(stringBuffer, C);
                } catch (IOException unused) {
                    antlr.Tool tool4 = this.k;
                    antlr.Tool.I(new StringBuffer("cannot find/copy importVocab file ").append(stringBuffer).toString());
                    return;
                }
            }
        }
        String str2 = bg.eg;
        if (this.eg != null || str2 == null) {
            return;
        }
        this.eg = str2;
    }

    public final String be() {
        return this.bv;
    }

    public final String bf() {
        return this.cW;
    }

    public final a bg() {
        if (this.ea == null) {
            return null;
        }
        return this.eh.Y(this.ea);
    }

    public final String bh() {
        return this.ea;
    }

    public final void P(String str) {
        this.bv = str;
    }

    public final void a(c cVar) {
        this.eh = cVar;
    }

    public final void Q(String str) {
        this.eg = str;
    }

    public final void a(antlr.a.a.c cVar) {
        this.ed = cVar;
    }

    public final void R(String str) {
        this.ef = str;
    }

    public final void o(boolean z) {
        this.ei = true;
    }

    public final void S(String str) {
        this.ee = str;
    }

    public final void T(String str) {
        this.eb = str;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(10000);
        if (this.ef != null) {
            stringBuffer.append(this.ef);
        }
        if (this.ea == null) {
            return new StringBuffer("class ").append(this.cW).append(";").toString();
        }
        if (this.bn != null) {
            stringBuffer.append(new StringBuffer("class ").append(this.cW).append(" extends ").append(this.bn).append(";").toString());
        } else {
            stringBuffer.append(new StringBuffer("class ").append(this.cW).append(" extends ").append(this.eb).append(";").toString());
        }
        stringBuffer.append(new StringBuffer().append(System.getProperty("line.separator")).append(System.getProperty("line.separator")).toString());
        if (this.ed != null) {
            stringBuffer.append(c.c(this.ed));
        }
        if (this.ee != null) {
            stringBuffer.append(new StringBuffer().append(this.ee).append("\n").toString());
        }
        if (this.eg != null) {
            stringBuffer.append(new StringBuffer().append(this.eg).append(System.getProperty("line.separator")).toString());
        }
        for (int i = 0; i < this.ec.size(); i++) {
            g gVar = (g) this.ec.F(i);
            if (!this.cW.equals(gVar.ex.cW)) {
                stringBuffer.append(new StringBuffer("// inherited from grammar ").append(gVar.ex.cW).append(System.getProperty("line.separator")).toString());
            }
            stringBuffer.append(new StringBuffer().append(gVar).append(System.getProperty("line.separator")).append(System.getProperty("line.separator")).toString());
        }
        return stringBuffer.toString();
    }
}