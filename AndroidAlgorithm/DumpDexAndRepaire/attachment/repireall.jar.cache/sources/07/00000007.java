package antlr.a.a;

import antlr.q;
import java.util.NoSuchElementException;

/* compiled from: LList.java */
/* loaded from: repireall.jar:antlr/a/a/e.class */
public final class e implements antlr.a.b {
    private d dR = null;
    private d dS = null;
    private int v = 0;

    @Override // antlr.a.b
    public final int aW() {
        return this.v;
    }

    @Override // antlr.a.b
    public final Object aX() throws NoSuchElementException {
        if (this.dR == null) {
            throw new NoSuchElementException();
        }
        Object obj = this.dR.dP;
        this.dR = this.dR.dQ;
        this.v--;
        return obj;
    }

    @Override // antlr.a.b
    public final void a(q qVar) {
        d dVar = this.dR;
        this.dR = new d(qVar);
        this.dR.dQ = dVar;
        this.v++;
        if (this.dS != null) {
            return;
        }
        this.dS = this.dR;
    }

    @Override // antlr.a.b
    public final Object aY() throws NoSuchElementException {
        if (this.dR == null) {
            throw new NoSuchElementException();
        }
        return this.dR.dP;
    }
}