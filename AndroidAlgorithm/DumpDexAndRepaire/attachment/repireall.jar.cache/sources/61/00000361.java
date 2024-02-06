package org.jf.dexlib2.c.a;

import org.jf.dexlib2.e.a.i;

/* compiled from: BuilderStartLocal.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/a/g.class */
public final class g extends org.jf.dexlib2.c.a implements i {
    private final int uX;
    private final org.jf.dexlib2.e.c.e uY;
    private final org.jf.dexlib2.e.c.f uZ;
    private final org.jf.dexlib2.e.c.e va;

    public g(int i, org.jf.dexlib2.e.c.e eVar, org.jf.dexlib2.e.c.f fVar, org.jf.dexlib2.e.c.e eVar2) {
        this.uX = i;
        this.uY = eVar;
        this.uZ = fVar;
        this.va = eVar2;
    }

    @Override // org.jf.dexlib2.e.a.i
    public final int jB() {
        return this.uX;
    }

    @Override // org.jf.dexlib2.e.a.i
    public final org.jf.dexlib2.e.c.e jF() {
        return this.uY;
    }

    @Override // org.jf.dexlib2.e.a.i
    public final org.jf.dexlib2.e.c.f jG() {
        return this.uZ;
    }

    @Override // org.jf.dexlib2.e.a.i
    public final org.jf.dexlib2.e.c.e jH() {
        return this.va;
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String bf() {
        if (this.uY == null) {
            return null;
        }
        return this.uY.lD();
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String io() {
        if (this.uZ == null) {
            return null;
        }
        return this.uZ.io();
    }

    @Override // org.jf.dexlib2.e.a.e
    public final String jb() {
        if (this.va == null) {
            return null;
        }
        return this.va.lD();
    }

    @Override // org.jf.dexlib2.e.a.a
    public final int jC() {
        return 3;
    }
}