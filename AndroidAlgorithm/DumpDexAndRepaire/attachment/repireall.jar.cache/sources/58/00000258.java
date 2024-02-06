package org.antlr.stringtemplate.a;

import java.util.LinkedHashMap;

/* compiled from: FormalArgument.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/l.class */
public final class l {
    public static final LinkedHashMap pc = new LinkedHashMap();
    private String cW;
    public org.antlr.stringtemplate.c pd;

    static {
        String[] strArr = {null, "?", "", null, "*", null, null, null, "+"};
    }

    public l(String str, org.antlr.stringtemplate.c cVar) {
        this.cW = str;
        this.pd = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.cW.equals(lVar.cW)) {
            return false;
        }
        if (this.pd == null || lVar.pd != null) {
            if (this.pd == null && lVar.pd != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        if (this.pd != null) {
            return new StringBuffer().append(this.cW).append("=").append(this.pd).toString();
        }
        return this.cW;
    }
}