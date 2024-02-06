package org.antlr.stringtemplate.a;

import antlr.ac;

/* compiled from: ChunkToken.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/h.class */
public class h extends ac {
    private String oR;

    public h() {
    }

    public h(int i, String str, String str2) {
        super(i, str);
        this.oR = str2;
    }

    public final String hv() {
        return this.oR;
    }

    @Override // antlr.ac, antlr.bs
    public String toString() {
        return new StringBuffer().append(super.toString()).append("<indent='").append(this.oR).append("'>").toString();
    }
}