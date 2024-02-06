package org.jf.dexlib2.f.e;

import com.b.a.c.ao;
import java.util.Collection;
import java.util.Set;

/* compiled from: ImmutableAnnotationEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/e/a.class */
public final class a extends org.jf.dexlib2.b.b.a implements g {
    private String eb;
    private ao<? extends org.jf.dexlib2.f.b> zM;

    @Override // org.jf.dexlib2.e.d.a
    public final /* bridge */ /* synthetic */ Set ks() {
        return this.zM;
    }

    public a(String str, Collection<? extends org.jf.dexlib2.e.b> collection) {
        this.eb = str;
        this.zM = org.jf.dexlib2.f.b.g(collection);
    }

    public static a a(org.jf.dexlib2.e.d.a aVar) {
        if (aVar instanceof a) {
            return (a) aVar;
        }
        return new a(aVar.io(), aVar.ks());
    }

    @Override // org.jf.dexlib2.e.d.a
    public final String io() {
        return this.eb;
    }
}