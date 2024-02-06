package org.jf.dexlib2.g;

/* compiled from: AnnotationElementRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/a.class */
public final class a implements o<org.jf.dexlib2.e.b> {
    protected final r Bg;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.b E(org.jf.dexlib2.e.b bVar) {
        return new C0028a(bVar);
    }

    public a(r rVar) {
        this.Bg = rVar;
    }

    /* compiled from: AnnotationElementRewriter.java */
    /* renamed from: org.jf.dexlib2.g.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/a$a.class */
    protected class C0028a extends org.jf.dexlib2.b.b {
        private org.jf.dexlib2.e.b Bh;

        public C0028a(org.jf.dexlib2.e.b bVar) {
            this.Bh = bVar;
        }

        @Override // org.jf.dexlib2.e.b
        public final String bf() {
            return this.Bh.bf();
        }

        @Override // org.jf.dexlib2.e.b
        public final org.jf.dexlib2.e.d.g kt() {
            return a.this.Bg.ml().E(this.Bh.kt());
        }
    }
}