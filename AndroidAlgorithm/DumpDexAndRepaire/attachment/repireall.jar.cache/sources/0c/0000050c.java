package org.jf.dexlib2.f;

import com.b.a.c.ah;
import com.b.a.c.ao;
import com.b.a.c.as;
import com.b.a.c.av;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jf.a.k;

/* compiled from: ImmutableClassDef.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/c.class */
public final class c extends org.jf.dexlib2.b.a.e implements org.jf.dexlib2.e.c {
    private String eb;
    private int wM;
    private String zQ;
    private ah<String> zR;
    private String pF;
    private ao<? extends a> zS;
    private as<? extends f> zT;
    private as<? extends f> zU;
    protected final as<? extends g> zV;
    protected final as<? extends g> zW;
    private static final k<c, org.jf.dexlib2.e.c> zX = new k<c, org.jf.dexlib2.e.c>() { // from class: org.jf.dexlib2.f.c.2
        @Override // org.jf.a.k
        protected final /* synthetic */ c O(org.jf.dexlib2.e.c cVar) {
            return c.b(cVar);
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(org.jf.dexlib2.e.c cVar) {
            return cVar instanceof c;
        }
    };

    @Override // org.jf.dexlib2.e.c
    public final /* synthetic */ Iterable iY() {
        return new AbstractCollection<g>() { // from class: org.jf.dexlib2.f.c.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<g> iterator() {
                return av.b(c.this.zV.iterator(), c.this.zW.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return c.this.zV.size() + c.this.zW.size();
            }
        };
    }

    @Override // org.jf.dexlib2.e.c
    public final /* bridge */ /* synthetic */ Iterable iX() {
        return this.zW;
    }

    @Override // org.jf.dexlib2.e.c
    public final /* bridge */ /* synthetic */ Iterable iW() {
        return this.zV;
    }

    @Override // org.jf.dexlib2.e.c
    public final /* bridge */ /* synthetic */ Iterable iV() {
        return this.zU;
    }

    @Override // org.jf.dexlib2.e.c
    public final /* bridge */ /* synthetic */ Iterable iU() {
        return this.zT;
    }

    @Override // org.jf.dexlib2.e.c
    public final /* bridge */ /* synthetic */ Set iK() {
        return this.zS;
    }

    @Override // org.jf.dexlib2.e.c
    public final /* bridge */ /* synthetic */ List iS() {
        return this.zR;
    }

    private c(String str, int i, String str2, Collection<String> collection, String str3, Collection<? extends org.jf.dexlib2.e.a> collection2, Iterable<? extends org.jf.dexlib2.e.f> iterable, Iterable<? extends org.jf.dexlib2.e.f> iterable2, Iterable<? extends org.jf.dexlib2.e.g> iterable3, Iterable<? extends org.jf.dexlib2.e.g> iterable4) {
        this.eb = str;
        this.wM = i;
        this.zQ = str2;
        this.zR = collection == null ? ah.eY() : ah.d(collection);
        this.pF = str3;
        this.zS = a.g(collection2);
        this.zT = f.k(iterable);
        this.zU = f.k(iterable2);
        this.zV = g.k(iterable3);
        this.zW = g.k(iterable4);
    }

    public static c b(org.jf.dexlib2.e.c cVar) {
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return new c(cVar.io(), cVar.iJ(), cVar.is(), cVar.iS(), cVar.iT(), cVar.iK(), cVar.iU(), cVar.iV(), cVar.iW(), cVar.iX());
    }

    @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
    public final String io() {
        return this.eb;
    }

    @Override // org.jf.dexlib2.e.c
    public final int iJ() {
        return this.wM;
    }

    @Override // org.jf.dexlib2.e.c
    public final String is() {
        return this.zQ;
    }

    @Override // org.jf.dexlib2.e.c
    public final String iT() {
        return this.pF;
    }

    public static ao<c> g(Iterable<? extends org.jf.dexlib2.e.c> iterable) {
        return zX.o(iterable);
    }
}