package com.b.a.b;

import com.b.a.b.n;
import java.io.Serializable;

/* compiled from: LongAdder.java */
/* loaded from: repireall.jar:com/b/a/b/j.class */
final class j extends n implements h, Serializable {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.b.a.b.n
    public final long a(long j, long j2) {
        return j + j2;
    }

    /* JADX WARN: Type inference failed for: r1v60, types: [long, com.b.a.b.n$a] */
    @Override // com.b.a.b.h
    public final void f(long j) {
        int i;
        int length;
        int length2;
        int length3;
        n.a aVar;
        n.a[] aVarArr = this.iB;
        if (aVarArr != null || !b(this.iC, j + 0)) {
            boolean z = true;
            int[] iArr = iy.get();
            if (iArr != null && aVarArr != null && (length3 = aVarArr.length) > 0 && (aVar = aVarArr[(length3 - 1) & iArr[0]]) != null) {
                ?? r1 = aVar.iH;
                boolean c = r1.c(r1, r1 + j);
                z = c;
                if (c) {
                    return;
                }
            }
            boolean z2 = z;
            int[] iArr2 = iArr;
            if (iArr2 == null) {
                int[] iArr3 = new int[1];
                iArr2 = iArr3;
                n.iy.set(iArr3);
                int nextInt = n.iz.nextInt();
                int i2 = nextInt == 0 ? 1 : nextInt;
                iArr2[0] = i2;
                i = i2;
            } else {
                i = iArr2[0];
            }
            boolean z3 = false;
            while (true) {
                n.a[] aVarArr2 = this.iB;
                if (aVarArr2 != null && (length = aVarArr2.length) > 0) {
                    n.a aVar2 = aVarArr2[(length - 1) & i];
                    if (aVar2 == null) {
                        int i3 = this.iD;
                        n.a aVar3 = new n.a(j);
                        int i4 = this.iD;
                        if (dS()) {
                            boolean z4 = false;
                            try {
                                n.a[] aVarArr3 = this.iB;
                                if (aVarArr3 != null && (length2 = aVarArr3.length) > 0) {
                                    int i5 = (length2 - 1) & i;
                                    if (aVarArr3[i5] == null) {
                                        aVarArr3[i5] = aVar3;
                                        z4 = true;
                                    }
                                }
                                if (z4) {
                                    return;
                                }
                            } finally {
                            }
                        } else {
                            z3 = false;
                            int i6 = i;
                            int i7 = i6 ^ (i6 << 13);
                            int i8 = i7 ^ (i7 >>> 17);
                            i = i8 ^ (i8 << 5);
                            iArr2[0] = i;
                        }
                    } else {
                        if (!z2) {
                            z2 = true;
                        } else {
                            long j2 = aVar2.iH;
                            if (aVar2.c(j2, a(j2, j))) {
                                return;
                            }
                            if (length >= n.iA || this.iB != aVarArr2) {
                                z3 = false;
                            } else if (!z3) {
                                z3 = true;
                            } else {
                                int i9 = this.iD;
                                if (dS()) {
                                    try {
                                        if (this.iB == aVarArr2) {
                                            n.a[] aVarArr4 = new n.a[length << 1];
                                            for (int i10 = 0; i10 < length; i10++) {
                                                aVarArr4[i10] = aVarArr2[i10];
                                            }
                                            this.iB = aVarArr4;
                                        }
                                        z3 = false;
                                    } finally {
                                    }
                                }
                            }
                        }
                        int i62 = i;
                        int i72 = i62 ^ (i62 << 13);
                        int i82 = i72 ^ (i72 >>> 17);
                        i = i82 ^ (i82 << 5);
                        iArr2[0] = i;
                    }
                } else {
                    int i11 = this.iD;
                    if (this.iB == aVarArr2 && dS()) {
                        boolean z5 = false;
                        try {
                            if (this.iB == aVarArr2) {
                                n.a[] aVarArr5 = new n.a[2];
                                aVarArr5[i & 1] = new n.a(j);
                                this.iB = aVarArr5;
                                z5 = true;
                            }
                            if (z5) {
                                return;
                            }
                        } finally {
                        }
                    } else if (b(this.iC, a(0L, j))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.b.a.b.h
    public final void dP() {
        f(1L);
    }

    private long dR() {
        long j = this.iC;
        n.a[] aVarArr = this.iB;
        if (aVarArr != null) {
            for (n.a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.iH;
                }
            }
        }
        return j;
    }

    public final String toString() {
        return Long.toString(dR());
    }

    @Override // java.lang.Number
    public final long longValue() {
        return dR();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) dR();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) dR();
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return dR();
    }
}