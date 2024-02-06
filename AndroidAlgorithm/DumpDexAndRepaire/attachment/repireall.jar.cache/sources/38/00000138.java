package com.b.a.c;

import com.b.a.c.ai;
import java.util.Collection;
import java.util.Map;

/* compiled from: ImmutableBiMap.java */
/* loaded from: repireall.jar:com/b/a/c/ae.class */
public abstract class ae<K, V> extends ai<K, V> implements k<K, V> {
    public abstract ae<V, K> eG();

    @Override // com.b.a.c.ai
    public final /* synthetic */ af eN() {
        return eG().keySet();
    }

    @Override // com.b.a.c.ai, java.util.Map
    public /* synthetic */ Collection values() {
        return eG().keySet();
    }

    public static <K, V> ae<K, V> eT() {
        return t.jB;
    }

    public static <K, V> ae<K, V> g(K k, V v) {
        return new bu(k, v);
    }

    public static <K, V> a<K, V> eU() {
        return new a<>();
    }

    /* compiled from: ImmutableBiMap.java */
    /* loaded from: repireall.jar:com/b/a/c/ae$a.class */
    public static final class a<K, V> extends ai.a<K, V> {
        @Override // com.b.a.c.ai.a
        /* renamed from: h */
        public final a<K, V> i(K k, V v) {
            super.i(k, v);
            return this;
        }

        @Override // com.b.a.c.ai.a
        /* renamed from: eV */
        public final ae<K, V> eW() {
            switch (this.dK) {
                case 0:
                    return ae.eT();
                case CAN_THROW:
                    return ae.g(this.jQ[0].getKey(), this.jQ[0].getValue());
                default:
                    return new bl(this.dK, this.jQ);
            }
        }
    }

    static {
        Map.Entry[] entryArr = new Map.Entry[0];
    }
}