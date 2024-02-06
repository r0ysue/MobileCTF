package org.jf.dexlib2.c;

/* compiled from: BuilderInstruction.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/c.class */
public abstract class c implements org.jf.dexlib2.e.b.f {
    protected final org.jf.dexlib2.e uq;
    h un;

    public abstract org.jf.dexlib2.d jf();

    /* JADX INFO: Access modifiers changed from: protected */
    public c(org.jf.dexlib2.e eVar) {
        org.jf.dexlib2.h.f.a(eVar, jf());
        this.uq = eVar;
    }

    @Override // org.jf.dexlib2.e.b.f
    public final org.jf.dexlib2.e iQ() {
        return this.uq;
    }

    @Override // org.jf.dexlib2.e.b.f
    public int iR() {
        return jf().size / 2;
    }

    public final h jg() {
        if (this.un == null) {
            throw new IllegalStateException("Cannot get the location of an instruction that hasn't been added to a method.");
        }
        return this.un;
    }
}