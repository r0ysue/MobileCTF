package org.jf.dexlib2.c.b;

/* compiled from: BuilderSwitchElement.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/b/ai.class */
public final class ai implements org.jf.dexlib2.e.b.o {
    private org.jf.dexlib2.c.e vw;
    private final int vx;
    private final org.jf.dexlib2.c.g vy;

    public ai(org.jf.dexlib2.c.e eVar, int i, org.jf.dexlib2.c.g gVar) {
        this.vw = eVar;
        this.vx = i;
        this.vy = gVar;
    }

    @Override // org.jf.dexlib2.e.b.o
    public final int hL() {
        return this.vx;
    }

    @Override // org.jf.dexlib2.e.b.o
    public final int kb() {
        return this.vy.jo() - this.vw.jk().jr();
    }
}