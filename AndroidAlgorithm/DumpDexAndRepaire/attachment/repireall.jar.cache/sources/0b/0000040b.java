package org.jf.dexlib2.d.d;

import com.b.a.c.ah;
import com.b.a.c.ao;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: AnnotationsDirectory.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/a.class */
public abstract class a {
    private static AnonymousClass1 yV = new a() { // from class: org.jf.dexlib2.d.d.a.1
        @Override // org.jf.dexlib2.d.d.a
        public final Set<? extends org.jf.dexlib2.d.c> lE() {
            return ao.fl();
        }

        @Override // org.jf.dexlib2.d.d.a
        public final InterfaceC0023a lF() {
            return InterfaceC0023a.yW;
        }

        @Override // org.jf.dexlib2.d.d.a
        public final InterfaceC0023a lG() {
            return InterfaceC0023a.yW;
        }

        @Override // org.jf.dexlib2.d.d.a
        public final InterfaceC0023a lH() {
            return InterfaceC0023a.yW;
        }
    };

    /* compiled from: AnnotationsDirectory.java */
    /* renamed from: org.jf.dexlib2.d.d.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/d/a$a.class */
    public interface InterfaceC0023a {
        public static final AnonymousClass1 yW = new InterfaceC0023a() { // from class: org.jf.dexlib2.d.d.a.a.1
            @Override // org.jf.dexlib2.d.d.a.InterfaceC0023a
            public final int bk(int i) {
                return 0;
            }
        };

        int bk(int i);
    }

    public abstract Set<? extends org.jf.dexlib2.d.c> lE();

    public abstract InterfaceC0023a lF();

    public abstract InterfaceC0023a lG();

    public abstract InterfaceC0023a lH();

    public static a c(org.jf.dexlib2.d.g gVar, int i) {
        if (i == 0) {
            return yV;
        }
        return new b(gVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<? extends org.jf.dexlib2.d.c>, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    public static Set<? extends org.jf.dexlib2.d.c> d(org.jf.dexlib2.d.g gVar, int i) {
        if (i != 0) {
            ?? hashSet = new HashSet();
            try {
                int ax = gVar.ax(i);
                for (int i2 = 0; i2 < ax; i2++) {
                    hashSet = hashSet.add(new org.jf.dexlib2.d.c(gVar, gVar.ax(i + 4 + (4 * i2))));
                }
                return hashSet;
            } catch (Throwable th) {
                hashSet.printStackTrace();
            }
        }
        return ao.fl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    public static List<Set<? extends org.jf.dexlib2.d.c>> e(org.jf.dexlib2.d.g gVar, int i) {
        ?? r0 = i;
        if (r0 > 0) {
            try {
                ArrayList arrayList = new ArrayList();
                int ax = gVar.ax(i);
                for (int i2 = 0; i2 < ax; i2++) {
                    r0 = arrayList.add(d(gVar, gVar.ax(i + 4 + (i2 << 2))));
                }
                return arrayList;
            } catch (Throwable th) {
                r0.printStackTrace();
            }
        }
        return ah.eY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnnotationsDirectory.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/d/a$b.class */
    public static class b extends a {
        public final org.jf.dexlib2.d.g yX;
        private final int yY;

        public b(org.jf.dexlib2.d.g gVar, int i) {
            this.yX = gVar;
            this.yY = i;
        }

        private int lI() {
            return this.yX.ax(this.yY + 4);
        }

        private int lJ() {
            return this.yX.ax(this.yY + 8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        @Override // org.jf.dexlib2.d.d.a
        public final Set<? extends org.jf.dexlib2.d.c> lE() {
            ?? r0 = 0;
            int i = 0;
            try {
                r0 = this.yX.ax(this.yY);
                i = r0;
            } catch (Throwable th) {
                r0.printStackTrace();
            }
            return d(this.yX, i);
        }

        @Override // org.jf.dexlib2.d.d.a
        public final InterfaceC0023a lF() {
            int lI = lI();
            if (lI != 0) {
                return new C0024a(this.yY + 16, lI);
            }
            return InterfaceC0023a.yW;
        }

        @Override // org.jf.dexlib2.d.d.a
        public final InterfaceC0023a lG() {
            int lJ = lJ();
            if (lJ == 0) {
                return InterfaceC0023a.yW;
            }
            return new C0024a(this.yY + 16 + (lI() << 3), lJ);
        }

        @Override // org.jf.dexlib2.d.d.a
        public final InterfaceC0023a lH() {
            int ax = this.yX.ax(this.yY + 12);
            if (ax == 0) {
                return InterfaceC0023a.yW;
            }
            return new C0024a(this.yY + 16 + (lI() << 3) + (lJ() << 3), ax);
        }

        /* compiled from: AnnotationsDirectory.java */
        /* renamed from: org.jf.dexlib2.d.d.a$b$a  reason: collision with other inner class name */
        /* loaded from: repireall.jar:org/jf/dexlib2/d/d/a$b$a.class */
        private class C0024a implements InterfaceC0023a {
            private final int yZ;
            private final int za;
            private int zb = 0;
            private int zc;

            public C0024a(int i, int i2) {
                this.yZ = i;
                this.za = i2;
                this.zc = b.this.yX.ax(i);
            }

            @Override // org.jf.dexlib2.d.d.a.InterfaceC0023a
            public final int bk(int i) {
                while (this.zc < i && this.zb + 1 < this.za) {
                    this.zb++;
                    this.zc = b.this.yX.ax(this.yZ + (this.zb << 3));
                }
                if (this.zc == i) {
                    return b.this.yX.ax(this.yZ + (this.zb << 3) + 4);
                }
                return 0;
            }
        }
    }
}