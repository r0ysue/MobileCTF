package com.b.a.c;

import java.util.Iterator;
import java.util.Map;

/* compiled from: ImmutableMapKeySet.java */
/* loaded from: repireall.jar:com/b/a/c/al.class */
final class al<K, V> extends ao<K> {
    private final ai<K, V> jR;

    @Override // com.b.a.c.ao, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return eK().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(ai<K, V> aiVar) {
        this.jR = aiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.jR.size();
    }

    @Override // com.b.a.c.af
    public final cf<K> eB() {
        return eK().iterator();
    }

    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.jR.containsKey(obj);
    }

    @Override // com.b.a.c.af
    final ah<K> eX() {
        final ah<Map.Entry<K, V>> eK = this.jR.entrySet().eK();
        return new ad<K>() { // from class: com.b.a.c.al.1
            @Override // java.util.List
            public final K get(int i) {
                return (K) ((Map.Entry) eK.get(i)).getKey();
            }

            @Override // com.b.a.c.ad
            final af<K> eS() {
                return al.this;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return true;
    }
}