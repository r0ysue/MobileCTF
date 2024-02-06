package org.jf.dexlib2.h;

import java.util.Arrays;
import java.util.List;

/* compiled from: InstructionOffsetMap.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/d.class */
public final class d {
    private final int[] CL;

    public d(List<? extends org.jf.dexlib2.e.b.f> list) {
        this.CL = new int[list.size()];
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.CL[i2] = i;
            i += list.get(i2).iR();
        }
    }

    public final int bn(int i) {
        return a(i, true);
    }

    public final int a(int i, boolean z) {
        int binarySearch = Arrays.binarySearch(this.CL, i);
        if (binarySearch < 0) {
            if (z) {
                throw new b(i);
            }
            return (binarySearch ^ (-1)) - 1;
        }
        return binarySearch;
    }

    public final int bo(int i) {
        if (i < 0 || i >= this.CL.length) {
            throw new a(i);
        }
        return this.CL[i];
    }

    /* compiled from: InstructionOffsetMap.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/h/d$b.class */
    public static class b extends org.jf.a.i {
        private final int CN;

        public b(int i) {
            super("No instruction at offset %d", Integer.valueOf(i));
            this.CN = i;
        }
    }

    /* compiled from: InstructionOffsetMap.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/h/d$a.class */
    public static class a extends org.jf.a.i {
        private final int CM;

        public a(int i) {
            super("Instruction index out of bounds: %d", Integer.valueOf(i));
            this.CM = i;
        }
    }
}