package org.jf.dexlib2.c.b;

import com.b.a.c.ax;
import java.util.List;
import org.jf.dexlib2.e.b.a.aj;

/* compiled from: BuilderSparseSwitchPayload.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/ah.class */
public class ah extends org.jf.dexlib2.c.e implements aj {
    private static org.jf.dexlib2.e vb = org.jf.dexlib2.e.SPARSE_SWITCH_PAYLOAD;
    private List<ai> vu;

    public ah(List<? extends org.jf.dexlib2.c.j> list) {
        super(vb);
        if (list == null) {
            this.vu = com.b.a.c.ah.eY();
        } else {
            this.vu = ax.a(list, new com.b.a.a.d<org.jf.dexlib2.c.j, ai>() { // from class: org.jf.dexlib2.c.b.ah.1
                private static /* synthetic */ boolean pL;

                @Override // com.b.a.a.d
                public final /* synthetic */ ai apply(org.jf.dexlib2.c.j jVar) {
                    org.jf.dexlib2.c.j jVar2 = jVar;
                    if (pL || jVar2 != null) {
                        return new ai(ah.this, jVar2.uR, jVar2.uS);
                    }
                    throw new AssertionError();
                }

                static {
                    pL = !ah.class.desiredAssertionStatus();
                }
            });
        }
    }

    @Override // org.jf.dexlib2.e.b.p
    public final List<ai> ka() {
        return this.vu;
    }

    @Override // org.jf.dexlib2.c.c, org.jf.dexlib2.e.b.f
    public final int iR() {
        return 2 + (this.vu.size() << 2);
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return vb.format;
    }
}