package org.jf.dexlib2.a;

import java.io.IOException;

/* compiled from: RegisterType.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/n.class */
public class n {
    public final byte tp;
    public final o tq;
    private static String[] tr;
    private static byte[][] ts;
    public static final n tt;
    private static n tu;
    public static final n tv;
    private static n tw;
    public static final n tx;
    public static final n ty;
    public static final n tz;
    public static final n tA;
    private static n tB;
    public static final n tC;
    public static final n tD;
    public static final n tE;
    public static final n tF;
    public static final n tG;
    public static final n tH;
    public static final n tI;
    private static n tJ;
    private static /* synthetic */ boolean pL;

    /* JADX WARN: Type inference failed for: r0v7, types: [byte[], byte[][]] */
    static {
        pL = !n.class.desiredAssertionStatus();
        tr = new String[]{"Unknown", "Uninit", "Null", "One", "Boolean", "Byte", "PosByte", "Short", "PosShort", "Char", "Integer", "Float", "LongLo", "LongHi", "DoubleLo", "DoubleHi", "UninitRef", "UninitThis", "Reference", "Conflicted"};
        ts = new byte[]{new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, new byte[]{1, 1, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{2, 19, 2, 4, 4, 5, 6, 7, 8, 9, 10, 11, 19, 19, 19, 19, 19, 19, 18, 19}, new byte[]{3, 19, 4, 3, 4, 5, 6, 7, 8, 9, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{4, 19, 4, 4, 4, 5, 6, 7, 8, 9, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{5, 19, 5, 5, 5, 5, 5, 7, 7, 10, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{6, 19, 6, 6, 6, 5, 6, 7, 8, 9, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{7, 19, 7, 7, 7, 7, 7, 7, 7, 10, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{8, 19, 8, 8, 8, 7, 8, 7, 8, 9, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{9, 19, 9, 9, 9, 10, 9, 10, 9, 9, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{10, 19, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{11, 19, 11, 11, 11, 11, 11, 11, 11, 11, 10, 11, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{12, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 12, 19, 12, 19, 19, 19, 19, 19}, new byte[]{13, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 13, 19, 13, 19, 19, 19, 19}, new byte[]{14, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 12, 19, 14, 19, 19, 19, 19, 19}, new byte[]{15, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 13, 19, 15, 19, 19, 19, 19}, new byte[]{16, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19}, new byte[]{17, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 17, 19, 19}, new byte[]{18, 19, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 18, 19}, new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19}};
        tt = new n((byte) 0, null);
        tu = new n((byte) 1, null);
        tv = new n((byte) 2, null);
        tw = new n((byte) 3, null);
        tx = new n((byte) 4, null);
        ty = new n((byte) 5, null);
        tz = new n((byte) 6, null);
        tA = new n((byte) 7, null);
        tB = new n((byte) 8, null);
        tC = new n((byte) 9, null);
        tD = new n((byte) 10, null);
        tE = new n((byte) 11, null);
        tF = new n((byte) 12, null);
        tG = new n((byte) 13, null);
        tH = new n((byte) 14, null);
        tI = new n((byte) 15, null);
        tJ = new n((byte) 19, null);
    }

    private n(byte b, o oVar) {
        if (!pL && (((b != 18 && b != 16 && b != 17) || oVar == null) && (b == 18 || b == 16 || b == 17 || oVar != null))) {
            throw new AssertionError();
        }
        this.tp = b;
        this.tq = oVar;
    }

    public String toString() {
        return "(" + tr[this.tp] + (this.tq == null ? "" : "," + this.tq) + ")";
    }

    public final void n(org.jf.a.m mVar) throws IOException {
        mVar.write(40);
        mVar.write(tr[this.tp]);
        if (this.tq != null) {
            mVar.write(44);
            mVar.write(this.tq.io());
        }
        mVar.write(41);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.tp != nVar.tp || this.tp == 16 || this.tp == 17) {
            return false;
        }
        return this.tq != null ? this.tq.equals(nVar.tq) : nVar.tq == null;
    }

    public int hashCode() {
        return (this.tp * 31) + (this.tq != null ? this.tq.hashCode() : 0);
    }

    public static n a(org.jf.dexlib2.e.i iVar, boolean z) {
        switch (iVar.charAt(0)) {
            case 'D':
                if (z) {
                    return a((byte) 14, (o) null);
                }
                return a((byte) 15, (o) null);
            case 'J':
                if (z) {
                    return a((byte) 12, (o) null);
                }
                return a((byte) 13, (o) null);
            default:
                throw new org.jf.a.i("Cannot use this method for narrow register type: %s", iVar);
        }
    }

    public static n a(e eVar, CharSequence charSequence) {
        switch (charSequence.charAt(0)) {
            case 'B':
                return ty;
            case 'C':
                return tC;
            case 'D':
                return tH;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            default:
                throw new a("Invalid type: " + ((Object) charSequence), new Object[0]);
            case 'F':
                return tE;
            case 'I':
                return tD;
            case 'J':
                return tF;
            case 'L':
            case '[':
                return a((byte) 18, eVar.a(charSequence));
            case 'S':
                return tA;
            case 'Z':
                return tx;
        }
    }

    public static n au(int i) {
        if (i < -32768) {
            return tD;
        }
        if (i < -128) {
            return tA;
        }
        if (i < 0) {
            return ty;
        }
        if (i == 0) {
            return tv;
        }
        if (i == 1) {
            return tw;
        }
        if (i < 128) {
            return tz;
        }
        if (i < 32768) {
            return tB;
        }
        if (i < 65536) {
            return tC;
        }
        return tD;
    }

    public final n a(n nVar) {
        if (nVar.equals(this)) {
            return this;
        }
        byte b = ts[this.tp][nVar.tp];
        o oVar = null;
        if (b == 18) {
            o oVar2 = this.tq;
            if (oVar2 != null) {
                if (nVar.tq != null) {
                    oVar = oVar2.a(nVar.tq);
                } else {
                    oVar = oVar2;
                }
            } else {
                oVar = nVar.tq;
            }
        } else if (b == 16 || b == 17) {
            if (this.tp == 0) {
                return nVar;
            }
            if (pL || nVar.tp == 0) {
                return this;
            }
            throw new AssertionError();
        }
        if (oVar != null) {
            if (oVar.equals(this.tq)) {
                return this;
            }
            if (oVar.equals(nVar.tq)) {
                return nVar;
            }
        }
        return a(b, oVar);
    }

    public static n a(byte b, o oVar) {
        switch (b) {
            case 0:
                return tt;
            case CAN_THROW:
                return tu;
            case ODEX_ONLY:
                return tv;
            case 3:
                return tw;
            case CAN_CONTINUE:
                return tx;
            case 5:
                return ty;
            case 6:
                return tz;
            case 7:
                return tA;
            case SETS_RESULT:
                return tB;
            case 9:
                return tC;
            case 10:
                return tD;
            case 11:
                return tE;
            case 12:
                return tF;
            case 13:
                return tG;
            case 14:
                return tH;
            case 15:
                return tI;
            case SETS_REGISTER:
            case 17:
            case 18:
            default:
                return new n(b, oVar);
            case 19:
                return tJ;
        }
    }
}