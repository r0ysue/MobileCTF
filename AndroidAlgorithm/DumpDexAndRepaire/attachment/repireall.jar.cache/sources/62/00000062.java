package antlr.preprocessor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/* compiled from: GrammarFile.java */
/* loaded from: repireall.jar:antlr/preprocessor/b.class */
public final class b {
    private String bv;
    private antlr.a.a.c ed;
    private antlr.Tool aV;
    private String el = "";
    private boolean en = false;
    private antlr.a.a.c em = new antlr.a.a.c();

    public b(antlr.Tool tool, String str) {
        this.bv = str;
        this.aV = tool;
    }

    public final void a(a aVar) {
        this.em.a(aVar.bf(), aVar);
    }

    public final void bi() throws IOException {
        if (!this.en) {
            return;
        }
        PrintWriter D = this.aV.D(U(this.bv));
        D.println(toString());
        D.close();
    }

    public final antlr.a.a.c bj() {
        return this.em;
    }

    public final String bk() {
        return this.bv;
    }

    public final String U(String str) {
        if (this.en) {
            StringBuffer stringBuffer = new StringBuffer("expanded");
            antlr.Tool tool = this.aV;
            return stringBuffer.append(antlr.Tool.C(str)).toString();
        }
        return str;
    }

    public final void p(boolean z) {
        this.en = true;
    }

    public final void V(String str) {
        this.el = new StringBuffer().append(this.el).append(str).append(System.getProperty("line.separator")).toString();
    }

    public final void b(antlr.a.a.c cVar) {
        this.ed = cVar;
    }

    public final String toString() {
        String str = this.el == null ? "" : this.el;
        String c = this.ed == null ? "" : c.c(this.ed);
        StringBuffer stringBuffer = new StringBuffer(10000);
        stringBuffer.append(str);
        stringBuffer.append(c);
        Enumeration ba = this.em.ba();
        while (ba.hasMoreElements()) {
            stringBuffer.append(((a) ba.nextElement()).toString());
        }
        return stringBuffer.toString();
    }
}