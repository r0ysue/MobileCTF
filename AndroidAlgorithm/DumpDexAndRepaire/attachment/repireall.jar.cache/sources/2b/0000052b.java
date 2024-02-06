package org.jf.dexlib2.f.e;

/* compiled from: ImmutableIntEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/l.class */
public class l extends org.jf.dexlib2.b.b.j implements g {
    private int value;

    public l(int i) {
        this.value = i;
    }

    public static l a(org.jf.dexlib2.e.d.k kVar) {
        if (kVar instanceof l) {
            return (l) kVar;
        }
        return new l(kVar.getValue());
    }

    @Override // org.jf.dexlib2.e.d.k
    public final int getValue() {
        return this.value;
    }
}