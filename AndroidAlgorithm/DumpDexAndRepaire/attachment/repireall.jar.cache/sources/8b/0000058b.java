package org.jf.dexlib2.i;

import java.util.Collection;

/* compiled from: AnnotationSection.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/a.class */
public interface a<StringKey, TypeKey, AnnotationKey, AnnotationElement, EncodedValue> extends n<AnnotationKey> {
    /* JADX WARN: Incorrect types in method signature: (TAnnotationKey;)I */
    int c(org.jf.dexlib2.e.a aVar);

    /* JADX WARN: Incorrect types in method signature: (TAnnotationKey;)TTypeKey; */
    Object d(org.jf.dexlib2.e.a aVar);

    /* JADX WARN: Incorrect types in method signature: (TAnnotationKey;)Ljava/util/Collection<+TAnnotationElement;>; */
    Collection e(org.jf.dexlib2.e.a aVar);

    /* JADX WARN: Incorrect types in method signature: (TAnnotationElement;)TStringKey; */
    Object c(org.jf.dexlib2.e.b bVar);

    /* JADX WARN: Incorrect types in method signature: (TAnnotationElement;)TEncodedValue; */
    Object d(org.jf.dexlib2.e.b bVar);
}