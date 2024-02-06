package org.jf.dexlib2.h;

/* compiled from: Preconditions.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/f.class */
public final class f {
    public static void a(org.jf.dexlib2.e eVar, org.jf.dexlib2.d dVar) {
        if (eVar.format != dVar) {
            throw new IllegalArgumentException(String.format("Invalid opcode %s for %s", eVar.name, dVar.name()));
        }
    }

    public static int bp(int i) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v15, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bq(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v255, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int br(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v65535, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bs(int i) {
        if (i < -8 || i > 7) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -8 and 7, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bt(int i) {
        if (i < -128 || i > 127) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -128 and 127, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bu(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -32768 and 32767, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bv(int i) {
        if ((i & 65535) != 0) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 16 bits must be zeroed out.", Integer.valueOf(i)));
        }
        return i;
    }

    public static long i(long j) {
        if ((j & 281474976710655L) != 0) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 48 bits must be zeroed out.", Long.valueOf(j)));
        }
        return j;
    }

    public static int bw(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(String.format("Invalid code offset: %d. Must be between -32768 and 32767, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bx(int i) {
        if (i < 0 || i > 5) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 5, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static int by(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 255, inclusive.", Integer.valueOf(i)));
        }
        return i;
    }

    public static void j(int i, int i2) {
        if (i > i2) {
            if (i2 == 0) {
                throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0", Integer.valueOf(i)));
            }
            throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static int bz(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(String.format("Invalid vtable index: %d. Must be between 0 and 65535, inclusive", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bA(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(String.format("Invalid inline index: %d. Must be between 0 and 65535, inclusive", Integer.valueOf(i)));
        }
        return i;
    }

    public static int bB(int i) {
        if (!org.jf.dexlib2.h.al(i)) {
            throw new IllegalArgumentException(String.format("Invalid verification error value: %d. Must be between 1 and 9, inclusive", Integer.valueOf(i)));
        }
        return i;
    }
}