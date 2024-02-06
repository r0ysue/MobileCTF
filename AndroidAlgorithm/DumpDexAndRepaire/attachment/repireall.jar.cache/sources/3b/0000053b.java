package org.jf.dexlib2;

import org.jf.a.i;

/* compiled from: ReferenceType.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g.class */
public final class g {
    public static int a(org.jf.dexlib2.e.c.d dVar) {
        if (dVar instanceof org.jf.dexlib2.e.c.e) {
            return 0;
        }
        if (dVar instanceof org.jf.dexlib2.e.c.f) {
            return 1;
        }
        if (dVar instanceof org.jf.dexlib2.e.c.a) {
            return 2;
        }
        if (dVar instanceof org.jf.dexlib2.e.c.c) {
            return 3;
        }
        if (dVar instanceof org.jf.dexlib2.e.c.b) {
            return 4;
        }
        throw new IllegalStateException("Invalid reference");
    }

    public static void aj(int i) {
        if (i < 0 || i > 4) {
            throw new a(i);
        }
    }

    /* compiled from: ReferenceType.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g$a.class */
    public static class a extends i {
        private final int rJ;

        public a(int i) {
            super("Invalid reference type: %d", Integer.valueOf(i));
            this.rJ = i;
        }

        public final int ib() {
            return this.rJ;
        }
    }
}