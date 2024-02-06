package antlr;

/* compiled from: TokenStreamRecognitionException.java */
/* loaded from: repireall.jar:antlr/cb.class */
public final class cb extends bz {
    private bh dg;

    public cb(bh bhVar) {
        super(bhVar.getMessage());
        this.dg = bhVar;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return this.dg.toString();
    }
}