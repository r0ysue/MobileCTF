package org.jf.dexlib2.f;

import com.b.a.c.ah;
import java.util.List;
import org.jf.a.k;

/* compiled from: ImmutableTryBlock.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/j.class */
public final class j extends org.jf.dexlib2.b.e<e> {
    private int Al;
    private int Am;
    private ah<? extends e> An;
    private static final k<j, org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e>> Ao = new k<j, org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e>>() { // from class: org.jf.dexlib2.f.j.1
        @Override // org.jf.a.k
        protected final /* synthetic */ j O(org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e> kVar) {
            return j.a(kVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e> kVar) {
            return kVar instanceof j;
        }
    };

    @Override // org.jf.dexlib2.e.k
    public final /* bridge */ /* synthetic */ List jn() {
        return this.An;
    }

    private j(int i, int i2, List<? extends org.jf.dexlib2.e.e> list) {
        this.Al = i;
        this.Am = i2;
        this.An = e.d(list);
    }

    public static j a(org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e> kVar) {
        if (kVar instanceof j) {
            return (j) kVar;
        }
        return new j(kVar.jl(), kVar.jm(), kVar.jn());
    }

    @Override // org.jf.dexlib2.e.k
    public final int jl() {
        return this.Al;
    }

    @Override // org.jf.dexlib2.e.k
    public final int jm() {
        return this.Am;
    }

    public static ah<j> e(List<? extends org.jf.dexlib2.e.k<? extends org.jf.dexlib2.e.e>> list) {
        return Ao.n(list);
    }
}