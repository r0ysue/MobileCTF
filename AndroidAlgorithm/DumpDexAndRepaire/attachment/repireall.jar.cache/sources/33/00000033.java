package antlr;

import java.util.Hashtable;

/* compiled from: SimpleTokenManager.java */
/* loaded from: repireall.jar:antlr/bn.class */
class bn implements bu, Cloneable {
    protected Tool k;
    private String cW;
    protected int cT = 4;
    private boolean cX = false;
    private antlr.a.a.f cU = new antlr.a.a.f(1);
    private Hashtable cV = new Hashtable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public bn(String str, Tool tool) {
        this.k = tool;
        this.cW = str;
        cc ccVar = new cc("EOF");
        ccVar.z(1);
        a(ccVar);
        this.cU.H(3);
        this.cU.c("NULL_TREE_LOOKAHEAD", 3);
    }

    @Override // antlr.bu
    public Object clone() {
        try {
            bn bnVar = (bn) super.clone();
            bnVar.cU = (antlr.a.a.f) this.cU.clone();
            bnVar.cV = (Hashtable) this.cV.clone();
            bnVar.cT = this.cT;
            bnVar.k = this.k;
            bnVar.cW = this.cW;
            return bnVar;
        } catch (CloneNotSupportedException unused) {
            this.k.F("cannot clone token manager");
            return null;
        }
    }

    @Override // antlr.bu
    public void a(cc ccVar) {
        this.cU.H(ccVar.aT());
        this.cU.c(ccVar.az(), ccVar.aT());
        a(ccVar.az(), ccVar);
    }

    @Override // antlr.bu
    public final cc w(String str) {
        return (cc) this.cV.get(str);
    }

    @Override // antlr.bu
    public final antlr.a.a.f aM() {
        return this.cU;
    }

    @Override // antlr.bu
    public final void a(String str, cc ccVar) {
        this.cV.put(str, ccVar);
    }

    @Override // antlr.bu
    public int aA() {
        int i = this.cT;
        this.cT = i + 1;
        return i;
    }

    @Override // antlr.bu
    public final void x(String str) {
        this.cW = str;
    }

    @Override // antlr.bu
    public final boolean y(String str) {
        return this.cV.containsKey(str);
    }
}