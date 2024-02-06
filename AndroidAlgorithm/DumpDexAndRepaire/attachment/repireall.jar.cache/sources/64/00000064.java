package antlr.preprocessor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Option.java */
/* loaded from: repireall.jar:antlr/preprocessor/d.class */
public final class d {
    private String cW;
    private String es;

    public d(String str, String str2, a aVar) {
        this.cW = str;
        this.es = str2;
    }

    public final String bn() {
        return this.cW;
    }

    public final String toString() {
        return new StringBuffer("\t").append(this.cW).append("=").append(this.es).toString();
    }
}