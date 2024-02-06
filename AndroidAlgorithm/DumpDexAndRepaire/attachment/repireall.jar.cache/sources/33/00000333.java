package org.jf.dexlib2.a;

/* compiled from: PrimitiveProto.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/m.class */
public final class m implements o {
    private e qV;
    private String eb;

    public m(e eVar, String str) {
        this.qV = eVar;
        this.eb = str;
    }

    public final String toString() {
        return this.eb;
    }

    @Override // org.jf.dexlib2.a.o
    public final e in() {
        return this.qV;
    }

    @Override // org.jf.dexlib2.a.o
    public final String io() {
        return this.eb;
    }

    @Override // org.jf.dexlib2.a.o
    public final boolean ip() {
        return false;
    }

    @Override // org.jf.dexlib2.a.o
    public final boolean bh(String str) {
        return false;
    }

    @Override // org.jf.dexlib2.a.o
    public final String is() {
        return null;
    }

    @Override // org.jf.dexlib2.a.o
    public final o a(o oVar) {
        throw new org.jf.a.i("Cannot call getCommonSuperclass on PrimitiveProto", new Object[0]);
    }

    @Override // org.jf.dexlib2.a.o
    public final org.jf.dexlib2.e.c.a aq(int i) {
        return null;
    }

    @Override // org.jf.dexlib2.a.o
    public final org.jf.dexlib2.e.g ar(int i) {
        return null;
    }

    @Override // org.jf.dexlib2.a.o
    public final int a(org.jf.dexlib2.e.c.c cVar) {
        return -1;
    }
}