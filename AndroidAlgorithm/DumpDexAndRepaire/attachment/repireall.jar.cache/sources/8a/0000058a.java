package org.jf.dexlib2.h;

/* compiled from: TypeUtils.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/j.class */
public final class j {
    public static boolean bv(String str) {
        char charAt = str.charAt(0);
        return charAt == 'J' || charAt == 'D';
    }

    public static boolean b(org.jf.dexlib2.e.i iVar) {
        return bv(iVar.io());
    }

    public static boolean bw(String str) {
        return str.length() == 1;
    }

    public static String bx(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return "";
        }
        return str.substring(1, lastIndexOf);
    }

    public static boolean a(String str, org.jf.dexlib2.e.c cVar) {
        if (org.jf.dexlib2.a.PUBLIC.isSet(cVar.iJ())) {
            return true;
        }
        return bx(cVar.io()).equals(bx(str));
    }
}