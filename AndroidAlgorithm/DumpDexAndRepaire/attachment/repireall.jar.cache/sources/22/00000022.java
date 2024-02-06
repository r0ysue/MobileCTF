package antlr;

/* compiled from: MismatchedCharException.java */
/* loaded from: repireall.jar:antlr/ax.class */
public final class ax extends bh {
    private int cl;
    private int cm;
    private int cn;
    private int co;
    private antlr.a.a.b cp;
    private x cq;

    public ax() {
        super("Mismatched char");
    }

    public ax(char c, char c2, char c3, boolean z, x xVar) {
        super("Mismatched char", xVar.al(), xVar.am(), xVar.ak());
        this.cl = 3;
        this.cm = c;
        this.cn = c2;
        this.co = c3;
        this.cq = xVar;
    }

    public ax(char c, char c2, boolean z, x xVar) {
        super("Mismatched char", xVar.al(), xVar.am(), xVar.ak());
        this.cl = z ? 2 : 1;
        this.cm = c;
        this.cn = c2;
        this.cq = xVar;
    }

    public ax(char c, antlr.a.a.b bVar, boolean z, x xVar) {
        super("Mismatched char", xVar.al(), xVar.am(), xVar.ak());
        this.cl = 5;
        this.cm = c;
        this.cp = bVar;
        this.cq = xVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.cl) {
            case CAN_THROW:
                stringBuffer.append("expecting ");
                a(stringBuffer, this.cn);
                stringBuffer.append(", found ");
                a(stringBuffer, this.cm);
                break;
            case ODEX_ONLY:
                stringBuffer.append("expecting anything but '");
                a(stringBuffer, this.cn);
                stringBuffer.append("'; got it anyway");
                break;
            case 3:
            case CAN_CONTINUE:
                stringBuffer.append("expecting token ");
                if (this.cl == 4) {
                    stringBuffer.append("NOT ");
                }
                stringBuffer.append("in range: ");
                a(stringBuffer, this.cn);
                stringBuffer.append("..");
                a(stringBuffer, this.co);
                stringBuffer.append(", found ");
                a(stringBuffer, this.cm);
                break;
            case 5:
            case 6:
                stringBuffer.append(new StringBuffer("expecting ").append(this.cl == 6 ? "NOT " : "").append("one of (").toString());
                for (int i : this.cp.aZ()) {
                    a(stringBuffer, i);
                }
                stringBuffer.append("), found ");
                a(stringBuffer, this.cm);
                break;
            default:
                stringBuffer.append(super.getMessage());
                break;
        }
        return stringBuffer.toString();
    }

    private static void a(StringBuffer stringBuffer, int i) {
        switch (i) {
            case 9:
                stringBuffer.append("'\\t'");
                return;
            case 10:
                stringBuffer.append("'\\n'");
                return;
            case 13:
                stringBuffer.append("'\\r'");
                return;
            case 65535:
                stringBuffer.append("'<EOF>'");
                return;
            default:
                stringBuffer.append('\'');
                stringBuffer.append((char) i);
                stringBuffer.append('\'');
                return;
        }
    }
}