package antlr;

/* compiled from: TokenBuffer.java */
/* loaded from: repireall.jar:antlr/bt.class */
public final class bt {
    private by db;
    private int bK = 0;
    private int bL = 0;
    int bM = 0;
    private bv dc = new bv(1);

    public bt(by byVar) {
        this.db = byVar;
    }

    private final void u(int i) throws bz {
        aQ();
        while (this.dc.ao < i + this.bL) {
            this.dc.r(this.db.o());
        }
    }

    public final int v(int i) throws bz {
        u(i);
        return this.dc.y((this.bL + i) - 1).aO();
    }

    public final bs w(int i) throws bz {
        u(i);
        return this.dc.y((this.bL + i) - 1);
    }

    public final int aP() {
        aQ();
        this.bK++;
        return this.bL;
    }

    public final void x(int i) {
        aQ();
        this.bL = i;
        this.bK--;
    }

    private final void aQ() {
        while (this.bM > 0) {
            if (this.bK > 0) {
                this.bL++;
            } else {
                this.dc.aR();
            }
            this.bM--;
        }
    }
}