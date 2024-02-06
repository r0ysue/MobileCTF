package org.jf.a;

/* compiled from: AlignmentUtils.java */
/* loaded from: repireall.jar:org/jf/a/c.class */
public abstract class c {
    private static /* synthetic */ boolean pL;

    static {
        pL = !c.class.desiredAssertionStatus();
    }

    public static int r(int i, int i2) {
        int i3 = i2 - 1;
        if (pL || (i2 >= 0 && (i3 & i2) == 0)) {
            return (i + i3) & (i3 ^ (-1));
        }
        throw new AssertionError();
    }

    public static boolean s(int i, int i2) {
        return i % i2 == 0;
    }
}