package org.antlr.stringtemplate;

import antlr.bh;
import antlr.bz;
import antlr.x;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.antlr.stringtemplate.a.i;
import org.antlr.stringtemplate.a.k;
import org.antlr.stringtemplate.a.l;
import org.antlr.stringtemplate.a.m;
import org.antlr.stringtemplate.a.o;
import org.antlr.stringtemplate.a.q;

/* compiled from: StringTemplate.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/c.class */
public class c {
    private ArrayList nG;
    private String cW;
    private int nI;
    private c nJ;
    private Map nK;
    private o nL;
    private LinkedHashMap nM;
    private int nN;
    private boolean nO;
    private e nP;
    private e nQ;
    private int nR;
    d nS;
    private String nT;
    private HashMap nU;
    private Map nV;
    private List nW;
    private int nX;
    private boolean nY;
    private Set nZ;
    private static Class ob;
    private static Class oc;
    private static Class od;
    private static boolean nF = false;
    private static int nH = 0;
    public static e oa = new e("defaultGroup", ".");

    /* compiled from: StringTemplate.java */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/c$a.class */
    public static final class a {
        private HashMap oe = new HashMap();

        public final Object aX(String str) {
            return this.oe.get(str);
        }

        public final String toString() {
            return this.oe.toString();
        }
    }

    /* compiled from: StringTemplate.java */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/c$b.class */
    public static final class b extends ArrayList {
        public b(int i) {
            super(i);
        }

        public b() {
        }
    }

    private static synchronized int gx() {
        int i = nH + 1;
        nH = i;
        return i;
    }

    public c() {
        this.nG = null;
        this.cW = "anonymous";
        this.nI = gx();
        this.nJ = null;
        this.nK = null;
        this.nL = null;
        this.nM = l.pc;
        this.nN = 0;
        this.nO = false;
        this.nS = null;
        this.nQ = oa;
    }

    public c(String str) {
        this(null, str);
    }

    public c(e eVar, String str) {
        this();
        if (eVar != null) {
            this.nQ = eVar;
        }
        aO(str);
    }

    public final c gy() {
        c gU;
        if (this.nP != null) {
            e eVar = this.nP;
            gU = e.gU();
        } else {
            e eVar2 = this.nQ;
            gU = e.gU();
        }
        c cVar = gU;
        cVar.nV = this.nV;
        cVar.nT = this.nT;
        cVar.nW = this.nW;
        cVar.nM = this.nM;
        cVar.nN = this.nN;
        cVar.cW = this.cW;
        cVar.nQ = this.nQ;
        cVar.nP = this.nP;
        cVar.nS = this.nS;
        cVar.nZ = this.nZ;
        cVar.nY = this.nY;
        cVar.nX = this.nX;
        return gU;
    }

    public final c gz() {
        return this.nJ;
    }

    public final c gA() {
        while (this.nJ != null) {
            this = this.nJ;
        }
        return this;
    }

    public final void a(c cVar) {
        if (this == cVar) {
            throw new IllegalArgumentException(new StringBuffer("cannot embed template ").append(this.cW).append(" in itself").toString());
        }
        this.nJ = cVar;
    }

    public final Map gB() {
        return this.nK;
    }

    public final void b(Map map) {
        this.nK = map;
    }

    public final o gC() {
        return this.nL;
    }

    public final void b(o oVar) {
        this.nL = oVar;
    }

    public final String gD() {
        return this.cW;
    }

    public final String gE() {
        while (this.nJ != null) {
            this = this.nJ;
        }
        return this.cW;
    }

    public final void aN(String str) {
        this.cW = str;
    }

    public final e gF() {
        return this.nQ;
    }

    public final void a(e eVar) {
        this.nQ = eVar;
    }

    public final e gG() {
        return this.nP;
    }

    public final void b(e eVar) {
        this.nP = eVar;
    }

    public final int gH() {
        while (this.nJ != null) {
            this = this.nJ;
        }
        return this.nR;
    }

    public final void aO(String str) {
        this.nT = str;
        gK();
    }

    public final String gI() {
        return this.nT;
    }

    private d gJ() {
        if (this.nS == null) {
            return this.nQ.gV();
        }
        return this.nS;
    }

    public final void d(String str, Object obj) {
        Class<?> cls;
        b bVar;
        if (obj == null) {
            return;
        }
        if (str.indexOf(46) >= 0) {
            throw new IllegalArgumentException("cannot have '.' in attribute names");
        }
        if (this.nU == null) {
            this.nU = new HashMap();
        }
        if (obj instanceof c) {
            ((c) obj).a(this);
        } else {
            obj = org.antlr.stringtemplate.a.a.G(obj);
        }
        Object obj2 = this.nU.get(str);
        if (obj2 == null) {
            a(this.nU, str, obj);
            return;
        }
        Class<?> cls2 = obj2.getClass();
        if (ob == null) {
            cls = f("org.antlr.stringtemplate.c$b");
            ob = cls;
        } else {
            cls = ob;
        }
        if (cls2 == cls) {
            bVar = (b) obj2;
        } else if (obj2 instanceof List) {
            List list = (List) obj2;
            b bVar2 = new b(list.size());
            bVar = bVar2;
            bVar2.addAll(list);
            a(this.nU, str, bVar);
        } else {
            bVar = new b();
            a(this.nU, str, bVar);
            bVar.add(obj2);
        }
        if (obj instanceof List) {
            if (bVar != obj) {
                bVar.addAll((List) obj);
                return;
            }
            return;
        }
        bVar.add(obj);
    }

    private static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    private void a(Map map, String str, Object obj) {
        if (this.nM != l.pc && aS(str) == null) {
            throw new NoSuchElementException(new StringBuffer("no such attribute: ").append(str).append(" in template context ").append(gR()).toString());
        }
        if (obj == null) {
            return;
        }
        map.put(str, obj);
    }

    public final void a(c cVar, Map map, String str, Object obj) {
        if (cVar.nM != l.pc && cVar.aS(str) == null) {
            throw new NoSuchElementException(new StringBuffer("template ").append(cVar.cW).append(" has no such attribute: ").append(str).append(" in template context ").append(gR()).toString());
        }
        if (obj == null) {
            return;
        }
        map.put(str, obj);
    }

    public final Object aP(String str) {
        Object a2 = a(this, str);
        if (a2 == null) {
            b(this, str);
        }
        return a2;
    }

    public final int a(f fVar) throws IOException {
        boolean z = this.nQ.op;
        int i = 0;
        boolean z2 = true;
        if (this.nN != 0) {
            if (this.nK == null) {
                this.nK = new HashMap();
            }
            if (this.nM != l.pc) {
                for (String str : this.nM.keySet()) {
                    l lVar = (l) this.nM.get(str);
                    if (lVar.pd != null && aP(str) == null) {
                        String str2 = lVar.pd;
                        if (lVar.pd.nW.size() == 1) {
                            Object obj = lVar.pd.nW.get(0);
                            if (obj instanceof org.antlr.stringtemplate.a.a) {
                                org.antlr.stringtemplate.a.a aVar = (org.antlr.stringtemplate.a.a) obj;
                                if (aVar.gW().W() == 9) {
                                    str2 = aVar.a(this, aVar.gW());
                                }
                            }
                        }
                        this.nK.put(str, str2);
                    }
                }
            }
        }
        int i2 = 0;
        while (this.nW != null && i2 < this.nW.size()) {
            int a2 = ((k) this.nW.get(i2)).a(this, fVar);
            if (a2 <= 0 && i2 == 0 && i2 + 1 < this.nW.size() && (this.nW.get(i2 + 1) instanceof m)) {
                i2++;
            } else {
                if (a2 <= 0 && i2 - 1 >= 0 && (this.nW.get(i2 - 1) instanceof m) && i2 + 1 < this.nW.size() && (this.nW.get(i2 + 1) instanceof m)) {
                    i2++;
                }
                if (a2 != -1) {
                    i += a2;
                    z2 = false;
                }
            }
            i2++;
        }
        boolean z3 = this.nQ.op;
        if (!z2 || this.nW == null || this.nW.size() <= 0) {
            return i;
        }
        return -1;
    }

    private Object a(c cVar, String str) {
        Map map;
        if (cVar == null) {
            return null;
        }
        Map map2 = null;
        if (cVar.nU != null) {
            map2 = cVar.nU.get(str);
        }
        if (map2 == null && (map = cVar.nK) != null) {
            map2 = map.get(str);
        }
        if (map2 == null && !cVar.nO && cVar.aS(str) != null) {
            return null;
        }
        if (map2 == null && cVar.nJ != null) {
            map2 = a(cVar.nJ, str);
        } else if (map2 == null && cVar.nJ == null) {
            map2 = cVar.nQ.bb(str);
        }
        return map2;
    }

    private void gK() {
        Class<?> cls;
        Class<?> cls2;
        if (this.nT == null) {
            return;
        }
        try {
            Class gS = this.nQ.gS();
            Class<?>[] clsArr = new Class[2];
            if (oc == null) {
                cls = f("org.antlr.stringtemplate.c");
                oc = cls;
            } else {
                cls = oc;
            }
            clsArr[0] = cls;
            if (od == null) {
                cls2 = f("java.io.Reader");
                od = cls2;
            } else {
                cls2 = od;
            }
            clsArr[1] = cls2;
            x xVar = (x) gS.getConstructor(clsArr).newInstance(this, new StringReader(this.nT));
            xVar.n("org.antlr.stringtemplate.a.h");
            new q(xVar).e(this);
        } catch (Exception e) {
            String str = "<unknown>";
            String gE = gE();
            if (this.cW != null) {
                str = this.cW;
            }
            if (gE != null && !str.equals(gE)) {
                str = new StringBuffer().append(str).append(" nested in ").append(gE).toString();
            }
            b(new StringBuffer("problem parsing template '").append(str).append("'").toString(), e);
        }
    }

    public final org.antlr.stringtemplate.a.a aQ(String str) {
        Map gZ;
        antlr.a.a aG;
        org.antlr.stringtemplate.a.c cVar = new org.antlr.stringtemplate.a.c(new StringReader(str.toString()));
        org.antlr.stringtemplate.a.d dVar = new org.antlr.stringtemplate.a.d(cVar, this);
        dVar.t("org.antlr.stringtemplate.a.o");
        cVar.n("org.antlr.stringtemplate.a.p");
        i iVar = null;
        try {
            gZ = dVar.gZ();
            aG = dVar.aG();
        } catch (bh e) {
            b(new StringBuffer("Can't parse chunk: ").append(str.toString()).toString(), e);
        } catch (bz e2) {
            b(new StringBuffer("Can't parse chunk: ").append(str.toString()).toString(), e2);
        }
        if (aG != null) {
            if (aG.W() == 8) {
                iVar = new i(this, aG);
                return iVar;
            }
            iVar = new org.antlr.stringtemplate.a.a(this, aG, gZ);
        }
        return iVar;
    }

    public final Map gL() {
        return this.nU;
    }

    public final List gM() {
        return this.nW;
    }

    public final void a(k kVar) {
        if (this.nW == null) {
            this.nW = new ArrayList();
        }
        this.nW.add(kVar);
    }

    public final Map gN() {
        return this.nM;
    }

    private l aR(String str) {
        l aS = aS(str);
        l lVar = aS;
        if (aS == null && this.nJ != null) {
            lVar = this.nJ.aR(str);
        }
        return lVar;
    }

    private l aS(String str) {
        return (l) this.nM.get(str);
    }

    public final void c(List list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            l lVar = new l(str, null);
            if (this.nM == l.pc) {
                this.nM = new LinkedHashMap();
            }
            this.nM.put(str, lVar);
        }
    }

    public final void C(boolean z) {
        this.nO = true;
    }

    public final org.antlr.stringtemplate.a e(Class cls) {
        while (true) {
            org.antlr.stringtemplate.a aVar = null;
            if (this.nV != null) {
                aVar = (org.antlr.stringtemplate.a) this.nV.get(cls);
            }
            if (aVar != null) {
                return aVar;
            }
            if (this.nJ != null) {
                this = this.nJ;
            } else {
                return this.nQ.f(cls);
            }
        }
    }

    public final void aT(String str) {
        b(str, (Exception) null);
    }

    public final void aU(String str) {
        if (gJ() != null) {
            gJ().J(str);
        } else {
            System.err.println(new StringBuffer("StringTemplate: warning: ").append(str).toString());
        }
    }

    public final void b(String str, Exception exc) {
        if (gJ() != null) {
            gJ().b(str, exc);
        } else if (exc != null) {
            System.err.println(new StringBuffer("StringTemplate: error: ").append(str).append(": ").append(exc.toString()).toString());
            if (exc instanceof InvocationTargetException) {
                exc = ((InvocationTargetException) exc).getTargetException();
            }
            exc.printStackTrace(System.err);
        } else {
            System.err.println(new StringBuffer("StringTemplate: error: ").append(str).toString());
        }
    }

    public static boolean gO() {
        return false;
    }

    public static boolean b(c cVar) {
        if (cVar == null) {
            return false;
        }
        c cVar2 = cVar.nJ;
        if (cVar2 == cVar) {
            return true;
        }
        for (c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.nJ) {
            if (cVar3 == cVar) {
                return true;
            }
        }
        return false;
    }

    public final String gP() {
        StringBuffer stringBuffer = new StringBuffer();
        HashSet hashSet = new HashSet();
        c cVar = this;
        while (true) {
            c cVar2 = cVar;
            if (cVar2 == null) {
                break;
            } else if (hashSet.contains(cVar2)) {
                stringBuffer.append(cVar2.gQ());
                stringBuffer.append(" (start of recursive cycle)");
                stringBuffer.append("\n");
                stringBuffer.append("...");
                break;
            } else {
                hashSet.add(cVar2);
                stringBuffer.append(cVar2.gQ());
                if (cVar2.nU != null) {
                    stringBuffer.append(", attributes=[");
                    int i = 0;
                    for (String str : cVar2.nU.keySet()) {
                        if (i > 0) {
                            stringBuffer.append(", ");
                        }
                        i++;
                        stringBuffer.append(str);
                        Object obj = cVar2.nU.get(str);
                        if (obj instanceof c) {
                            c cVar3 = (c) obj;
                            stringBuffer.append("=");
                            stringBuffer.append("<");
                            stringBuffer.append(cVar3.cW);
                            stringBuffer.append("()@");
                            stringBuffer.append(String.valueOf(cVar3.nI));
                            stringBuffer.append(">");
                        } else if (obj instanceof List) {
                            stringBuffer.append("=List[..");
                            List list = (List) obj;
                            int i2 = 0;
                            for (int i3 = 0; i3 < list.size(); i3++) {
                                Object obj2 = list.get(i3);
                                if (obj2 instanceof c) {
                                    if (i2 > 0) {
                                        stringBuffer.append(", ");
                                    }
                                    i2++;
                                    c cVar4 = (c) obj2;
                                    stringBuffer.append("<");
                                    stringBuffer.append(cVar4.cW);
                                    stringBuffer.append("()@");
                                    stringBuffer.append(String.valueOf(cVar4.nI));
                                    stringBuffer.append(">");
                                }
                            }
                            stringBuffer.append("..]");
                        }
                    }
                    stringBuffer.append("]");
                }
                if (cVar2.nG != null) {
                    stringBuffer.append(", references=");
                    stringBuffer.append(cVar2.nG);
                }
                stringBuffer.append(">\n");
                cVar = cVar2.nJ;
            }
        }
        return stringBuffer.toString();
    }

    public final String gQ() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<");
        stringBuffer.append(this.cW);
        stringBuffer.append("(");
        stringBuffer.append(this.nM.keySet());
        stringBuffer.append(")@");
        stringBuffer.append(String.valueOf(this.nI));
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    private void b(c cVar, String str) {
        while (cVar.nM == l.pc) {
            if (cVar.nJ != null) {
                cVar = cVar.nJ;
                this = this;
            } else {
                return;
            }
        }
        if (cVar.aR(str) == null) {
            throw new NoSuchElementException(new StringBuffer("no such attribute: ").append(str).append(" in template context ").append(this.gR()).toString());
        }
    }

    public final String gR() {
        LinkedList linkedList = new LinkedList();
        c cVar = this;
        while (true) {
            c cVar2 = cVar;
            if (cVar2 != null) {
                linkedList.add(0, new StringBuffer().append(cVar2.cW).append(cVar2.nO ? "(...)" : "").toString());
                cVar = cVar2.nJ;
            } else {
                return linkedList.toString().replaceAll(",", "");
            }
        }
    }

    public final void D(boolean z) {
        this.nY = true;
    }

    public final void aV(String str) {
        if (this.nZ == null) {
            this.nZ = new HashSet();
        }
        this.nZ.add(str);
    }

    public final boolean aW(String str) {
        if (this.nZ == null) {
            return false;
        }
        return this.nZ.contains(str);
    }

    public final void Z(int i) {
        this.nX = i;
    }

    public String toString() {
        return aa(-1);
    }

    private String aa(int i) {
        StringWriter stringWriter = new StringWriter();
        f a2 = this.nQ.a(stringWriter);
        a2.Y(-1);
        try {
            a(a2);
        } catch (IOException unused) {
            b(new StringBuffer("Got IOException writing to writer ").append(a2.getClass().getName()).toString(), (Exception) null);
        }
        a2.Y(-1);
        return stringWriter.toString();
    }
}