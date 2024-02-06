package org.jf.dexlib2.g;

import com.b.a.c.ax;
import java.util.List;

/* compiled from: MethodReferenceRewriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/g/m.class */
public final class m implements o<org.jf.dexlib2.e.c.c> {
    protected final r Cj;

    @Override // org.jf.dexlib2.g.o
    public final /* synthetic */ org.jf.dexlib2.e.c.c E(org.jf.dexlib2.e.c.c cVar) {
        return new a(cVar);
    }

    public m(r rVar) {
        this.Cj = rVar;
    }

    /* compiled from: MethodReferenceRewriter.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/g/m$a.class */
    protected class a extends org.jf.dexlib2.b.a.c {
        private org.jf.dexlib2.e.c.c Ck;

        public a(org.jf.dexlib2.e.c.c cVar) {
            this.Ck = cVar;
        }

        @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
        public final String iG() {
            return m.this.Cj.mg().E(this.Ck.iG());
        }

        @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
        public final String bf() {
            return this.Ck.bf();
        }

        @Override // org.jf.dexlib2.e.c.c
        public final List<? extends CharSequence> iH() {
            return q.a((o) m.this.Cj.mg(), ax.a(this.Ck.iH(), new com.b.a.a.d<CharSequence, String>() { // from class: org.jf.dexlib2.g.m.a.1
                @Override // com.b.a.a.d
                public final /* synthetic */ String apply(CharSequence charSequence) {
                    return charSequence.toString();
                }
            }));
        }

        @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
        public final String iI() {
            return m.this.Cj.mg().E(this.Ck.iI());
        }
    }
}