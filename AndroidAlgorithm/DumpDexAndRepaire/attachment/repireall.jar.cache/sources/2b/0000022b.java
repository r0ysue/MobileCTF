package com.b.a.d;

import com.b.a.a.i;
import com.b.a.c.ce;
import java.io.File;

/* compiled from: Files.java */
/* loaded from: repireall.jar:com/b/a/d/b.class */
public final class b {
    public static String aH(String str) {
        i.i(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    static {
        new ce<File>() { // from class: com.b.a.d.b.1
            public final String toString() {
                return "Files.fileTreeTraverser()";
            }
        };
    }
}