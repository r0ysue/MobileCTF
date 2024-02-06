package org.jf.dexlib2.d.d;

import org.jf.dexlib2.d.o;

/* compiled from: StaticInitialValueIterator.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/f.class */
public abstract class f {
    private static AnonymousClass1 zn = new f() { // from class: org.jf.dexlib2.d.d.f.1
        @Override // org.jf.dexlib2.d.d.f
        public final org.jf.dexlib2.e.d.g lK() {
            return null;
        }

        @Override // org.jf.dexlib2.d.d.f
        public final int lL() {
            return 0;
        }
    };

    public abstract org.jf.dexlib2.e.d.g lK();

    public abstract int lL();

    public static f f(org.jf.dexlib2.d.g gVar, int i) {
        if (i == 0) {
            return zn;
        }
        return new a(gVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StaticInitialValueIterator.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/d/f$a.class */
    public static class a extends f {
        private final o zo;
        private final int zp;
        private int ux = 0;

        public a(org.jf.dexlib2.d.g gVar, int i) {
            this.zo = gVar.aY(i);
            this.zp = this.zo.kf();
        }

        @Override // org.jf.dexlib2.d.d.f
        public final org.jf.dexlib2.e.d.g lK() {
            if (this.ux < this.zp) {
                this.ux++;
                return org.jf.dexlib2.d.e.c.f(this.zo);
            }
            return null;
        }

        @Override // org.jf.dexlib2.d.d.f
        public final int lL() {
            return this.zo.kd();
        }
    }
}