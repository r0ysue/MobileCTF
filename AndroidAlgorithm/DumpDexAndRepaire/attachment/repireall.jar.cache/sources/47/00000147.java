package com.b.a.c;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImmutableMapEntrySet.java */
/* loaded from: repireall.jar:com/b/a/c/ak.class */
public abstract class ak<K, V> extends ao<Map.Entry<K, V>> {
    abstract ai<K, V> fg();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return fg().size();
    }

    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            V v = fg().get(entry.getKey());
            return v != null && v.equals(entry.getValue());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return fg().eF();
    }
}