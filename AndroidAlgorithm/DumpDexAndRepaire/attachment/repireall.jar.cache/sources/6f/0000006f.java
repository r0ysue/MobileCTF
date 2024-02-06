package antlr;

import java.util.Hashtable;

/* compiled from: CharScanner.java */
/* loaded from: repireall.jar:antlr/x.class */
public abstract class x implements by {
    protected f at;
    private boolean au;
    private Class av;
    private boolean aw;
    protected boolean ax;
    protected Hashtable ay;
    private int az;
    protected bs aA;
    private c aB;
    protected au aC;
    private boolean aD;
    private int aE;

    public x() {
        this.au = true;
        this.aw = true;
        this.ax = true;
        this.az = 8;
        this.aA = null;
        this.aD = false;
        this.aE = 0;
        this.at = new f();
        this.aB = new c(this);
        n("antlr.ac");
    }

    public x(au auVar) {
        this();
        this.aC = auVar;
    }

    private void a(char c) {
        if (this.au) {
            this.at.a(c);
        }
    }

    private void ai() throws y {
        if (this.aC.bZ == 0) {
            char g = g(1);
            if (this.aw) {
                a(g);
            } else {
                a(this.aC.bY.m(1));
            }
            if (g != '\t') {
                this.aC.bH++;
            } else {
                this.aC.bH = ((((this.aC.bH - 1) / this.az) + 1) * this.az) + 1;
            }
        }
        this.aC.bY.aB();
    }

    public final boolean aj() {
        return this.ax;
    }

    public final int ak() {
        return this.aC.bH;
    }

    public final String al() {
        return this.aC.bJ;
    }

    public final int am() {
        return this.aC.aP;
    }

    public final String an() {
        return this.at.toString();
    }

    public final char g(int i) throws y {
        if (this.aw) {
            return this.aC.bY.m(i);
        }
        return Character.toLowerCase(this.aC.bY.m(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bs h(int i) {
        try {
            bs bsVar = (bs) this.av.newInstance();
            bsVar.t(i);
            bsVar.l(this.aC.bW);
            bsVar.k(this.aC.bX);
            return bsVar;
        } catch (IllegalAccessException unused) {
            k(new StringBuffer("Token class is not accessible").append(this.av).toString());
            return bs.da;
        } catch (InstantiationException unused2) {
            k(new StringBuffer("can't instantiate token: ").append(this.av).toString());
            return bs.da;
        }
    }

    public final int ao() {
        return this.aC.bY.aC();
    }

    public final void c(char c) throws ax, y {
        if (g(1) != c) {
            throw new ax(g(1), c, false, this);
        }
        ai();
    }

    public final void b(antlr.a.a.b bVar) throws ax, y {
        if (!bVar.D(g(1))) {
            throw new ax(g(1), bVar, false, this);
        }
        ai();
    }

    public final void j(String str) throws ax, y {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (g(1) != str.charAt(i)) {
                throw new ax(g(1), str.charAt(i), false, this);
            }
            ai();
        }
    }

    public final void d(char c) throws ax, y {
        if (g(1) == c) {
            throw new ax(g(1), c, true, this);
        }
        ai();
    }

    public final void a(char c, char c2) throws ax, y {
        if (g(1) < c || g(1) > c2) {
            throw new ax(g(1), c, c2, false, this);
        }
        ai();
    }

    public final void ap() {
        this.aC.aP++;
        this.aC.bH = 1;
    }

    private static void k(String str) {
        System.err.println(new StringBuffer("CharScanner; panic: ").append(str).toString());
        ci.B(str);
    }

    public final void aq() {
        this.at.a(0);
        this.aC.bW = this.aC.bH;
        this.aC.bX = this.aC.aP;
    }

    public final void i(int i) {
        this.aC.bY.n(i);
    }

    public final void n(boolean z) {
        this.aw = true;
    }

    public final void l(String str) {
        this.aC.bJ = str;
    }

    public final void m(String str) {
        aq();
        this.at.d(str);
    }

    public final void n(String str) {
        try {
            this.av = ci.L(str);
        } catch (ClassNotFoundException unused) {
            k(new StringBuffer("ClassNotFoundException: ").append(str).toString());
        }
    }

    public final int j(int i) {
        this.aB.a(this.at.N(), this.at.O());
        Integer num = (Integer) this.ay.get(this.aB);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    public final int a(String str, int i) {
        Integer num = (Integer) this.ay.get(new c(str, this));
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }
}