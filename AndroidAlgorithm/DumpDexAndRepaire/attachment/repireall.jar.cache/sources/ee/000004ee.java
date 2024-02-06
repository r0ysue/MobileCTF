package org.jf.dexlib2.f.b;

import java.util.List;

/* compiled from: ImmutableSwitchElement.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/b/aj.class */
public final class aj implements org.jf.dexlib2.e.b.o {
    private int pZ;
    private int an;
    private static final org.jf.a.k<aj, org.jf.dexlib2.e.b.o> AD = new org.jf.a.k<aj, org.jf.dexlib2.e.b.o>() { // from class: org.jf.dexlib2.f.b.aj.1
        @Override // org.jf.a.k
        protected final /* synthetic */ aj O(org.jf.dexlib2.e.b.o oVar) {
            return aj.a(oVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.b.o oVar) {
            return oVar instanceof aj;
        }
    };

    private aj(int i, int i2) {
        this.pZ = i;
        this.an = i2;
    }

    public static aj a(org.jf.dexlib2.e.b.o oVar) {
        if (oVar instanceof aj) {
            return (aj) oVar;
        }
        return new aj(oVar.hL(), oVar.kb());
    }

    @Override // org.jf.dexlib2.e.b.o
    public final int hL() {
        return this.pZ;
    }

    @Override // org.jf.dexlib2.e.b.o
    public final int kb() {
        return this.an;
    }

    public static com.b.a.c.ah<aj> e(List<? extends org.jf.dexlib2.e.b.o> list) {
        return AD.n(list);
    }
}