package org.jf.dexlib2.c;

/* compiled from: BuilderDebugItem.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/a.class */
public abstract class a implements org.jf.dexlib2.e.a.a {
    h un;

    @Override // org.jf.dexlib2.e.a.a
    public final int hQ() {
        if (this.un == null) {
            throw new IllegalStateException("Cannot get the address of a BuilderDebugItem that isn't associated with a method.");
        }
        return this.un.qq;
    }
}