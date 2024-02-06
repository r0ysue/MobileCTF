package org.jf.dexlib2.d.c;

import org.jf.a.i;
import org.jf.dexlib2.d.g;

/* compiled from: DexBackedReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/c/d.class */
public abstract class d {
    public static org.jf.dexlib2.e.c.d a(g gVar, int i, int i2) {
        switch (i) {
            case 0:
                return new e(gVar, i2);
            case CAN_THROW:
                return new f(gVar, i2);
            case ODEX_ONLY:
                return new a(gVar, i2);
            case 3:
                return new c(gVar, i2);
            case CAN_CONTINUE:
                return new b(gVar, i2);
            default:
                throw new i("Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}