package org.jf.dexlib2.f.c;

import org.jf.a.k;

/* compiled from: ImmutableTypeReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/c/g.class */
public final class g extends org.jf.dexlib2.b.a.e implements d {
    private String eb;

    public g(String str) {
        this.eb = str;
    }

    public static g a(org.jf.dexlib2.e.c.f fVar) {
        if (fVar instanceof g) {
            return (g) fVar;
        }
        return new g(fVar.io());
    }

    @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
    public final String io() {
        return this.eb;
    }

    static {
        new k<g, org.jf.dexlib2.e.c.f>() { // from class: org.jf.dexlib2.f.c.g.1
            @Override // org.jf.a.k
            protected final /* synthetic */ g O(org.jf.dexlib2.e.c.f fVar) {
                return g.a(fVar);
            }

            @Override // org.jf.a.k
            protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.c.f fVar) {
                return fVar instanceof g;
            }
        };
    }
}