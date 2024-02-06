package org.jf.dexlib2.g;

import java.util.List;

/* compiled from: TryBlockRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/s.class */
public final class s implements o<org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e>> {
    protected final r Cx;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e> E(org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e> kVar) {
        return new a(kVar);
    }

    public s(r rVar) {
        this.Cx = rVar;
    }

    /* compiled from: TryBlockRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/s$a.class */
    protected class a extends org.jf.dexlib2.b.e<org.jf.dexlib2.e.e> {
        private org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e> Cy;

        public a(org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e> kVar) {
            this.Cy = kVar;
        }

        @Override // org.jf.dexlib2.e.k
        public final int jl() {
            return this.Cy.jl();
        }

        @Override // org.jf.dexlib2.e.k
        public final int jm() {
            return this.Cy.jm();
        }

        @Override // org.jf.dexlib2.e.k
        public final List<? extends org.jf.dexlib2.e.e> jn() {
            return q.a((o) s.this.Cx.me(), (List) this.Cy.jn());
        }
    }
}