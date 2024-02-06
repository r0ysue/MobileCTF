package org.antlr.stringtemplate.a;

import antlr.au;
import antlr.bb;
import antlr.bh;
import antlr.bs;
import antlr.bz;
import antlr.t;
import antlr.x;
import antlr.y;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/* compiled from: ActionLexer.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/c.class */
public final class c extends x {
    private static antlr.a.a.b e = new antlr.a.a.b(gX());
    private static antlr.a.a.b f;
    private static antlr.a.a.b g;
    private static antlr.a.a.b h;
    private static antlr.a.a.b i;
    private static antlr.a.a.b n;
    private static antlr.a.a.b o;

    public c(StringReader stringReader) {
        this(new t(stringReader));
    }

    private c(t tVar) {
        this(new au(tVar));
    }

    private c(au auVar) {
        super(auVar);
        this.ax = true;
        n(true);
        this.ay = new Hashtable();
        this.ay.put(new antlr.c("super", this), 32);
        this.ay.put(new antlr.c("if", this), 8);
        this.ay.put(new antlr.c("first", this), 26);
        this.ay.put(new antlr.c("last", this), 28);
        this.ay.put(new antlr.c("rest", this), 27);
        this.ay.put(new antlr.c("trunc", this), 31);
        this.ay.put(new antlr.c("strip", this), 30);
        this.ay.put(new antlr.c("length", this), 29);
        this.ay.put(new antlr.c("elseif", this), 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x03fb, code lost:
        throw new antlr.bb(g(1), al(), am(), ak());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x045d, code lost:
        throw new antlr.bb(g(1), al(), am(), ak());
     */
    @Override // antlr.by
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final antlr.bs o() throws antlr.bz {
        /*
            Method dump skipped, instructions count: 2651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.antlr.stringtemplate.a.c.o():antlr.bs");
    }

    private void E(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        switch (g(1)) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
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
                a('A', 'Z');
                break;
            case '[':
            case '\\':
            case ']':
            case '^':
            case '`':
            default:
                throw new bb(g(1), al(), am(), ak());
            case '_':
                c('_');
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                a('a', 'z');
                break;
        }
        while (true) {
            switch (g(1)) {
                case '/':
                    c('/');
                    break;
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
                case '[':
                case '\\':
                case ']':
                case '^':
                case '`':
                default:
                    int j = j(20);
                    if (j != -1) {
                        bs h2 = h(j);
                        bsVar = h2;
                        h2.i(new String(this.at.N(), O, this.at.O() - O));
                    }
                    this.aA = bsVar;
                    return;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
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
                    a('A', 'Z');
                    break;
                case '_':
                    c('_');
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    a('a', 'z');
                    break;
            }
        }
    }

    private void b(boolean z, boolean z2) throws bh, y, bz {
        int O = this.at.O();
        c('\\');
        if (g(1) == 'n' && g(2) >= 3 && g(2) <= 65534) {
            c('n');
            if (this.aC.bZ == 0 && z2) {
                this.at.a(O);
                this.at.d("\n");
            }
        } else if (g(1) == 'r' && g(2) >= 3 && g(2) <= 65534) {
            c('r');
            if (this.aC.bZ == 0 && z2) {
                this.at.a(O);
                this.at.d("\r");
            }
        } else if (g(1) == 't' && g(2) >= 3 && g(2) <= 65534) {
            c('t');
            if (this.aC.bZ == 0 && z2) {
                this.at.a(O);
                this.at.d("\t");
            }
        } else if (g(1) == 'b' && g(2) >= 3 && g(2) <= 65534) {
            c('b');
            if (this.aC.bZ == 0 && z2) {
                this.at.a(O);
                this.at.d("\b");
            }
        } else if (g(1) == 'f' && g(2) >= 3 && g(2) <= 65534) {
            c('f');
            if (this.aC.bZ == 0 && z2) {
                this.at.a(O);
                this.at.d("\f");
            }
        } else if (g(1) >= 3 && g(1) <= 65534 && g(2) >= 3 && g(2) <= 65534) {
            char g2 = g(1);
            d((char) 65535);
            if (this.aC.bZ == 0 && z2) {
                this.at.a(O);
                this.at.d(String.valueOf(g2));
            }
        } else {
            throw new bb(g(1), al(), am(), ak());
        }
        this.aA = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private List F(boolean z) throws bh, y, bz {
        ArrayList arrayList = new ArrayList();
        this.at.O();
        switch (g(1)) {
            case 11:
            case '\f':
            case 14:
            case 15:
            case SETS_REGISTER:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
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
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case QUICK_FIELD_ACCESSOR:
            case '[':
            case '\\':
            case ']':
            case '^':
            case '`':
            default:
                throw new bb(g(1), al(), am(), ak());
            case '\t':
            case '\n':
            case '\r':
            case SETS_WIDE_REGISTER:
                int O = this.at.O();
                G(false);
                this.at.a(O);
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
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
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                break;
        }
        int O2 = this.at.O();
        E(true);
        this.at.a(O2);
        bs bsVar = this.aA;
        if (this.aC.bZ == 0) {
            arrayList.add(bsVar.V());
        }
        while (n.D(g(1)) && o.D(g(2))) {
            switch (g(1)) {
                case '\t':
                case '\n':
                case '\r':
                case SETS_WIDE_REGISTER:
                    int O3 = this.at.O();
                    G(false);
                    this.at.a(O3);
                    break;
                case ',':
                    break;
                default:
                    throw new bb(g(1), al(), am(), ak());
            }
            int O4 = this.at.O();
            c(',');
            this.at.a(O4);
            switch (g(1)) {
                case 11:
                case '\f':
                case 14:
                case 15:
                case SETS_REGISTER:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
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
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case QUICK_FIELD_ACCESSOR:
                case '[':
                case '\\':
                case ']':
                case '^':
                case '`':
                default:
                    throw new bb(g(1), al(), am(), ak());
                case '\t':
                case '\n':
                case '\r':
                case SETS_WIDE_REGISTER:
                    int O5 = this.at.O();
                    G(false);
                    this.at.a(O5);
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
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
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    break;
            }
            int O6 = this.at.O();
            E(true);
            this.at.a(O6);
            bs bsVar2 = this.aA;
            if (this.aC.bZ == 0) {
                arrayList.add(bsVar2.V());
            }
        }
        switch (g(1)) {
            case '\t':
            case '\n':
            case '\r':
            case SETS_WIDE_REGISTER:
                int O7 = this.at.O();
                G(false);
                this.at.a(O7);
                break;
            case '|':
                break;
            default:
                throw new bb(g(1), al(), am(), ak());
        }
        int O8 = this.at.O();
        c('|');
        this.at.a(O8);
        this.aA = null;
        return arrayList;
    }

    private void G(boolean z) throws bh, y, bz {
        this.at.O();
        switch (g(1)) {
            case '\t':
                c('\t');
                break;
            case '\n':
                c('\n');
                if (this.aC.bZ == 0) {
                    ap();
                    break;
                }
                break;
            case '\r':
                c('\r');
                break;
            case SETS_WIDE_REGISTER:
                c(' ');
                break;
            default:
                throw new bb(g(1), al(), am(), ak());
        }
        this.aA = null;
    }

    private void H(boolean z) throws bh, y, bz {
        this.at.O();
        c('{');
        while (true) {
            if (g(1) == '\\' && g(2) == '{') {
                int O = this.at.O();
                c('\\');
                this.at.a(O);
                c('{');
            } else if (g(1) == '\\' && g(2) == '}') {
                int O2 = this.at.O();
                c('\\');
                this.at.a(O2);
                c('}');
            } else if (g(1) == '\\' && g(2) >= 3 && g(2) <= 65534) {
                b(false, false);
            } else if (g(1) == '{') {
                H(false);
            } else if (i.D(g(1))) {
                d('}');
            } else {
                c('}');
                this.aA = null;
                return;
            }
        }
    }

    private static final long[] gX() {
        long[] jArr = new long[2048];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i2 = 2; i2 <= 1022; i2++) {
            jArr[i2] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    static {
        long[] jArr = new long[1025];
        jArr[0] = 4294977024L;
        jArr[1] = 576460745995190270L;
        f = new antlr.a.a.b(jArr);
        long[] jArr2 = new long[1025];
        jArr2[0] = 288107235144377856L;
        jArr2[1] = 1729382250602037246L;
        g = new antlr.a.a.b(jArr2);
        long[] jArr3 = new long[1025];
        jArr3[0] = 4294977024L;
        h = new antlr.a.a.b(jArr3);
        i = new antlr.a.a.b(gY());
        long[] jArr4 = new long[1025];
        jArr4[0] = 17596481021440L;
        n = new antlr.a.a.b(jArr4);
        long[] jArr5 = new long[1025];
        jArr5[0] = 17596481021440L;
        jArr5[1] = 576460745995190270L;
        o = new antlr.a.a.b(jArr5);
    }

    private static final long[] gY() {
        long[] jArr = new long[2048];
        jArr[0] = -8;
        jArr[1] = -2882303761785552897L;
        for (int i2 = 2; i2 <= 1022; i2++) {
            jArr[i2] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }
}