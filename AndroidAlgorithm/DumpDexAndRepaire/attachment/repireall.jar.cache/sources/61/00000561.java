package org.jf.dexlib2.g;

import java.util.List;

/* compiled from: MethodImplementationRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/k.class */
public final class k implements o<org.jf.dexlib2.e.h> {
    protected final r Cd;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.h E(org.jf.dexlib2.e.h hVar) {
        return new a(hVar);
    }

    public k(r rVar) {
        this.Cd = rVar;
    }

    /* compiled from: MethodImplementationRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/k$a.class */
    protected class a implements org.jf.dexlib2.e.h {
        private org.jf.dexlib2.e.h Ce;

        public a(org.jf.dexlib2.e.h hVar) {
            this.Ce = hVar;
        }

        @Override // org.jf.dexlib2.e.h
        public final int im() {
            return this.Ce.im();
        }

        @Override // org.jf.dexlib2.e.h
        public final Iterable<? extends org.jf.dexlib2.e.b.f> jz() {
            return q.a((o) k.this.Cd.mc(), (Iterable) this.Ce.jz());
        }

        @Override // org.jf.dexlib2.e.h
        public final List<? extends org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e>> jw() {
            return q.a((o) k.this.Cd.md(), (List) this.Ce.jw());
        }

        @Override // org.jf.dexlib2.e.h
        public final Iterable<? extends org.jf.dexlib2.e.a.a> jx() {
            return q.a((o) k.this.Cd.mf(), (Iterable) this.Ce.jx());
        }
    }
}