package org.jf.dexlib2.d;

import java.util.Set;

/* compiled from: DexBackedAnnotation.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/c.class */
public final class c extends org.jf.dexlib2.b.a {
    private g re;
    private int vB;
    private int vC;
    private final int vD;

    public c(g gVar, int i) {
        this.re = gVar;
        o aY = gVar.aY(i);
        this.vB = aY.kn();
        this.vC = aY.kf();
        this.vD = aY.kd();
    }

    @Override // org.jf.dexlib2.e.a
    public final int kr() {
        return this.vB;
    }

    @Override // org.jf.dexlib2.e.a
    public final String io() {
        return this.re.aW(this.vC);
    }

    @Override // org.jf.dexlib2.e.a
    public final Set<? extends d> ks() {
        o aY = this.re.aY(this.vD);
        return new org.jf.dexlib2.d.d.k<d>(this.re, aY.kd(), aY.kf()) { // from class: org.jf.dexlib2.d.c.1
            @Override // org.jf.dexlib2.d.d.k
            protected final /* synthetic */ d a(o oVar, int i) {
                return new d(oVar);
            }
        };
    }
}