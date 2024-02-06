package org.jf.dexlib2.i.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MemoryDeferredOutputStream.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/a/e.class */
public final class e extends a {
    private final List<byte[]> Ep;
    private byte[] Eq;
    private int Er;

    public e() {
        this(16384);
    }

    public e(int i) {
        this.Ep = new ArrayList();
        this.Eq = new byte[i];
    }

    @Override // org.jf.dexlib2.i.a.a
    public final void a(org.jf.dexlib2.i.e eVar) throws IOException {
        for (byte[] bArr : this.Ep) {
            eVar.write(bArr);
        }
        if (this.Er > 0) {
            eVar.write(this.Eq, 0, this.Er);
        }
        this.Ep.clear();
        this.Er = 0;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (mI() == 0) {
            this.Ep.add(this.Eq);
            this.Eq = new byte[this.Eq.length];
            this.Er = 0;
        }
        byte[] bArr = this.Eq;
        int i2 = this.Er;
        this.Er = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int mI = mI();
        int i3 = 0;
        while (i2 - i3 > 0) {
            int min = Math.min(mI, i2 - i3);
            System.arraycopy(bArr, i + i3, this.Eq, this.Er, min);
            i3 += min;
            this.Er += min;
            int mI2 = mI();
            mI = mI2;
            if (mI2 == 0) {
                this.Ep.add(this.Eq);
                this.Eq = new byte[this.Eq.length];
                this.Er = 0;
                mI = this.Eq.length;
            }
        }
    }

    private int mI() {
        return this.Eq.length - this.Er;
    }

    public static b mJ() {
        return new b() { // from class: org.jf.dexlib2.i.a.e.1
            @Override // org.jf.dexlib2.i.a.b
            public final a mH() {
                return new e(r4);
            }
        };
    }
}