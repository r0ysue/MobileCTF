package antlr;

/* compiled from: LLkParser.java */
/* loaded from: repireall.jar:antlr/as.class */
public class as extends bd {
    private int bR;

    public as(bt btVar, int i) {
        this.bR = 1;
        a(btVar);
    }

    public as(by byVar, int i) {
        this.bR = i;
        a(new bt(byVar));
    }

    @Override // antlr.bd
    public final void ai() throws bz {
        this.cx.cB.bM++;
    }

    @Override // antlr.bd
    public final int o(int i) throws bz {
        return this.cx.cB.v(i);
    }

    @Override // antlr.bd
    public final bs p(int i) throws bz {
        return this.cx.cB.w(1);
    }
}