package org.jf.dexlib2.h;

import com.b.a.c.ah;
import com.b.a.c.ai;
import com.b.a.c.ba;
import java.util.Iterator;
import java.util.Map;
import org.jf.dexlib2.e.b.m;

/* compiled from: SyntheticAccessorResolver.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/i.class */
public final class i {
    private final h Db;
    private final Map<String, org.jf.dexlib2.e.c> Dc;
    private final Map<String, a> Dd = ba.fO();

    public i(org.jf.dexlib2.f fVar, Iterable<? extends org.jf.dexlib2.e.c> iterable) {
        this.Db = new h(fVar);
        ai.a fc = ai.fc();
        for (org.jf.dexlib2.e.c cVar : iterable) {
            fc.i(cVar.io(), cVar);
        }
        this.Dc = fc.eW();
    }

    public final a f(org.jf.dexlib2.e.c.c cVar) {
        ah c;
        int a2;
        String b = g.b(cVar, false);
        a aVar = this.Dd.get(b);
        if (aVar != null) {
            return aVar;
        }
        org.jf.dexlib2.e.c cVar2 = this.Dc.get(cVar.iG());
        if (cVar2 == null) {
            return null;
        }
        org.jf.dexlib2.e.g gVar = null;
        org.jf.dexlib2.e.h hVar = null;
        Iterator<? extends org.jf.dexlib2.e.g> it = cVar2.iY().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            org.jf.dexlib2.e.g next = it.next();
            org.jf.dexlib2.e.h iL = next.iL();
            if (iL != null) {
                if (next.bf().equals(cVar.bf()) && next.iI().equals(cVar.iI()) && next.iH().equals(cVar.iH())) {
                    gVar = next;
                    hVar = iL;
                    break;
                }
            }
        }
        if (gVar != null && org.jf.dexlib2.a.SYNTHETIC.isSet(gVar.iJ()) && (a2 = this.Db.a((c = ah.c(hVar.jz())))) >= 0) {
            a aVar2 = new a(a2, ((m) c.get(0)).jP());
            this.Dd.put(b, aVar2);
            return aVar2;
        }
        return null;
    }

    /* compiled from: SyntheticAccessorResolver.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/h/i$a.class */
    public static class a {
        public final int De;
        public final org.jf.dexlib2.e.c.d Df;

        public a(int i, org.jf.dexlib2.e.c.d dVar) {
            this.De = i;
            this.Df = dVar;
        }
    }
}