package antlr;

import java.io.Serializable;

/* compiled from: BaseAST.java */
/* loaded from: repireall.jar:antlr/p.class */
public abstract class p implements antlr.a.a, Serializable {
    private p ac;
    private p ad;
    private static boolean ae = false;
    private static String[] af = null;

    @Override // antlr.a.a
    public final void a(antlr.a.a aVar) {
        if (aVar == null) {
            return;
        }
        p pVar = this.ac;
        p pVar2 = pVar;
        if (pVar != null) {
            while (pVar2.ad != null) {
                pVar2 = pVar2.ad;
            }
            pVar2.ad = (p) aVar;
            return;
        }
        this.ac = (p) aVar;
    }

    @Override // antlr.a.a
    public final antlr.a.a T() {
        return this.ac;
    }

    @Override // antlr.a.a
    public final antlr.a.a U() {
        return this.ad;
    }

    @Override // antlr.a.a
    public String V() {
        return "";
    }

    @Override // antlr.a.a
    public int W() {
        return 0;
    }

    @Override // antlr.a.a
    public final int X() {
        return 0;
    }

    @Override // antlr.a.a
    public final int Y() {
        return 0;
    }

    @Override // antlr.a.a
    public final void b(antlr.a.a aVar) {
        this.ac = (p) aVar;
    }

    @Override // antlr.a.a
    public final void c(antlr.a.a aVar) {
        this.ad = (p) aVar;
    }

    public void i(String str) {
    }

    public void d(int i) {
    }

    public String toString() {
        new StringBuffer();
        return V();
    }

    @Override // antlr.a.a
    public final String Z() {
        String str;
        str = "";
        String stringBuffer = new StringBuffer().append(T() != null ? new StringBuffer().append(str).append(" (").toString() : "").append(" ").append(toString()).toString();
        if (T() != null) {
            stringBuffer = new StringBuffer().append(stringBuffer).append(((p) T()).Z()).toString();
        }
        if (T() != null) {
            stringBuffer = new StringBuffer().append(stringBuffer).append(" )").toString();
        }
        if (U() != null) {
            stringBuffer = new StringBuffer().append(stringBuffer).append(((p) U()).Z()).toString();
        }
        return stringBuffer;
    }
}