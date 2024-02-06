package org.jf.dexlib2.f.a;

/* compiled from: ImmutableSetSourceFile.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/a/g.class */
public final class g extends a implements org.jf.dexlib2.e.a.h {
    protected final String Ar;

    public g(int i, String str) {
        super(i);
        this.Ar = str;
    }

    @Override // org.jf.dexlib2.e.a.h
    public final String iT() {
        return this.Ar;
    }

    @Override // org.jf.dexlib2.e.a.h
    public final org.jf.dexlib2.e.c.e jE() {
        if (this.Ar == null) {
            return null;
        }
        return new org.jf.dexlib2.b.a.d() { // from class: org.jf.dexlib2.f.a.g.1
            @Override // org.jf.dexlib2.e.c.e
            public final String lD() {
                return g.this.Ar;
            }
        };
    }

    @Override // org.jf.dexlib2.e.a.a
    public final int jC() {
        return 9;
    }
}