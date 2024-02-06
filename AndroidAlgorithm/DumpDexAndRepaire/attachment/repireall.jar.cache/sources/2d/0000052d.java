package org.jf.dexlib2.f.e;

/* compiled from: ImmutableMethodEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/n.class */
public final class n extends org.jf.dexlib2.b.b.l implements g {
    private org.jf.dexlib2.e.c.c AS;

    public n(org.jf.dexlib2.e.c.c cVar) {
        this.AS = cVar;
    }

    public static n a(org.jf.dexlib2.e.d.m mVar) {
        if (mVar instanceof n) {
            return (n) mVar;
        }
        return new n(mVar.lO());
    }

    @Override // org.jf.dexlib2.e.d.m
    public final org.jf.dexlib2.e.c.c lO() {
        return this.AS;
    }
}