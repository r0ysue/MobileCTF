package org.jf.a.a;

import com.a.a.j;
import com.a.a.m;
import com.a.a.o;
import com.a.a.p;
import java.lang.reflect.Field;

/* compiled from: ExtendedCommands.java */
/* loaded from: repireall.jar:org/jf/a/a/c.class */
public class c {
    private static /* synthetic */ boolean pL;

    static {
        pL = !c.class.desiredAssertionStatus();
    }

    private static e ao(Object obj) {
        e eVar = (e) obj.getClass().getAnnotation(e.class);
        if (eVar == null) {
            throw new IllegalStateException("All extended commands should have an ExtendedParameters annotation: " + obj.getClass().getCanonicalName());
        }
        return eVar;
    }

    public static String b(j jVar) {
        return ao(jVar.bU().get(0)).nb();
    }

    private static String[] ap(Object obj) {
        return ao(obj).nc();
    }

    public static void a(j jVar, b bVar) {
        jVar.a(ao(bVar).nb(), bVar, ap(bVar));
        bVar.a(bVar.hV());
    }

    public static String[] b(m mVar) {
        o cl = mVar.cl();
        Field field = null;
        for (Class<? super Object> cls = mVar.ci().getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                field = cls.getDeclaredField(cl.cs());
                break;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (pL || field != null) {
            d dVar = (d) field.getAnnotation(d.class);
            if (dVar != null) {
                return dVar.mZ();
            }
            return new String[0];
        }
        throw new AssertionError();
    }

    public static j a(j jVar, String str) {
        if (jVar.bS().containsKey(str)) {
            return jVar.bS().get(str);
        }
        for (j jVar2 : jVar.bS().values()) {
            for (String str2 : ap(jVar2.bU().get(0))) {
                if (str.equals(str2)) {
                    return jVar2;
                }
            }
        }
        return null;
    }

    public static String c(j jVar) {
        p pVar = (p) jVar.bU().get(0).getClass().getAnnotation(p.class);
        if (pVar == null) {
            return null;
        }
        return pVar.cB();
    }
}