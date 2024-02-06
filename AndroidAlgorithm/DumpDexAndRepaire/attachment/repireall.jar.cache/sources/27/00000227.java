package com.b.a.c;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: ForwardingCollection.java */
/* loaded from: repireall.jar:com/b/a/c/y.class */
public abstract class y<E> extends aa implements Collection<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.b.a.c.aa
    /* renamed from: eP */
    public abstract Collection<E> eQ();

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return eQ().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return eQ().size();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return eQ().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return eQ().isEmpty();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return eQ().contains(obj);
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        return eQ().add(e);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return eQ().remove(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return eQ().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return eQ().addAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return eQ().retainAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        eQ().clear();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return eQ().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) eQ().toArray(tArr);
    }
}