package org.jf.dexlib2.d.c;

import com.b.a.c.ah;
import java.util.List;
import org.jf.dexlib2.d.g;

/* compiled from: DexBackedMethodReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/c/c.class */
public final class c extends org.jf.dexlib2.b.a.c {
    public final g yS;
    private int xa;
    private int xb;

    public c(g gVar, int i) {
        this.yS = gVar;
        this.xa = gVar.aR(i);
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String iG() {
        return this.yS.aW(this.yS.az(this.xa));
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String bf() {
        return this.yS.aU(this.yS.ax(this.xa + 4));
    }

    @Override // org.jf.dexlib2.e.c.c
    public final List<String> iH() {
        int ax = this.yS.ax(kO() + 8);
        if (ax > 0) {
            final int ax2 = this.yS.ax(ax);
            final int i = ax + 4;
            return new org.jf.dexlib2.d.d.c<String>() { // from class: org.jf.dexlib2.d.c.c.1
                @Override // org.jf.dexlib2.d.d.c
                public final /* synthetic */ String aZ(int i2) {
                    return c.this.yS.aW(c.this.yS.az(i + (2 * i2)));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return ax2;
                }
            };
        }
        return ah.eY();
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String iI() {
        return this.yS.aW(this.yS.ax(kO() + 4));
    }

    private int kO() {
        if (this.xb == 0) {
            this.xb = this.yS.aS(this.yS.az(this.xa + 2));
        }
        return this.xb;
    }
}