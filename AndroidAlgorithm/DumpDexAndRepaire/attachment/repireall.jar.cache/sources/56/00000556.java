package org.jf.dexlib2.g;

import java.util.Set;

/* compiled from: FieldRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/i.class */
public final class i implements o<org.jf.dexlib2.e.f> {
    protected final r BW;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.f E(org.jf.dexlib2.e.f fVar) {
        return new a(fVar);
    }

    public i(r rVar) {
        this.BW = rVar;
    }

    /* compiled from: FieldRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/i$a.class */
    protected class a extends org.jf.dexlib2.b.a.a implements org.jf.dexlib2.e.f {
        private org.jf.dexlib2.e.f BX;

        public a(org.jf.dexlib2.e.f fVar) {
            this.BX = fVar;
        }

        @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
        public final String iG() {
            return i.this.BW.mh().E(this.BX).iG();
        }

        @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
        public final String bf() {
            return i.this.BW.mh().E(this.BX).bf();
        }

        @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
        public final String io() {
            return i.this.BW.mh().E(this.BX).io();
        }

        @Override // org.jf.dexlib2.e.f
        public final int iJ() {
            return this.BX.iJ();
        }

        @Override // org.jf.dexlib2.e.f
        public final org.jf.dexlib2.e.d.g iZ() {
            return (org.jf.dexlib2.e.d.g) q.a(i.this.BW.ml(), this.BX.iZ());
        }

        @Override // org.jf.dexlib2.e.f
        public final Set<? extends org.jf.dexlib2.e.a> iK() {
            return q.a((o) i.this.BW.mj(), (Set) this.BX.iK());
        }
    }
}