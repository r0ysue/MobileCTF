package antlr.a.a;

import org.antlr.stringtemplate.a.o;

/* compiled from: ASTArray.java */
/* loaded from: repireall.jar:antlr/a/a/a.class */
public final class a {
    private int dK = 0;
    public antlr.a.a[] dL;

    public a(int i) {
        this.dL = new antlr.a.a[i];
    }

    public final a a(o oVar) {
        antlr.a.a[] aVarArr = this.dL;
        int i = this.dK;
        this.dK = i + 1;
        aVarArr[i] = oVar;
        return this;
    }
}