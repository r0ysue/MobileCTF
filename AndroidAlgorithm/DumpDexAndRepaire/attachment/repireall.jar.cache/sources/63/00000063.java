package antlr.preprocessor;

import antlr.ba;
import antlr.bh;
import antlr.bs;
import antlr.bz;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: Hierarchy.java */
/* loaded from: repireall.jar:antlr/preprocessor/c.class */
public final class c {
    private a eo;
    private a ep;
    private a eq;
    private Hashtable bj = new Hashtable(10);
    private Hashtable er = new Hashtable(10);
    private antlr.Tool k;

    public c(antlr.Tool tool) {
        this.eo = null;
        this.ep = null;
        this.eq = null;
        this.k = tool;
        this.eo = new a(tool, "Lexer", null, null);
        this.ep = new a(tool, "Parser", null, null);
        this.eq = new a(tool, "TreeParser", null, null);
        this.eo.o(true);
        this.ep.o(true);
        this.eq.o(true);
        this.bj.put(this.eo.bf(), this.eo);
        this.bj.put(this.ep.bf(), this.ep);
        this.bj.put(this.eq.bf(), this.eq);
    }

    public final void W(String str) {
        Enumeration ba = X(str).bj().ba();
        while (ba.hasMoreElements()) {
            ((a) ba.nextElement()).bd();
        }
    }

    private a b(a aVar) {
        while (aVar.bh() != null) {
            a bg = aVar.bg();
            if (bg == null) {
                return aVar;
            }
            aVar = bg;
            this = this;
        }
        return aVar;
    }

    public final b X(String str) {
        return (b) this.er.get(str);
    }

    public final a Y(String str) {
        return (a) this.bj.get(str);
    }

    public static String c(antlr.a.a.c cVar) {
        String stringBuffer = new StringBuffer("options {").append(System.getProperty("line.separator")).toString();
        Enumeration ba = cVar.ba();
        while (ba.hasMoreElements()) {
            stringBuffer = new StringBuffer().append(stringBuffer).append((d) ba.nextElement()).append(System.getProperty("line.separator")).toString();
        }
        return new StringBuffer().append(stringBuffer).append("}").append(System.getProperty("line.separator")).append(System.getProperty("line.separator")).toString();
    }

    public final void Z(String str) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        b bVar = new b(this.k, str);
        this.er.put(bVar.bk(), bVar);
        f fVar = new f(bufferedReader);
        fVar.l(str);
        e eVar = new e(fVar);
        eVar.b(this.k);
        eVar.u(str);
        antlr.a.a.c cVar = null;
        while (eVar.o(1) == 5) {
            try {
                try {
                    bs p = eVar.p(1);
                    eVar.r(5);
                    X(str).V(p.V());
                } catch (bh e) {
                    eVar.a(e);
                    eVar.ai();
                    eVar.d(e.et);
                    return;
                }
            } catch (bz e2) {
                antlr.Tool tool = this.k;
                antlr.Tool.I(new StringBuffer("Token stream error reading grammar(s):\n").append(e2).toString());
                return;
            } catch (antlr.a e3) {
                antlr.Tool tool2 = this.k;
                antlr.Tool.I(new StringBuffer("error reading grammar(s):\n").append(e3).toString());
                return;
            }
        }
        switch (eVar.o(1)) {
            case CAN_THROW:
            case 7:
            case SETS_RESULT:
                break;
            case 13:
                cVar = eVar.c(null);
                break;
            default:
                throw new ba(eVar.p(1), eVar.aH());
        }
        while (true) {
            if (eVar.o(1) == 7 || eVar.o(1) == 8) {
                a a = eVar.a(str, this);
                if (a != null && cVar != null) {
                    X(str).b(cVar);
                }
                if (a != null) {
                    a.P(str);
                    a.a(this);
                    this.bj.put(a.bf(), a);
                    X(a.be()).a(a);
                }
            } else {
                eVar.r(1);
                return;
            }
        }
    }

    public final boolean bl() {
        boolean z = true;
        Enumeration elements = this.bj.elements();
        while (elements.hasMoreElements()) {
            a aVar = (a) elements.nextElement();
            if (aVar.bh() != null && aVar.bg() == null) {
                antlr.Tool tool = this.k;
                antlr.Tool.I(new StringBuffer("grammar ").append(aVar.bh()).append(" not defined").toString());
                z = false;
                this.bj.remove(aVar.bf());
            }
        }
        if (z) {
            Enumeration elements2 = this.bj.elements();
            while (elements2.hasMoreElements()) {
                a aVar2 = (a) elements2.nextElement();
                if (aVar2.bh() != null) {
                    aVar2.T(b(aVar2).bf());
                }
            }
            return true;
        }
        return false;
    }

    public final antlr.Tool bm() {
        return this.k;
    }
}