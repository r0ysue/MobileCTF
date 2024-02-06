package org.jf.dexlib2.f.c;

import com.b.a.c.ah;
import java.util.List;

/* compiled from: ImmutableMethodProtoReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/c/b.class */
public final class b extends org.jf.dexlib2.b.a.b implements d {
    private ah<String> Ae;
    private String Af;

    public b(Iterable<? extends CharSequence> iterable, String str) {
        this.Ae = org.jf.dexlib2.f.d.a.m(iterable);
        this.Af = str;
    }

    public static b b(org.jf.dexlib2.e.c.b bVar) {
        if (bVar instanceof b) {
            return (b) bVar;
        }
        return new b(bVar.iH(), bVar.iI());
    }

    @Override // org.jf.dexlib2.e.c.b
    public final List<? extends CharSequence> iH() {
        return this.Ae;
    }

    @Override // org.jf.dexlib2.e.c.b
    public final String iI() {
        return this.Af;
    }
}