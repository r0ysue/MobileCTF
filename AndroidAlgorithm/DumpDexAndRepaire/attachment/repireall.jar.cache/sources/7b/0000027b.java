package org.jf.a;

import java.util.BitSet;

/* compiled from: BitSetUtils.java */
/* loaded from: repireall.jar:org/jf/a/d.class */
public final class d {
    public static BitSet a(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }
}