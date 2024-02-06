package org.jf.dexlib2.f;

import com.b.a.c.ao;
import java.util.Collection;
import java.util.Set;
import org.jf.a.k;

/* compiled from: ImmutableAnnotation.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/a.class */
public final class a extends org.jf.dexlib2.b.a {
    private int vB;
    private String eb;
    private ao<? extends b> zM;
    private static final k<a, org.jf.dexlib2.e.a> zN = new k<a, org.jf.dexlib2.e.a>() { // from class: org.jf.dexlib2.f.a.1
        @Override // org.jf.a.k
        protected final /* synthetic */ a O(org.jf.dexlib2.e.a aVar) {
            return a.b(aVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.a aVar) {
            return aVar instanceof a;
        }
    };

    @Override // org.jf.dexlib2.e.a
    public final /* bridge */ /* synthetic */ Set ks() {
        return this.zM;
    }

    public a(int i, String str, Collection<? extends org.jf.dexlib2.e.b> collection) {
        this.vB = i;
        this.eb = str;
        this.zM = b.g(collection);
    }

    public static a b(org.jf.dexlib2.e.a aVar) {
        if (aVar instanceof a) {
            return (a) aVar;
        }
        return new a(aVar.kr(), aVar.io(), aVar.ks());
    }

    @Override // org.jf.dexlib2.e.a
    public final int kr() {
        return this.vB;
    }

    @Override // org.jf.dexlib2.e.a
    public final String io() {
        return this.eb;
    }

    public static ao<a> g(Iterable<? extends org.jf.dexlib2.e.a> iterable) {
        return zN.o(iterable);
    }
}