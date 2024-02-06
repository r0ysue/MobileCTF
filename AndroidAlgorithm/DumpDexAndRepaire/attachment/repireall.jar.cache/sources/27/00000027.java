package antlr;

/* compiled from: NoViableAltForCharException.java */
/* loaded from: repireall.jar:antlr/bb.class */
public final class bb extends bh {
    private char cw;

    public bb(char c, String str, int i, int i2) {
        super("NoViableAlt", str, i, i2);
        this.cw = c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String stringBuffer;
        if (this.cw < ' ' || this.cw > '~') {
            stringBuffer = new StringBuffer().append("unexpected char: ").append("0x").append(Integer.toHexString(this.cw).toUpperCase()).toString();
        } else {
            stringBuffer = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("unexpected char: ").append('\'').toString()).append(this.cw).toString()).append('\'').toString();
        }
        return stringBuffer;
    }
}