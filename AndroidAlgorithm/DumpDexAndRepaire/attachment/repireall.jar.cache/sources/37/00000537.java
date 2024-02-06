package org.jf.dexlib2.f;

import com.b.a.c.ah;
import com.b.a.c.ao;
import java.util.Set;
import org.jf.a.k;
import org.jf.a.l;

/* compiled from: ImmutableMethodParameter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/i.class */
public final class i extends org.jf.dexlib2.b.d {
    private String eb;
    private ao<? extends a> zS;
    private String cW;
    private static final k<i, org.jf.dexlib2.e.i> Ak = new k<i, org.jf.dexlib2.e.i>() { // from class: org.jf.dexlib2.f.i.1
        @Override // org.jf.a.k
        protected final /* synthetic */ i O(org.jf.dexlib2.e.i iVar) {
            return i.a(iVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.i iVar) {
            return iVar instanceof i;
        }
    };

    private i(String str, Set<? extends org.jf.dexlib2.e.a> set, String str2) {
        this.eb = str;
        this.zS = a.g(set);
        this.cW = str2;
    }

    public i(String str, ao<? extends a> aoVar, String str2) {
        this.eb = str;
        this.zS = l.a(null);
        this.cW = null;
    }

    public static i a(org.jf.dexlib2.e.i iVar) {
        if (iVar instanceof i) {
            return (i) iVar;
        }
        return new i(iVar.io(), iVar.iK(), iVar.bf());
    }

    @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
    public final String io() {
        return this.eb;
    }

    @Override // org.jf.dexlib2.e.i
    public final Set<? extends org.jf.dexlib2.e.a> iK() {
        return this.zS;
    }

    @Override // org.jf.dexlib2.e.i, org.jf.dexlib2.e.a.e
    public final String bf() {
        return this.cW;
    }

    @Override // org.jf.dexlib2.b.d, org.jf.dexlib2.e.i, org.jf.dexlib2.e.a.e
    public final String jb() {
        return null;
    }

    public static ah<i> l(Iterable<? extends org.jf.dexlib2.e.i> iterable) {
        return Ak.n(iterable);
    }
}