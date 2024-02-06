package org.jf.dexlib2.g;

/* compiled from: FieldReferenceRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/h.class */
public final class h implements o<org.jf.dexlib2.e.c.a> {
    protected final r BT;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.c.a E(org.jf.dexlib2.e.c.a aVar) {
        return new a(aVar);
    }

    public h(r rVar) {
        this.BT = rVar;
    }

    /* compiled from: FieldReferenceRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/h$a.class */
    protected class a extends org.jf.dexlib2.b.a.a {
        private org.jf.dexlib2.e.c.a BU;

        public a(org.jf.dexlib2.e.c.a aVar) {
            this.BU = aVar;
        }

        @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
        public final String iG() {
            return h.this.BT.mg().E(this.BU.iG());
        }

        @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
        public final String bf() {
            return this.BU.bf();
        }

        @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
        public final String io() {
            return h.this.BT.mg().E(this.BU.io());
        }
    }
}