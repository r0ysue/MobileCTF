package com.b.a.c;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap.java */
/* loaded from: repireall.jar:com/b/a/c/z.class */
public abstract class z<K, V> extends aa implements Map<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.b.a.c.aa
    /* renamed from: eR */
    public abstract Map<K, V> eQ();

    @Override // java.util.Map
    public int size() {
        return eQ().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return eQ().isEmpty();
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return eQ().remove(obj);
    }

    @Override // java.util.Map
    public void clear() {
        eQ().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return eQ().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return eQ().containsValue(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return eQ().get(obj);
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return eQ().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        eQ().putAll(map);
    }

    public Set<K> keySet() {
        return eQ().keySet();
    }

    public Collection<V> values() {
        return eQ().values();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return eQ().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || eQ().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return eQ().hashCode();
    }
}