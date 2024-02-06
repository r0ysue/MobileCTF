package org.jf.dexlib2.a;

import com.b.a.c.ba;
import java.util.Map;

/* compiled from: DexClassProvider.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/i.class */
public final class i implements h {
    private final org.jf.dexlib2.e.d sE;
    private Map<String, org.jf.dexlib2.e.c> sF = ba.fM();

    public i(org.jf.dexlib2.e.d dVar) {
        this.sE = dVar;
        for (org.jf.dexlib2.e.c cVar : dVar.kz()) {
            this.sF.put(cVar.io(), cVar);
        }
    }

    @Override // org.jf.dexlib2.a.h
    public final org.jf.dexlib2.e.c bj(String str) {
        return this.sF.get(str);
    }
}