package org.jf.dexlib2.f.c;

import com.b.a.c.ah;
import java.util.List;

/* compiled from: ImmutableMethodReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/c/c.class */
public final class c extends org.jf.dexlib2.b.a.c implements d {
    private String sD;
    private String cW;
    private ah<String> Ae;
    private String Af;

    @Override // org.jf.dexlib2.e.c.c
    public final /* bridge */ /* synthetic */ List iH() {
        return this.Ae;
    }

    public c(String str, String str2, Iterable<? extends CharSequence> iterable, String str3) {
        this.sD = str;
        this.cW = str2;
        this.Ae = org.jf.dexlib2.f.d.a.m(iterable);
        this.Af = str3;
    }

    public static c d(org.jf.dexlib2.e.c.c cVar) {
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return new c(cVar.iG(), cVar.bf(), cVar.iH(), cVar.iI());
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String iG() {
        return this.sD;
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String bf() {
        return this.cW;
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String iI() {
        return this.Af;
    }
}