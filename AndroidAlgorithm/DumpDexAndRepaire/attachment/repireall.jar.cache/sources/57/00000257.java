package org.antlr.stringtemplate.a;

import java.io.IOException;

/* compiled from: Expr.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/k.class */
public abstract class k {
    private org.antlr.stringtemplate.c pb;
    private String oR = null;

    public abstract int a(org.antlr.stringtemplate.c cVar, org.antlr.stringtemplate.f fVar) throws IOException;

    public k(org.antlr.stringtemplate.c cVar) {
        this.pb = cVar;
    }

    public final String hG() {
        return this.oR;
    }

    public final void be(String str) {
        this.oR = str;
    }
}