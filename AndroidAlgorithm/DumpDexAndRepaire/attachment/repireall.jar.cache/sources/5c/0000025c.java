package org.antlr.stringtemplate.a;

import antlr.ac;
import java.util.List;

/* compiled from: StringTemplateToken.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/p.class */
public class p extends ac {
    public List pf;

    public p() {
    }

    public p(int i, String str, List list) {
        super(33, str);
        this.pf = list;
    }

    @Override // antlr.ac, antlr.bs
    public String toString() {
        return new StringBuffer().append(super.toString()).append("; args=").append(this.pf).toString();
    }
}