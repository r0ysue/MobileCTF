package org.jf.dexlib2;

import org.jf.a.i;

/* compiled from: AnnotationVisibility.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b.class */
public final class b {
    private static String[] rs = {"build", "runtime", "system"};

    public static String af(int i) {
        if (i < 0 || i >= rs.length) {
            throw new i("Invalid annotation visibility %d", Integer.valueOf(i));
        }
        return rs[i];
    }
}