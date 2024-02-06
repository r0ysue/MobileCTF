package org.jf.dexlib2.g;

import com.b.a.c.av;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: ClassDefRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/c.class */
public final class c implements o<org.jf.dexlib2.e.c> {
    protected final r Bm;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.c E(org.jf.dexlib2.e.c cVar) {
        return new a(cVar);
    }

    public c(r rVar) {
        this.Bm = rVar;
    }

    /* compiled from: ClassDefRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/c$a.class */
    protected class a extends org.jf.dexlib2.b.a.e implements org.jf.dexlib2.e.c {
        private org.jf.dexlib2.e.c pt;

        public a(org.jf.dexlib2.e.c cVar) {
            this.pt = cVar;
        }

        @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
        public final String io() {
            return c.this.Bm.mg().E(this.pt.io());
        }

        @Override // org.jf.dexlib2.e.c
        public final int iJ() {
            return this.pt.iJ();
        }

        @Override // org.jf.dexlib2.e.c
        public final String is() {
            return (String) q.a(c.this.Bm.mg(), this.pt.is());
        }

        @Override // org.jf.dexlib2.e.c
        public final List<String> iS() {
            return q.a((o) c.this.Bm.mg(), (List) this.pt.iS());
        }

        @Override // org.jf.dexlib2.e.c
        public final String iT() {
            return this.pt.iT();
        }

        @Override // org.jf.dexlib2.e.c
        public final Set<? extends org.jf.dexlib2.e.a> iK() {
            return q.a((o) c.this.Bm.mj(), (Set) this.pt.iK());
        }

        @Override // org.jf.dexlib2.e.c
        public final Iterable<? extends org.jf.dexlib2.e.f> iU() {
            return q.a((o) c.this.Bm.lY(), (Iterable) this.pt.iU());
        }

        @Override // org.jf.dexlib2.e.c
        public final Iterable<? extends org.jf.dexlib2.e.f> iV() {
            return q.a((o) c.this.Bm.lY(), (Iterable) this.pt.iV());
        }

        @Override // org.jf.dexlib2.e.c
        public final Iterable<? extends org.jf.dexlib2.e.g> iW() {
            return q.a((o) c.this.Bm.lZ(), (Iterable) this.pt.iW());
        }

        @Override // org.jf.dexlib2.e.c
        public final Iterable<? extends org.jf.dexlib2.e.g> iX() {
            return q.a((o) c.this.Bm.lZ(), (Iterable) this.pt.iX());
        }

        @Override // org.jf.dexlib2.e.c
        public final Iterable<? extends org.jf.dexlib2.e.g> iY() {
            return new Iterable<org.jf.dexlib2.e.g>() { // from class: org.jf.dexlib2.g.c.a.1
                @Override // java.lang.Iterable
                public final Iterator<org.jf.dexlib2.e.g> iterator() {
                    return av.b(a.this.iW().iterator(), a.this.iX().iterator());
                }
            };
        }
    }
}