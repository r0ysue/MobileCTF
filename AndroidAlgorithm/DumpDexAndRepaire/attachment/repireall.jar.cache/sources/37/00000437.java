package org.jf.dexlib2.d;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.AbstractList;
import java.util.List;
import java.util.Set;

/* compiled from: DexBackedDexFile.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/g.class */
public class g extends org.jf.dexlib2.d.a implements org.jf.dexlib2.e.d {
    private final org.jf.dexlib2.f ww;
    private final int wx;
    private final int wy;
    private final int wz;
    private final int wA;
    private final int wB;
    private final int wC;
    private final int wD;
    private final int wE;
    private final int wF;
    private final int wG;
    private final int wH;
    private final int wI;

    private g(org.jf.dexlib2.f fVar, byte[] bArr, int i, boolean z) {
        super(bArr, i);
        this.ww = fVar;
        if (z) {
            org.jf.dexlib2.h.b.c(bArr, i);
        }
        this.wx = ax(56);
        this.wy = ax(60);
        this.wz = ax(64);
        this.wA = ax(68);
        this.wB = ax(72);
        this.wC = ax(76);
        this.wD = ax(80);
        this.wE = ax(84);
        this.wF = ax(88);
        this.wG = ax(92);
        this.wH = ax(96);
        this.wI = ax(100);
    }

    public g(org.jf.dexlib2.f fVar, org.jf.dexlib2.d.a aVar) {
        this(fVar, aVar.rw, aVar.vz);
    }

    public g(org.jf.dexlib2.f fVar, byte[] bArr, int i) {
        this(fVar, bArr, i, false);
    }

    public g(org.jf.dexlib2.f fVar, byte[] bArr) {
        this(fVar, bArr, 0, true);
    }

    public static g a(org.jf.dexlib2.f fVar, BufferedInputStream bufferedInputStream) throws IOException {
        org.jf.dexlib2.h.b.c(bufferedInputStream);
        return new g(fVar, com.b.a.d.a.a(bufferedInputStream), 0, false);
    }

    @Override // org.jf.dexlib2.e.d
    public final org.jf.dexlib2.f kx() {
        return this.ww;
    }

    public boolean ky() {
        return false;
    }

    @Override // org.jf.dexlib2.e.d
    public final Set<? extends f> kz() {
        return new org.jf.dexlib2.d.d.d<f>() { // from class: org.jf.dexlib2.d.g.1
            @Override // org.jf.dexlib2.d.d.d
            public final /* synthetic */ f aZ(int i) {
                return new f(g.this, g.this.aT(i));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return g.this.wH;
            }
        };
    }

    private int aO(int i) {
        if (i < 0 || i >= this.wx) {
            throw new a(i, "String index out of bounds: %d", Integer.valueOf(i));
        }
        return this.wy + (i << 2);
    }

    private int aP(int i) {
        if (i < 0 || i >= this.wz) {
            throw new a(i, "Type index out of bounds: %d", Integer.valueOf(i));
        }
        return this.wA + (i << 2);
    }

    public final int aQ(int i) {
        if (i < 0 || i >= this.wD) {
            throw new a(i, "Field index out of bounds: %d", Integer.valueOf(i));
        }
        return this.wE + (i << 3);
    }

    public final int aR(int i) {
        if (i < 0 || i >= this.wF) {
            throw new a(i, "Method index out of bounds: %d", Integer.valueOf(i));
        }
        return this.wG + (i << 3);
    }

    public final int aS(int i) {
        if (i < 0 || i >= this.wB) {
            throw new a(i, "Proto index out of bounds: %d", Integer.valueOf(i));
        }
        return this.wC + (i * 12);
    }

    public final int aT(int i) {
        if (i < 0 || i >= this.wH) {
            throw new a(i, "Class index out of bounds: %d", Integer.valueOf(i));
        }
        return this.wI + (i << 5);
    }

    public final int kA() {
        return this.wx;
    }

    public final int kB() {
        return this.wz;
    }

    public final int kC() {
        return this.wD;
    }

    public final int kD() {
        return this.wF;
    }

    public final String aU(int i) {
        o aY = aY(ax(aO(i)));
        return aY.aN(aY.kf());
    }

    public final String aV(int i) {
        if (i == -1) {
            return null;
        }
        return aU(i);
    }

    public final String aW(int i) {
        return aU(ax(aP(i)));
    }

    public final String aX(int i) {
        if (i == -1) {
            return null;
        }
        return aW(i);
    }

    public final List<org.jf.dexlib2.d.c.e> kE() {
        return new AbstractList<org.jf.dexlib2.d.c.e>() { // from class: org.jf.dexlib2.d.g.2
            @Override // java.util.AbstractList, java.util.List
            public final /* synthetic */ Object get(int i) {
                if (i < 0 || i >= g.this.kA()) {
                    throw new IndexOutOfBoundsException();
                }
                return new org.jf.dexlib2.d.c.e(g.this, i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return g.this.kA();
            }
        };
    }

    public final List<org.jf.dexlib2.d.c.f> kF() {
        return new AbstractList<org.jf.dexlib2.d.c.f>() { // from class: org.jf.dexlib2.d.g.3
            @Override // java.util.AbstractList, java.util.List
            public final /* synthetic */ Object get(int i) {
                if (i < 0 || i >= g.this.kB()) {
                    throw new IndexOutOfBoundsException();
                }
                return new org.jf.dexlib2.d.c.f(g.this, i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return g.this.kB();
            }
        };
    }

    public final List<org.jf.dexlib2.d.c.c> kG() {
        return new AbstractList<org.jf.dexlib2.d.c.c>() { // from class: org.jf.dexlib2.d.g.4
            @Override // java.util.AbstractList, java.util.List
            public final /* synthetic */ Object get(int i) {
                if (i < 0 || i >= g.this.kD()) {
                    throw new IndexOutOfBoundsException();
                }
                return new org.jf.dexlib2.d.c.c(g.this, i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return g.this.kD();
            }
        };
    }

    public final List<org.jf.dexlib2.d.c.a> kH() {
        return new AbstractList<org.jf.dexlib2.d.c.a>() { // from class: org.jf.dexlib2.d.g.5
            @Override // java.util.AbstractList, java.util.List
            public final /* synthetic */ Object get(int i) {
                if (i < 0 || i >= g.this.kC()) {
                    throw new IndexOutOfBoundsException();
                }
                return new org.jf.dexlib2.d.c.a(g.this, i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return g.this.kC();
            }
        };
    }

    public final o aY(int i) {
        return new o(this, i);
    }

    /* compiled from: DexBackedDexFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/g$b.class */
    public static class b extends RuntimeException {
        public b() {
        }

        public b(String str) {
            super(str);
        }
    }

    /* compiled from: DexBackedDexFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/g$a.class */
    public static class a extends org.jf.a.i {
        private final int wK;

        public a(int i, String str, Object... objArr) {
            super(str, objArr);
            this.wK = i;
        }

        public final int kI() {
            return this.wK;
        }
    }
}