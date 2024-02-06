package com.b.a.c;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonImmutableBiMap.java */
/* loaded from: repireall.jar:com/b/a/c/bu.class */
public final class bu<K, V> extends ae<K, V> {
    private transient K mz;
    private transient V mA;
    private transient ae<V, K> mB;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bu(K k, V v) {
        n.f(k, v);
        this.mz = k;
        this.mA = v;
    }

    private bu(K k, V v, ae<V, K> aeVar) {
        this.mz = k;
        this.mA = v;
        this.mB = aeVar;
    }

    @Override // com.b.a.c.ai, java.util.Map
    public final V get(Object obj) {
        if (this.mz.equals(obj)) {
            return this.mA;
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.b.a.c.ai, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.mz.equals(obj);
    }

    @Override // com.b.a.c.ai, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.mA.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.ai
    public final boolean eF() {
        return false;
    }

    @Override // com.b.a.c.ai
    final ao<Map.Entry<K, V>> eI() {
        return ao.w(ba.n(this.mz, this.mA));
    }

    @Override // com.b.a.c.ai
    final ao<K> fd() {
        return ao.w(this.mz);
    }

    @Override // com.b.a.c.ae
    public final ae<V, K> eG() {
        ae<V, K> aeVar = this.mB;
        if (aeVar == null) {
            bu buVar = new bu(this.mA, this.mz, this);
            this.mB = buVar;
            return buVar;
        }
        return aeVar;
    }
}