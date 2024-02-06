package antlr;

/* compiled from: MismatchedTokenException.java */
/* loaded from: repireall.jar:antlr/ay.class */
public final class ay extends bh {
    private String[] af;
    private bs cr;
    private antlr.a.a cs;
    private String ct;
    private int cl;
    private int cn;
    private int co;
    private antlr.a.a.b cp;

    public ay() {
        super("Mismatched Token: expecting any AST node", "<AST>", -1, -1);
        this.ct = null;
    }

    public ay(String[] strArr, antlr.a.a aVar, int i, boolean z) {
        super("Mismatched Token", "<AST>", aVar == null ? -1 : aVar.X(), aVar == null ? -1 : aVar.Y());
        this.ct = null;
        this.af = strArr;
        this.cs = aVar;
        if (aVar == null) {
            this.ct = "<empty tree>";
        } else {
            this.ct = aVar.toString();
        }
        this.cl = 1;
        this.cn = i;
    }

    public ay(String[] strArr, bs bsVar, int i, boolean z, String str) {
        super("Mismatched Token", str, bsVar.X(), bsVar.Y());
        this.ct = null;
        this.af = strArr;
        this.cr = bsVar;
        this.ct = bsVar.V();
        this.cl = 1;
        this.cn = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.cl) {
            case CAN_THROW:
                stringBuffer.append(new StringBuffer("expecting ").append(q(this.cn)).append(", found '").append(this.ct).append("'").toString());
                break;
            case ODEX_ONLY:
                stringBuffer.append(new StringBuffer("expecting anything but ").append(q(this.cn)).append("; got it anyway").toString());
                break;
            case 3:
                stringBuffer.append(new StringBuffer("expecting token in range: ").append(q(this.cn)).append("..").append(q(this.co)).append(", found '").append(this.ct).append("'").toString());
                break;
            case CAN_CONTINUE:
                stringBuffer.append(new StringBuffer("expecting token NOT in range: ").append(q(this.cn)).append("..").append(q(this.co)).append(", found '").append(this.ct).append("'").toString());
                break;
            case 5:
            case 6:
                stringBuffer.append(new StringBuffer("expecting ").append(this.cl == 6 ? "NOT " : "").append("one of (").toString());
                antlr.a.a.b bVar = this.cp;
                throw new NullPointerException();
            default:
                stringBuffer.append(super.getMessage());
                break;
        }
        return stringBuffer.toString();
    }

    private String q(int i) {
        if (i == 0) {
            return "<Set of tokens>";
        }
        if (i < 0 || i >= this.af.length) {
            return new StringBuffer("<").append(String.valueOf(i)).append(">").toString();
        }
        return this.af[i];
    }
}