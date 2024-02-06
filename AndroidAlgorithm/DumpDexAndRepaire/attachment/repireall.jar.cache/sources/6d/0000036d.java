package org.jf.dexlib2.c.b;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BuilderPackedSwitchPayload.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/ag.class */
public final class ag extends org.jf.dexlib2.c.e implements org.jf.dexlib2.e.b.a.ai {
    private static org.jf.dexlib2.e vb = org.jf.dexlib2.e.PACKED_SWITCH_PAYLOAD;
    private List<ai> vu;

    public ag(int i, List<? extends org.jf.dexlib2.c.g> list) {
        super(vb);
        if (list == null) {
            this.vu = com.b.a.c.ah.eY();
            return;
        }
        this.vu = new ArrayList();
        int i2 = i;
        for (org.jf.dexlib2.c.g gVar : list) {
            int i3 = i2;
            i2++;
            this.vu.add(new ai(this, i3, gVar));
        }
    }

    @Override // org.jf.dexlib2.e.b.p
    public final List<ai> ka() {
        return this.vu;
    }

    @Override // org.jf.dexlib2.c.c, org.jf.dexlib2.e.b.f
    public final int iR() {
        return 4 + (this.vu.size() << 1);
    }

    @Override // org.jf.dexlib2.c.c
    public final org.jf.dexlib2.d jf() {
        return vb.format;
    }
}