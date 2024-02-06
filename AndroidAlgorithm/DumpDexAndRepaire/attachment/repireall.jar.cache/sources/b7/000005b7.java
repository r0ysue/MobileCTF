package org.jf.dexlib2.i.c;

import com.b.a.c.ax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jf.a.i;
import org.jf.dexlib2.e.e;
import org.jf.dexlib2.e.k;

/* compiled from: TryListBuilder.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/c/a.class */
public final class a<EH extends e> {
    private final b<EH> Fa = new b<>(0, 0);
    private final b<EH> Fb = new b<>(0, 0);

    public a() {
        this.Fa.Fc = this.Fb;
        this.Fb.Fe = this.Fa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <EH extends e> List<k<EH>> h(List<? extends k<? extends EH>> list) {
        a aVar = new a();
        for (k<? extends EH> kVar : list) {
            int jl = kVar.jl();
            int jm = jl + kVar.jm();
            Iterator<? extends Object> it = kVar.jn().iterator();
            while (it.hasNext()) {
                aVar.a(jl, jm, (e) it.next());
            }
        }
        return aVar.jw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TryListBuilder.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/i/c/a$c.class */
    public static class c<EH extends e> {
        public final b<EH> Fh;
        public final b<EH> Fi;

        public c(b<EH> bVar, b<EH> bVar2) {
            this.Fh = bVar;
            this.Fi = bVar2;
        }
    }

    /* compiled from: TryListBuilder.java */
    /* renamed from: org.jf.dexlib2.i.c.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/jf/dexlib2/i/c/a$a.class */
    public static class C0034a extends i {
        public C0034a(String str, Object... objArr) {
            super(str, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TryListBuilder.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/i/c/a$b.class */
    public static class b<EH extends e> extends org.jf.dexlib2.b.e<EH> {
        public b<EH> Fe;
        public b<EH> Fc;
        public int Al;
        public int Ff;
        private List<EH> Fg;

        public b(int i, int i2) {
            this.Fe = null;
            this.Fc = null;
            this.Fg = new ArrayList();
            this.Al = i;
            this.Ff = i2;
        }

        private b(int i, int i2, List<EH> list) {
            this.Fe = null;
            this.Fc = null;
            this.Fg = new ArrayList();
            this.Al = i;
            this.Ff = i2;
            this.Fg = ax.j(list);
        }

        @Override // org.jf.dexlib2.e.k
        public final int jl() {
            return this.Al;
        }

        @Override // org.jf.dexlib2.e.k
        public final int jm() {
            return this.Ff - this.Al;
        }

        @Override // org.jf.dexlib2.e.k
        public final List<EH> jn() {
            return this.Fg;
        }

        public final b<EH> bN(int i) {
            b<EH> bVar = new b<>(i, this.Ff, this.Fg);
            this.Ff = i;
            a(bVar);
            return bVar;
        }

        private void mP() {
            this.Fc.Fe = this.Fe;
            this.Fe.Fc = this.Fc;
        }

        public final void mQ() {
            this.Ff = this.Fc.Ff;
            this.Fc.mP();
        }

        private void a(b<EH> bVar) {
            this.Fc.Fe = bVar;
            bVar.Fc = this.Fc;
            bVar.Fe = this;
            this.Fc = bVar;
        }

        public final void b(b<EH> bVar) {
            this.Fe.Fc = bVar;
            bVar.Fe = this.Fe;
            bVar.Fc = this;
            this.Fe = bVar;
        }

        public final void d(EH eh) {
            for (EH eh2 : this.Fg) {
                String jd = eh2.jd();
                String jd2 = eh.jd();
                if (jd == null) {
                    if (jd2 == null) {
                        if (eh2.je() != eh.je()) {
                            throw new C0034a("Multiple overlapping catch all handlers with different handlers", new Object[0]);
                        }
                        return;
                    }
                } else if (jd.equals(jd2)) {
                    return;
                }
            }
            this.Fg.add(eh);
        }
    }

    private c<EH> q(int i, int i2) {
        b<EH> bVar = null;
        b<EH> bVar2 = this.Fa.Fc;
        while (true) {
            b<EH> bVar3 = bVar2;
            if (bVar3 == this.Fb) {
                break;
            }
            int i3 = bVar3.Al;
            int i4 = bVar3.Ff;
            if (i == i3) {
                bVar = bVar3;
                break;
            } else if (i > i3 && i < i4) {
                bVar = bVar3.bN(i);
                break;
            } else if (i < i3) {
                if (i2 <= i3) {
                    b<EH> bVar4 = new b<>(i, i2);
                    bVar3.b(bVar4);
                    return new c<>(bVar4, bVar4);
                }
                bVar = new b<>(i, i3);
                bVar3.b(bVar);
            } else {
                bVar2 = bVar3.Fc;
            }
        }
        if (bVar == null) {
            b<EH> bVar5 = new b<>(i, i2);
            this.Fb.b(bVar5);
            return new c<>(bVar5, bVar5);
        }
        b<EH> bVar6 = bVar;
        while (true) {
            b<EH> bVar7 = bVar6;
            if (bVar7 != this.Fb) {
                int i5 = bVar7.Al;
                int i6 = bVar7.Ff;
                if (i2 == i6) {
                    return new c<>(bVar, bVar7);
                }
                if (i2 > i5 && i2 < i6) {
                    bVar7.bN(i2);
                    return new c<>(bVar, bVar7);
                } else if (i2 <= i5) {
                    b<EH> bVar8 = new b<>(bVar7.Fe.Ff, i2);
                    bVar7.b(bVar8);
                    return new c<>(bVar, bVar8);
                } else {
                    bVar6 = bVar7.Fc;
                }
            } else {
                b<EH> bVar9 = new b<>(this.Fb.Fe.Ff, i2);
                this.Fb.b(bVar9);
                return new c<>(bVar, bVar9);
            }
        }
    }

    private void a(int i, int i2, EH eh) {
        b<EH> bVar;
        c<EH> q = q(i, i2);
        b<EH> bVar2 = q.Fh;
        b<EH> bVar3 = q.Fi;
        int i3 = i;
        b<EH> bVar4 = bVar2;
        do {
            if (bVar4.Al > i3) {
                b<EH> bVar5 = new b<>(i3, bVar4.Al);
                bVar4.b(bVar5);
                bVar4 = bVar5;
            }
            bVar4.d(eh);
            i3 = bVar4.Ff;
            bVar = bVar4.Fc;
            bVar4 = bVar;
        } while (bVar.Fe != bVar3);
    }

    private List<k<EH>> jw() {
        return ax.o(new Iterator<k<EH>>() { // from class: org.jf.dexlib2.i.c.a.1
            private b<EH> Fc;

            {
                this.Fc = a.this.Fa;
                this.Fc = mO();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<EH> bVar = this.Fc;
                this.Fc = mO();
                return bVar;
            }

            private b<EH> mO() {
                b<EH> bVar = this.Fc.Fc;
                if (bVar != a.this.Fb) {
                    while (bVar.Fc != a.this.Fb && bVar.Ff == bVar.Fc.Al && bVar.jn().equals(bVar.Fc.jn())) {
                        bVar.mQ();
                    }
                    return bVar;
                }
                return null;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.Fc != null;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        });
    }
}