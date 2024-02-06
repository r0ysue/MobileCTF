package org.antlr.stringtemplate.misc;

import java.util.HashMap;
import org.antlr.stringtemplate.a.k;

/* compiled from: JTreeStringTemplateModel.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/misc/a.class */
public final class a {
    private static HashMap pg;
    private d ph;
    private static Class pi;
    private static Class pj;
    private static Class pk;
    private static Class pl;

    /* compiled from: JTreeStringTemplateModel.java */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/misc/a$c.class */
    static class c extends e {
    }

    static {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        HashMap hashMap = new HashMap();
        pg = hashMap;
        if (pi == null) {
            cls = f("org.antlr.stringtemplate.misc.a$d");
            pi = cls;
        } else {
            cls = pi;
        }
        hashMap.put("org.antlr.stringtemplate.c", cls);
        HashMap hashMap2 = pg;
        if (pj == null) {
            cls2 = f("org.antlr.stringtemplate.misc.a$a");
            pj = cls2;
        } else {
            cls2 = pj;
        }
        hashMap2.put("org.antlr.stringtemplate.a.a", cls2);
        HashMap hashMap3 = pg;
        if (pk == null) {
            cls3 = f("org.antlr.stringtemplate.misc.a$b");
            pk = cls3;
        } else {
            cls3 = pk;
        }
        hashMap3.put("java.util.Hashtable", cls3);
        HashMap hashMap4 = pg;
        if (pl == null) {
            cls4 = f("org.antlr.stringtemplate.misc.a$c");
            pl = cls4;
        } else {
            cls4 = pl;
        }
        hashMap4.put("java.util.ArrayList", cls4);
        HashMap hashMap5 = pg;
        if (pl == null) {
            cls5 = f("org.antlr.stringtemplate.misc.a$c");
            pl = cls5;
        } else {
            cls5 = pl;
        }
        hashMap5.put("java.util.Vector", cls5);
    }

    private static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    /* compiled from: JTreeStringTemplateModel.java */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/misc/a$e.class */
    static abstract class e {
        e() {
        }
    }

    /* compiled from: JTreeStringTemplateModel.java */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/misc/a$d.class */
    static class d extends e {
        private org.antlr.stringtemplate.c oZ;

        public d(org.antlr.stringtemplate.c cVar) {
            this.oZ = null;
            this.oZ = cVar;
        }

        public String toString() {
            if (this.oZ == null) {
                return "<invalid template>";
            }
            return this.oZ.gD();
        }
    }

    /* compiled from: JTreeStringTemplateModel.java */
    /* renamed from: org.antlr.stringtemplate.misc.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/misc/a$a.class */
    static class C0011a extends e {
        private k pm;

        public String toString() {
            k kVar = this.pm;
            k kVar2 = this.pm;
            return "<invalid node type>";
        }
    }

    /* compiled from: JTreeStringTemplateModel.java */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/misc/a$b.class */
    static class b extends e {
        public String toString() {
            return "attributes";
        }
    }

    public a(org.antlr.stringtemplate.c cVar) {
        this.ph = null;
        if (cVar == null) {
            throw new IllegalArgumentException("root is null");
        }
        this.ph = new d(cVar);
    }
}