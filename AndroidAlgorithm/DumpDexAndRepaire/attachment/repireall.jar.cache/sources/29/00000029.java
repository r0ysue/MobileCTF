package antlr;

import java.util.Hashtable;

/* compiled from: Parser.java */
/* loaded from: repireall.jar:antlr/bd.class */
public abstract class bd {
    protected bf cx;
    protected String[] af;
    protected org.antlr.stringtemplate.a.o cy;
    protected i cz;
    protected Hashtable y;
    private boolean cA;
    private int aE;

    public abstract void ai() throws bz;

    public abstract int o(int i) throws bz;

    public abstract bs p(int i) throws bz;

    public bd() {
        this(new bf());
    }

    private bd(bf bfVar) {
        this.cz = null;
        this.y = null;
        this.cA = false;
        this.aE = 0;
        this.cx = bfVar;
    }

    public final Hashtable aF() {
        return this.y;
    }

    public final void d(antlr.a.a.b bVar) throws bz {
        while (o(1) != 1 && !bVar.D(o(1))) {
            ai();
        }
    }

    public final antlr.a.a aG() {
        return this.cy;
    }

    public final String aH() {
        return this.cx.bJ;
    }

    public final bf aI() {
        return this.cx;
    }

    public final int aJ() {
        return this.cx.cB.aP();
    }

    public final void r(int i) throws ay, bz {
        if (o(1) != i) {
            throw new ay(this.af, p(1), i, false, this.cx.bJ);
        }
        ai();
    }

    public void a(bh bhVar) {
        System.err.println(bhVar);
    }

    public final void e(antlr.a.a.b bVar) throws bz {
        ai();
        d(bVar);
    }

    public final void s(int i) {
        this.cx.cB.x(i);
    }

    public final void t(String str) {
        this.cz.e(str);
    }

    public final void u(String str) {
        this.cx.bJ = str;
    }

    public final void a(bt btVar) {
        this.cx.cB = btVar;
    }
}