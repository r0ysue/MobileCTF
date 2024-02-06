package org.jf.dexlib2.c;

/* compiled from: BuilderOffsetInstruction.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/d.class */
public abstract class d extends c implements org.jf.dexlib2.e.b.j {
    private g ur;

    public d(org.jf.dexlib2.e eVar, g gVar) {
        super(eVar);
        this.ur = gVar;
    }

    @Override // org.jf.dexlib2.e.b.j
    public final int jh() {
        int ji = ji();
        if (iR() == 1) {
            if (ji < -128 || ji > 127) {
                throw new org.jf.a.i("Invalid instruction offset: %d. Offset must be in [-128, 127]", Integer.valueOf(ji));
            }
        } else if (iR() == 2 && (ji < -32768 || ji > 32767)) {
            throw new org.jf.a.i("Invalid instruction offset: %d. Offset must be in [-32768, 32767]", Integer.valueOf(ji));
        }
        return ji;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ji() {
        return this.ur.jp().qq - jg().qq;
    }

    public final g jj() {
        return this.ur;
    }
}