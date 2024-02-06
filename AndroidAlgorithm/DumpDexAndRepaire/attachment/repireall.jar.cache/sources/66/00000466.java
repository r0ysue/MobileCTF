package org.jf.dexlib2.d;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.jf.dexlib2.d.g;
import org.jf.dexlib2.e.j;
import org.jf.dexlib2.h.b;

/* compiled from: ZipDexContainer.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/q.class */
public final class q implements org.jf.dexlib2.e.j<b> {
    private final File xY;
    private final org.jf.dexlib2.f xZ;

    /* compiled from: ZipDexContainer.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/q$a.class */
    public static class a extends RuntimeException {
    }

    public q(File file, org.jf.dexlib2.f fVar) {
        this.xY = file;
        this.xZ = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.jf.dexlib2.e.j
    /* renamed from: bq */
    public b bg(String str) throws IOException {
        ZipFile lr = lr();
        try {
            ZipEntry entry = lr.getEntry(str);
            if (entry != null) {
                return b(lr, entry);
            }
            lr.close();
            return null;
        } finally {
            lr.close();
        }
    }

    public final boolean lq() {
        ZipFile zipFile = null;
        try {
            zipFile = lr();
            try {
                zipFile.close();
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (IOException unused2) {
            if (zipFile != null) {
                try {
                    zipFile.close();
                    return false;
                } catch (IOException unused3) {
                    return false;
                }
            }
            return false;
        } catch (a unused4) {
            if (zipFile != null) {
                try {
                    zipFile.close();
                    return false;
                } catch (IOException unused5) {
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException unused6) {
                }
            }
            throw th;
        }
    }

    /* compiled from: ZipDexContainer.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/d/q$b.class */
    public class b extends g implements j.a {
        private final String ya;

        protected b(org.jf.dexlib2.f fVar, byte[] bArr, String str) {
            super(fVar, bArr, 0);
            this.ya = str;
        }

        @Override // org.jf.dexlib2.e.j.a
        public final org.jf.dexlib2.e.j lc() {
            return q.this;
        }
    }

    private static boolean a(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
        try {
            org.jf.dexlib2.h.b.c(bufferedInputStream);
            bufferedInputStream.close();
            return true;
        } catch (g.b unused) {
            bufferedInputStream.close();
            return false;
        } catch (b.a unused2) {
            bufferedInputStream.close();
            return false;
        } catch (b.C0033b unused3) {
            bufferedInputStream.close();
            return false;
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    private ZipFile lr() throws IOException {
        try {
            return new ZipFile(this.xY);
        } catch (IOException unused) {
            throw new a();
        }
    }

    private b b(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            return new b(this.xZ, com.b.a.d.a.a(inputStream), zipEntry.getName());
        } finally {
            inputStream.close();
        }
    }

    @Override // org.jf.dexlib2.e.j
    public final List<String> hY() throws IOException {
        ArrayList arrayList = new ArrayList();
        ZipFile lr = lr();
        try {
            Enumeration<? extends ZipEntry> entries = lr.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (a(lr, nextElement)) {
                    arrayList.add(nextElement.getName());
                }
            }
            return arrayList;
        } finally {
            lr.close();
        }
    }
}