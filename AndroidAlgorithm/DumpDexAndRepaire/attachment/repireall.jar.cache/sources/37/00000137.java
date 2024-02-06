package com.b.a.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImmutableAsList.java */
/* loaded from: repireall.jar:com/b/a/c/ad.class */
public abstract class ad<E> extends ah<E> {
    abstract af<E> eS();

    @Override // com.b.a.c.ah, com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return eS().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return eS().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return eS().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.c.af
    public final boolean eF() {
        return eS().eF();
    }
}