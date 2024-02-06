package antlr;

/* compiled from: StringUtils.java */
/* loaded from: repireall.jar:antlr/bq.class */
public final class bq {
    public static String a(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int lastIndexOf = str.lastIndexOf(str3);
        return (indexOf == -1 || lastIndexOf == -1) ? str : str.substring(indexOf + 1, lastIndexOf);
    }
}