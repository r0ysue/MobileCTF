package org.jf.dexlib2.b;

import java.util.Iterator;
import org.jf.dexlib2.e.d.g;
import org.jf.dexlib2.e.d.p;
import org.jf.dexlib2.e.i;

/* compiled from: BaseMethodParameter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/d.class */
public abstract class d extends org.jf.dexlib2.b.a.e implements i {
    @Override // org.jf.dexlib2.e.i, org.jf.dexlib2.e.a.e
    public String jb() {
        org.jf.dexlib2.e.a aVar = null;
        Iterator<? extends org.jf.dexlib2.e.a> it = iK().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            org.jf.dexlib2.e.a next = it.next();
            if (next.io().equals("Ldalvik/annotation/Signature;")) {
                aVar = next;
                break;
            }
        }
        if (aVar == null) {
            return null;
        }
        org.jf.dexlib2.e.d.b bVar = null;
        Iterator<? extends org.jf.dexlib2.e.b> it2 = aVar.ks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            org.jf.dexlib2.e.b next2 = it2.next();
            if (next2.bf().equals("value")) {
                g kt = next2.kt();
                if (kt.jc() != 28) {
                    return null;
                }
                bVar = (org.jf.dexlib2.e.d.b) kt;
            }
        }
        if (bVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (g gVar : bVar.lM()) {
            if (gVar.jc() != 23) {
                return null;
            }
            sb.append(((p) gVar).lP());
        }
        return sb.toString();
    }
}