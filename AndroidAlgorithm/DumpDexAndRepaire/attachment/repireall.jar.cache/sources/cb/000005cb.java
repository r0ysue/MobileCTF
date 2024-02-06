package org.jf.dexlib2.i;

import org.jf.dexlib2.e.c.b;
import org.jf.dexlib2.e.c.c;

/* compiled from: MethodSection.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/k.class */
public interface k<StringKey, TypeKey, ProtoRefKey extends org.jf.dexlib2.e.c.b, MethodRefKey extends org.jf.dexlib2.e.c.c, MethodKey> extends i<MethodRefKey> {
    MethodRefKey ah(MethodKey methodkey);

    TypeKey h(MethodRefKey methodrefkey);

    ProtoRefKey i(MethodRefKey methodrefkey);

    ProtoRefKey ai(MethodKey methodkey);

    StringKey j(MethodRefKey methodrefkey);

    int aj(MethodKey methodkey);
}