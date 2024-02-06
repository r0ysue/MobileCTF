package org.jf.dexlib2.a;

/* compiled from: ArrayProto.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/d.class */
public final class d implements o {
    private e qV;
    protected final int rT;
    private String rU;
    private static final String rV = com.b.a.a.n.e("[", org.jf.dexlib2.e.STATIC_FIELD_ACCESSOR);

    public d(e eVar, String str) {
        this.qV = eVar;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
            if (i == str.length()) {
                throw new org.jf.a.i("Invalid array type: %s", str);
            }
        }
        if (i == 0) {
            throw new org.jf.a.i("Invalid array type: %s", str);
        }
        this.rT = i;
        this.rU = str.substring(i);
    }

    public final String toString() {
        return io();
    }

    @Override // org.jf.dexlib2.a.o
    public final e in() {
        return this.qV;
    }

    @Override // org.jf.dexlib2.a.o
    public final String io() {
        return f(this.rU, this.rT);
    }

    @Override // org.jf.dexlib2.a.o
    public final boolean ip() {
        return false;
    }

    public final String iq() {
        return this.rU;
    }

    public final String ir() {
        if (this.rT > 1) {
            return f(this.rU, this.rT - 1);
        }
        return this.rU;
    }

    @Override // org.jf.dexlib2.a.o
    public final boolean bh(String str) {
        return str.equals("Ljava/lang/Cloneable;") || str.equals("Ljava/io/Serializable;");
    }

    @Override // org.jf.dexlib2.a.o
    public final String is() {
        return "Ljava/lang/Object;";
    }

    @Override // org.jf.dexlib2.a.o
    public final o a(o oVar) {
        if (oVar instanceof d) {
            if (org.jf.dexlib2.h.j.bw(this.rU) || org.jf.dexlib2.h.j.bw(((d) oVar).rU)) {
                if (this.rT == ((d) oVar).rT && this.rU.equals(((d) oVar).rU)) {
                    return this;
                }
                return this.qV.a("Ljava/lang/Object;");
            } else if (this.rT == ((d) oVar).rT) {
                o a = this.qV.a(this.rU);
                o a2 = this.qV.a(((d) oVar).rU);
                o a3 = a.a(a2);
                if (a == a3) {
                    return this;
                }
                if (a2 == a3) {
                    return oVar;
                }
                return this.qV.a(f(a3.io(), this.rT));
            } else {
                return this.qV.a(f("Ljava/lang/Object;", Math.min(this.rT, ((d) oVar).rT)));
            }
        } else if (oVar instanceof g) {
            try {
                if (oVar.ip()) {
                    if (bh(oVar.io())) {
                        return oVar;
                    }
                }
            } catch (q unused) {
            }
            return this.qV.a("Ljava/lang/Object;");
        } else {
            return oVar.a(this);
        }
    }

    private static String f(String str, int i) {
        return rV.substring(0, i) + str;
    }

    @Override // org.jf.dexlib2.a.o
    public final org.jf.dexlib2.e.c.a aq(int i) {
        if (i == 8) {
            return new org.jf.dexlib2.f.c.a(io(), "length", "int");
        }
        return null;
    }

    @Override // org.jf.dexlib2.a.o
    public final org.jf.dexlib2.e.g ar(int i) {
        return this.qV.a("Ljava/lang/Object;").ar(i);
    }

    @Override // org.jf.dexlib2.a.o
    public final int a(org.jf.dexlib2.e.c.c cVar) {
        return this.qV.a("Ljava/lang/Object;").a(cVar);
    }
}