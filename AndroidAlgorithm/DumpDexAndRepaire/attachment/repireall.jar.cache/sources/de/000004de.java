package org.jf.dexlib2.f.a;

import org.jf.dexlib2.e.a.i;

/* compiled from: ImmutableStartLocal.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/a/h.class */
public final class h extends a implements i {
    private int uT;
    protected final String At;
    protected final String Au;
    protected final String Av;

    public h(int i, int i2, String str, String str2, String str3) {
        super(i);
        this.uT = i2;
        this.At = str;
        this.Au = str2;
        this.Av = str3;
    }

    @Override // org.jf.dexlib2.e.a.i
    public final int jB() {
        return this.uT;
    }

    @Override // org.jf.dexlib2.e.a.i
    public final org.jf.dexlib2.e.c.e jF() {
        if (this.At == null) {
            return null;
        }
        return new org.jf.dexlib2.b.a.d() { // from class: org.jf.dexlib2.f.a.h.1
            @Override // org.jf.dexlib2.e.c.e
            public final String lD() {
                return h.this.At;
            }
        };
    }

    @Override // org.jf.dexlib2.e.a.i
    public final org.jf.dexlib2.e.c.f jG() {
        if (this.Au == null) {
            return null;
        }
        return new org.jf.dexlib2.b.a.e() { // from class: org.jf.dexlib2.f.a.h.2
            @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
            public final String io() {
                return h.this.Au;
            }
        };
    }

    @Override // org.jf.dexlib2.e.a.i
    public final org.jf.dexlib2.e.c.e jH() {
        if (this.Av == null) {
            return null;
        }
        return new org.jf.dexlib2.b.a.d() { // from class: org.jf.dexlib2.f.a.h.3
            @Override // org.jf.dexlib2.e.c.e
            public final String lD() {
                return h.this.Av;
            }
        };
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String bf() {
        return this.At;
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String io() {
        return this.Au;
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String jb() {
        return this.Av;
    }

    @Override // org.jf.dexlib2.e.a.a
    public final int jC() {
        return 3;
    }
}