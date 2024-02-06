package org.jf.dexlib2.d;

import com.b.a.c.ah;
import com.b.a.c.av;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jf.dexlib2.c;
import org.jf.dexlib2.e.j;

/* compiled from: OatFile.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/p.class */
public class p extends org.jf.dexlib2.d.a implements org.jf.dexlib2.e.j<e> {
    private static final byte[] xA = {Byte.MAX_VALUE, 69, 76, 70};
    private static final byte[] xB = {111, 97, 116, 10};
    private final boolean xC;
    private final f xD;
    private final org.jf.dexlib2.f xE;
    private final l xF;

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$d.class */
    public static class d extends RuntimeException {
    }

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$l.class */
    public interface l {
        byte[] hX();
    }

    @Override // org.jf.dexlib2.e.j
    public final /* synthetic */ e bg(String str) throws IOException {
        b bVar = new b(this, (byte) 0);
        while (bVar.hasNext()) {
            a next = bVar.next();
            if (next.xL.equals(str)) {
                return next.kZ();
            }
        }
        return null;
    }

    private p(byte[] bArr, l lVar) {
        super(bArr);
        if (bArr.length < 52) {
            throw new d();
        }
        a(bArr);
        if (bArr[4] == 1) {
            this.xC = false;
        } else if (bArr[4] == 2) {
            this.xC = true;
        } else {
            throw new c(String.format("Invalid word-size value: %x", Byte.valueOf(bArr[5])));
        }
        f fVar = null;
        for (g gVar : kX()) {
            if (gVar.li() == 11) {
                final k kVar = new k(gVar);
                Iterator<k.a> it = new AbstractList<k.a>() { // from class: org.jf.dexlib2.d.p.k.1
                    @Override // java.util.AbstractList, java.util.List
                    public final /* synthetic */ Object get(int i2) {
                        if (i2 >= 0 && i2 < k.this.xT) {
                            if (p.this.xC) {
                                return new c(k.this.xS + (i2 * k.this.xU));
                            }
                            return new b(k.this.xS + (i2 * k.this.xU));
                        }
                        throw new IndexOutOfBoundsException();
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return k.this.xT;
                    }
                }.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    k.a next = it.next();
                    if (next.bf().equals("oatdata")) {
                        fVar = new f(next.lp());
                        break;
                    }
                }
                if (fVar == null) {
                    throw new c("Oat file has no oatdata symbol");
                }
                this.xD = fVar;
                if (!fVar.ld()) {
                    throw new c("Invalid oat magic value");
                }
                this.xE = org.jf.dexlib2.f.ah(fVar.le());
                this.xF = lVar;
                return;
            }
        }
        throw new c("Oat file has no symbol table");
    }

    private static void a(byte[] bArr) {
        for (int i2 = 0; i2 < xA.length; i2++) {
            if (bArr[i2] != xA[i2]) {
                throw new d();
            }
        }
    }

    public static p a(BufferedInputStream bufferedInputStream) throws IOException {
        return a(bufferedInputStream, null);
    }

    public static p a(InputStream inputStream, c.C0018c c0018c) throws IOException {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(4);
        byte[] bArr = new byte[4];
        try {
            try {
                com.b.a.d.a.a(inputStream, bArr);
                inputStream.reset();
                a(bArr);
                inputStream.reset();
                return new p(com.b.a.d.a.a(inputStream), c0018c);
            } catch (EOFException unused) {
                throw new d();
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    public final int kT() {
        return this.xD.le();
    }

    public final int kU() {
        int le = this.xD.le();
        if (le < 56) {
            return 0;
        }
        if (le <= 86) {
            return 1;
        }
        return 2;
    }

    public final List<String> kV() {
        if (this.xD.le() < 75) {
            return ah.eY();
        }
        String bp = this.xD.bp("bootclasspath");
        if (bp == null) {
            return ah.eY();
        }
        return Arrays.asList(bp.split(":"));
    }

    public final List<e> kW() {
        return new org.jf.a.a<e>() { // from class: org.jf.dexlib2.d.p.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return p.this.xD.lf();
            }

            @Override // org.jf.a.a, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final Iterator<e> iterator() {
                return av.a((Iterator) new b(p.this, (byte) 0), (com.b.a.a.d) new com.b.a.a.d<a, e>() { // from class: org.jf.dexlib2.d.p.1.1
                    @Override // com.b.a.a.d
                    public final /* synthetic */ e apply(a aVar) {
                        return aVar.kZ();
                    }
                });
            }
        };
    }

    @Override // org.jf.dexlib2.e.j
    public final List<String> hY() throws IOException {
        return new org.jf.a.a<String>() { // from class: org.jf.dexlib2.d.p.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return p.this.xD.lf();
            }

            @Override // org.jf.a.a, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final Iterator<String> iterator() {
                return av.a((Iterator) new b(p.this, (byte) 0), (com.b.a.a.d) new com.b.a.a.d<a, String>() { // from class: org.jf.dexlib2.d.p.2.1
                    @Override // com.b.a.a.d
                    public final /* bridge */ /* synthetic */ String apply(a aVar) {
                        return aVar.xL;
                    }
                });
            }
        };
    }

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$e.class */
    public class e extends org.jf.dexlib2.d.g implements j.a {
        private String bJ;

        @Override // org.jf.dexlib2.e.j.a
        public final /* bridge */ /* synthetic */ org.jf.dexlib2.e.j lc() {
            return p.this;
        }

        public e(byte[] bArr, int i, String str) {
            super(p.this.xE, bArr, i);
            this.bJ = str;
        }

        public final p lb() {
            return p.this;
        }

        @Override // org.jf.dexlib2.d.g
        public final boolean ky() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$f.class */
    public class f {
        private final int xN;

        public f(int i) {
            this.xN = i;
        }

        public final boolean ld() {
            for (int i = 0; i < p.xB.length; i++) {
                if (p.this.rw[this.xN + i] != p.xB[i]) {
                    return false;
                }
            }
            for (int i2 = 4; i2 < 7; i2++) {
                if (p.this.rw[this.xN + i2] < 48 || p.this.rw[this.xN + i2] > 57) {
                    return false;
                }
            }
            return p.this.rw[this.xN + 7] == 0;
        }

        public final int le() {
            return Integer.valueOf(new String(p.this.rw, this.xN + 4, 3)).intValue();
        }

        public final int lf() {
            return p.this.ax(this.xN + 20);
        }

        private int lg() {
            if (le() < 56) {
                throw new IllegalStateException("Unsupported oat version");
            }
            return p.this.ax(this.xN + 68);
        }

        public final String bp(String str) {
            int lg = lg();
            int i = this.xN + 72;
            int i2 = i;
            int i3 = i + lg;
            while (i2 < i3) {
                int i4 = i2;
                while (i2 < i3 && p.this.rw[i2] != 0) {
                    i2++;
                }
                if (i2 >= i3) {
                    throw new c("Oat file contains truncated key value store");
                }
                if (new String(p.this.rw, i4, i2 - i4).equals(str)) {
                    int i5 = i2 + 1;
                    while (i5 < i3 && p.this.rw[i5] != 0) {
                        i5++;
                    }
                    if (i5 >= i3) {
                        throw new c("Oat file contains truncated key value store");
                    }
                    return new String(p.this.rw, i5, i5 - i5);
                }
                i2++;
            }
            return null;
        }

        public final int lh() {
            int i = this.xN;
            if (le() >= 56) {
                return i + 72 + lg();
            }
            throw new IllegalStateException("Unsupported oat version");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<g> kX() {
        int ax;
        int az;
        int az2;
        if (this.xC) {
            ax = aC(40);
            az = az(58);
            az2 = az(60);
        } else {
            ax = ax(32);
            az = az(46);
            az2 = az(48);
        }
        if (ax + (az * az2) > this.rw.length) {
            throw new c("The ELF section headers extend past the end of the file");
        }
        final int i2 = az2;
        final int i3 = ax;
        final int i4 = az;
        return new AbstractList<g>() { // from class: org.jf.dexlib2.d.p.3
            @Override // java.util.AbstractList, java.util.List
            public final /* synthetic */ Object get(int i5) {
                if (i5 >= 0 && i5 < i2) {
                    if (p.this.xC) {
                        return new i(i3 + (i5 * i4));
                    }
                    return new h(i3 + (i5 * i4));
                }
                throw new IndexOutOfBoundsException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return i2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$g.class */
    public abstract class g {
        protected final int xO;

        public abstract long lj();

        public abstract int kb();

        public abstract int lk();

        public abstract int ll();

        public abstract int lm();

        public g(int i) {
            this.xO = i;
        }

        public final int li() {
            return p.this.aD(this.xO + 4);
        }
    }

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$h.class */
    private class h extends g {
        public h(int i) {
            super(i);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final long lj() {
            return p.this.aD(this.xO + 12) & 4294967295L;
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int kb() {
            return p.this.ax(this.xO + 16);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int lk() {
            return p.this.ax(this.xO + 20);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int ll() {
            return p.this.ax(this.xO + 24);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int lm() {
            return p.this.ax(this.xO + 36);
        }
    }

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$i.class */
    private class i extends g {
        public i(int i) {
            super(i);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final long lj() {
            return p.this.aB(this.xO + 16);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int kb() {
            return p.this.aC(this.xO + 24);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int lk() {
            return p.this.aC(this.xO + 32);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int ll() {
            return p.this.ax(this.xO + 40);
        }

        @Override // org.jf.dexlib2.d.p.g
        public final int lm() {
            return p.this.aC(this.xO + 56);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$k.class */
    public class k {
        private final j xR;
        private final int xS;
        private final int xT;
        private final int xU;

        public k(g gVar) {
            try {
                this.xR = new j((g) p.this.kX().get(gVar.ll()));
                this.xS = gVar.kb();
                this.xU = gVar.lm();
                this.xT = gVar.lk() / this.xU;
                if (this.xS + (this.xT * this.xU) > p.this.rw.length) {
                    throw new c("Symbol table extends past end of file");
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new c("String table section index is invalid");
            }
        }

        /* compiled from: OatFile.java */
        /* loaded from: repireall.jar:org/jf/dexlib2/d/p$k$a.class */
        public abstract class a {
            protected final int xX;
            private static /* synthetic */ boolean pL;

            public abstract String bf();

            public abstract long ln();

            public abstract int lo();

            static {
                pL = !p.class.desiredAssertionStatus();
            }

            public a(int i) {
                this.xX = i;
            }

            public final int lp() {
                try {
                    g gVar = (g) p.this.kX().get(lo());
                    long lj = gVar.lj();
                    int kb = gVar.kb();
                    int lk = gVar.lk();
                    long ln = ln();
                    if (ln < lj || ln >= lj + lk) {
                        throw new c("symbol address lies outside it's associated section");
                    }
                    long ln2 = kb + (ln() - lj);
                    if (pL || ln2 <= 2147483647L) {
                        return (int) ln2;
                    }
                    throw new AssertionError();
                } catch (IndexOutOfBoundsException unused) {
                    throw new c("Section index for symbol is out of bounds");
                }
            }
        }

        /* compiled from: OatFile.java */
        /* loaded from: repireall.jar:org/jf/dexlib2/d/p$k$b.class */
        public class b extends a {
            public b(int i) {
                super(i);
            }

            @Override // org.jf.dexlib2.d.p.k.a
            public final String bf() {
                return k.this.xR.ba(p.this.ax(this.xX));
            }

            @Override // org.jf.dexlib2.d.p.k.a
            public final long ln() {
                return p.this.ax(this.xX + 4);
            }

            @Override // org.jf.dexlib2.d.p.k.a
            public final int lo() {
                return p.this.az(this.xX + 14);
            }
        }

        /* compiled from: OatFile.java */
        /* loaded from: repireall.jar:org/jf/dexlib2/d/p$k$c.class */
        public class c extends a {
            public c(int i) {
                super(i);
            }

            @Override // org.jf.dexlib2.d.p.k.a
            public final String bf() {
                return k.this.xR.ba(p.this.ax(this.xX));
            }

            @Override // org.jf.dexlib2.d.p.k.a
            public final long ln() {
                return p.this.aB(this.xX + 8);
            }

            @Override // org.jf.dexlib2.d.p.k.a
            public final int lo() {
                return p.this.az(this.xX + 6);
            }
        }
    }

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$j.class */
    private class j {
        private final int xP;
        private final int xQ;

        public j(g gVar) {
            this.xP = gVar.kb();
            this.xQ = gVar.lk();
            if (this.xP + this.xQ > p.this.rw.length) {
                throw new c("String table extends past end of file");
            }
        }

        public final String ba(int i) {
            if (i >= this.xQ) {
                throw new c("String index is out of bounds");
            }
            int i2 = this.xP + i;
            int i3 = i2;
            while (p.this.rw[i3] != 0) {
                i3++;
                if (i3 >= this.xP + this.xQ) {
                    throw new c("String extends past end of string table");
                }
            }
            return new String(p.this.rw, i2, i3 - i2, Charset.forName("US-ASCII"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$a.class */
    public class a {
        public final String xL;
        private byte[] rw;
        private int xM;

        public a(String str, byte[] bArr, int i) {
            this.xL = str;
            this.rw = bArr;
            this.xM = i;
        }

        public final e kZ() {
            return new e(this.rw, this.xM, this.xL);
        }
    }

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$b.class */
    private class b implements Iterator<a> {
        private int ux;
        private int an;

        private b() {
            this.ux = 0;
            this.an = p.this.xD.lh();
        }

        /* synthetic */ b(p pVar, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.ux < p.this.xD.lf();
        }

        @Override // java.util.Iterator
        /* renamed from: la */
        public final a next() {
            byte[] bArr;
            int ax = p.this.ax(this.an);
            this.an += 4;
            String str = new String(p.this.rw, this.an, ax, Charset.forName("US-ASCII"));
            this.an += ax;
            this.an += 4;
            int ax2 = p.this.ax(this.an);
            this.an += 4;
            if (p.this.kT() >= 87 && p.this.xF != null && p.this.xF.hX() != null) {
                bArr = p.this.xF.hX();
            } else {
                bArr = p.this.rw;
                ax2 += p.this.xD.xN;
            }
            if (p.this.kT() >= 75) {
                this.an += 4;
            }
            if (p.this.kT() >= 73) {
                this.an += 4;
            }
            if (p.this.kT() < 75) {
                this.an += 4 * p.this.ax(ax2 + 96);
            }
            this.ux++;
            return new a(str, bArr, ax2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: OatFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/p$c.class */
    public static class c extends RuntimeException {
        public c(String str) {
            super(str);
        }
    }
}