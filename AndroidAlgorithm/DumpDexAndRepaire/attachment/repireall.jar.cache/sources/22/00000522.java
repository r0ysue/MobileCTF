package org.jf.dexlib2.f.e;

/* compiled from: ImmutableByteEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/d.class */
public class d extends org.jf.dexlib2.b.b.d implements g {
    private byte AM;

    public d(byte b) {
        this.AM = b;
    }

    public static d a(org.jf.dexlib2.e.d.d dVar) {
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return new d(dVar.lR());
    }

    @Override // org.jf.dexlib2.e.d.d
    public final byte lR() {
        return this.AM;
    }
}