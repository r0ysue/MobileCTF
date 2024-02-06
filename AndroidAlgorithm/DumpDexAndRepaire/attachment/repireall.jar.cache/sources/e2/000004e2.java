package org.jf.dexlib2.f;

import com.b.a.c.ao;
import org.jf.a.k;

/* compiled from: ImmutableAnnotationElement.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/b.class */
public final class b extends org.jf.dexlib2.b.b {
    private String cW;
    private org.jf.dexlib2.f.e.g zO;
    private static final k<b, org.jf.dexlib2.e.b> zP = new k<b, org.jf.dexlib2.e.b>() { // from class: org.jf.dexlib2.f.b.1
        @Override // org.jf.a.k
        protected final /* synthetic */ b O(org.jf.dexlib2.e.b bVar) {
            return b.b(bVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.b bVar) {
            return bVar instanceof b;
        }
    };

    public b(String str, org.jf.dexlib2.e.d.g gVar) {
        this.cW = str;
        this.zO = org.jf.dexlib2.f.e.h.b(gVar);
    }

    public static b b(org.jf.dexlib2.e.b bVar) {
        if (bVar instanceof b) {
            return (b) bVar;
        }
        return new b(bVar.bf(), bVar.kt());
    }

    @Override // org.jf.dexlib2.e.b
    public final String bf() {
        return this.cW;
    }

    @Override // org.jf.dexlib2.e.b
    public final org.jf.dexlib2.e.d.g kt() {
        return this.zO;
    }

    public static ao<b> g(Iterable<? extends org.jf.dexlib2.e.b> iterable) {
        return zP.o(iterable);
    }
}