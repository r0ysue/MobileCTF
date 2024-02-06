package org.jf.dexlib2.b;

import org.jf.dexlib2.e.e;
import org.jf.dexlib2.e.k;

/* compiled from: BaseTryBlock.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/e.class */
public abstract class e<EH extends org.jf.dexlib2.e.e> implements k<EH> {
    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            return jl() == kVar.jl() && jm() == kVar.jm() && jn().equals(kVar.jn());
        }
        return false;
    }
}