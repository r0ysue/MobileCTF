package antlr;

/* compiled from: TreeParser.java */
/* loaded from: repireall.jar:antlr/cf.class */
public class cf {
    public static j dA = new j();
    protected antlr.a.a dB;
    protected String[] af;
    private i cz = new i();
    private int aE = 0;
    private cg dC = new cg();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(antlr.a.a aVar, int i) throws ay {
        if (aVar == null || aVar == dA || aVar.W() != i) {
            throw new ay(this.af, aVar, i, false);
        }
    }

    public void a(bh bhVar) {
        System.err.println(bhVar.toString());
    }
}