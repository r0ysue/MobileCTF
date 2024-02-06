package antlr;

import java.util.Hashtable;

/* compiled from: ASTFactory.java */
/* loaded from: repireall.jar:antlr/i.class */
public final class i {
    private String w;
    private Class x;
    private Hashtable y;
    private static Class z;

    public i() {
        this.w = null;
        this.x = null;
        this.y = null;
    }

    public i(Hashtable hashtable) {
        this.w = null;
        this.x = null;
        this.y = null;
        this.y = hashtable;
    }

    private static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static void a(k kVar, antlr.a.a aVar) {
        if (aVar != null) {
            if (kVar.A == null) {
                kVar.A = aVar;
            } else if (kVar.B == null) {
                kVar.A.b(aVar);
            } else {
                kVar.B.c(aVar);
            }
            kVar.B = aVar;
            kVar.aa();
        }
    }

    public final antlr.a.a b(int i) {
        Class cls;
        Class cls2;
        if (this.y != null && (cls2 = (Class) this.y.get(Integer.valueOf(i))) != null) {
            cls = cls2;
        } else if (this.x != null) {
            cls = this.x;
        } else if (z == null) {
            cls = f("antlr.ab");
            z = cls;
        } else {
            cls = z;
        }
        antlr.a.a a = a(cls);
        if (a != null) {
            a.b(i, "");
        }
        return a;
    }

    public final antlr.a.a a(int i, String str) {
        antlr.a.a b = b(i);
        if (b != null) {
            b.b(i, str);
        }
        return b;
    }

    public final antlr.a.a n(bs bsVar) {
        antlr.a.a b = b(bsVar.aO());
        if (b != null) {
            b.o(bsVar);
        }
        return b;
    }

    private antlr.a.a a(Class cls) {
        try {
            return (antlr.a.a) cls.newInstance();
        } catch (Exception unused) {
            System.err.println(new StringBuffer("Can't create AST Node ").append(cls.getName()).toString());
            return null;
        }
    }

    public final antlr.a.a a(antlr.a.a.a aVar) {
        antlr.a.a[] aVarArr = aVar.dL;
        if (aVarArr == null || aVarArr.length == 0) {
            return null;
        }
        antlr.a.a aVar2 = aVarArr[0];
        antlr.a.a aVar3 = null;
        if (aVar2 != null) {
            aVar2.b(null);
        }
        for (int i = 1; i < aVarArr.length; i++) {
            if (aVarArr[i] != null) {
                if (aVar2 == null) {
                    antlr.a.a aVar4 = aVarArr[i];
                    aVar3 = aVar4;
                    aVar2 = aVar4;
                } else if (aVar3 == null) {
                    aVar2.b(aVarArr[i]);
                    aVar3 = aVar2.T();
                } else {
                    aVar3.c(aVarArr[i]);
                    aVar3 = aVar3.U();
                }
                while (aVar3.U() != null) {
                    aVar3 = aVar3.U();
                }
            }
        }
        return aVar2;
    }

    public static void a(k kVar, org.antlr.stringtemplate.a.o oVar) {
        if (oVar != null) {
            oVar.a(kVar.A);
            kVar.B = kVar.A;
            kVar.aa();
            kVar.A = oVar;
        }
    }

    public final void e(String str) {
        this.w = str;
        try {
            this.x = ci.L(str);
        } catch (Exception unused) {
            System.err.println(new StringBuffer("Can't find/access AST Node type").append(str).toString());
        }
    }
}