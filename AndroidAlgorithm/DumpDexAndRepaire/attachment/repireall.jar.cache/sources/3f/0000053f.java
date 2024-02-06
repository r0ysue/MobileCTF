package org.jf.dexlib2.g;

import java.util.Set;

/* compiled from: AnnotationRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/b.class */
public final class b implements o<org.jf.dexlib2.e.a> {
    protected final r Bj;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.a E(org.jf.dexlib2.e.a aVar) {
        return new a(aVar);
    }

    public b(r rVar) {
        this.Bj = rVar;
    }

    /* compiled from: AnnotationRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/b$a.class */
    protected class a extends org.jf.dexlib2.b.a {
        private org.jf.dexlib2.e.a Bk;

        public a(org.jf.dexlib2.e.a aVar) {
            this.Bk = aVar;
        }

        @Override // org.jf.dexlib2.e.a
        public final int kr() {
            return this.Bk.kr();
        }

        @Override // org.jf.dexlib2.e.a
        public final String io() {
            return b.this.Bj.mg().E(this.Bk.io());
        }

        @Override // org.jf.dexlib2.e.a
        public final Set<? extends org.jf.dexlib2.e.b> ks() {
            return q.a((o) b.this.Bj.mk(), (Set) this.Bk.ks());
        }
    }
}