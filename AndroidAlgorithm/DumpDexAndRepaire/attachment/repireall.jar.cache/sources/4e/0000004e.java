package antlr;

import java.io.Reader;
import java.util.Hashtable;

/* compiled from: ANTLRLexer.java */
/* loaded from: repireall.jar:antlr/d.class */
public final class d extends x {
    private static antlr.a.a.b e = new antlr.a.a.b(p());
    private static antlr.a.a.b f = new antlr.a.a.b(q());
    private static antlr.a.a.b g = new antlr.a.a.b(r());
    private static antlr.a.a.b h = new antlr.a.a.b(s());
    private static antlr.a.a.b i = new antlr.a.a.b(t());

    public static int c(String str) {
        if (str.length() > 3) {
            if (str.charAt(1) == '\\') {
                switch (str.charAt(2)) {
                    case '\"':
                        return 34;
                    case '\'':
                        return 39;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                        if (str.length() > 5 && Character.isDigit(str.charAt(4))) {
                            return (((str.charAt(2) - '0') << 3) << 3) + ((str.charAt(3) - '0') << 3) + (str.charAt(4) - '0');
                        }
                        if (str.length() > 4 && Character.isDigit(str.charAt(3))) {
                            return ((str.charAt(2) - '0') << 3) + (str.charAt(3) - '0');
                        }
                        return str.charAt(2) - '0';
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        if (str.length() > 4 && Character.isDigit(str.charAt(3))) {
                            return ((str.charAt(2) - '0') << 3) + (str.charAt(3) - '0');
                        }
                        return str.charAt(2) - '0';
                    case '\\':
                        return 92;
                    case 'b':
                        return 8;
                    case 'f':
                        return 12;
                    case 'n':
                        return 10;
                    case 'r':
                        return 13;
                    case 't':
                        return 9;
                    case 'u':
                        if (str.length() == 8) {
                            return (((Character.digit(str.charAt(3), 16) << 4) << 4) << 4) + ((Character.digit(str.charAt(4), 16) << 4) << 4) + (Character.digit(str.charAt(5), 16) << 4) + Character.digit(str.charAt(6), 16);
                        }
                        return 0;
                    default:
                        return 0;
                }
            }
            return 0;
        }
        return str.charAt(1);
    }

    public d(Reader reader) {
        this(new t(reader));
    }

    private d(t tVar) {
        this(new au(tVar));
    }

    private d(au auVar) {
        super(auVar);
        this.ax = true;
        n(true);
        this.ay = new Hashtable();
        this.ay.put(new c("public", this), 31);
        this.ay.put(new c("class", this), 10);
        this.ay.put(new c("header", this), 5);
        this.ay.put(new c("throws", this), 37);
        this.ay.put(new c("lexclass", this), 9);
        this.ay.put(new c("catch", this), 40);
        this.ay.put(new c("private", this), 32);
        this.ay.put(new c("options", this), 51);
        this.ay.put(new c("extends", this), 11);
        this.ay.put(new c("protected", this), 30);
        this.ay.put(new c("TreeParser", this), 13);
        this.ay.put(new c("Parser", this), 29);
        this.ay.put(new c("Lexer", this), 12);
        this.ay.put(new c("returns", this), 35);
        this.ay.put(new c("charVocabulary", this), 18);
        this.ay.put(new c("tokens", this), 4);
        this.ay.put(new c("exception", this), 39);
    }

    @Override // antlr.by
    public final bs o() throws bz {
        while (true) {
            aq();
            try {
                try {
                    switch (g(1)) {
                        case '\t':
                        case '\n':
                        case '\r':
                        case SETS_WIDE_REGISTER:
                            b(true);
                            bs bsVar = this.aA;
                            break;
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
                        case '$':
                        case '%':
                        case '&':
                        case '-':
                        case '.':
                        case '=':
                        case QUICK_FIELD_ACCESSOR:
                        case '\\':
                        case ']':
                        case '_':
                        case '`':
                        default:
                            if (g(1) == '=' && g(2) == '>') {
                                int O = this.at.O();
                                j("=>");
                                bs h2 = h(48);
                                h2.i(new String(this.at.N(), O, this.at.O() - O));
                                this.aA = h2;
                                bs bsVar2 = this.aA;
                                break;
                            } else if (g(1) == '.' && g(2) == '.') {
                                int O2 = this.at.O();
                                j("..");
                                bs h3 = h(22);
                                h3.i(new String(this.at.N(), O2, this.at.O() - O2));
                                this.aA = h3;
                                bs bsVar3 = this.aA;
                                break;
                            } else if (g(1) == '=') {
                                int O3 = this.at.O();
                                c('=');
                                bs h4 = h(15);
                                h4.i(new String(this.at.N(), O3, this.at.O() - O3));
                                this.aA = h4;
                                bs bsVar4 = this.aA;
                                break;
                            } else if (g(1) == '.') {
                                int O4 = this.at.O();
                                c('.');
                                bs h5 = h(50);
                                h5.i(new String(this.at.N(), O4, this.at.O() - O4));
                                this.aA = h5;
                                bs bsVar5 = this.aA;
                                break;
                            } else if (g(1) == 65535) {
                                this.aA = h(1);
                                break;
                            } else {
                                throw new bb(g(1), al(), am(), ak());
                            }
                            break;
                        case '!':
                            int O5 = this.at.O();
                            c('!');
                            bs h6 = h(33);
                            h6.i(new String(this.at.N(), O5, this.at.O() - O5));
                            this.aA = h6;
                            bs bsVar6 = this.aA;
                            break;
                        case '\"':
                            h(true);
                            bs bsVar7 = this.aA;
                            break;
                        case '#':
                            int O6 = this.at.O();
                            j("#(");
                            bs h7 = h(44);
                            h7.i(new String(this.at.N(), O6, this.at.O() - O6));
                            this.aA = h7;
                            bs bsVar8 = this.aA;
                            break;
                        case '\'':
                            f(true);
                            bs bsVar9 = this.aA;
                            break;
                        case '(':
                            int O7 = this.at.O();
                            c('(');
                            bs h8 = h(27);
                            h8.i(new String(this.at.N(), O7, this.at.O() - O7));
                            this.aA = h8;
                            bs bsVar10 = this.aA;
                            break;
                        case ')':
                            int O8 = this.at.O();
                            c(')');
                            bs h9 = h(28);
                            h9.i(new String(this.at.N(), O8, this.at.O() - O8));
                            this.aA = h9;
                            bs bsVar11 = this.aA;
                            break;
                        case '*':
                            int O9 = this.at.O();
                            c('*');
                            bs h10 = h(46);
                            h10.i(new String(this.at.N(), O9, this.at.O() - O9));
                            this.aA = h10;
                            bs bsVar12 = this.aA;
                            break;
                        case '+':
                            int O10 = this.at.O();
                            c('+');
                            bs h11 = h(47);
                            h11.i(new String(this.at.N(), O10, this.at.O() - O10));
                            this.aA = h11;
                            bs bsVar13 = this.aA;
                            break;
                        case ',':
                            int O11 = this.at.O();
                            c(',');
                            bs h12 = h(38);
                            h12.i(new String(this.at.N(), O11, this.at.O() - O11));
                            this.aA = h12;
                            bs bsVar14 = this.aA;
                            break;
                        case '/':
                            c(true);
                            bs bsVar15 = this.aA;
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
                            int O12 = this.at.O();
                            int i2 = 0;
                            while (g(1) >= '0' && g(1) <= '9') {
                                a('0', '9');
                                i2++;
                            }
                            if (i2 <= 0) {
                                throw new bb(g(1), al(), am(), ak());
                            }
                            bs h13 = h(20);
                            h13.i(new String(this.at.N(), O12, this.at.O() - O12));
                            this.aA = h13;
                            bs bsVar16 = this.aA;
                            break;
                        case ':':
                            int O13 = this.at.O();
                            c(':');
                            bs h14 = h(36);
                            h14.i(new String(this.at.N(), O13, this.at.O() - O13));
                            this.aA = h14;
                            bs bsVar17 = this.aA;
                            break;
                        case ';':
                            int O14 = this.at.O();
                            c(';');
                            bs h15 = h(16);
                            h15.i(new String(this.at.N(), O14, this.at.O() - O14));
                            this.aA = h15;
                            bs bsVar18 = this.aA;
                            break;
                        case '<':
                            int O15 = this.at.O();
                            c('<');
                            bs h16 = h(25);
                            h16.i(new String(this.at.N(), O15, this.at.O() - O15));
                            this.aA = h16;
                            bs bsVar19 = this.aA;
                            break;
                        case '>':
                            int O16 = this.at.O();
                            c('>');
                            bs h17 = h(26);
                            h17.i(new String(this.at.N(), O16, this.at.O() - O16));
                            this.aA = h17;
                            bs bsVar20 = this.aA;
                            break;
                        case '?':
                            int O17 = this.at.O();
                            c('?');
                            bs h18 = h(45);
                            h18.i(new String(this.at.N(), O17, this.at.O() - O17));
                            this.aA = h18;
                            bs bsVar21 = this.aA;
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
                            bs bsVar22 = null;
                            int O18 = this.at.O();
                            a('A', 'Z');
                            while (true) {
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
                                        int j = j(24);
                                        if (j != -1) {
                                            bs h19 = h(j);
                                            bsVar22 = h19;
                                            h19.i(new String(this.at.N(), O18, this.at.O() - O18));
                                        }
                                        this.aA = bsVar22;
                                        bs bsVar23 = this.aA;
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
                                        a('A', 'Z');
                                    case '_':
                                        c('_');
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
                                }
                            }
                        case '[':
                            int O19 = this.at.O();
                            j(false);
                            m(bq.a(an(), "[", "]"));
                            bs h20 = h(34);
                            h20.i(new String(this.at.N(), O19, this.at.O() - O19));
                            this.aA = h20;
                            bs bsVar24 = this.aA;
                            break;
                        case '^':
                            int O20 = this.at.O();
                            c('^');
                            bs h21 = h(49);
                            h21.i(new String(this.at.N(), O20, this.at.O() - O20));
                            this.aA = h21;
                            bs bsVar25 = this.aA;
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
                            bs bsVar26 = null;
                            int O21 = this.at.O();
                            this.at.O();
                            a('a', 'z');
                            while (true) {
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
                                        int j2 = j(41);
                                        this.aA = null;
                                        int i3 = j2;
                                        if (j2 == 51) {
                                            l(false);
                                            if (g(1) == '{') {
                                                c('{');
                                                i3 = 14;
                                            }
                                        } else if (j2 == 4) {
                                            l(false);
                                            if (g(1) == '{') {
                                                c('{');
                                                i3 = 23;
                                            }
                                        }
                                        if (i3 != -1) {
                                            bs h22 = h(i3);
                                            bsVar26 = h22;
                                            h22.i(new String(this.at.N(), O21, this.at.O() - O21));
                                        }
                                        this.aA = bsVar26;
                                        bs bsVar27 = this.aA;
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
                                        a('A', 'Z');
                                    case '_':
                                        c('_');
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
                                }
                            }
                        case '{':
                            int O22 = this.at.O();
                            int i4 = 7;
                            int am = am();
                            int ak = ak();
                            k(false);
                            if (g(1) == '?') {
                                c('?');
                                i4 = 43;
                            }
                            if (i4 == 7) {
                                m(bq.a(an(), "{", "}"));
                            } else {
                                m(bq.a(an(), "{", "}?"));
                            }
                            ac acVar = new ac(i4, new String(this.at.N(), O22, this.at.O() - O22));
                            acVar.k(am);
                            acVar.l(ak);
                            this.aA = acVar;
                            bs bsVar28 = this.aA;
                            break;
                        case '|':
                            int O23 = this.at.O();
                            c('|');
                            bs h23 = h(21);
                            h23.i(new String(this.at.N(), O23, this.at.O() - O23));
                            this.aA = h23;
                            bs bsVar29 = this.aA;
                            break;
                        case '}':
                            int O24 = this.at.O();
                            c('}');
                            bs h24 = h(17);
                            h24.i(new String(this.at.N(), O24, this.at.O() - O24));
                            this.aA = h24;
                            bs bsVar30 = this.aA;
                            break;
                        case '~':
                            int O25 = this.at.O();
                            c('~');
                            bs h25 = h(42);
                            h25.i(new String(this.at.N(), O25, this.at.O() - O25));
                            this.aA = h25;
                            bs bsVar31 = this.aA;
                            break;
                    }
                    if (this.aA != null) {
                        this.aA.t(this.aA.aO());
                        return this.aA;
                    }
                } catch (bh e2) {
                    throw new cb(e2);
                }
            } catch (y e3) {
                if (this instanceof z) {
                    throw new ca(((z) e3).aF);
                }
                throw new bz(e3.getMessage());
            }
        }
    }

    private void b(boolean z) throws bh, y, bz {
        this.at.O();
        switch (g(1)) {
            case '\t':
                c('\t');
                break;
            case '\n':
                c('\n');
                ap();
                break;
            case SETS_WIDE_REGISTER:
                c(' ');
                break;
            default:
                if (g(1) == '\r' && g(2) == '\n') {
                    c('\r');
                    c('\n');
                    ap();
                    break;
                } else if (g(1) == '\r') {
                    c('\r');
                    ap();
                    break;
                } else {
                    throw new bb(g(1), al(), am(), ak());
                }
        }
        this.aA = null;
    }

    private void c(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        int i2 = 53;
        if (g(1) == '/' && g(2) == '/') {
            d(false);
        } else if (g(1) == '/' && g(2) == '*') {
            e(true);
            i2 = this.aA.aO();
        } else {
            throw new bb(g(1), al(), am(), ak());
        }
        if (i2 != 8) {
            i2 = -1;
        }
        if (z && i2 != -1) {
            bs h2 = h(i2);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
    }

    private void d(boolean z) throws bh, y, bz {
        this.at.O();
        j("//");
        while (e.D(g(1))) {
            b(e);
        }
        if (g(1) == '\r' && g(2) == '\n') {
            c('\r');
            c('\n');
        } else if (g(1) == '\r') {
            c('\r');
        } else if (g(1) == '\n') {
            c('\n');
        } else {
            throw new bb(g(1), al(), am(), ak());
        }
        ap();
        this.aA = null;
    }

    private void e(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        int i2 = 55;
        j("/*");
        if (g(1) == '*' && g(2) >= 3 && g(2) <= 255 && g(2) != '/') {
            c('*');
            i2 = 8;
        } else if (g(1) < 3 || g(1) > 255 || g(2) < 3 || g(2) > 255) {
            throw new bb(g(1), al(), am(), ak());
        }
        while (true) {
            if (g(1) == '*' && g(2) == '/') {
                break;
            } else if (g(1) == '\r' && g(2) == '\n') {
                c('\r');
                c('\n');
                ap();
            } else if (g(1) == '\r' && g(2) >= 3 && g(2) <= 255) {
                c('\r');
                ap();
            } else if (e.D(g(1)) && g(2) >= 3 && g(2) <= 255) {
                b(e);
            } else if (g(1) != '\n') {
                break;
            } else {
                c('\n');
                ap();
            }
        }
        j("*/");
        if (i2 != -1) {
            bs h2 = h(i2);
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
        } else if (f.D(g(1))) {
            d('\'');
        } else {
            throw new bb(g(1), al(), am(), ak());
        }
        c('\'');
        if (z) {
            bs h2 = h(19);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
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
                if (g(1) >= '0' && g(1) <= '7' && g(2) >= 3 && g(2) <= 255) {
                    a('0', '7');
                    if (g(1) >= '0' && g(1) <= '7' && g(2) >= 3 && g(2) <= 255) {
                        a('0', '7');
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
                if (g(1) >= '0' && g(1) <= '7' && g(2) >= 3 && g(2) <= 255) {
                    a('0', '7');
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

    private void h(boolean z) throws bh, y, bz {
        bs bsVar = null;
        int O = this.at.O();
        c('\"');
        while (true) {
            if (g(1) == '\\') {
                g(false);
            } else if (!g.D(g(1))) {
                break;
            } else {
                d('\"');
            }
        }
        c('\"');
        if (z) {
            bs h2 = h(6);
            bsVar = h2;
            h2.i(new String(this.at.N(), O, this.at.O() - O));
        }
        this.aA = bsVar;
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

    private void j(boolean z) throws bh, y, bz {
        this.at.O();
        c('[');
        while (true) {
            switch (g(1)) {
                case '\n':
                    c('\n');
                    ap();
                    break;
                case '\"':
                    h(false);
                    break;
                case '\'':
                    f(false);
                    break;
                case '[':
                    j(false);
                    break;
                default:
                    if (g(1) == '\r' && g(2) == '\n') {
                        c('\r');
                        c('\n');
                        ap();
                        break;
                    } else if (g(1) == '\r' && g(2) >= 3 && g(2) <= 255) {
                        c('\r');
                        ap();
                        break;
                    } else if (h.D(g(1))) {
                        d(']');
                        break;
                    } else {
                        c(']');
                        this.aA = null;
                        return;
                    }
                    break;
            }
        }
    }

    private void k(boolean z) throws bh, y, bz {
        this.at.O();
        c('{');
        while (g(1) != '}') {
            if ((g(1) == '\n' || g(1) == '\r') && g(2) >= 3 && g(2) <= 255) {
                if (g(1) == '\r' && g(2) == '\n') {
                    c('\r');
                    c('\n');
                    ap();
                } else if (g(1) == '\r' && g(2) >= 3 && g(2) <= 255) {
                    c('\r');
                    ap();
                } else if (g(1) == '\n') {
                    c('\n');
                    ap();
                } else {
                    throw new bb(g(1), al(), am(), ak());
                }
            } else if (g(1) == '{' && g(2) >= 3 && g(2) <= 255) {
                k(false);
            } else if (g(1) == '\'' && i.D(g(2))) {
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
        this.aA = null;
    }

    private void l(boolean z) throws bh, y, bz {
        this.at.O();
        while (true) {
            switch (g(1)) {
                case '\t':
                case '\n':
                case '\r':
                case SETS_WIDE_REGISTER:
                    b(false);
                    break;
                case '/':
                    c(false);
                    break;
                default:
                    this.aA = null;
                    return;
            }
        }
    }

    private static final long[] p() {
        long[] jArr = new long[8];
        jArr[0] = -9224;
        for (int i2 = 1; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    static {
        new antlr.a.a.b(new long[]{4294977024L, 0, 0, 0, 0});
    }

    private static final long[] q() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        jArr[1] = -268435457;
        for (int i2 = 2; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] r() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i2 = 2; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] s() {
        long[] jArr = new long[8];
        jArr[0] = -566935692296L;
        jArr[1] = -671088641;
        for (int i2 = 2; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }

    private static final long[] t() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        for (int i2 = 1; i2 <= 3; i2++) {
            jArr[i2] = -1;
        }
        return jArr;
    }
}