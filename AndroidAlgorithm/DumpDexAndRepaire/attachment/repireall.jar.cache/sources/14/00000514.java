package org.jf.dexlib2.f.c;

/* compiled from: ImmutableStringReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/c/f.class */
public final class f extends org.jf.dexlib2.b.a.d implements d {
    private String pe;

    private f(String str) {
        this.pe = str;
    }

    public static f a(org.jf.dexlib2.e.c.e eVar) {
        if (eVar instanceof f) {
            return (f) eVar;
        }
        return new f(eVar.lD());
    }

    @Override // org.jf.dexlib2.e.c.e
    public final String lD() {
        return this.pe;
    }
}