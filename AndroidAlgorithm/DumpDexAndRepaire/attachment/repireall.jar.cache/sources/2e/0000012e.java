package com.b.a.b;

import java.util.Map;

/* compiled from: RemovalNotification.java */
/* loaded from: repireall.jar:com/b/a/b/m.class */
public final class m<K, V> implements Map.Entry<K, V> {
    private final K iv;
    private final V iw;
    private final k ix;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(K k, V v, k kVar) {
        this.iv = k;
        this.iw = v;
        this.ix = (k) com.b.a.a.i.i(kVar);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.iv;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.iw;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return com.b.a.a.h.e(getKey(), entry.getKey()) && com.b.a.a.h.e(getValue(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(String.valueOf(getKey()));
        String valueOf2 = String.valueOf(String.valueOf(getValue()));
        return new StringBuilder(1 + valueOf.length() + valueOf2.length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}