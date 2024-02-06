package antlr;

/* compiled from: TreeBlockContext.java */
/* loaded from: repireall.jar:antlr/cd.class */
final class cd extends q {
    private boolean dy = true;

    @Override // antlr.q
    public final void b(o oVar) {
        ce ceVar = (ce) this.ag;
        if (this.dy) {
            ceVar.dz = (al) oVar;
            this.dy = false;
            return;
        }
        super.b(oVar);
    }
}