package com.b.a.c;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
/* loaded from: repireall.jar:com/b/a/c/ag.class */
class ag<K, V> extends e<K, V> implements Serializable {
    private K il;
    private V gb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ag(K k, V v) {
        this.il = k;
        this.gb = v;
    }

    @Override // com.b.a.c.e, java.util.Map.Entry
    public final K getKey() {
        return this.il;
    }

    @Override // com.b.a.c.e, java.util.Map.Entry
    public final V getValue() {
        return this.gb;
    }

    @Override // com.b.a.c.e, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}