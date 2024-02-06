package org.jf.baksmali.a.a;

import org.jf.baksmali.a.l;
import org.jf.baksmali.a.p;

/* compiled from: DebugMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a/b.class */
public abstract class b extends l {
    private final int pz;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i, int i2) {
        super(i);
        this.pz = i2;
    }

    @Override // org.jf.baksmali.a.l
    public final double hI() {
        return this.pz;
    }

    public static b a(p pVar, org.jf.dexlib2.e.a.a aVar) {
        int hQ = aVar.hQ();
        switch (aVar.jC()) {
            case 3:
                return new i(hQ, -1, pVar, (org.jf.dexlib2.e.a.i) aVar);
            case CAN_CONTINUE:
            default:
                throw new org.jf.a.i("Invalid debug item type: %d", Integer.valueOf(aVar.jC()));
            case 5:
                return new c(hQ, -1, pVar, (org.jf.dexlib2.e.a.b) aVar);
            case 6:
                return new g(hQ, -1, pVar, (org.jf.dexlib2.e.a.g) aVar);
            case 7:
                return new d(hQ, -4);
            case SETS_RESULT:
                return new a(hQ, -4);
            case 9:
                return new h(hQ, -3, (org.jf.dexlib2.e.a.h) aVar);
            case 10:
                return new e(hQ, -2, (org.jf.dexlib2.e.a.d) aVar);
        }
    }
}