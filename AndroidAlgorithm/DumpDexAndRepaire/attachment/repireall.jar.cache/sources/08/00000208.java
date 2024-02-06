package com.b.a.c;

import java.util.Map;

/* compiled from: AbstractMapEntry.java */
/* loaded from: repireall.jar:com/b/a/c/e.class */
abstract class e<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return com.b.a.a.h.e(getKey(), entry.getKey()) && com.b.a.a.h.e(getValue(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    public String toString() {
        String valueOf = String.valueOf(String.valueOf(getKey()));
        String valueOf2 = String.valueOf(String.valueOf(getValue()));
        return new StringBuilder(1 + valueOf.length() + valueOf2.length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}