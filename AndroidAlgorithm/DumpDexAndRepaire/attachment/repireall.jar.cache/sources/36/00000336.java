package org.jf.dexlib2.a;

/* compiled from: UnknownClassProto.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/p.class */
public final class p implements o {
    private e qV;

    public p(e eVar) {
        this.qV = eVar;
    }

    public final String toString() {
        return "Ujava/lang/Object;";
    }

    @Override // org.jf.dexlib2.a.o
    public final e in() {
        return this.qV;
    }

    @Override // org.jf.dexlib2.a.o
    public final String is() {
        return null;
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
    public final o a(o oVar) {
        if (oVar.io().equals("Ljava/lang/Object;")) {
            return oVar;
        }
        if (oVar instanceof d) {
            return this.qV.a("Ljava/lang/Object;");
        }
        return this;
    }

    @Override // org.jf.dexlib2.a.o
    public final String io() {
        return "Ujava/lang/Object;";
    }

    @Override // org.jf.dexlib2.a.o
    public final org.jf.dexlib2.e.c.a aq(int i) {
        return this.qV.a("Ljava/lang/Object;").aq(i);
    }

    @Override // org.jf.dexlib2.a.o
    public final org.jf.dexlib2.e.g ar(int i) {
        return this.qV.a("Ljava/lang/Object;").ar(i);
    }

    @Override // org.jf.dexlib2.a.o
    public final int a(org.jf.dexlib2.e.c.c cVar) {
        return this.qV.a("Ljava/lang/Object;").a(cVar);
    }
}