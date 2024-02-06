package org.jf.dexlib2.f.c;

import org.jf.a.i;

/* compiled from: ImmutableReferenceFactory.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/c/e.class */
public final class e {
    public static d a(int i, org.jf.dexlib2.e.c.d dVar) {
        switch (i) {
            case 0:
                return f.a((org.jf.dexlib2.e.c.e) dVar);
            case CAN_THROW:
                return g.a((org.jf.dexlib2.e.c.f) dVar);
            case ODEX_ONLY:
                return a.d((org.jf.dexlib2.e.c.a) dVar);
            case 3:
                return c.d((org.jf.dexlib2.e.c.c) dVar);
            case CAN_CONTINUE:
                return b.b((org.jf.dexlib2.e.c.b) dVar);
            default:
                throw new i("Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}