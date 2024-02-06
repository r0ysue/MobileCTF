package org.antlr.stringtemplate.a;

import antlr.ay;
import antlr.ba;
import antlr.bh;
import antlr.cf;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Vector;

/* compiled from: ActionEvaluator.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/b.class */
public final class b extends cf {
    private org.antlr.stringtemplate.c oH;
    private org.antlr.stringtemplate.f oI;
    private a oJ;
    private static String[] m = {"<0>", "EOF", "<2>", "NULL_TREE_LOOKAHEAD", "APPLY", "MULTI_APPLY", "ARGS", "INCLUDE", "\"if\"", "VALUE", "TEMPLATE", "FUNCTION", "SINGLEVALUEARG", "LIST", "NOTHING", "SEMI", "LPAREN", "RPAREN", "\"elseif\"", "COMMA", "ID", "ASSIGN", "COLON", "NOT", "PLUS", "DOT", "\"first\"", "\"rest\"", "\"last\"", "\"length\"", "\"strip\"", "\"trunc\"", "\"super\"", "ANONYMOUS_TEMPLATE", "STRING", "INT", "LBRACK", "RBRACK", "DOTDOTDOT", "TEMPLATE_ARGS", "NESTED_ANONYMOUS_TEMPLATE", "ESC_CHAR", "WS", "WS_CHAR"};
    private static antlr.a.a.b e = new antlr.a.a.b(new long[]{60180933296L, 0});

    public b(org.antlr.stringtemplate.c cVar, a aVar, org.antlr.stringtemplate.f fVar) {
        this.oH = null;
        this.oI = null;
        this.oJ = null;
        this.oH = cVar;
        this.oJ = aVar;
        this.oI = fVar;
    }

    @Override // antlr.cf
    public final void a(bh bhVar) {
        this.oH.b("eval tree parse error", bhVar);
    }

    public b() {
        this.oH = null;
        this.oI = null;
        this.oJ = null;
        this.af = m;
    }

    public final int d(antlr.a.a aVar) throws bh {
        int i = 0;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        try {
            Object e2 = e(aVar);
            aVar = this.dB;
            i = this.oJ.a(this.oH, e2, this.oI);
        } catch (bh e3) {
            a(e3);
            if (aVar != null) {
                aVar = aVar.U();
            }
        }
        this.dB = aVar;
        return i;
    }

    private Object e(antlr.a.a aVar) throws bh {
        String str = null;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        if (aVar == null) {
            try {
                aVar = dA;
            } catch (bh e2) {
                a(e2);
                if (aVar != null) {
                    aVar = aVar.U();
                }
            }
        }
        switch (aVar.W()) {
            case CAN_CONTINUE:
            case 5:
                str = f(aVar);
                aVar = this.dB;
                break;
            case 6:
            case SETS_RESULT:
            case 10:
            case 12:
            case 14:
            case 15:
            case SETS_REGISTER:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case SETS_WIDE_REGISTER:
            default:
                throw new ba(aVar);
            case 7:
                str = h(aVar);
                aVar = this.dB;
                break;
            case 9:
                o oVar2 = (o) aVar;
                a(aVar, 9);
                Object e3 = e(aVar.T());
                antlr.a.a aVar2 = this.dB;
                aVar = aVar.U();
                StringWriter stringWriter = new StringWriter();
                if (this.oJ.a(this.oH, e3, this.oH.gF().a(stringWriter)) <= 0) {
                    break;
                } else {
                    str = stringWriter.toString();
                    break;
                }
            case 11:
                str = i(aVar);
                aVar = this.dB;
                break;
            case 13:
                str = j(aVar);
                aVar = this.dB;
                break;
            case 20:
            case 25:
            case 33:
            case 34:
            case 35:
                str = g(aVar);
                aVar = this.dB;
                break;
            case 24:
                o oVar3 = (o) aVar;
                a(aVar, 24);
                Object e4 = e(aVar.T());
                Object e5 = e(this.dB);
                antlr.a.a aVar3 = this.dB;
                a aVar4 = this.oJ;
                str = a.o(e4, e5);
                aVar = aVar.U();
                break;
        }
        this.dB = aVar;
        return str;
    }

    private Object f(antlr.a.a aVar) throws bh {
        Object obj = null;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        Vector vector = new Vector();
        ArrayList arrayList = new ArrayList();
        if (aVar == null) {
            try {
                aVar = dA;
            } catch (bh e2) {
                a(e2);
                if (aVar != null) {
                    aVar = aVar.U();
                }
            }
        }
        switch (aVar.W()) {
            case CAN_CONTINUE:
                antlr.a.a aVar2 = aVar;
                o oVar2 = (o) aVar;
                a(aVar, 4);
                Object e3 = e(aVar.T());
                aVar = this.dB;
                int i = 0;
                while (true) {
                    if (aVar == null) {
                        aVar = dA;
                    }
                    if (aVar.W() != 10) {
                        if (i > 0) {
                            obj = this.oJ.a(this.oH, e3, vector);
                            aVar = aVar2.U();
                            break;
                        } else {
                            throw new ba(aVar);
                        }
                    } else {
                        antlr.a.a aVar3 = aVar;
                        if (aVar3 != dA) {
                            o oVar3 = (o) aVar3;
                        }
                        try {
                            o oVar4 = (o) aVar3;
                            a(aVar3, 10);
                            antlr.a.a T = aVar3.T();
                            antlr.j jVar = T;
                            if (T == null) {
                                jVar = dA;
                            }
                            switch (jVar.W()) {
                                case 9:
                                    antlr.a.a aVar4 = jVar;
                                    o oVar5 = (o) jVar;
                                    a(jVar, 9);
                                    Object e4 = e(jVar.T());
                                    antlr.a.a aVar5 = this.dB;
                                    o oVar6 = (o) aVar5;
                                    if (aVar5 != null) {
                                        aVar5.U();
                                        if (e4 != null) {
                                            org.antlr.stringtemplate.c d = this.oH.gF().d(this.oH, e4.toString());
                                            if (d != null) {
                                                d.b(oVar6);
                                                vector.addElement(d);
                                            }
                                        }
                                        aVar4.U();
                                        break;
                                    } else {
                                        throw new ay();
                                    }
                                case 20:
                                    o oVar7 = (o) jVar;
                                    a(jVar, 20);
                                    antlr.a.a U = jVar.U();
                                    o oVar8 = (o) U;
                                    if (U != null) {
                                        U.U();
                                        org.antlr.stringtemplate.c d2 = this.oH.gF().d(this.oH, oVar7.V());
                                        if (d2 != null) {
                                            d2.b(oVar8);
                                            vector.addElement(d2);
                                            break;
                                        }
                                    } else {
                                        throw new ay();
                                    }
                                    break;
                                case 33:
                                    a(jVar, 33);
                                    jVar.U();
                                    org.antlr.stringtemplate.c hH = ((o) jVar).hH();
                                    hH.a(this.oH.gF());
                                    vector.addElement(hH);
                                    break;
                                default:
                                    throw new ba(jVar);
                            }
                            aVar3 = aVar3.U();
                        } catch (bh e5) {
                            a(e5);
                            if (aVar3 != null) {
                                aVar3 = aVar3.U();
                            }
                        }
                        this.dB = aVar3;
                        aVar = this.dB;
                        i++;
                    }
                }
            case 5:
                antlr.a.a aVar6 = aVar;
                o oVar9 = (o) aVar;
                a(aVar, 5);
                antlr.j T2 = aVar.T();
                int i2 = 0;
                while (true) {
                    if (T2 == null) {
                        T2 = dA;
                    }
                    if (e.D(T2.W())) {
                        Object e6 = e(T2);
                        T2 = this.dB;
                        arrayList.add(e6);
                        i2++;
                    } else if (i2 > 0) {
                        o oVar10 = (o) T2;
                        a(T2, 22);
                        antlr.a.a U2 = T2.U();
                        o oVar11 = (o) U2;
                        a(U2, 33);
                        U2.U();
                        vector.addElement(oVar11.hH());
                        a aVar7 = this.oJ;
                        obj = a.a(this.oH, arrayList, oVar11.hH());
                        aVar = aVar6.U();
                        break;
                    } else {
                        throw new ba(T2);
                    }
                }
            default:
                throw new ba(aVar);
        }
        this.dB = aVar;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object g(antlr.a.a aVar) throws bh {
        Integer num;
        Integer num2 = null;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        String str = null;
        if (aVar == null) {
            try {
                aVar = dA;
            } catch (bh e2) {
                a(e2);
                num = num2;
                if (aVar != null) {
                    aVar = aVar.U();
                    num = num2;
                }
            }
        }
        switch (aVar.W()) {
            case 20:
                o oVar2 = (o) aVar;
                a(aVar, 20);
                aVar = aVar.U();
                num = this.oH.aP(oVar2.V());
                break;
            case 25:
                antlr.a.a aVar2 = aVar;
                o oVar3 = (o) aVar;
                a(aVar, 25);
                Object e3 = e(aVar.T());
                antlr.a.a aVar3 = this.dB;
                antlr.j jVar = aVar3;
                if (aVar3 == null) {
                    jVar = dA;
                }
                switch (jVar.W()) {
                    case 9:
                        o oVar4 = (o) jVar;
                        a(jVar, 9);
                        Object e4 = e(jVar.T());
                        antlr.a.a aVar4 = this.dB;
                        jVar.U();
                        if (e4 != null) {
                            str = e4;
                            break;
                        }
                        break;
                    case 20:
                        a(jVar, 20);
                        jVar.U();
                        str = ((o) jVar).V();
                        break;
                    default:
                        throw new ba(jVar);
                }
                aVar = aVar2.U();
                num = this.oJ.a(this.oH, e3, str);
                break;
            case 33:
                o oVar5 = (o) aVar;
                a(aVar, 33);
                aVar = aVar.U();
                num = oVar5.V();
                if (oVar5.V() == null) {
                    break;
                } else {
                    org.antlr.stringtemplate.c cVar = new org.antlr.stringtemplate.c(this.oH.gF(), oVar5.V());
                    cVar.a(this.oH);
                    cVar.aN("<anonymous template argument>");
                    num = cVar;
                    break;
                }
            case 34:
                o oVar6 = (o) aVar;
                a(aVar, 34);
                aVar = aVar.U();
                num = oVar6.V();
                break;
            case 35:
                o oVar7 = (o) aVar;
                a(aVar, 35);
                aVar = aVar.U();
                num = new Integer(oVar7.V());
                break;
            default:
                throw new ba(aVar);
        }
        this.dB = aVar;
        return num;
    }

    private Object h(antlr.a.a aVar) throws bh {
        o oVar;
        org.antlr.stringtemplate.c cVar = null;
        if (aVar != dA) {
            o oVar2 = (o) aVar;
        }
        String str = null;
        try {
            o oVar3 = (o) aVar;
            a(aVar, 7);
            antlr.a.a T = aVar.T();
            antlr.j jVar = T;
            if (T == null) {
                jVar = dA;
            }
            switch (jVar.W()) {
                case 9:
                    antlr.a.a aVar2 = jVar;
                    o oVar4 = (o) jVar;
                    a(jVar, 9);
                    Object e2 = e(jVar.T());
                    antlr.a.a aVar3 = this.dB;
                    o oVar5 = (o) aVar3;
                    if (aVar3 != null) {
                        aVar3.U();
                        aVar2.U();
                        if (e2 != null) {
                            str = e2.toString();
                        }
                        oVar = oVar5;
                        break;
                    } else {
                        throw new ay();
                    }
                case 20:
                    o oVar6 = (o) jVar;
                    a(jVar, 20);
                    antlr.a.a U = jVar.U();
                    o oVar7 = (o) U;
                    if (U != null) {
                        U.U();
                        str = oVar6.V();
                        oVar = oVar7;
                        break;
                    } else {
                        throw new ay();
                    }
                default:
                    throw new ba(jVar);
            }
            aVar = aVar.U();
            if (str != null) {
                cVar = this.oJ.a(this.oH, str, oVar);
            }
        } catch (bh e3) {
            a(e3);
            if (aVar != null) {
                aVar = aVar.U();
            }
        }
        this.dB = aVar;
        return cVar;
    }

    private Object i(antlr.a.a aVar) throws bh {
        Object obj = null;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        try {
            o oVar2 = (o) aVar;
            a(aVar, 11);
            antlr.a.a T = aVar.T();
            antlr.j jVar = T;
            if (T == null) {
                jVar = dA;
            }
            switch (jVar.W()) {
                case 26:
                    o oVar3 = (o) jVar;
                    a(jVar, 26);
                    Object k = k(jVar.U());
                    antlr.a.a aVar2 = this.dB;
                    a aVar3 = this.oJ;
                    obj = a.I(k);
                    break;
                case 27:
                    o oVar4 = (o) jVar;
                    a(jVar, 27);
                    Object k2 = k(jVar.U());
                    antlr.a.a aVar4 = this.dB;
                    a aVar5 = this.oJ;
                    obj = a.J(k2);
                    break;
                case 28:
                    o oVar5 = (o) jVar;
                    a(jVar, 28);
                    Object k3 = k(jVar.U());
                    antlr.a.a aVar6 = this.dB;
                    a aVar7 = this.oJ;
                    obj = a.K(k3);
                    break;
                case 29:
                    o oVar6 = (o) jVar;
                    a(jVar, 29);
                    Object k4 = k(jVar.U());
                    antlr.a.a aVar8 = this.dB;
                    a aVar9 = this.oJ;
                    obj = a.N(k4);
                    break;
                case 30:
                    o oVar7 = (o) jVar;
                    a(jVar, 30);
                    Object k5 = k(jVar.U());
                    antlr.a.a aVar10 = this.dB;
                    a aVar11 = this.oJ;
                    obj = a.L(k5);
                    break;
                case 31:
                    o oVar8 = (o) jVar;
                    a(jVar, 31);
                    Object k6 = k(jVar.U());
                    antlr.a.a aVar12 = this.dB;
                    a aVar13 = this.oJ;
                    obj = a.M(k6);
                    break;
                default:
                    throw new ba(jVar);
            }
            aVar = aVar.U();
        } catch (bh e2) {
            a(e2);
            if (aVar != null) {
                aVar = aVar.U();
            }
        }
        this.dB = aVar;
        return obj;
    }

    private Object j(antlr.a.a aVar) throws bh {
        antlr.j T;
        int i;
        g gVar = null;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        ArrayList arrayList = new ArrayList();
        try {
            o oVar2 = (o) aVar;
            a(aVar, 13);
            T = aVar.T();
            i = 0;
        } catch (bh e2) {
            a(e2);
            if (aVar != null) {
                aVar = aVar.U();
            }
        }
        while (true) {
            if (T == null) {
                T = dA;
            }
            switch (T.W()) {
                case CAN_CONTINUE:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 20:
                case 24:
                case 25:
                case 33:
                case 34:
                case 35:
                    Object e3 = e(T);
                    T = this.dB;
                    if (e3 == null) {
                        break;
                    } else {
                        arrayList.add(e3);
                        break;
                    }
                case 6:
                case SETS_RESULT:
                case 10:
                case 12:
                case 15:
                case SETS_REGISTER:
                case 17:
                case 18:
                case 19:
                case 21:
                case 22:
                case 23:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case SETS_WIDE_REGISTER:
                default:
                    if (i > 0) {
                        aVar = aVar.U();
                        gVar = new g(arrayList);
                        this.dB = aVar;
                        return gVar;
                    }
                    throw new ba(T);
                case 14:
                    o oVar3 = (o) T;
                    a(T, 14);
                    T = T.U();
                    arrayList.add(new ArrayList(this) { // from class: org.antlr.stringtemplate.a.b.1
                        private final b oK;

                        {
                            this.oK = this;
                            add(null);
                        }
                    }.iterator());
                    break;
            }
            i++;
        }
    }

    private Object k(antlr.a.a aVar) throws bh {
        Object obj = null;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        try {
            o oVar2 = (o) aVar;
            a(aVar, 12);
            obj = e(aVar.T());
            antlr.a.a aVar2 = this.dB;
            aVar = aVar.U();
        } catch (bh e2) {
            a(e2);
            if (aVar != null) {
                aVar = aVar.U();
            }
        }
        this.dB = aVar;
        return obj;
    }

    public final boolean l(antlr.a.a aVar) throws bh {
        boolean z = false;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        if (aVar == null) {
            try {
                aVar = dA;
            } catch (bh e2) {
                a(e2);
                if (aVar != null) {
                    aVar = aVar.U();
                }
            }
        }
        switch (aVar.W()) {
            case CAN_CONTINUE:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 20:
            case 24:
            case 25:
            case 33:
            case 34:
            case 35:
                Object m2 = m(aVar);
                aVar = this.dB;
                a aVar2 = this.oJ;
                z = a.F(m2);
                break;
            case 6:
            case SETS_RESULT:
            case 10:
            case 12:
            case 14:
            case 15:
            case SETS_REGISTER:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case SETS_WIDE_REGISTER:
            default:
                throw new ba(aVar);
            case 23:
                o oVar2 = (o) aVar;
                a(aVar, 23);
                Object m3 = m(aVar.T());
                antlr.a.a aVar3 = this.dB;
                aVar = aVar.U();
                a aVar4 = this.oJ;
                z = !a.F(m3);
                break;
        }
        this.dB = aVar;
        return z;
    }

    private Object m(antlr.a.a aVar) throws bh {
        Object obj = null;
        if (aVar != dA) {
            o oVar = (o) aVar;
        }
        try {
            obj = e(aVar);
            aVar = this.dB;
        } catch (bh e2) {
            a(e2);
            if (aVar != null) {
                aVar = aVar.U();
            }
        }
        this.dB = aVar;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0163 A[Catch: bh -> 0x0290, TryCatch #0 {bh -> 0x0290, blocks: (B:10:0x001e, B:11:0x0022, B:12:0x0028, B:13:0x0044, B:16:0x005e, B:17:0x0062, B:19:0x006d, B:41:0x017b, B:21:0x0078, B:23:0x008c, B:26:0x0097, B:27:0x009c, B:28:0x00a3, B:29:0x00bc, B:31:0x0111, B:40:0x016c, B:32:0x0127, B:33:0x0148, B:34:0x0151, B:37:0x0157, B:39:0x0163, B:42:0x0188, B:44:0x019c, B:45:0x01a2, B:47:0x01df, B:49:0x01ef, B:51:0x0202, B:56:0x0220, B:63:0x0278, B:57:0x024f, B:60:0x0263, B:62:0x026f, B:64:0x0287, B:65:0x028f), top: B:72:0x001e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v21, types: [antlr.a.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [antlr.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map a(org.antlr.stringtemplate.a.o r7, org.antlr.stringtemplate.c r8, java.util.Map r9) throws antlr.bh {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.antlr.stringtemplate.a.b.a(org.antlr.stringtemplate.a.o, org.antlr.stringtemplate.c, java.util.Map):java.util.Map");
    }
}