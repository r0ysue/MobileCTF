package org.jf.baksmali.a.c;

import java.io.IOException;
import org.jf.a.i;
import org.jf.a.m;
import org.jf.baksmali.a.k;
import org.jf.baksmali.a.l;
import org.jf.dexlib2.d.g;
import org.jf.dexlib2.e.b.a.ak;
import org.jf.dexlib2.e.b.a.x;
import org.jf.dexlib2.e.b.f;
import org.jf.dexlib2.e.b.n;
import org.jf.dexlib2.e.b.q;
import org.jf.dexlib2.e.b.r;
import org.jf.dexlib2.e.b.u;
import org.jf.dexlib2.e.b.v;
import org.jf.dexlib2.g;
import org.jf.dexlib2.h;

/* compiled from: InstructionMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/c/b.class */
public class b<T extends org.jf.dexlib2.e.b.f> extends l {
    private k pJ;
    protected final T pK;
    private static /* synthetic */ boolean pL;

    static {
        pL = !b.class.desiredAssertionStatus();
    }

    public b(k kVar, int i, T t) {
        super(i);
        this.pJ = kVar;
        this.pK = t;
    }

    @Override // org.jf.baksmali.a.l
    public final double hI() {
        return 100.0d;
    }

    private static String a(g.a aVar, int i, m mVar) throws IOException {
        String str;
        mVar.write("#");
        mVar.write(aVar.getMessage());
        mVar.write("\n");
        Object[] objArr = new Object[2];
        switch (i) {
            case 0:
                str = "string";
                break;
            case CAN_THROW:
                str = "type";
                break;
            case ODEX_ONLY:
                str = "field";
                break;
            case 3:
                str = "method";
                break;
            case CAN_CONTINUE:
                str = "method_proto";
                break;
            default:
                throw new g.a(i);
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(aVar.kI());
        return String.format("%s@%d", objArr);
    }

    @Override // org.jf.baksmali.a.l
    public boolean a(m mVar) throws IOException {
        boolean z;
        org.jf.dexlib2.e iQ = this.pK.iQ();
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = false;
        if (this.pK instanceof org.jf.dexlib2.e.b.a.g) {
            int jO = ((org.jf.dexlib2.e.b.a.g) this.pK).jO();
            String ak = h.ak(jO);
            str = ak;
            if (ak == null) {
                mVar.write("#was invalid verification error type: ");
                mVar.bX(jO);
                mVar.write("\n");
                str = "generic-error";
            }
        }
        if (this.pK instanceof org.jf.dexlib2.e.b.m) {
            org.jf.dexlib2.e.b.m mVar2 = (org.jf.dexlib2.e.b.m) this.pK;
            String str4 = null;
            if (this.pJ.qd.ps.qR) {
                str4 = this.pJ.qe.iG();
            }
            try {
                str2 = org.jf.dexlib2.h.g.a(mVar2.jP(), str4);
            } catch (g.a e) {
                z2 = true;
                str2 = a(e, mVar2.ib(), mVar);
            } catch (g.a e2) {
                mVar.write("#invalid reference type: ");
                mVar.bX(e2.ib());
                z2 = true;
                str2 = "invalid_reference";
            }
            if (!pL && str2 == null) {
                throw new AssertionError();
            } else if (this.pK instanceof org.jf.dexlib2.e.b.a) {
                org.jf.dexlib2.e.b.a aVar = (org.jf.dexlib2.e.b.a) this.pK;
                try {
                    str3 = org.jf.dexlib2.h.g.a(aVar.ls(), str4);
                } catch (g.a e3) {
                    z2 = true;
                    str3 = a(e3, aVar.lt(), mVar);
                } catch (g.a e4) {
                    mVar.write("#invalid reference type: ");
                    mVar.bX(e4.ib());
                    z2 = true;
                    str3 = "invalid_reference";
                }
            }
        }
        if (this.pK instanceof x) {
            boolean z3 = true;
            switch (AnonymousClass1.pM[this.pK.iQ().ordinal()]) {
                case CAN_THROW:
                    if (this.pJ.ad(this.qq + ((x) this.pK).jh()) == -1) {
                        z3 = false;
                        break;
                    }
                    break;
                case ODEX_ONLY:
                    if (this.pJ.ae(this.qq + ((x) this.pK).jh()) == -1) {
                        z3 = false;
                        break;
                    }
                    break;
                case 3:
                    try {
                        this.pJ.b(this.qq + ((x) this.pK).jh(), org.jf.dexlib2.e.ARRAY_PAYLOAD);
                        break;
                    } catch (k.a unused) {
                        z3 = false;
                        break;
                    }
                default:
                    throw new i("Invalid 31t opcode: %s", this.pK.iQ());
            }
            if (!z3) {
                mVar.write("#invalid payload reference\n");
                z2 = true;
            }
        }
        if (iQ.odexOnly()) {
            if (this.pJ.qd.ps.qP) {
                z = true;
            } else {
                z = this.pJ.qd.ps.qI < 14 && (iQ.isVolatileFieldAccessor() || iQ == org.jf.dexlib2.e.THROW_VERIFICATION_ERROR);
            }
            if (!z) {
                mVar.write("#disallowed odex opcode\n");
                z2 = true;
            }
        }
        if (z2) {
            mVar.write("#");
        }
        switch (AnonymousClass1.pN[this.pK.iQ().format.ordinal()]) {
            case CAN_THROW:
                c(mVar);
                mVar.write(32);
                d(mVar);
                break;
            case ODEX_ONLY:
                if (this.pK instanceof ak) {
                    mVar.write("#unknown opcode: 0x");
                    mVar.l(((ak) this.pK).lu());
                    mVar.write(10);
                }
                c(mVar);
                break;
            case 3:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                i(mVar);
                break;
            case CAN_CONTINUE:
                c(mVar);
                mVar.write(32);
                e(mVar);
                break;
            case 5:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                f(mVar);
                break;
            case 6:
                c(mVar);
                mVar.write(32);
                mVar.write(str);
                mVar.write(", ");
                mVar.write(str2);
                break;
            case 7:
            case SETS_RESULT:
                c(mVar);
                mVar.write(32);
                d(mVar);
                break;
            case 9:
            case 10:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                mVar.write(str2);
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                i(mVar);
                if (!this.pK.iQ().setsWideRegister()) {
                    if (!c(mVar, ((org.jf.dexlib2.e.b.i) this.pK).jL())) {
                        b(mVar, ((org.jf.dexlib2.e.b.i) this.pK).jL());
                        break;
                    }
                } else {
                    a(mVar, ((v) this.pK).jM());
                    break;
                }
                break;
            case SETS_REGISTER:
            case 17:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                d(mVar);
                break;
            case 18:
            case 19:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                f(mVar);
                mVar.write(", ");
                i(mVar);
                break;
            case 20:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                f(mVar);
                mVar.write(", ");
                mVar.write(str2);
                break;
            case 21:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                f(mVar);
                mVar.write(", ");
                mVar.write("field@0x");
                mVar.l(((org.jf.dexlib2.e.b.b) this.pK).jR());
                break;
            case 22:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                f(mVar);
                mVar.write(", ");
                d(mVar);
                break;
            case 23:
            case 24:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                f(mVar);
                break;
            case 25:
                c(mVar);
                mVar.write(32);
                e(mVar);
                mVar.write(", ");
                f(mVar);
                mVar.write(", ");
                a(mVar, ((q) this.pK).jS());
                break;
            case 26:
                c(mVar);
                mVar.write(32);
                g(mVar);
                mVar.write(", ");
                mVar.write(str2);
                break;
            case 27:
                c(mVar);
                mVar.write(32);
                g(mVar);
                mVar.write(", ");
                j(mVar);
                break;
            case 28:
                c(mVar);
                mVar.write(32);
                g(mVar);
                mVar.write(", ");
                k(mVar);
                break;
            case 29:
                c(mVar);
                mVar.write(32);
                h(mVar);
                mVar.write(", ");
                mVar.write(str2);
                break;
            case 30:
                c(mVar);
                mVar.write(32);
                h(mVar);
                mVar.write(", ");
                j(mVar);
                break;
            case 31:
                c(mVar);
                mVar.write(32);
                h(mVar);
                mVar.write(", ");
                k(mVar);
                break;
            case SETS_WIDE_REGISTER:
                c(mVar);
                mVar.write(32);
                g(mVar);
                mVar.write(", ");
                mVar.write(str2);
                mVar.write(", ");
                mVar.write(str3);
                break;
            case 33:
                c(mVar);
                mVar.write(32);
                h(mVar);
                mVar.write(", ");
                mVar.write(str2);
                mVar.write(", ");
                mVar.write(str3);
                break;
            default:
                if (pL) {
                    return false;
                }
                throw new AssertionError();
        }
        if (z2) {
            mVar.write("\nnop");
            return true;
        }
        return true;
    }

    /* compiled from: InstructionMethodItem.java */
    /* renamed from: org.jf.baksmali.a.c.b$1  reason: invalid class name */
    /* loaded from: repireall.jar:org/jf/baksmali/a/c/b$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pM;
        static final /* synthetic */ int[] pN = new int[org.jf.dexlib2.d.values().length];

        static {
            try {
                pN[org.jf.dexlib2.d.Format10t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pN[org.jf.dexlib2.d.Format10x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pN[org.jf.dexlib2.d.Format11n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pN[org.jf.dexlib2.d.Format11x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pN[org.jf.dexlib2.d.Format12x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pN[org.jf.dexlib2.d.Format20bc.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pN[org.jf.dexlib2.d.Format20t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pN[org.jf.dexlib2.d.Format30t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                pN[org.jf.dexlib2.d.Format21c.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                pN[org.jf.dexlib2.d.Format31c.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                pN[org.jf.dexlib2.d.Format21ih.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                pN[org.jf.dexlib2.d.Format21lh.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                pN[org.jf.dexlib2.d.Format21s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                pN[org.jf.dexlib2.d.Format31i.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                pN[org.jf.dexlib2.d.Format51l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                pN[org.jf.dexlib2.d.Format21t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                pN[org.jf.dexlib2.d.Format31t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                pN[org.jf.dexlib2.d.Format22b.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                pN[org.jf.dexlib2.d.Format22s.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                pN[org.jf.dexlib2.d.Format22c.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                pN[org.jf.dexlib2.d.Format22cs.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                pN[org.jf.dexlib2.d.Format22t.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                pN[org.jf.dexlib2.d.Format22x.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                pN[org.jf.dexlib2.d.Format32x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                pN[org.jf.dexlib2.d.Format23x.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                pN[org.jf.dexlib2.d.Format35c.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                pN[org.jf.dexlib2.d.Format35mi.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                pN[org.jf.dexlib2.d.Format35ms.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                pN[org.jf.dexlib2.d.Format3rc.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                pN[org.jf.dexlib2.d.Format3rmi.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                pN[org.jf.dexlib2.d.Format3rms.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                pN[org.jf.dexlib2.d.Format45cc.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                pN[org.jf.dexlib2.d.Format4rcc.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            pM = new int[org.jf.dexlib2.e.values().length];
            try {
                pM[org.jf.dexlib2.e.PACKED_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                pM[org.jf.dexlib2.e.SPARSE_SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                pM[org.jf.dexlib2.e.FILL_ARRAY_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    private void c(m mVar) throws IOException {
        mVar.write(this.pK.iQ().name);
    }

    protected void d(m mVar) throws IOException {
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(m mVar, int i) throws IOException {
        this.pJ.pB.e(mVar, i);
    }

    private void e(m mVar) throws IOException {
        a(mVar, ((org.jf.dexlib2.e.b.k) this.pK).jK());
    }

    private void f(m mVar) throws IOException {
        a(mVar, ((r) this.pK).jN());
    }

    private void g(m mVar) throws IOException {
        org.jf.dexlib2.e.b.c cVar = (org.jf.dexlib2.e.b.c) this.pK;
        int im = cVar.im();
        mVar.write(123);
        switch (im) {
            case CAN_THROW:
                a(mVar, cVar.jS());
                break;
            case ODEX_ONLY:
                a(mVar, cVar.jS());
                mVar.write(", ");
                a(mVar, cVar.jT());
                break;
            case 3:
                a(mVar, cVar.jS());
                mVar.write(", ");
                a(mVar, cVar.jT());
                mVar.write(", ");
                a(mVar, cVar.jU());
                break;
            case CAN_CONTINUE:
                a(mVar, cVar.jS());
                mVar.write(", ");
                a(mVar, cVar.jT());
                mVar.write(", ");
                a(mVar, cVar.jU());
                mVar.write(", ");
                a(mVar, cVar.jV());
                break;
            case 5:
                a(mVar, cVar.jS());
                mVar.write(", ");
                a(mVar, cVar.jT());
                mVar.write(", ");
                a(mVar, cVar.jU());
                mVar.write(", ");
                a(mVar, cVar.jV());
                mVar.write(", ");
                a(mVar, cVar.jW());
                break;
        }
        mVar.write(125);
    }

    private void h(m mVar) throws IOException {
        n nVar = (n) this.pK;
        int im = nVar.im();
        if (im == 0) {
            mVar.write("{}");
            return;
        }
        int jZ = nVar.jZ();
        this.pJ.pB.a(mVar, jZ, (jZ + im) - 1);
    }

    private void i(m mVar) throws IOException {
        org.jf.baksmali.b.g.c(mVar, ((v) this.pK).jM());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(m mVar, int i) throws IOException {
        if (org.jf.a.n.bY(i)) {
            mVar.write("    # ");
            float intBitsToFloat = Float.intBitsToFloat(i);
            if (intBitsToFloat == Float.POSITIVE_INFINITY) {
                mVar.write("Float.POSITIVE_INFINITY");
            } else if (intBitsToFloat == Float.NEGATIVE_INFINITY) {
                mVar.write("Float.NEGATIVE_INFINITY");
            } else if (Float.isNaN(intBitsToFloat)) {
                mVar.write("Float.NaN");
            } else if (intBitsToFloat == Float.MAX_VALUE) {
                mVar.write("Float.MAX_VALUE");
            } else if (intBitsToFloat == 3.1415927f) {
                mVar.write("(float)Math.PI");
            } else if (intBitsToFloat == 2.7182817f) {
                mVar.write("(float)Math.E");
            } else {
                mVar.write(Float.toString(intBitsToFloat));
                mVar.write(102);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(m mVar, long j) throws IOException {
        if (org.jf.a.n.n(j)) {
            mVar.write("    # ");
            double longBitsToDouble = Double.longBitsToDouble(j);
            if (longBitsToDouble == Double.POSITIVE_INFINITY) {
                mVar.write("Double.POSITIVE_INFINITY");
            } else if (longBitsToDouble == Double.NEGATIVE_INFINITY) {
                mVar.write("Double.NEGATIVE_INFINITY");
            } else if (Double.isNaN(longBitsToDouble)) {
                mVar.write("Double.NaN");
            } else if (longBitsToDouble == Double.MAX_VALUE) {
                mVar.write("Double.MAX_VALUE");
            } else if (longBitsToDouble == 3.141592653589793d) {
                mVar.write("Math.PI");
            } else if (longBitsToDouble == 2.718281828459045d) {
                mVar.write("Math.E");
            } else {
                mVar.write(Double.toString(longBitsToDouble));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c(m mVar, int i) throws IOException {
        String str = this.pJ.qd.ps.qT.get(Integer.valueOf(i));
        if (str != null) {
            mVar.write("    # ");
            mVar.write(str);
            return true;
        }
        return false;
    }

    private void j(m mVar) throws IOException {
        mVar.write("inline@");
        mVar.bX(((org.jf.dexlib2.e.b.e) this.pK).jX());
    }

    private void k(m mVar) throws IOException {
        mVar.write("vtable@");
        mVar.bX(((u) this.pK).jY());
    }
}