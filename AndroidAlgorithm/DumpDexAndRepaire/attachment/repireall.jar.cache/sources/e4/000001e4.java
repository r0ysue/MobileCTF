package com.b.a.c;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: AbstractListMultimap.java */
/* loaded from: repireall.jar:com/b/a/c/c.class */
abstract class c<K, V> extends d<K, V> implements aw<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.d
    /* renamed from: dW */
    public abstract List<V> dY();

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.b.a.c.d, com.b.a.c.bb
    /* renamed from: q */
    public List<V> r(K k) {
        return (List) super.r(k);
    }

    @Override // com.b.a.c.f, com.b.a.c.bb
    public Map<K, Collection<V>> dX() {
        return super.dX();
    }

    @Override // com.b.a.c.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}