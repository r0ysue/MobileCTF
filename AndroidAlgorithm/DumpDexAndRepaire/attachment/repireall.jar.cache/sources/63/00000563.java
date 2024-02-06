package org.jf.dexlib2.g;

import java.util.Set;

/* compiled from: MethodParameterRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/l.class */
public final class l implements o<org.jf.dexlib2.e.i> {
    protected final r Cg;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.i E(org.jf.dexlib2.e.i iVar) {
        return new a(iVar);
    }

    public l(r rVar) {
        this.Cg = rVar;
    }

    /* compiled from: MethodParameterRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/l$a.class */
    protected class a extends org.jf.dexlib2.b.d {
        private org.jf.dexlib2.e.i Ch;

        public a(org.jf.dexlib2.e.i iVar) {
            this.Ch = iVar;
        }

        @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
        public final String io() {
            return l.this.Cg.mg().E(this.Ch.io());
        }

        @Override // org.jf.dexlib2.e.i
        public final Set<? extends org.jf.dexlib2.e.a> iK() {
            return q.a((o) l.this.Cg.mj(), (Set) this.Ch.iK());
        }

        @Override // org.jf.dexlib2.e.i, org.jf.dexlib2.e.a.e
        public final String bf() {
            return this.Ch.bf();
        }

        @Override // org.jf.dexlib2.b.d, org.jf.dexlib2.e.i, org.jf.dexlib2.e.a.e
        public final String jb() {
            return this.Ch.jb();
        }
    }
}