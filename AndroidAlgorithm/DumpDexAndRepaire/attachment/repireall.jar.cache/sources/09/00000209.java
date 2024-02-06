package com.b.a.c;

import com.b.a.c.ba;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMultimap.java */
/* loaded from: repireall.jar:com/b/a/c/f.class */
public abstract class f<K, V> implements bb<K, V> {
    private transient Set<K> jk;
    private transient Map<K, Collection<V>> jl;

    abstract Map<K, Collection<V>> ea();

    public Set<K> keySet() {
        Set<K> set = this.jk;
        if (set == null) {
            Set<K> dZ = dZ();
            this.jk = dZ;
            return dZ;
        }
        return set;
    }

    Set<K> dZ() {
        return new ba.e(dX());
    }

    @Override // com.b.a.c.bb
    public Map<K, Collection<V>> dX() {
        Map<K, Collection<V>> map = this.jl;
        if (map == null) {
            Map<K, Collection<V>> ea = ea();
            this.jl = ea;
            return ea;
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bb) {
            return dX().equals(((bb) obj).dX());
        }
        return false;
    }

    public int hashCode() {
        return dX().hashCode();
    }

    public String toString() {
        return dX().toString();
    }
}