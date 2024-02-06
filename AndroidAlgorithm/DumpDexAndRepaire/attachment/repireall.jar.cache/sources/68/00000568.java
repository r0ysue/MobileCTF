package org.jf.dexlib2.g;

import java.util.List;
import java.util.Set;

/* compiled from: MethodRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/n.class */
public final class n implements o<org.jf.dexlib2.e.g> {
    protected final r Cn;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.g E(org.jf.dexlib2.e.g gVar) {
        return new a(gVar);
    }

    public n(r rVar) {
        this.Cn = rVar;
    }

    /* compiled from: MethodRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/n$a.class */
    protected class a extends org.jf.dexlib2.b.a.c implements org.jf.dexlib2.e.g {
        private org.jf.dexlib2.e.g qe;

        public a(org.jf.dexlib2.e.g gVar) {
            this.qe = gVar;
        }

        @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
        public final String iG() {
            return n.this.Cn.mi().E(this.qe).iG();
        }

        @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
        public final String bf() {
            return n.this.Cn.mi().E(this.qe).bf();
        }

        @Override // org.jf.dexlib2.e.c.c
        public final List<? extends CharSequence> iH() {
            return n.this.Cn.mi().E(this.qe).iH();
        }

        @Override // org.jf.dexlib2.e.g
        public final List<? extends org.jf.dexlib2.e.i> bQ() {
            return q.a((o) n.this.Cn.ma(), (List) this.qe.bQ());
        }

        @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
        public final String iI() {
            return n.this.Cn.mi().E(this.qe).iI();
        }

        @Override // org.jf.dexlib2.e.g
        public final int iJ() {
            return this.qe.iJ();
        }

        @Override // org.jf.dexlib2.e.g
        public final Set<? extends org.jf.dexlib2.e.a> iK() {
            return q.a((o) n.this.Cn.mj(), (Set) this.qe.iK());
        }

        @Override // org.jf.dexlib2.e.g
        public final org.jf.dexlib2.e.h iL() {
            return (org.jf.dexlib2.e.h) q.a(n.this.Cn.mb(), this.qe.iL());
        }
    }
}