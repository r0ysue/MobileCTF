package org.jf.dexlib2.f;

import com.b.a.c.ah;
import org.jf.a.k;

/* compiled from: ImmutableExceptionHandler.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e.class */
public final class e extends org.jf.dexlib2.b.c {
    private String po;
    private int vI;
    private static final k<e, org.jf.dexlib2.e.e> Ab = new k<e, org.jf.dexlib2.e.e>() { // from class: org.jf.dexlib2.f.e.1
        @Override // org.jf.a.k
        protected final /* synthetic */ e O(org.jf.dexlib2.e.e eVar) {
            return e.b(eVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.e eVar) {
            return eVar instanceof e;
        }
    };

    private e(String str, int i) {
        this.po = str;
        this.vI = i;
    }

    public static e b(org.jf.dexlib2.e.e eVar) {
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return new e(eVar.jd(), eVar.je());
    }

    @Override // org.jf.dexlib2.e.e
    public final String jd() {
        return this.po;
    }

    @Override // org.jf.dexlib2.e.e
    public final int je() {
        return this.vI;
    }

    public static ah<e> d(Iterable<? extends org.jf.dexlib2.e.e> iterable) {
        return Ab.n(iterable);
    }
}