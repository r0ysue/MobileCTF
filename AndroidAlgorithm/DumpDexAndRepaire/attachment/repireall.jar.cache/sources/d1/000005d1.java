package org.jf.dexlib2.i;

import java.util.Collection;

/* compiled from: TypeListSection.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/q.class */
public interface q<TypeKey, TypeListKey> extends m<TypeListKey> {
    @Override // org.jf.dexlib2.i.m
    int ak(TypeListKey typelistkey);

    Collection<? extends TypeKey> am(TypeListKey typelistkey);
}