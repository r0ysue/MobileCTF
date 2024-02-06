package org.jf.dexlib2.d;

import java.util.List;

/* compiled from: DexBackedTryBlock.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/m.class */
public final class m extends org.jf.dexlib2.b.e<h> {
    private g re;
    private final int xt;
    private final int xu;

    public m(g gVar, int i, int i2) {
        this.re = gVar;
        this.xt = i;
        this.xu = i2;
    }

    @Override // org.jf.dexlib2.e.k
    public final int jl() {
        return this.re.ax(this.xt);
    }

    @Override // org.jf.dexlib2.e.k
    public final int jm() {
        return this.re.az(this.xt + 4);
    }

    @Override // org.jf.dexlib2.e.k
    public final List<? extends h> jn() {
        o aY = this.re.aY(this.xu + this.re.az(this.xt + 6));
        int ke = aY.ke();
        if (ke > 0) {
            return new org.jf.dexlib2.d.d.h<n>(this.re, aY.kd(), ke) { // from class: org.jf.dexlib2.d.m.1
                @Override // org.jf.dexlib2.d.d.h
                protected final /* synthetic */ n a(o oVar, int i) {
                    return new n(oVar);
                }
            };
        }
        final int i = ((-1) * ke) + 1;
        return new org.jf.dexlib2.d.d.h<h>(this.re, aY.kd(), i) { // from class: org.jf.dexlib2.d.m.2
            @Override // org.jf.dexlib2.d.d.h
            protected final /* synthetic */ h a(o oVar, int i2) {
                if (i2 == i - 1) {
                    return new e(oVar);
                }
                return new n(oVar);
            }
        };
    }
}