package org.jf.dexlib2.f.e;

/* compiled from: ImmutableCharEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/e.class */
public class e extends org.jf.dexlib2.b.b.e implements g {
    private char AN;

    public e(char c) {
        this.AN = c;
    }

    public static e a(org.jf.dexlib2.e.d.e eVar) {
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return new e(eVar.lS());
    }

    @Override // org.jf.dexlib2.e.d.e
    public final char lS() {
        return this.AN;
    }
}