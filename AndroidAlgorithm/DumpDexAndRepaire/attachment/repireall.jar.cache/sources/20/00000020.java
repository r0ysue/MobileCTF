package antlr;

/* compiled from: Lookahead.java */
/* loaded from: repireall.jar:antlr/av.class */
public final class av implements Cloneable {
    private String cb;
    private antlr.a.a.b cc;
    private boolean cd = false;
    private antlr.a.a.b ca = new antlr.a.a.b();

    public final Object clone() {
        try {
            av avVar = (av) super.clone();
            avVar.ca = (antlr.a.a.b) this.ca.clone();
            avVar.cb = this.cb;
            if (this.cc != null) {
                avVar.cc = (antlr.a.a.b) this.cc.clone();
            }
            return avVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final String toString() {
        String str = "";
        String N = this.ca.N(",");
        if (this.cd) {
            str = "+<epsilon>";
        }
        return new StringBuffer().append(N).append(str).append(this.cb != null ? new StringBuffer("; FOLLOW(").append(this.cb).append(")").toString() : "").append(this.cc != null ? new StringBuffer("; depths=").append(this.cc.N(",")).toString() : "").toString();
    }

    public final String a(String str, antlr.a.a.f fVar) {
        String str2 = "";
        String b = this.ca.b(str, fVar);
        if (this.cb != null) {
            str2 = new StringBuffer("; FOLLOW(").append(this.cb).append(")").toString();
        }
        return new StringBuffer().append(b).append(str2).append(this.cc != null ? new StringBuffer("; depths=").append(this.cc.N(",")).toString() : "").toString();
    }
}