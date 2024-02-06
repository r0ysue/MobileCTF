package antlr;

/* compiled from: ANTLRHashString.java */
/* loaded from: repireall.jar:antlr/c.class */
public final class c {
    private String a;
    private char[] b;
    private int c;
    private x d;

    public c(x xVar) {
        this.d = xVar;
    }

    public c(String str, x xVar) {
        this.d = xVar;
        this.a = str;
        this.b = null;
    }

    private final char charAt(int i) {
        return this.a != null ? this.a.charAt(i) : this.b[i];
    }

    public final boolean equals(Object obj) {
        c cVar;
        if (!(obj instanceof c) && !(obj instanceof String)) {
            return false;
        }
        if (obj instanceof String) {
            cVar = new c((String) obj, this.d);
        } else {
            cVar = (c) obj;
        }
        int length = length();
        if (cVar.length() != length) {
            return false;
        }
        if (this.d.aj()) {
            for (int i = 0; i < length; i++) {
                if (charAt(i) != cVar.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < length; i2++) {
            x xVar = this.d;
            char lowerCase = Character.toLowerCase(charAt(i2));
            x xVar2 = this.d;
            if (lowerCase != Character.toLowerCase(cVar.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int length = length();
        if (this.d.aj()) {
            for (int i2 = 0; i2 < length; i2++) {
                i = (i * 151) + charAt(i2);
            }
        } else {
            for (int i3 = 0; i3 < length; i3++) {
                x xVar = this.d;
                i = (i * 151) + Character.toLowerCase(charAt(i3));
            }
        }
        return i;
    }

    private final int length() {
        return this.a != null ? this.a.length() : this.c;
    }

    public final void a(char[] cArr, int i) {
        this.b = cArr;
        this.c = i;
        this.a = null;
    }
}