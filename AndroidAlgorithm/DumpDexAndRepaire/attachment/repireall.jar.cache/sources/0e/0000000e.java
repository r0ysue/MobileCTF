package antlr;

/* compiled from: DefaultFileLineFormatter.java */
/* loaded from: repireall.jar:antlr/ad.class */
public final class ad extends aj {
    @Override // antlr.aj
    public final String a(String str, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(new StringBuffer().append(str).append(":").toString());
        }
        if (i != -1) {
            if (str == null) {
                stringBuffer.append("line ");
            }
            stringBuffer.append(i);
            if (i2 != -1) {
                stringBuffer.append(new StringBuffer(":").append(i2).toString());
            }
            stringBuffer.append(":");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}