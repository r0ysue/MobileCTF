package org.jf.dexlib2.d;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* compiled from: DexBackedOdexFile.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/l.class */
public final class l extends g {
    private final byte[] xr;

    private l(org.jf.dexlib2.f fVar, byte[] bArr, byte[] bArr2) {
        super(fVar, bArr2);
        this.xr = bArr;
    }

    @Override // org.jf.dexlib2.d.g
    public final boolean ky() {
        return true;
    }

    public final List<String> kR() {
        int c = org.jf.dexlib2.d.b.o.c(this.xr) - org.jf.dexlib2.d.b.o.b(this.xr);
        return new org.jf.dexlib2.d.d.h<String>(this, c + 16, new org.jf.dexlib2.d.a(this.rw).aD(c + 12)) { // from class: org.jf.dexlib2.d.l.1
            @Override // org.jf.dexlib2.d.d.h
            protected final /* synthetic */ String a(o oVar, int i) {
                return c(oVar);
            }

            private String c(o oVar) {
                int ko = oVar.ko();
                int kd = oVar.kd();
                oVar.aH(ko + 20);
                try {
                    return new String(l.this.rw, kd, ko - 1, "US-ASCII");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    public static l b(org.jf.dexlib2.f fVar, BufferedInputStream bufferedInputStream) throws IOException {
        org.jf.dexlib2.h.b.d(bufferedInputStream);
        bufferedInputStream.reset();
        byte[] bArr = new byte[40];
        com.b.a.d.a.a(bufferedInputStream, bArr);
        int b = org.jf.dexlib2.d.b.o.b(bArr);
        if (b > 40) {
            com.b.a.d.a.a(bufferedInputStream, b - 40);
        }
        return new l(fVar, bArr, com.b.a.d.a.a(bufferedInputStream));
    }

    public final int kS() {
        return org.jf.dexlib2.d.b.o.a(this.xr, 0);
    }

    /* compiled from: DexBackedOdexFile.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/l$a.class */
    public static class a extends RuntimeException {
        public a() {
        }

        public a(String str) {
            super(str);
        }
    }
}