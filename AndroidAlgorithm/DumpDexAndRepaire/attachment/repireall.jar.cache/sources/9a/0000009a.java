package com.a.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: ParameterDescription.java */
/* loaded from: repireall.jar:com/a/a/m.class */
public final class m {
    private Object fi;
    private u fj;
    private l fk;
    private a fl;
    private o fm;
    private ResourceBundle eM;
    private String fo;
    private j fp;
    private Object fq;
    private boolean fn = false;
    private String fr = "";

    public m(Object obj, a aVar, o oVar, ResourceBundle resourceBundle, j jVar) {
        if (!Map.class.isAssignableFrom(oVar.cr())) {
            throw new n("@DynamicParameter " + oVar.cs() + " should be of type Map but is " + oVar.cr().getName());
        }
        this.fl = aVar;
        this.fj = new u(this.fl);
        a(obj, oVar, resourceBundle, jVar);
    }

    public m(Object obj, l lVar, o oVar, ResourceBundle resourceBundle, j jVar) {
        this.fk = lVar;
        this.fj = new u(this.fk);
        a(obj, oVar, resourceBundle, jVar);
    }

    private ResourceBundle c(Object obj) {
        ResourceBundle resourceBundle = null;
        p pVar = (p) obj.getClass().getAnnotation(p.class);
        if (pVar != null && !ao(pVar.cy())) {
            resourceBundle = ResourceBundle.getBundle(pVar.cy(), Locale.getDefault());
        } else {
            r rVar = (r) obj.getClass().getAnnotation(r.class);
            if (rVar != null && !ao(rVar.cD())) {
                resourceBundle = ResourceBundle.getBundle(rVar.cD(), Locale.getDefault());
            }
        }
        return resourceBundle;
    }

    private static boolean ao(String str) {
        return str == null || "".equals(str);
    }

    private void a(String str, String str2, String[] strArr) {
        this.fo = str;
        if (!"".equals(str2) && this.eM != null) {
            this.fo = this.eM.getString(str2);
        }
        for (String str3 : strArr) {
            if (str3.length() > this.fr.length()) {
                this.fr = str3;
            }
        }
    }

    private void a(Object obj, o oVar, ResourceBundle resourceBundle, j jVar) {
        String bF;
        this.fi = obj;
        this.fm = oVar;
        this.eM = resourceBundle;
        if (this.eM == null) {
            this.eM = c(obj);
        }
        this.fp = jVar;
        if (this.fk != null) {
            if (Enum.class.isAssignableFrom(oVar.cr()) && this.fk.bF().isEmpty()) {
                bF = "Options: " + EnumSet.allOf(oVar.cr());
            } else {
                bF = this.fk.bF();
            }
            a(bF, this.fk.bG(), this.fk.bD());
        } else if (this.fl != null) {
            a(this.fl.bF(), this.fl.bG(), this.fl.bD());
        } else {
            throw new AssertionError("Shound never happen");
        }
        try {
            this.fq = oVar.get(obj);
        } catch (Exception unused) {
        }
        if (this.fq != null && this.fk != null) {
            e(this.fk.bD());
        }
    }

    private void e(String[] strArr) {
        b(strArr.length > 0 ? strArr[0] : "", this.fq);
    }

    public final String cf() {
        return this.fr;
    }

    public final Object cg() {
        return this.fq;
    }

    public final String ch() {
        return this.fo;
    }

    public final Object ci() {
        return this.fi;
    }

    public final String cj() {
        StringBuilder sb = new StringBuilder();
        String[] cK = this.fj.cK();
        for (int i = 0; i < cK.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(cK[i]);
        }
        return sb.toString();
    }

    public final u ck() {
        return this.fj;
    }

    public final o cl() {
        return this.fm;
    }

    private boolean cm() {
        Class<?> cr = this.fm.cr();
        return cr.equals(List.class) || cr.equals(Set.class) || this.fm.cx();
    }

    public final void ap(String str) {
        a(str, false);
    }

    public final boolean cn() {
        return this.fn;
    }

    public final void w(boolean z) {
        this.fn = true;
    }

    public final void a(String str, boolean z) {
        al("Adding " + (z ? "default " : "") + "value:" + str + " to parameter:" + this.fm.cs());
        String str2 = this.fj.cK()[0];
        if ((this.fn && !cm() && !this.fp.bV()) || this.fj.cQ()) {
            throw new n("Can only specify option " + str2 + " once.");
        }
        c(str2, str);
        Class<?> cr = this.fm.cr();
        Object a = this.fp.a(this, str);
        b(str2, a);
        if (Collection.class.isAssignableFrom(cr)) {
            Collection<Object> collection = (Collection) this.fm.get(this.fi);
            Collection<Object> collection2 = collection;
            if (collection == null || x(z)) {
                collection2 = d(cr);
                this.fm.a(this.fi, collection2);
            }
            if (a instanceof Collection) {
                collection2.addAll((Collection) a);
            } else {
                collection2.add(a);
            }
        } else {
            this.fj.a(this.fm, this.fi, a);
        }
        if (!z) {
            this.fn = true;
        }
    }

    private void c(String str, String str2) {
        Class<? extends d> cM = this.fj.cM();
        if (cM != null) {
            a(this, cM, str, str2);
        }
    }

    private void b(String str, Object obj) {
        Class<? extends h> cN = this.fj.cN();
        if (cN != null) {
            a(cN, str, obj);
        }
    }

    private static void a(Class<? extends h> cls, String str, Object obj) {
        if (cls != com.a.a.c.b.class) {
            try {
                al("Validating value parameter:" + str + " value:" + obj + " validator:" + cls);
            } catch (IllegalAccessException e) {
                throw new n("Can't instantiate validator:" + e);
            } catch (InstantiationException e2) {
                throw new n("Can't instantiate validator:" + e2);
            }
        }
        cls.newInstance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.a.a.e] */
    public static void a(m mVar, Class<? extends d> cls, String str, String str2) {
        ?? r0 = cls;
        if (r0 != com.a.a.c.a.class) {
            try {
                al("Validating parameter:" + str + " value:" + str2 + " validator:" + cls);
            } catch (n e) {
                throw r0;
            } catch (IllegalAccessException e2) {
                throw new n("Can't instantiate validator:" + e2);
            } catch (InstantiationException e3) {
                throw new n("Can't instantiate validator:" + e3);
            } catch (Exception e4) {
                throw new n(e4);
            }
        }
        cls.newInstance().b(str, str2);
        if (e.class.isAssignableFrom(cls)) {
            r0 = (e) cls.newInstance();
        }
    }

    private static Collection<Object> d(Class<?> cls) {
        if (SortedSet.class.isAssignableFrom(cls)) {
            return new TreeSet();
        }
        if (LinkedHashSet.class.isAssignableFrom(cls)) {
            return new LinkedHashSet();
        }
        if (Set.class.isAssignableFrom(cls)) {
            return new HashSet();
        }
        if (List.class.isAssignableFrom(cls)) {
            return new ArrayList();
        }
        throw new n("Parameters of Collection type '" + cls.getSimpleName() + "' are not supported. Please use List or Set instead.");
    }

    private boolean x(boolean z) {
        return (z || this.fn) ? false : true;
    }

    private static void al(String str) {
        if (System.getProperty("jcommander.debug") != null) {
            j.bM().aB("[ParameterDescription] " + str);
        }
    }

    public final String toString() {
        return "[ParameterDescription " + this.fm.cs() + "]";
    }

    public final boolean co() {
        return this.fl != null;
    }

    public final boolean cp() {
        return this.fj.cP();
    }
}