package com.b.a.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImmutableMapEntry.java */
/* loaded from: repireall.jar:com/b/a/c/aj.class */
public abstract class aj<K, V> extends ag<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract aj<K, V> fe();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract aj<K, V> ff();

    aj(K k, V v) {
        super(k, v);
        n.f(k, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aj(aj<K, V> ajVar) {
        super(ajVar.getKey(), ajVar.getValue());
    }

    /* compiled from: ImmutableMapEntry.java */
    /* loaded from: repireall.jar:com/b/a/c/aj$a.class */
    static final class a<K, V> extends aj<K, V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(K k, V v) {
            super(k, v);
        }

        @Override // com.b.a.c.aj
        final aj<K, V> fe() {
            return null;
        }

        @Override // com.b.a.c.aj
        final aj<K, V> ff() {
            return null;
        }
    }
}