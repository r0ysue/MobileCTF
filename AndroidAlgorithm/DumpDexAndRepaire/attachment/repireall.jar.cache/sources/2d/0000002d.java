package antlr;

/* compiled from: RecognitionException.java */
/* loaded from: repireall.jar:antlr/bh.class */
public class bh extends a {
    public String bv;
    public int aP;
    public int bH;

    public bh(String str) {
        super(str);
        this.bv = null;
        this.aP = -1;
        this.bH = -1;
    }

    public bh(String str, String str2, int i, int i2) {
        super(str);
        this.bv = str2;
        this.aP = i;
        this.bH = i2;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return new StringBuffer().append(aj.as().a(this.bv, this.aP, this.bH)).append(getMessage()).toString();
    }
}