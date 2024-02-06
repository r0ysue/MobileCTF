package org.jf.dexlib2.c;

/* compiled from: BuilderExceptionHandler.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b.class */
public abstract class b extends org.jf.dexlib2.b.c {
    protected final g uo;

    /* synthetic */ b(g gVar, byte b) {
        this(gVar);
    }

    private b(g gVar) {
        this.uo = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(final org.jf.dexlib2.e.c.f fVar, g gVar) {
        if (fVar == null) {
            return a(gVar);
        }
        return new b(gVar) { // from class: org.jf.dexlib2.c.b.1
            @Override // org.jf.dexlib2.e.e
            public final String jd() {
                return fVar.io();
            }

            @Override // org.jf.dexlib2.e.e
            public final int je() {
                return this.uo.jp().qq;
            }

            @Override // org.jf.dexlib2.b.c, org.jf.dexlib2.e.e
            public final org.jf.dexlib2.e.c.f ja() {
                return fVar;
            }
        };
    }

    static b a(g gVar) {
        return new b(gVar) { // from class: org.jf.dexlib2.c.b.2
            @Override // org.jf.dexlib2.e.e
            public final String jd() {
                return null;
            }

            @Override // org.jf.dexlib2.e.e
            public final int je() {
                return this.uo.jp().qq;
            }
        };
    }
}