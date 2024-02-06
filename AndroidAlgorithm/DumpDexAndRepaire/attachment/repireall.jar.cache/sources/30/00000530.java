package org.jf.dexlib2.f.e;

/* compiled from: ImmutableStringEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/q.class */
public final class q extends org.jf.dexlib2.b.b.o implements g {
    private String AV;

    public q(String str) {
        this.AV = str;
    }

    public static q a(org.jf.dexlib2.e.d.p pVar) {
        if (pVar instanceof q) {
            return (q) pVar;
        }
        return new q(pVar.lP());
    }

    @Override // org.jf.dexlib2.e.d.p
    public final String lP() {
        return this.AV;
    }
}