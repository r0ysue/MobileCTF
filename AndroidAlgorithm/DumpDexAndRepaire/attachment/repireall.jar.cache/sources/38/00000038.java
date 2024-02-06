package antlr;

/* compiled from: Token.java */
/* loaded from: repireall.jar:antlr/bs.class */
public class bs implements Cloneable {
    protected int cZ;
    public static bs da = new bs(0, "<no text>");

    public bs() {
        this.cZ = 0;
    }

    private bs(int i, String str) {
        this.cZ = 0;
        this.cZ = 0;
        i(str);
    }

    public int Y() {
        return 0;
    }

    public int X() {
        return 0;
    }

    public String V() {
        return "<no text>";
    }

    public void i(String str) {
    }

    public void l(int i) {
    }

    public void k(int i) {
    }

    public final int aO() {
        return this.cZ;
    }

    public final void t(int i) {
        this.cZ = i;
    }

    public String toString() {
        return new StringBuffer("[\"").append(V()).append("\",<").append(this.cZ).append(">]").toString();
    }
}