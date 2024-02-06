package com.b.a.c;

import com.b.a.c.af;
import com.b.a.c.aj;
import java.io.Serializable;
import java.util.Map;

/* compiled from: ImmutableMap.java */
/* loaded from: repireall.jar:com/b/a/c/ai.class */
public abstract class ai<K, V> implements Serializable, Map<K, V> {
    private transient ao<Map.Entry<K, V>> jN;
    private transient ao<K> jO;
    private transient af<V> jP;

    @Override // java.util.Map
    public abstract V get(Object obj);

    abstract ao<Map.Entry<K, V>> eI();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean eF();

    public static <K, V> ai<K, V> fb() {
        return ae.eT();
    }

    public static <K, V> ai<K, V> k(K k, V v) {
        return ae.g(k, v);
    }

    static <K, V> aj.a<K, V> l(K k, V v) {
        n.f(k, v);
        return new aj.a<>(k, v);
    }

    public static <K, V> a<K, V> fc() {
        return new a<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z) {
            String valueOf = String.valueOf(String.valueOf(str));
            String valueOf2 = String.valueOf(String.valueOf(entry));
            String valueOf3 = String.valueOf(String.valueOf(entry2));
            throw new IllegalArgumentException(new StringBuilder(34 + valueOf.length() + valueOf2.length() + valueOf3.length()).append("Multiple entries with same ").append(valueOf).append(": ").append(valueOf2).append(" and ").append(valueOf3).toString());
        }
    }

    /* compiled from: ImmutableMap.java */
    /* loaded from: repireall.jar:com/b/a/c/ai$a.class */
    public static class a<K, V> {
        aj.a<K, V>[] jQ;
        int dK;

        public a() {
            this(4);
        }

        private a(int i) {
            this.jQ = new aj.a[4];
            this.dK = 0;
        }

        public a<K, V> i(K k, V v) {
            int i = this.dK + 1;
            if (i > this.jQ.length) {
                this.jQ = (aj.a[]) be.d(this.jQ, af.b.c(this.jQ.length, i));
            }
            aj.a<K, V> l = ai.l(k, v);
            aj.a<K, V>[] aVarArr = this.jQ;
            int i2 = this.dK;
            this.dK = i2 + 1;
            aVarArr[i2] = l;
            return this;
        }

        public ai<K, V> eW() {
            switch (this.dK) {
                case 0:
                    return ai.fb();
                case CAN_THROW:
                    return ai.k(this.jQ[0].getKey(), this.jQ[0].getValue());
                default:
                    return new bn(this.dK, this.jQ);
            }
        }
    }

    static {
        Map.Entry[] entryArr = new Map.Entry[0];
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: eH */
    public ao<Map.Entry<K, V>> entrySet() {
        ao<Map.Entry<K, V>> aoVar = this.jN;
        if (aoVar == null) {
            ao<Map.Entry<K, V>> eI = eI();
            this.jN = eI;
            return eI;
        }
        return aoVar;
    }

    @Override // java.util.Map
    /* renamed from: eJ */
    public ao<K> keySet() {
        ao<K> aoVar = this.jO;
        if (aoVar == null) {
            ao<K> fd = fd();
            this.jO = fd;
            return fd;
        }
        return aoVar;
    }

    ao<K> fd() {
        return new al(this);
    }

    @Override // java.util.Map
    /* renamed from: eN */
    public af<V> values() {
        af<V> afVar = this.jP;
        if (afVar == null) {
            am amVar = new am(this);
            this.jP = amVar;
            return amVar;
        }
        return afVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ba.a((Map<?, ?>) this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public String toString() {
        return ba.a(this);
    }
}