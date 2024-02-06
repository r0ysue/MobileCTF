package com.b.a.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayListMultimap.java */
/* loaded from: repireall.jar:com/b/a/c/j.class */
public final class j<K, V> extends c<K, V> {
    private transient int jo;

    @Override // com.b.a.c.c, com.b.a.c.f
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.b.a.c.c, com.b.a.c.f, com.b.a.c.bb
    public final /* bridge */ /* synthetic */ Map dX() {
        return super.dX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.b.a.c.c
    public final /* bridge */ /* synthetic */ List q(Object obj) {
        return super.r(obj);
    }

    @Override // com.b.a.c.d
    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.b.a.c.f
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.b.a.c.f
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.b.a.c.f
    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public static <K, V> j<K, V> eo() {
        return new j<>();
    }

    private j() {
        super(new HashMap());
        this.jo = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.c, com.b.a.c.d
    /* renamed from: dW */
    public final List<V> dY() {
        return new ArrayList(this.jo);
    }
}