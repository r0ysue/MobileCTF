package org.jf.dexlib2.f.e;

/* compiled from: ImmutableBooleanEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/c.class */
public final class c extends org.jf.dexlib2.b.b.c implements g {
    private static c AJ = new c(true);
    public static final c AK = new c(false);
    private boolean AL;

    private c(boolean z) {
        this.AL = z;
    }

    public static c W(boolean z) {
        return z ? AJ : AK;
    }

    public static c a(org.jf.dexlib2.e.d.c cVar) {
        return W(cVar.lQ());
    }

    @Override // org.jf.dexlib2.e.d.c
    public final boolean lQ() {
        return this.AL;
    }
}