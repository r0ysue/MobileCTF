package org.jf.dexlib2.f;

import com.b.a.c.ao;
import java.util.Collection;
import java.util.Set;

/* compiled from: ImmutableDexFile.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/d.class */
public final class d implements org.jf.dexlib2.e.d {
    private ao<? extends c> zZ;
    private final org.jf.dexlib2.f Aa;

    @Override // org.jf.dexlib2.e.d
    public final /* bridge */ /* synthetic */ Set kz() {
        return this.zZ;
    }

    public d(org.jf.dexlib2.f fVar, Collection<? extends org.jf.dexlib2.e.c> collection) {
        this.zZ = c.g(collection);
        this.Aa = fVar;
    }

    @Override // org.jf.dexlib2.e.d
    public final org.jf.dexlib2.f kx() {
        return this.Aa;
    }
}