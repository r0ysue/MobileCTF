package org.jf.dexlib2.c;

import com.b.a.c.ah;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MethodLocation.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/h.class */
public final class h {
    c uw;
    int qq;
    int ux;
    private List<g> uy = null;
    private List<a> uz = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(c cVar, int i, int i2) {
        this.uw = cVar;
        this.qq = i;
        this.ux = i2;
    }

    public final int jr() {
        return this.qq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<g> P(boolean z) {
        if (this.uy == null) {
            if (z) {
                this.uy = new ArrayList(1);
                return this.uy;
            }
            return ah.eY();
        }
        return this.uy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<a> Q(boolean z) {
        if (this.uz == null) {
            if (z) {
                this.uz = new ArrayList(1);
                return this.uz;
            }
            return ah.eY();
        }
        return this.uz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(h hVar) {
        if (this.uy != null || hVar.uy != null) {
            List<g> P = hVar.P(true);
            for (g gVar : P(false)) {
                gVar.un = hVar;
                P.add(gVar);
            }
            this.uy = null;
        }
        if (this.uz != null || hVar.uy != null) {
            List<a> Q = Q(true);
            for (a aVar : Q) {
                aVar.un = hVar;
            }
            Q.addAll(hVar.Q(false));
            hVar.uz = Q;
            this.uz = null;
        }
    }

    public final Set<g> js() {
        return new AbstractSet<g>() { // from class: org.jf.dexlib2.c.h.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* synthetic */ boolean add(Object obj) {
                g gVar = (g) obj;
                if (gVar.jq()) {
                    throw new IllegalArgumentException("Cannot add a label that is already placed. You must remove it from its current location first.");
                }
                gVar.un = h.this;
                h.this.P(true).add(gVar);
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<g> iterator() {
                final Iterator it = h.this.P(false).iterator();
                return new Iterator<g>() { // from class: org.jf.dexlib2.c.h.1.1
                    private g uB = null;

                    @Override // java.util.Iterator
                    public final /* bridge */ /* synthetic */ g next() {
                        this.uB = (g) it.next();
                        return this.uB;
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        if (this.uB != null) {
                            this.uB.un = null;
                        }
                        it.remove();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return h.this.P(false).size();
            }
        };
    }

    public final g jt() {
        g gVar = new g(this);
        P(true).add(gVar);
        return gVar;
    }

    public final Set<a> ju() {
        return new AbstractSet<a>() { // from class: org.jf.dexlib2.c.h.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* synthetic */ boolean add(Object obj) {
                a aVar = (a) obj;
                if (aVar.un != null) {
                    throw new IllegalArgumentException("Cannot add a debug item that has already been added to a method. You must remove it from its current location first.");
                }
                aVar.un = h.this;
                h.this.Q(true).add(aVar);
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<a> iterator() {
                final Iterator it = h.this.Q(false).iterator();
                return new Iterator<a>() { // from class: org.jf.dexlib2.c.h.2.1
                    private a uE = null;

                    @Override // java.util.Iterator
                    public final /* bridge */ /* synthetic */ a next() {
                        this.uE = (a) it.next();
                        return this.uE;
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        if (this.uE != null) {
                            this.uE.un = null;
                        }
                        it.remove();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return h.this.Q(false).size();
            }
        };
    }
}