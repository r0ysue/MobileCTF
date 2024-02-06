package org.jf.dexlib2.h;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.jf.dexlib2.d.b.l;
import org.jf.dexlib2.d.b.o;
import org.jf.dexlib2.d.g;
import org.jf.dexlib2.d.l;

/* compiled from: DexUtil.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/b.class */
public final class b {
    public static void c(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(44);
        byte[] bArr = new byte[44];
        try {
            try {
                com.b.a.d.a.a(inputStream, bArr);
                inputStream.reset();
                c(bArr, 0);
            } catch (EOFException unused) {
                throw new g.b("File is too short");
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    public static void c(byte[] bArr, int i) {
        int a2 = l.a(bArr, i);
        if (a2 == -1) {
            StringBuilder sb = new StringBuilder("Not a valid dex magic value:");
            for (int i2 = 0; i2 < 8; i2++) {
                sb.append(String.format(" %02x", Byte.valueOf(bArr[i2])));
            }
            throw new g.b(sb.toString());
        }
        if (!l.bg(a2)) {
            System.out.println(String.format("Dex version %03d is not supported yet,maybe error happens,be careful......", Integer.valueOf(a2)));
        }
        int b = l.b(bArr, i);
        if (b == 2018915346) {
            throw new C0033b("Big endian dex files are not supported");
        }
        if (b != 305419896) {
            throw new a(String.format("Invalid endian tag: 0x%x", Integer.valueOf(b)));
        }
    }

    public static void d(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(8);
        byte[] bArr = new byte[8];
        try {
            try {
                com.b.a.d.a.a(inputStream, bArr);
                inputStream.reset();
                d(bArr, 0);
            } catch (EOFException unused) {
                throw new l.a("File is too short");
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    private static void d(byte[] bArr, int i) {
        int a2 = o.a(bArr, 0);
        if (a2 == -1) {
            StringBuilder sb = new StringBuilder("Not a valid odex magic value:");
            for (int i2 = 0; i2 < 8; i2++) {
                sb.append(String.format(" %02x", Byte.valueOf(bArr[i2])));
            }
            throw new l.a(sb.toString());
        } else if (!o.bh(a2)) {
            throw new C0033b(String.format("Odex version %03d is not supported", Integer.valueOf(a2)));
        }
    }

    /* compiled from: DexUtil.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/h/b$a.class */
    public static class a extends RuntimeException {
        public a() {
        }

        public a(String str) {
            super(str);
        }
    }

    /* compiled from: DexUtil.java */
    /* renamed from: org.jf.dexlib2.h.b$b  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/jf/dexlib2/h/b$b.class */
    public static class C0033b extends RuntimeException {
        public C0033b() {
        }

        public C0033b(String str) {
            super(str);
        }
    }
}