package org.jf.dexlib2.c.a;

import org.jf.dexlib2.e.a.h;

/* compiled from: BuilderSetSourceFile.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/a/f.class */
public final class f extends org.jf.dexlib2.c.a implements h {
    private final org.jf.dexlib2.e.c.e uW;

    public f(org.jf.dexlib2.e.c.e eVar) {
        this.uW = eVar;
    }

    @Override // org.jf.dexlib2.e.a.a
    public final int jC() {
        return 9;
    }

    @Override // org.jf.dexlib2.e.a.h
    public final String iT() {
        if (this.uW == null) {
            return null;
        }
        return this.uW.lD();
    }

    @Override // org.jf.dexlib2.e.a.h
    public final org.jf.dexlib2.e.c.e jE() {
        return this.uW;
    }
}