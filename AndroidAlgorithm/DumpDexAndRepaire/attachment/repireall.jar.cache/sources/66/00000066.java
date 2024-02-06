package antlr.preprocessor;

import antlr.au;
import antlr.bb;
import antlr.bh;
import antlr.bs;
import antlr.bz;
import antlr.t;
import antlr.x;
import antlr.y;
import java.io.BufferedReader;
import java.util.Hashtable;

/* compiled from: PreprocessorLexer.java */
/* loaded from: repireall.jar:antlr/preprocessor/f.class */
public final class f extends x {
    private static antlr.a.a.b e = new antlr.a.a.b(bs());
    private static antlr.a.a.b f = new antlr.a.a.b(new long[]{4294977024L, 0, 0, 0, 0});
    private static antlr.a.a.b g = new antlr.a.a.b(bt());
    private static antlr.a.a.b h = new antlr.a.a.b(bu());
    private static antlr.a.a.b i = new antlr.a.a.b(new long[]{4294977024L, 1152921504606846976L, 0, 0, 0});
    private static antlr.a.a.b n = new antlr.a.a.b(bv());
    private static antlr.a.a.b o = new antlr.a.a.b(bw());
    private static antlr.a.a.b p = new antlr.a.a.b(bx());
    private static antlr.a.a.b q = new antlr.a.a.b(by());
    private static antlr.a.a.b r = new antlr.a.a.b(new long[]{140758963201536L, 576460752303423488L, 0, 0, 0});
    private static antlr.a.a.b s = new antlr.a.a.b(new long[]{140741783332352L, 576460752303423488L, 0, 0, 0});

    public f(BufferedReader bufferedReader) {
        this(new t(bufferedReader));
    }

    private f(t tVar) {
        this(new au(tVar));
    }

    private f(au auVar) {
        super(auVar);
        this.ax = true;
        n(true);
        this.ay = new Hashtable();
        this.ay.put(new antlr.c("public", this), 18);
        this.ay.put(new antlr.c("class", this), 8);
        this.ay.put(new antlr.c("throws", this), 23);
        this.ay.put(new antlr.c("catch", this), 26);
        this.ay.put(new antlr.c("private", this), 17);
        this.ay.put(new antlr.c("extends", this), 10);
        this.ay.put(new antlr.c("protected", this), 16);
        this.ay.put(new antlr.c("returns", this), 21);
        this.ay.put(new antlr.c("tokens", this), 4);
        this.ay.put(new antlr.c("exception", this), 25);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x093d, code lost:
        throw new antlr.bb(g(1), al(), am(), ak());
     */
    @Override // antlr.by
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final antlr.bs o() throws antlr.bz {
        /*
            Method dump skipped, instructions count: 3613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.preprocessor.f.o():antlr.bs");
    }

    private void b(boolean z) throws bh, y, bz {
        this.at.O();
        int i2 = 0;
        while (true) {
            if (g(1) == ' ') {
                c(' ');
            } else if (g(1) == '\t') {
                c('\t');
            } else if (g(1) != '\n' && g(1) != '\r') {
                break;
            } else {
                u(false);
            }
            i2++;
        }
        if (i2 <= 0) {
            throw new bb(g(1), al(), am(), ak());
        }
        this.aA = null;
    }

    private void q(boolean z) throws bh, y, bz {
        this.at.O();
        while (h.D(g(1)) && g(2) >= 3 && g(2) <= 255) {
            s(false);
        }
        this.aA = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void r(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        c('(');
        if (f.D(g(1)) && e.D(g(2))) {
            b(false);
        } else if (!e.D(g(1))) {
            throw new bb(g(1), al(), am(), ak());
        }
        q(false);
        while (i.D(g(1)) && e.D(g(2))) {
            switch (g(1)) {
                case '\t':
                case '\n':
                case '\r':
                case SETS_WIDE_REGISTER:
                    b(false);
                    break;
                case '|':
                    break;
                default:
                    throw new bb(g(1), al(), am(), ak());
            }
            c('|');
            if (f.D(g(1)) && e.D(g(2))) {
                b(false);
            } else if (!e.D(g(1))) {
                throw new bb(g(1), al(), am(), ak());
            }
            q(false);
        }
        switch (g(1)) {
            case '\t':
            case '\n':
            case '\r':
            case SETS_WIDE_REGISTER:
                b(false);
                break;
            case ')':
                break;
            default:
                throw new bb(g(1), al(), am(), ak());
        }
        c(')');
        if (g(1) == '=' && g(2) == '>') {
            j("=>");
        } else if (g(1) == '*') {
            c('*');
        } else if (g(1) == '+') {
            c('+');
        } else if (g(1) == '?') {
            c('?');
        }
        if (z) {
            bs h2 = h(6);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
    }

    private void s(boolean z) throws bh, y, bz {
        this.at.O();
        switch (g(1)) {
            case '\n':
            case '\r':
                u(false);
                break;
            case '\"':
                h(false);
                break;
            case '\'':
                f(false);
                break;
            case '(':
                r(false);
                break;
            case '/':
                c(false);
                break;
            case '{':
                t(false);
                break;
            default:
                if (n.D(g(1))) {
                    b(n);
                    break;
                } else {
                    throw new bb(g(1), al(), am(), ak());
                }
        }
        this.aA = null;
    }

    private void c(boolean z) throws bh, y, bz {
        this.at.O();
        if (g(1) == '/' && g(2) == '/') {
            d(false);
        } else if (g(1) == '/' && g(2) == '*') {
            e(false);
        } else {
            throw new bb(g(1), al(), am(), ak());
        }
        this.aA = null;
    }

    private void t(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        c('{');
        while (g(1) != '}') {
            if ((g(1) == '\n' || g(1) == '\r') && g(2) >= 3 && g(2) <= 255) {
                u(false);
            } else if (g(1) == '{' && g(2) >= 3 && g(2) <= 255) {
                t(false);
            } else if (g(1) == '\'' && o.D(g(2))) {
                f(false);
            } else if (g(1) == '/' && (g(2) == '*' || g(2) == '/')) {
                c(false);
            } else if (g(1) == '\"' && g(2) >= 3 && g(2) <= 255) {
                h(false);
            } else if (g(1) < 3 || g(1) > 255 || g(2) < 3 || g(2) > 255) {
                break;
            } else {
                d((char) 65535);
            }
        }
        c('}');
        if (z) {
            bs h2 = h(7);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
    }

    private void h(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        c('\"');
        while (true) {
            if (g(1) == '\\') {
                g(false);
            } else if (!p.D(g(1))) {
                break;
            } else {
                d('\"');
            }
        }
        c('\"');
        if (z) {
            bs h2 = h(39);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
    }

    private void f(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        c('\'');
        if (g(1) == '\\') {
            g(false);
        } else if (q.D(g(1))) {
            d('\'');
        } else {
            throw new bb(g(1), al(), am(), ak());
        }
        c('\'');
        if (z) {
            bs h2 = h(38);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
    }

    private void u(boolean z) throws bh, y, bz {
        this.at.O();
        if (g(1) == '\r' && g(2) == '\n') {
            c('\r');
            c('\n');
            ap();
        } else if (g(1) == '\r') {
            c('\r');
            ap();
        } else if (g(1) == '\n') {
            c('\n');
            ap();
        } else {
            throw new bb(g(1), al(), am(), ak());
        }
        this.aA = null;
    }

    private void d(boolean z) throws bh, y, bz {
        this.at.O();
        j("//");
        while (g(1) != '\n' && g(1) != '\r' && g(1) >= 3 && g(1) <= 255 && g(2) >= 3 && g(2) <= 255) {
            d((char) 65535);
        }
        u(false);
        this.aA = null;
    }

    private void e(boolean z) throws bh, y, bz {
        this.at.O();
        j("/*");
        while (true) {
            if (g(1) != '*' || g(2) != '/') {
                if ((g(1) == '\n' || g(1) == '\r') && g(2) >= 3 && g(2) <= 255) {
                    u(false);
                } else if (g(1) < 3 || g(1) > 255 || g(2) < 3 || g(2) > 255) {
                    break;
                } else {
                    d((char) 65535);
                }
            } else {
                break;
            }
        }
        j("*/");
        this.aA = null;
    }

    private void g(boolean z) throws bh, y, bz {
        this.at.O();
        c('\\');
        switch (g(1)) {
            case '\"':
                c('\"');
                break;
            case '\'':
                c('\'');
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                a('0', '3');
                if (g(1) >= '0' && g(1) <= '9' && g(2) >= 3 && g(2) <= 255) {
                    m(false);
                    if (g(1) >= '0' && g(1) <= '9' && g(2) >= 3 && g(2) <= 255) {
                        m(false);
                        break;
                    } else if (g(1) < 3 || g(1) > 255) {
                        throw new bb(g(1), al(), am(), ak());
                    }
                } else if (g(1) < 3 || g(1) > 255) {
                    throw new bb(g(1), al(), am(), ak());
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                a('4', '7');
                if (g(1) >= '0' && g(1) <= '9' && g(2) >= 3 && g(2) <= 255) {
                    m(false);
                    break;
                } else if (g(1) < 3 || g(1) > 255) {
                    throw new bb(g(1), al(), am(), ak());
                }
                break;
            case '\\':
                c('\\');
                break;
            case 'a':
                c('a');
                break;
            case 'b':
                c('b');
                break;
            case 'f':
                c('f');
                break;
            case 'n':
                c('n');
                break;
            case 'r':
                c('r');
                break;
            case 't':
                c('t');
                break;
            case 'u':
                c('u');
                i(false);
                i(false);
                i(false);
                i(false);
                break;
            case 'w':
                c('w');
                break;
            default:
                throw new bb(g(1), al(), am(), ak());
        }
        this.aA = null;
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

    private void v(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        c('[');
        while (g(1) != ']') {
            if (g(1) == '[' && g(2) >= 3 && g(2) <= 255) {
                v(false);
            } else if ((g(1) == '\n' || g(1) == '\r') && g(2) >= 3 && g(2) <= 255) {
                u(false);
            } else if (g(1) == '\'' && o.D(g(2))) {
                f(false);
            } else if (g(1) == '\"' && g(2) >= 3 && g(2) <= 255) {
                h(false);
            } else if (g(1) < 3 || g(1) > 255 || g(2) < 3 || g(2) > 255) {
                break;
            } else {
                d((char) 65535);
            }
        }
        c(']');
        if (z) {
            bs h2 = h(20);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
    }

    private static final long[] bs() {
        long[] jArr = new long[8];
        jArr[0] = -576460752303423496L;
        for (int i2 = 1; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] bt() {
        long[] jArr = new long[8];
        jArr[0] = -2199023255560L;
        for (int i2 = 1; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] bu() {
        long[] jArr = new long[8];
        jArr[0] = -576462951326679048L;
        for (int i2 = 1; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] bv() {
        long[] jArr = new long[8];
        jArr[0] = -576605355262354440L;
        jArr[1] = -576460752303423489L;
        for (int i2 = 2; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] bw() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        for (int i2 = 1; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] bx() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i2 = 2; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] by() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        jArr[1] = -268435457;
        for (int i2 = 2; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }
}