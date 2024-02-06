package org.jf.dexlib2.g;

/* compiled from: DebugItemRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/d.class */
public final class d implements o<org.jf.dexlib2.e.a.a> {
    protected final r Bp;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.a.a E(org.jf.dexlib2.e.a.a aVar) {
        org.jf.dexlib2.e.a.a aVar2 = aVar;
        switch (aVar2.jC()) {
            case 3:
                return new C0029d((org.jf.dexlib2.e.a.i) aVar2);
            case CAN_CONTINUE:
            default:
                return aVar2;
            case 5:
                return new b((org.jf.dexlib2.e.a.b) aVar2);
            case 6:
                return new c((org.jf.dexlib2.e.a.g) aVar2);
        }
    }

    public d(r rVar) {
        this.Bp = rVar;
    }

    /* compiled from: DebugItemRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/d$a.class */
    protected class a<T extends org.jf.dexlib2.e.a.a & org.jf.dexlib2.e.a.e> implements org.jf.dexlib2.e.a.a, org.jf.dexlib2.e.a.e {
        protected T Bq;

        public a(T t) {
            this.Bq = t;
        }

        @Override // org.jf.dexlib2.e.a.a
        public final int jC() {
            return this.Bq.jC();
        }

        @Override // org.jf.dexlib2.e.a.a
        public final int hQ() {
            return this.Bq.hQ();
        }

        @Override // org.jf.dexlib2.e.a.e
        public final String bf() {
            return this.Bq.bf();
        }

        @Override // org.jf.dexlib2.e.a.e
        public final String io() {
            return (String) q.a(d.this.Bp.mg(), this.Bq.io());
        }

        @Override // org.jf.dexlib2.e.a.e
        public final String jb() {
            return this.Bq.jb();
        }
    }

    /* compiled from: DebugItemRewriter.java */
    /* renamed from: org.jf.dexlib2.g.d$d  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/d$d.class */
    protected class C0029d extends a<org.jf.dexlib2.e.a.i> implements org.jf.dexlib2.e.a.i {
        public C0029d(org.jf.dexlib2.e.a.i iVar) {
            super(iVar);
        }

        @Override // org.jf.dexlib2.e.a.i
        public final int jB() {
            return ((org.jf.dexlib2.e.a.i) this.Bq).jB();
        }

        @Override // org.jf.dexlib2.e.a.i
        public final org.jf.dexlib2.e.c.e jF() {
            return ((org.jf.dexlib2.e.a.i) this.Bq).jF();
        }

        @Override // org.jf.dexlib2.e.a.i
        public final org.jf.dexlib2.e.c.f jG() {
            org.jf.dexlib2.e.c.f jG = ((org.jf.dexlib2.e.a.i) this.Bq).jG();
            if (jG != null) {
                return q.a(d.this.Bp.mg(), jG);
            }
            return null;
        }

        @Override // org.jf.dexlib2.e.a.i
        public final org.jf.dexlib2.e.c.e jH() {
            return ((org.jf.dexlib2.e.a.i) this.Bq).jH();
        }
    }

    /* compiled from: DebugItemRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/d$b.class */
    protected class b extends a<org.jf.dexlib2.e.a.b> implements org.jf.dexlib2.e.a.b {
        public b(org.jf.dexlib2.e.a.b bVar) {
            super(bVar);
        }

        @Override // org.jf.dexlib2.e.a.b
        public final int jB() {
            return ((org.jf.dexlib2.e.a.b) this.Bq).jB();
        }
    }

    /* compiled from: DebugItemRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/d$c.class */
    protected class c extends a<org.jf.dexlib2.e.a.g> implements org.jf.dexlib2.e.a.g {
        public c(org.jf.dexlib2.e.a.g gVar) {
            super(gVar);
        }

        @Override // org.jf.dexlib2.e.a.g
        public final int jB() {
            return ((org.jf.dexlib2.e.a.g) this.Bq).jB();
        }
    }
}