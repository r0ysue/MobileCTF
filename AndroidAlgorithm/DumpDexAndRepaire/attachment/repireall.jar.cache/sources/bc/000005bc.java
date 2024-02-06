package org.jf.dexlib2.i;

import java.io.IOException;
import java.lang.CharSequence;

/* compiled from: DebugWriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/d.class */
public final class d<StringKey extends CharSequence, TypeKey extends CharSequence> {
    private final p<StringKey, ?> Dg;
    private final r<StringKey, TypeKey, ?> Dh;
    private final e Di;
    private int Dj;
    private int Dk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(p<StringKey, ?> pVar, r<StringKey, TypeKey, ?> rVar, e eVar) {
        this.Dg = pVar;
        this.Dh = rVar;
        this.Di = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bC(int i) {
        this.Dj = 0;
        this.Dk = i;
    }

    public final void a(int i, int i2, StringKey stringkey, TypeKey typekey, StringKey stringkey2) throws IOException {
        int g = this.Dg.g(stringkey);
        int g2 = this.Dh.g(typekey);
        int g3 = this.Dg.g(stringkey2);
        bF(i);
        if (g3 == -1) {
            this.Di.write(3);
            e.b(this.Di, i2);
            e.b(this.Di, g + 1);
            e.b(this.Di, g2 + 1);
            return;
        }
        this.Di.write(4);
        e.b(this.Di, i2);
        e.b(this.Di, g + 1);
        e.b(this.Di, g2 + 1);
        e.b(this.Di, g3 + 1);
    }

    public final void k(int i, int i2) throws IOException {
        bF(i);
        this.Di.write(5);
        e.b(this.Di, i2);
    }

    public final void l(int i, int i2) throws IOException {
        bF(i);
        this.Di.write(6);
        e.b(this.Di, i2);
    }

    public final void bD(int i) throws IOException {
        bF(i);
        this.Di.write(7);
    }

    public final void bE(int i) throws IOException {
        bF(i);
        this.Di.write(8);
    }

    public final void m(int i, int i2) throws IOException {
        int i3 = i2 - this.Dk;
        int i4 = i - this.Dj;
        int i5 = i4;
        if (i4 < 0) {
            throw new org.jf.a.i("debug info items must have non-decreasing code addresses", new Object[0]);
        }
        if (i3 < -4 || i3 > 10) {
            int i6 = i2 - this.Dk;
            if (i6 != 0) {
                this.Di.write(2);
                e.c(this.Di, i6);
                this.Dk = i2;
            }
            i3 = 0;
        }
        if ((i3 < 2 && i5 > 16) || (i3 > 1 && i5 > 15)) {
            bF(i);
            i5 = 0;
        }
        int i7 = i3;
        int i8 = i5;
        this.Di.write((byte) (10 + (i8 * 15) + (i7 - (-4))));
        this.Dk += i7;
        this.Dj += i8;
    }

    public final void a(int i, StringKey stringkey) throws IOException {
        bF(i);
        this.Di.write(9);
        e.b(this.Di, this.Dg.g(stringkey) + 1);
    }

    private void bF(int i) throws IOException {
        int i2 = i - this.Dj;
        if (i2 > 0) {
            this.Di.write(1);
            e.b(this.Di, i2);
            this.Dj = i;
        }
    }
}