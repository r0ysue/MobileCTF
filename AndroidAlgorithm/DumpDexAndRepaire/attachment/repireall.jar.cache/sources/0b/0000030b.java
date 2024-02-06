package org.jf.dexlib2.a.b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jf.dexlib2.a.o;
import org.jf.dexlib2.a.q;

/* compiled from: TypeProtoUtils.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/b/a.class */
public final class a {
    public static Iterable<o> b(final o oVar) {
        return new Iterable<o>() { // from class: org.jf.dexlib2.a.b.a.1
            @Override // java.lang.Iterable
            public final Iterator<o> iterator() {
                return new Iterator<o>() { // from class: org.jf.dexlib2.a.b.a.1.1
                    private o tq;

                    {
                        this.tq = a.c(o.this);
                    }

                    @Override // java.util.Iterator
                    public final /* synthetic */ o next() {
                        o oVar2 = this.tq;
                        if (oVar2 == null) {
                            throw new NoSuchElementException();
                        }
                        this.tq = a.c(oVar2);
                        return oVar2;
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return this.tq != null;
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static o c(o oVar) {
        try {
            String is = oVar.is();
            if (is != null) {
                return oVar.in().a(is);
            }
            return null;
        } catch (q unused) {
            return oVar.in().iu();
        }
    }
}