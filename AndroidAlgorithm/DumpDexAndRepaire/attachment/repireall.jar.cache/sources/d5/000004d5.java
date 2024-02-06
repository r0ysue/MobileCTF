package org.jf.dexlib2.f.a;

import com.b.a.c.ah;
import org.jf.a.k;
import org.jf.dexlib2.e.a.i;

/* compiled from: ImmutableDebugItem.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/a/a.class */
public abstract class a implements org.jf.dexlib2.e.a.a {
    private int qq;
    private static final k<a, org.jf.dexlib2.e.a.a> Ap = new k<a, org.jf.dexlib2.e.a.a>() { // from class: org.jf.dexlib2.f.a.a.1
        @Override // org.jf.a.k
        protected final /* synthetic */ a O(org.jf.dexlib2.e.a.a aVar) {
            return a.a(aVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.a.a aVar) {
            return aVar instanceof a;
        }
    };

    public a(int i) {
        this.qq = i;
    }

    public static a a(org.jf.dexlib2.e.a.a aVar) {
        if (aVar instanceof a) {
            return (a) aVar;
        }
        switch (aVar.jC()) {
            case 3:
                i iVar = (i) aVar;
                if (iVar instanceof h) {
                    return (h) iVar;
                }
                return new h(iVar.hQ(), iVar.jB(), iVar.bf(), iVar.io(), iVar.jb());
            case CAN_CONTINUE:
            default:
                throw new org.jf.a.i("Invalid debug item type: %d", Integer.valueOf(aVar.jC()));
            case 5:
                org.jf.dexlib2.e.a.b bVar = (org.jf.dexlib2.e.a.b) aVar;
                if (bVar instanceof b) {
                    return (b) bVar;
                }
                return new b(bVar.hQ(), bVar.jB(), bVar.io(), bVar.bf(), bVar.jb());
            case 6:
                org.jf.dexlib2.e.a.g gVar = (org.jf.dexlib2.e.a.g) aVar;
                if (gVar instanceof f) {
                    return (f) gVar;
                }
                return new f(gVar.hQ(), gVar.jB(), gVar.io(), gVar.bf(), gVar.jb());
            case 7:
                org.jf.dexlib2.e.a.f fVar = (org.jf.dexlib2.e.a.f) aVar;
                if (fVar instanceof e) {
                    return (e) fVar;
                }
                return new e(fVar.hQ());
            case SETS_RESULT:
                org.jf.dexlib2.e.a.c cVar = (org.jf.dexlib2.e.a.c) aVar;
                if (cVar instanceof c) {
                    return (c) cVar;
                }
                return new c(cVar.hQ());
            case 9:
                org.jf.dexlib2.e.a.h hVar = (org.jf.dexlib2.e.a.h) aVar;
                if (hVar instanceof g) {
                    return (g) hVar;
                }
                return new g(hVar.hQ(), hVar.iT());
            case 10:
                org.jf.dexlib2.e.a.d dVar = (org.jf.dexlib2.e.a.d) aVar;
                if (dVar instanceof d) {
                    return (d) dVar;
                }
                return new d(dVar.hQ(), dVar.jD());
        }
    }

    @Override // org.jf.dexlib2.e.a.a
    public final int hQ() {
        return this.qq;
    }

    public static ah<a> l(Iterable<? extends org.jf.dexlib2.e.a.a> iterable) {
        return Ap.n(iterable);
    }
}