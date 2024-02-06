package org.jf.dexlib2.a.a.a;

import com.b.a.c.ae;

/* compiled from: ReflectionUtils.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/a/a/a.class */
public final class a {
    private static ae<String, String> ug = ae.eU().i("boolean", "Z").i("int", "I").i("long", "J").i("double", "D").i("void", "V").i("float", "F").i("char", "C").i("short", "S").i("byte", "B").eW();

    public static String bo(String str) {
        if (str.charAt(0) == '[') {
            return str.replace('.', '/');
        }
        if (ug.containsKey(str)) {
            return ug.get(str);
        }
        return "L" + str.replace('.', '/') + ';';
    }
}