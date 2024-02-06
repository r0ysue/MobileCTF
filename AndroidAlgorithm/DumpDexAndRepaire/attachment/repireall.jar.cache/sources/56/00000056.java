package antlr;

import java.io.BufferedReader;
import java.util.Hashtable;

/* compiled from: ANTLRTokdefLexer.java */
/* loaded from: repireall.jar:antlr/g.class */
public final class g extends x {
    private static antlr.a.a.b e = new antlr.a.a.b(P());
    private static antlr.a.a.b f = new antlr.a.a.b(Q());
    private static antlr.a.a.b g = new antlr.a.a.b(R());
    private static antlr.a.a.b h = new antlr.a.a.b(S());

    public g(BufferedReader bufferedReader) {
        this(new t(bufferedReader));
    }

    private g(t tVar) {
        this(new au(tVar));
    }

    private g(au auVar) {
        super(auVar);
        this.ax = true;
        n(true);
        this.ay = new Hashtable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x04e9, code lost:
        throw new antlr.bb(g(1), al(), am(), ak());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x057b, code lost:
        throw new antlr.bb(g(1), al(), am(), ak());
     */
    @Override // antlr.by
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final antlr.bs o() throws antlr.bz {
        /*
            Method dump skipped, instructions count: 2829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.g.o():antlr.bs");
    }

    private void m(boolean z) throws bh, y, bz {
        this.at.O();
        a('0', '9');
        this.aA = null;
    }

    private void i(boolean z) throws bh, y, bz {
        this.at.O();
        switch (g(1)) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                a('0', '9');
                break;
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case QUICK_FIELD_ACCESSOR:
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            default:
                throw new bb(g(1), al(), am(), ak());
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                a('A', 'F');
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                a('a', 'f');
                break;
        }
        this.aA = null;
    }

    private static final long[] P() {
        long[] jArr = new long[8];
        jArr[0] = -9224;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] Q() {
        long[] jArr = new long[8];
        jArr[0] = -140737488355336L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] R() {
        long[] jArr = new long[8];
        jArr[0] = -4398046512136L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] S() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }
}