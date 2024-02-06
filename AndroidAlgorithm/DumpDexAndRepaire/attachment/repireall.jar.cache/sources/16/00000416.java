package org.jf.dexlib2.d.d;

import com.b.a.c.ao;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: ParameterIterator.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/d/e.class */
public final class e implements Iterator<org.jf.dexlib2.e.i> {
    private final Iterator<? extends CharSequence> zg;
    private final Iterator<? extends Set<? extends org.jf.dexlib2.e.a>> zh;
    private final Iterator<String> zi;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Set] */
    @Override // java.util.Iterator
    public final /* synthetic */ org.jf.dexlib2.e.i next() {
        ao fl;
        String str;
        final String charSequence = this.zg.next().toString();
        if (this.zh.hasNext()) {
            fl = (Set) this.zh.next();
        } else {
            fl = ao.fl();
        }
        if (this.zi.hasNext()) {
            str = this.zi.next();
        } else {
            str = null;
        }
        final ao aoVar = fl;
        final String str2 = str;
        return new org.jf.dexlib2.b.d() { // from class: org.jf.dexlib2.d.d.e.1
            @Override // org.jf.dexlib2.e.i
            public final Set<? extends org.jf.dexlib2.e.a> iK() {
                return aoVar;
            }

            @Override // org.jf.dexlib2.e.i, org.jf.dexlib2.e.a.e
            public final String bf() {
                return str2;
            }

            @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
            public final String io() {
                return charSequence;
            }
        };
    }

    public e(List<? extends CharSequence> list, List<? extends Set<? extends org.jf.dexlib2.e.a>> list2, Iterator<String> it) {
        this.zg = list.iterator();
        this.zh = list2.iterator();
        this.zi = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zg.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}