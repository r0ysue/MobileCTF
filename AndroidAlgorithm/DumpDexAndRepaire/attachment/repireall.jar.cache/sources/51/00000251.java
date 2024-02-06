package org.antlr.stringtemplate.a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Cat.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/g.class */
public final class g extends AbstractList {
    private ArrayList oQ = new ArrayList();

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.oQ.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.oQ.size();
    }

    public g(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Object H = a.H(arrayList.get(i));
            if (!(H instanceof Iterator)) {
                this.oQ.add(H);
            } else {
                Iterator it = (Iterator) H;
                while (it.hasNext()) {
                    this.oQ.add(it.next());
                }
            }
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.oQ.size(); i++) {
            stringBuffer.append(this.oQ.get(i));
        }
        return stringBuffer.toString();
    }
}