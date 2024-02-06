package antlr.a.a;

/* compiled from: BitSet.java */
/* loaded from: repireall.jar:antlr/a/a/b.class */
public final class b implements Cloneable {
    private long[] dM;

    public b() {
        this(64);
    }

    public b(long[] jArr) {
        this.dM = jArr;
    }

    private b(int i) {
        this.dM = new long[((i - 1) >> 6) + 1];
    }

    public final void B(int i) {
        int i2 = i >> 6;
        if (i2 >= this.dM.length) {
            long[] jArr = new long[Math.max(this.dM.length << 1, (i >> 6) + 1)];
            System.arraycopy(this.dM, 0, jArr, 0, this.dM.length);
            this.dM = jArr;
        }
        long[] jArr2 = this.dM;
        jArr2[i2] = jArr2[i2] | C(i);
    }

    private static final long C(int i) {
        return 1 << (i & 63);
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.dM = new long[this.dM.length];
            System.arraycopy(this.dM, 0, bVar.dM, 0, this.dM.length);
            return bVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            int min = Math.min(this.dM.length, bVar.dM.length);
            int i = min;
            do {
                int i2 = i;
                i = i2 - 1;
                if (i2 <= 0) {
                    if (this.dM.length <= min) {
                        if (bVar.dM.length > min) {
                            int length = bVar.dM.length;
                            do {
                                int i3 = length;
                                length = i3 - 1;
                                if (i3 <= min) {
                                    return true;
                                }
                            } while (bVar.dM[length] == 0);
                            return false;
                        }
                        return true;
                    }
                    int length2 = this.dM.length;
                    do {
                        int i4 = length2;
                        length2 = i4 - 1;
                        if (i4 <= min) {
                            return true;
                        }
                    } while (this.dM[length2] == 0);
                    return false;
                }
            } while (this.dM[i] == bVar.dM[i]);
            return false;
        }
        return false;
    }

    public final boolean D(int i) {
        int i2 = i >> 6;
        return i2 < this.dM.length && (this.dM[i2] & C(i)) != 0;
    }

    public static b E(int i) {
        b bVar = new b(i + 1);
        bVar.B(i);
        return bVar;
    }

    public final void f(b bVar) {
        if (bVar.dM.length > this.dM.length) {
            int length = bVar.dM.length;
            long[] jArr = new long[length];
            System.arraycopy(this.dM, 0, jArr, 0, Math.min(length, this.dM.length));
            this.dM = jArr;
        }
        for (int min = Math.min(this.dM.length, bVar.dM.length) - 1; min >= 0; min--) {
            long[] jArr2 = this.dM;
            int i = min;
            jArr2[i] = jArr2[i] | bVar.dM[min];
        }
    }

    public final int[] aZ() {
        int i = 0;
        for (int length = this.dM.length - 1; length >= 0; length--) {
            long j = this.dM[length];
            if (j != 0) {
                for (int i2 = 63; i2 >= 0; i2--) {
                    if ((j & (1 << i2)) != 0) {
                        i++;
                    }
                }
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < (this.dM.length << 6); i4++) {
            if (D(i4)) {
                int i5 = i3;
                i3++;
                iArr[i5] = i4;
            }
        }
        return iArr;
    }

    public final String toString() {
        return N(",");
    }

    public final String N(String str) {
        String str2 = "";
        for (int i = 0; i < (this.dM.length << 6); i++) {
            if (D(i)) {
                if (str2.length() > 0) {
                    str2 = new StringBuffer().append(str2).append(str).toString();
                }
                str2 = new StringBuffer().append(str2).append(i).toString();
            }
        }
        return str2;
    }

    public final String b(String str, f fVar) {
        if (fVar == null) {
            return N(str);
        }
        String str2 = "";
        for (int i = 0; i < (this.dM.length << 6); i++) {
            if (D(i)) {
                if (str2.length() > 0) {
                    str2 = new StringBuffer().append(str2).append(str).toString();
                }
                if (i >= fVar.bc()) {
                    str2 = new StringBuffer().append(str2).append("<bad element ").append(i).append(">").toString();
                } else if (fVar.G(i) == null) {
                    str2 = new StringBuffer().append(str2).append("<").append(i).append(">").toString();
                } else {
                    str2 = new StringBuffer().append(str2).append((String) fVar.G(i)).toString();
                }
            }
        }
        return str2;
    }
}