package org.jf.dexlib2.d.c;

import com.b.a.c.ah;
import java.util.List;
import org.jf.dexlib2.d.g;

/* compiled from: DexBackedMethodProtoReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/c/b.class */
public final class b extends org.jf.dexlib2.b.a.b {
    public final g yP;
    private final int yQ;

    public b(g gVar, int i) {
        this.yP = gVar;
        this.yQ = gVar.aS(i);
    }

    @Override // org.jf.dexlib2.e.c.b
    public final List<String> iH() {
        int ax = this.yP.ax(this.yQ + 8);
        if (ax > 0) {
            final int ax2 = this.yP.ax(ax);
            final int i = ax + 4;
            return new org.jf.dexlib2.d.d.c<String>() { // from class: org.jf.dexlib2.d.c.b.1
                @Override // org.jf.dexlib2.d.d.c
                public final /* synthetic */ String aZ(int i2) {
                    return b.this.yP.aW(b.this.yP.az(i + (2 * i2)));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return ax2;
                }
            };
        }
        return ah.eY();
    }

    @Override // org.jf.dexlib2.e.c.b
    public final String iI() {
        return this.yP.aW(this.yP.ax(this.yQ + 4));
    }
}