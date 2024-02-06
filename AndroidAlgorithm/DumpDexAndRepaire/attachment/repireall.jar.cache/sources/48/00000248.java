package org.antlr.stringtemplate.a;

import antlr.bh;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.antlr.stringtemplate.c;

/* compiled from: ASTExpr.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/a.class */
public class a extends k {
    private static org.antlr.stringtemplate.c ow = new org.antlr.stringtemplate.c();
    private static AnonymousClass1 ox = new HashMap() { // from class: org.antlr.stringtemplate.a.a.1
        {
            put("anchor", new o(34, "true"));
            put("wrap", new o(34, "\n"));
        }
    };
    private static AnonymousClass2 oy = new HashSet() { // from class: org.antlr.stringtemplate.a.a.2
        {
            add("anchor");
            add("format");
            add("null");
            add("separator");
            add("wrap");
        }
    };
    antlr.a.a oz;
    private Map oA;
    private String oB;
    private String oC;
    private String oD;
    private String oE;
    private static Class oF;
    private static Class oc;
    private static Class oG;

    public a(org.antlr.stringtemplate.c cVar, antlr.a.a aVar, Map map) {
        super(cVar);
        this.oz = null;
        this.oA = null;
        this.oB = null;
        this.oC = null;
        this.oD = null;
        this.oE = null;
        this.oz = aVar;
        this.oA = map;
    }

    public final antlr.a.a gW() {
        return this.oz;
    }

    @Override // org.antlr.stringtemplate.a.k
    public int a(org.antlr.stringtemplate.c cVar, org.antlr.stringtemplate.f fVar) throws IOException {
        if (this.oz == null || fVar == null) {
            return 0;
        }
        o oVar = (o) bd("anchor");
        if (oVar != null) {
            fVar.gu();
        }
        fVar.aJ(hG());
        this.oE = null;
        o oVar2 = (o) bd("wrap");
        if (oVar2 != null) {
            this.oB = a(cVar, oVar2);
        }
        o oVar3 = (o) bd("null");
        if (oVar3 != null) {
            this.oC = a(cVar, oVar3);
        }
        o oVar4 = (o) bd("separator");
        if (oVar4 != null) {
            this.oD = a(cVar, oVar4);
        }
        o oVar5 = (o) bd("format");
        if (oVar5 != null) {
            this.oE = a(cVar, oVar5);
        }
        if (this.oA != null) {
            for (String str : this.oA.keySet()) {
                if (!oy.contains(str)) {
                    cVar.aU(new StringBuffer("ignoring unsupported option: ").append(str).toString());
                }
            }
        }
        int i = 0;
        try {
            i = new b(cVar, this, fVar).d(this.oz);
        } catch (bh e) {
            cVar.b(new StringBuffer("can't evaluate tree: ").append(this.oz.Z()).toString(), e);
        }
        fVar.gt();
        if (oVar != null) {
            fVar.gv();
        }
        return i;
    }

    public static Object a(org.antlr.stringtemplate.c cVar, ArrayList arrayList, org.antlr.stringtemplate.c cVar2) {
        Iterator it;
        if (cVar2 == null || arrayList.size() == 0) {
            return null;
        }
        c.b bVar = new c.b();
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj != null) {
                Iterator it2 = null;
                if (obj instanceof Collection) {
                    it2 = ((Collection) obj).iterator();
                } else if (obj instanceof Map) {
                    it2 = ((Map) obj).values().iterator();
                } else if (obj instanceof Iterator) {
                    it2 = (Iterator) obj;
                }
                if (it2 == null) {
                    c.b bVar2 = new c.b(1);
                    bVar2.add(obj);
                    it = bVar2.iterator();
                } else {
                    it = it2;
                }
                arrayList.set(i, it);
            }
        }
        int size = arrayList.size();
        Map gN = cVar2.gN();
        if (gN == null || gN.size() == 0) {
            cVar.aT(new StringBuffer("missing arguments in anonymous template in context ").append(cVar.gR()).toString());
            return null;
        }
        Object[] array = gN.keySet().toArray();
        Object[] objArr = array;
        if (array.length != size) {
            cVar.aT(new StringBuffer("number of arguments ").append(gN.keySet()).append(" mismatch between attribute list and anonymous template in context ").append(cVar.gR()).toString());
            int min = Math.min(objArr.length, size);
            size = min;
            Object[] objArr2 = new Object[min];
            System.arraycopy(objArr, 0, objArr2, 0, min);
            objArr = objArr2;
        }
        int i2 = 0;
        while (true) {
            HashMap hashMap = new HashMap();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Iterator it3 = (Iterator) arrayList.get(i4);
                if (it3 != null && it3.hasNext()) {
                    hashMap.put((String) objArr[i4], it3.next());
                } else {
                    i3++;
                }
            }
            if (i3 != size) {
                hashMap.put("i", new Integer(i2 + 1));
                hashMap.put("i0", Integer.valueOf(i2));
                org.antlr.stringtemplate.c gy = cVar2.gy();
                gy.a(cVar);
                gy.b(hashMap);
                bVar.add(gy);
                i2++;
            } else {
                return bVar;
            }
        }
    }

    public final Object a(org.antlr.stringtemplate.c cVar, Object obj, Vector vector) {
        if (obj == null || vector.size() == 0) {
            return null;
        }
        Object H = H(G(obj));
        if (H instanceof Iterator) {
            c.b bVar = new c.b();
            Iterator it = (Iterator) H;
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                String str = next;
                if (next == null) {
                    if (this.oC != null) {
                        str = this.oC;
                    }
                }
                org.antlr.stringtemplate.c cVar2 = (org.antlr.stringtemplate.c) vector.get(i % vector.size());
                o gC = cVar2.gC();
                org.antlr.stringtemplate.c gy = cVar2.gy();
                gy.a(cVar);
                gy.b(gC);
                HashMap hashMap = new HashMap();
                Map gN = gy.gN();
                boolean z = gy.gD() == "anonymous";
                a(gy, hashMap, str);
                if (!z || gN == null || gN.size() <= 0) {
                    hashMap.put("it", str);
                    hashMap.put("attr", str);
                }
                hashMap.put("i", new Integer(i + 1));
                hashMap.put("i0", Integer.valueOf(i));
                gy.b(hashMap);
                c(gy);
                bVar.add(gy);
                i++;
            }
            if (bVar.size() == 0) {
                bVar = null;
            }
            return bVar;
        }
        org.antlr.stringtemplate.c cVar3 = (org.antlr.stringtemplate.c) vector.get(0);
        HashMap hashMap2 = new HashMap();
        Map gN2 = cVar3.gN();
        cVar3.gC();
        a(cVar3, hashMap2, H);
        if (!(cVar3.gD() == "anonymous") || gN2 == null || gN2.size() <= 0) {
            hashMap2.put("it", H);
            hashMap2.put("attr", H);
        }
        hashMap2.put("i", 1);
        hashMap2.put("i0", 0);
        cVar3.b(hashMap2);
        c(cVar3);
        return cVar3;
    }

    private static void a(org.antlr.stringtemplate.c cVar, HashMap hashMap, Object obj) {
        Map gN = cVar.gN();
        if (gN != null) {
            boolean z = cVar.gD() == "anonymous";
            if (gN.size() == 1 || (z && gN.size() > 0)) {
                if (z && gN.size() > 1) {
                    cVar.aT(new StringBuffer("too many arguments on {...} template: ").append(gN).toString());
                }
                hashMap.put((String) gN.keySet().toArray()[0], obj);
            }
        }
    }

    public final Object a(org.antlr.stringtemplate.c cVar, Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return G(b(cVar, obj, obj2));
    }

    private Object b(org.antlr.stringtemplate.c cVar, Object obj, Object obj2) {
        Class<?> cls;
        Class<?> cls2;
        Map gL;
        Class<?> cls3 = obj.getClass();
        Set set = null;
        if (oF == null) {
            cls = f("org.antlr.stringtemplate.c$a");
            oF = cls;
        } else {
            cls = oF;
        }
        if (cls3 == cls) {
            return ((c.a) obj).aX((String) obj2);
        }
        if (oc == null) {
            cls2 = f("org.antlr.stringtemplate.c");
            oc = cls2;
        } else {
            cls2 = oc;
        }
        if (cls3 == cls2 && (gL = ((org.antlr.stringtemplate.c) obj).gL()) != null) {
            return gL.get((String) obj2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (obj2.equals("keys")) {
                set = map.keySet();
            } else if (obj2.equals("values")) {
                set = map.values();
            } else if (map.containsKey(obj2)) {
                set = map.get(obj2);
            } else if (map.containsKey(obj2.toString())) {
                set = map.get(obj2.toString());
            } else if (map.containsKey("_default_")) {
                set = map.get("_default_");
            }
            if (set == ow) {
                set = obj2;
            }
            return set;
        }
        String str = (String) obj2;
        String stringBuffer = new StringBuffer().append(Character.toUpperCase(str.charAt(0))).append(str.substring(1, str.length())).toString();
        Method a = a(cls3, new StringBuffer("get").append(stringBuffer).toString());
        Method method = a;
        if (a == null) {
            method = a(cls3, new StringBuffer("is").append(stringBuffer).toString());
        }
        if (method != null) {
            try {
                set = a(method, obj);
            } catch (Exception e) {
                cVar.b(new StringBuffer("Can't get property ").append(str).append(" using method get/is").append(stringBuffer).append(" from ").append(cls3.getName()).append(" instance").toString(), e);
            }
        } else {
            try {
                try {
                    set = a(cls3.getField(str), obj);
                } catch (IllegalAccessException e2) {
                    cVar.b(new StringBuffer("Can't access property ").append(str).append(" using method get/is").append(stringBuffer).append(" or direct field access from ").append(cls3.getName()).append(" instance").toString(), e2);
                }
            } catch (NoSuchFieldException e3) {
                cVar.b(new StringBuffer("Class ").append(cls3.getName()).append(" has no such attribute: ").append(str).append(" in template context ").append(cVar.gR()).toString(), e3);
            }
        }
        return set;
    }

    private static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    private static Object a(Field field, Object obj) throws IllegalAccessException {
        try {
            field.setAccessible(true);
        } catch (SecurityException unused) {
        }
        return field.get(obj);
    }

    private static Object a(Method method, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            method.setAccessible(true);
        } catch (SecurityException unused) {
        }
        return method.invoke(obj, null);
    }

    private static Method a(Class cls, String str) {
        Method method;
        try {
            method = cls.getMethod(str, null);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        return method;
    }

    public static boolean F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size() > 0;
        } else if (obj instanceof Map) {
            return ((Map) obj).size() > 0;
        } else if (obj instanceof Iterator) {
            return ((Iterator) obj).hasNext();
        } else {
            return true;
        }
    }

    public static Object o(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj;
        }
        return new StringBuffer().append(obj.toString()).append(obj2.toString()).toString();
    }

    public final org.antlr.stringtemplate.c a(org.antlr.stringtemplate.c cVar, String str, o oVar) {
        org.antlr.stringtemplate.c d = cVar.gF().d(cVar, str);
        if (d == null) {
            cVar.aT(new StringBuffer("cannot make embedded instance of ").append(str).append(" in template ").append(cVar.gD()).toString());
            return null;
        }
        d.b(oVar);
        c(d);
        return d;
    }

    public final int a(org.antlr.stringtemplate.c cVar, Object obj, org.antlr.stringtemplate.f fVar) {
        return b(cVar, obj, fVar);
    }

    private int b(org.antlr.stringtemplate.c cVar, Object obj, org.antlr.stringtemplate.f fVar) {
        String obj2;
        int aK;
        Class cls;
        if (obj == null) {
            if (this.oC == null) {
                return -1;
            }
            obj = this.oC;
        }
        try {
            if (!(obj instanceof org.antlr.stringtemplate.c)) {
                Object H = H(obj);
                if (H instanceof Iterator) {
                    int i = 0;
                    Iterator it = (Iterator) H;
                    boolean z = false;
                    while (it.hasNext()) {
                        Object next = it.next();
                        String str = next;
                        if (next == null) {
                            str = this.oC;
                        }
                        if (str != null) {
                            if (this.oD == null) {
                                int b = b(cVar, str, fVar);
                                if (b != -1) {
                                    i += b;
                                }
                            } else {
                                if (str instanceof org.antlr.stringtemplate.c) {
                                    org.antlr.stringtemplate.c cVar2 = (org.antlr.stringtemplate.c) str;
                                    int size = cVar2.gM() != null ? cVar2.gM().size() : 0;
                                    boolean z2 = true;
                                    for (int i2 = 0; i2 < size; i2++) {
                                        if (!(((k) cVar2.gM().get(i2)) instanceof i)) {
                                            z2 = false;
                                        }
                                    }
                                    if (!z2) {
                                        if (z && this.oD != null) {
                                            i += fVar.aL(this.oD);
                                        }
                                        i += b(cVar, str, fVar);
                                        z = true;
                                    }
                                }
                                if (!(str instanceof org.antlr.stringtemplate.c) && !(str instanceof Iterator)) {
                                    if (z && this.oD != null) {
                                        i += fVar.aL(this.oD);
                                    }
                                    z = true;
                                    i += b(cVar, str, fVar);
                                } else if (b(cVar, str, cVar.gF().a(new StringWriter())) != -1) {
                                    if (z && this.oD != null) {
                                        i += fVar.aL(this.oD);
                                    }
                                    i += b(cVar, str, fVar);
                                    z = true;
                                }
                            }
                        }
                    }
                    return i;
                }
                org.antlr.stringtemplate.a e = cVar.e(H.getClass());
                if (e != null) {
                    if (this.oE != null) {
                        String str2 = this.oE;
                        obj2 = e.gs();
                    } else {
                        obj2 = e.gr();
                    }
                } else {
                    obj2 = H.toString();
                }
                if (this.oB != null) {
                    aK = fVar.e(obj2, this.oB);
                } else {
                    aK = fVar.aK(obj2);
                }
                return aK;
            }
            org.antlr.stringtemplate.c cVar3 = (org.antlr.stringtemplate.c) obj;
            cVar3.a(cVar);
            if (org.antlr.stringtemplate.c.gO() && org.antlr.stringtemplate.c.b(cVar3)) {
                throw new IllegalStateException(new StringBuffer("infinite recursion to ").append(cVar3.gQ()).append(" referenced in ").append(cVar3.gz().gQ()).append("; stack trace:\n").append(cVar3.gP()).toString());
            }
            if (this.oB != null) {
                fVar.aM(this.oB);
            }
            if (this.oE != null) {
                if (oG == null) {
                    cls = f("java.lang.String");
                    oG = cls;
                } else {
                    cls = oG;
                }
                org.antlr.stringtemplate.a e2 = cVar.e(cls);
                if (e2 != null) {
                    cVar3.a(cVar.gF().a(new StringWriter()));
                    String str3 = this.oE;
                    return fVar.aK(e2.gs());
                }
            }
            return cVar3.a(fVar);
        } catch (IOException e3) {
            cVar.b(new StringBuffer("problem writing object: ").append(obj).toString(), e3);
            return 0;
        }
    }

    public final String a(org.antlr.stringtemplate.c cVar, antlr.a.a aVar) {
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof o) {
            o oVar = (o) aVar;
            StringWriter stringWriter = new StringWriter();
            try {
                new b(cVar, this, cVar.gF().a(stringWriter)).d(oVar);
            } catch (bh e) {
                cVar.b(new StringBuffer("can't evaluate tree: ").append(this.oz.Z()).toString(), e);
            }
            return stringWriter.toString();
        }
        return aVar.toString();
    }

    private void c(org.antlr.stringtemplate.c cVar) {
        o gC = cVar.gC();
        if (gC == null || gC.T() == null) {
            return;
        }
        org.antlr.stringtemplate.c gz = cVar.gz();
        org.antlr.stringtemplate.c cVar2 = new org.antlr.stringtemplate.c(cVar.gF(), "");
        cVar2.aN(new StringBuffer("<invoke ").append(cVar.gD()).append(" arg context>").toString());
        cVar2.a(gz);
        cVar2.b(cVar.gB());
        try {
            cVar.b(new b(cVar2, this, null).a(gC, cVar, cVar.gB()));
        } catch (bh e) {
            cVar.b(new StringBuffer("can't evaluate tree: ").append(gC.Z()).toString(), e);
        }
    }

    public static Object G(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj.getClass().isArray()) {
            if (obj.getClass().getComponentType().isPrimitive()) {
                return new f(obj);
            }
            return Arrays.asList((Object[]) obj);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object H(Object obj) {
        Iterator it = null;
        if (obj instanceof Collection) {
            it = ((Collection) obj).iterator();
        } else if (obj instanceof Map) {
            it = ((Map) obj).values().iterator();
        } else if (obj instanceof Iterator) {
            it = (Iterator) obj;
        }
        if (it == null) {
            return obj;
        }
        return it;
    }

    public static Object I(Object obj) {
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        Object H = H(obj);
        if (H instanceof Iterator) {
            Iterator it = (Iterator) H;
            if (it.hasNext()) {
                obj2 = it.next();
            }
        }
        return obj2;
    }

    public static Object J(Object obj) {
        if (obj == null) {
            return null;
        }
        Object H = H(obj);
        if (H instanceof Iterator) {
            ArrayList arrayList = new ArrayList();
            Iterator it = (Iterator) H;
            if (!it.hasNext()) {
                return null;
            }
            it.next();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static Object K(Object obj) {
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        Object H = H(obj);
        if (H instanceof Iterator) {
            Iterator it = (Iterator) H;
            while (it.hasNext()) {
                obj2 = it.next();
            }
        }
        return obj2;
    }

    public static Object L(Object obj) {
        if (obj == null) {
            return null;
        }
        Object H = H(obj);
        if (H instanceof Iterator) {
            ArrayList arrayList = new ArrayList();
            Iterator it = (Iterator) H;
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return H;
    }

    public static Object M(Object obj) {
        if (obj == null) {
            return null;
        }
        Object H = H(obj);
        if (H instanceof Iterator) {
            ArrayList arrayList = new ArrayList();
            Iterator it = (Iterator) H;
            while (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static Object N(Object obj) {
        if (obj == null) {
            return 0;
        }
        int i = 1;
        if (obj instanceof Map) {
            i = ((Map) obj).size();
        } else if (obj instanceof Collection) {
            i = ((Collection) obj).size();
        } else if (obj instanceof Object[]) {
            i = ((Object[]) obj).length;
        } else if (obj instanceof int[]) {
            i = ((int[]) obj).length;
        } else if (obj instanceof long[]) {
            i = ((long[]) obj).length;
        } else if (obj instanceof float[]) {
            i = ((float[]) obj).length;
        } else if (obj instanceof double[]) {
            i = ((double[]) obj).length;
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    private Object bd(String str) {
        Object obj = null;
        if (this.oA != null) {
            Object obj2 = this.oA.get(str);
            obj = obj2;
            if (obj2 == "empty expr option") {
                return ox.get(str);
            }
        }
        return obj;
    }

    public String toString() {
        return this.oz.Z();
    }
}