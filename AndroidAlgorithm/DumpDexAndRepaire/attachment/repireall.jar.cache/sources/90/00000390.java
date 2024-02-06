package org.jf.dexlib2.c;

import com.b.a.c.ah;
import java.util.List;

/* compiled from: BuilderTryBlock.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/f.class */
public final class f extends org.jf.dexlib2.b.e<b> {
    private b ut;
    private g uu;
    private g uv;

    public f(g gVar, g gVar2, org.jf.dexlib2.e.c.f fVar, g gVar3) {
        this.uu = gVar;
        this.uv = gVar2;
        this.ut = b.a(fVar, gVar3);
    }

    @Override // org.jf.dexlib2.e.k
    public final int jl() {
        return this.uu.jp().qq;
    }

    @Override // org.jf.dexlib2.e.k
    public final int jm() {
        return this.uv.jp().qq - this.uu.jp().qq;
    }

    @Override // org.jf.dexlib2.e.k
    public final List<? extends b> jn() {
        return ah.u(this.ut);
    }
}