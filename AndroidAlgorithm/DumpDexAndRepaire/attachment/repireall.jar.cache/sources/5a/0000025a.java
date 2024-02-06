package org.antlr.stringtemplate.a;

import java.io.IOException;

/* compiled from: StringRef.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/n.class */
public class n extends k {
    private String pe;

    public n(org.antlr.stringtemplate.c cVar, String str) {
        super(cVar);
        this.pe = str;
    }

    @Override // org.antlr.stringtemplate.a.k
    public final int a(org.antlr.stringtemplate.c cVar, org.antlr.stringtemplate.f fVar) throws IOException {
        if (this.pe != null) {
            return fVar.aK(this.pe);
        }
        return 0;
    }

    public String toString() {
        if (this.pe != null) {
            return this.pe;
        }
        return "";
    }
}