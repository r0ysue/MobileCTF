package org.jf.dexlib2.g;

/* compiled from: ExceptionHandlerRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/g.class */
public final class g implements o<org.jf.dexlib2.e.e> {
    protected final r BQ;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.e E(org.jf.dexlib2.e.e eVar) {
        return new a(eVar);
    }

    public g(r rVar) {
        this.BQ = rVar;
    }

    /* compiled from: ExceptionHandlerRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/g$a.class */
    protected class a extends org.jf.dexlib2.b.c {
        private org.jf.dexlib2.e.e BR;

        public a(org.jf.dexlib2.e.e eVar) {
            this.BR = eVar;
        }

        @Override // org.jf.dexlib2.e.e
        public final String jd() {
            return (String) q.a(g.this.BQ.mg(), this.BR.jd());
        }

        @Override // org.jf.dexlib2.e.e
        public final int je() {
            return this.BR.je();
        }
    }
}