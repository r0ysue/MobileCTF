package antlr.preprocessor;

import java.util.Enumeration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Rule.java */
/* loaded from: repireall.jar:antlr/preprocessor/g.class */
public final class g {
    private String cW;
    private String eu;
    private String cN;
    private String ev;
    private String cG;
    private String M;
    private antlr.a.a.c ed;
    private String ew;
    protected a ex;
    private boolean ey = false;

    public g(String str, String str2, antlr.a.a.c cVar, a aVar) {
        this.cW = str;
        this.eu = str2;
        this.ed = cVar;
        this.ex = aVar;
    }

    public final String bz() {
        return this.cW;
    }

    public final boolean b(g gVar) {
        boolean z = true;
        boolean z2 = true;
        boolean equals = this.cW.equals(gVar.cW);
        if (this.cN != null) {
            z = this.cN.equals(gVar.cN);
        }
        if (this.ev != null) {
            z2 = this.ev.equals(gVar.ev);
        }
        return equals && z && z2;
    }

    public final void aa(String str) {
        this.cN = str;
    }

    public final void bA() {
        this.ey = true;
    }

    public final void ab(String str) {
        this.M = str;
    }

    public final void ac(String str) {
        this.ev = str;
    }

    public final void ad(String str) {
        this.cG = str;
    }

    public final void ae(String str) {
        this.ew = str;
    }

    public final String toString() {
        String stringBuffer = new StringBuffer().append(new StringBuffer().append("").append(this.ew == null ? "" : new StringBuffer().append(this.ew).append(" ").toString()).toString()).append(this.cW).append(this.ey ? "!" : "").append(this.cN == null ? "" : this.cN).append(" ").append(this.ev == null ? "" : new StringBuffer("returns ").append(this.ev).toString()).append(this.cG).toString();
        if (this.ed != null) {
            String stringBuffer2 = new StringBuffer().append(stringBuffer).append(System.getProperty("line.separator")).append("options {").append(System.getProperty("line.separator")).toString();
            Enumeration ba = this.ed.ba();
            while (ba.hasMoreElements()) {
                stringBuffer2 = new StringBuffer().append(stringBuffer2).append((d) ba.nextElement()).append(System.getProperty("line.separator")).toString();
            }
            stringBuffer = new StringBuffer().append(stringBuffer2).append("}").append(System.getProperty("line.separator")).toString();
        }
        if (this.M != null) {
            stringBuffer = new StringBuffer().append(stringBuffer).append(this.M).append(System.getProperty("line.separator")).toString();
        }
        return new StringBuffer().append(stringBuffer).append(this.eu).toString();
    }
}