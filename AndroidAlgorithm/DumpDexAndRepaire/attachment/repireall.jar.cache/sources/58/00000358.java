package org.jf.dexlib2;

import com.b.a.c.ah;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jf.a.i;
import org.jf.dexlib2.d.g;
import org.jf.dexlib2.d.l;
import org.jf.dexlib2.d.p;
import org.jf.dexlib2.d.q;
import org.jf.dexlib2.e.j;

/* compiled from: DexFileFactory.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c.class */
public final class c {
    static /* synthetic */ boolean i(String str, String str2) {
        String str3 = str2;
        String str4 = str;
        if (str.equals(str3)) {
            return true;
        }
        if (str4.charAt(0) == '/') {
            str4 = str4.substring(1);
        }
        if (str3.charAt(0) == '/') {
            str3 = str3.substring(1);
        }
        return str4.equals(str3);
    }

    static /* synthetic */ boolean j(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.endsWith(str2)) {
            char charAt = str.charAt((str.length() - str2.length()) - 1);
            char charAt2 = str2.charAt(0);
            return charAt2 == ':' || charAt2 == '/' || charAt == ':' || charAt == '/';
        }
        return false;
    }

    public static org.jf.dexlib2.d.g a(String str, org.jf.dexlib2.f fVar) throws IOException {
        return a(new File(str), fVar);
    }

    public static org.jf.dexlib2.d.g a(File file, org.jf.dexlib2.f fVar) throws IOException {
        if (file.exists()) {
            try {
                return new a(file.getPath(), new q(file, fVar)).b("classes.dex", true);
            } catch (q.a unused) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    return org.jf.dexlib2.d.g.a(fVar, bufferedInputStream);
                } catch (l.a unused2) {
                    p pVar = null;
                    try {
                        pVar = p.a(bufferedInputStream, new C0018c(file));
                    } catch (p.d unused3) {
                    }
                    if (pVar != null) {
                        if (pVar.kU() == 0) {
                            throw new g(pVar);
                        }
                        List<p.e> kW = pVar.kW();
                        if (kW.size() == 0) {
                            throw new b("Oat file %s contains no dex files", file.getName());
                        }
                        return kW.get(0);
                    }
                    throw new f("%s is not an apk, dex, odex or oat file.", file.getPath());
                } catch (g.b unused4) {
                    return l.b(fVar, bufferedInputStream);
                } finally {
                    bufferedInputStream.close();
                }
            }
        }
        throw new b("%s does not exist", file.getName());
    }

    public static org.jf.dexlib2.d.g a(File file, String str, boolean z, org.jf.dexlib2.f fVar) throws IOException {
        if (!file.exists()) {
            throw new b("Container file %s does not exist", file.getName());
        }
        try {
            return new a(file.getPath(), new q(file, fVar)).b(str, z);
        } catch (q.a unused) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            p pVar = null;
            try {
                try {
                    pVar = p.a(bufferedInputStream, new C0018c(file));
                } finally {
                    bufferedInputStream.close();
                }
            } catch (p.d unused2) {
            }
            if (pVar != null) {
                if (pVar.kU() == 0) {
                    throw new g(pVar);
                }
                if (pVar.kW().size() == 0) {
                    throw new b("Oat file %s contains no dex files", file.getName());
                }
                return new a(file.getPath(), pVar).b(str, z);
            }
            throw new f("%s is not an apk or oat file.", file.getPath());
        }
    }

    public static j<? extends org.jf.dexlib2.d.g> b(File file, org.jf.dexlib2.f fVar) throws IOException {
        if (file.exists()) {
            q qVar = new q(file, fVar);
            if (qVar.lq()) {
                return qVar;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                return new e(file.getPath(), org.jf.dexlib2.d.g.a(fVar, bufferedInputStream));
            } catch (g.b unused) {
                return new e(file.getPath(), l.b(fVar, bufferedInputStream));
            } catch (l.a unused2) {
                p pVar = null;
                try {
                    pVar = p.a(bufferedInputStream, new C0018c(file));
                } catch (p.d unused3) {
                }
                if (pVar != null) {
                    if (pVar.kU() == 0) {
                        throw new g(pVar);
                    }
                    return pVar;
                }
                throw new f("%s is not an apk, dex, odex or oat file.", file.getPath());
            } finally {
                bufferedInputStream.close();
            }
        }
        throw new b("%s does not exist", file.getName());
    }

    public static void a(String str, org.jf.dexlib2.e.d dVar) throws IOException {
        org.jf.dexlib2.i.b.h.b(str, dVar);
    }

    private c() {
    }

    /* compiled from: DexFileFactory.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/c$b.class */
    public static class b extends i {
        public b(String str, Object... objArr) {
            super(str, objArr);
        }
    }

    /* compiled from: DexFileFactory.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/c$g.class */
    public static class g extends i {
        private p rA;

        public g(p pVar) {
            super("Unsupported oat version: %d", Integer.valueOf(pVar.kT()));
            this.rA = pVar;
        }
    }

    /* compiled from: DexFileFactory.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/c$d.class */
    public static class d extends i {
        public d(String str, Object... objArr) {
            super(String.format(str, objArr), new Object[0]);
        }
    }

    /* compiled from: DexFileFactory.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/c$f.class */
    public static class f extends i {
        public f(String str, Object... objArr) {
            super(String.format(str, objArr), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: DexFileFactory.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/c$a.class */
    public static class a {
        private final String rt;
        private final j<? extends org.jf.dexlib2.d.g> ru;
        private static /* synthetic */ boolean pL;

        static {
            pL = !c.class.desiredAssertionStatus();
        }

        public a(String str, j<? extends org.jf.dexlib2.d.g> jVar) {
            this.rt = str;
            this.ru = jVar;
        }

        public final org.jf.dexlib2.d.g b(String str, boolean z) throws IOException {
            if (z) {
                try {
                    org.jf.dexlib2.d.g bg = this.ru.bg(str);
                    if (bg == null) {
                        throw new b("Could not find entry %s in %s.", str, this.rt);
                    }
                    return bg;
                } catch (g.b unused) {
                    throw new f("Entry %s in %s is not a dex file", str, this.rt);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (String str2 : this.ru.hY()) {
                if (c.i(str2, str)) {
                    arrayList.add(str2);
                    arrayList2.add(this.ru.bg(str2));
                } else if (c.j(str2, str)) {
                    arrayList3.add(str2);
                    arrayList4.add(this.ru.bg(str2));
                }
            }
            if (arrayList2.size() == 1) {
                try {
                    org.jf.dexlib2.d.g gVar = (org.jf.dexlib2.d.g) arrayList2.get(0);
                    if (pL || gVar != null) {
                        return gVar;
                    }
                    throw new AssertionError();
                } catch (g.b unused2) {
                    throw new f("Entry %s in %s is not a dex file", arrayList.get(0), this.rt);
                }
            } else if (arrayList2.size() > 1) {
                throw new d(String.format("Multiple entries in %s match %s: %s", this.rt, str, com.b.a.a.f.aD(", ").b(arrayList)), new Object[0]);
            } else {
                if (arrayList4.size() == 0) {
                    throw new b("Could not find a dex entry in %s matching %s", this.rt, str);
                }
                if (arrayList4.size() > 1) {
                    throw new d(String.format("Multiple dex entries in %s match %s: %s", this.rt, str, com.b.a.a.f.aD(", ").b(arrayList3)), new Object[0]);
                }
                return (org.jf.dexlib2.d.g) arrayList4.get(0);
            }
        }
    }

    /* compiled from: DexFileFactory.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/c$e.class */
    private static class e implements j<org.jf.dexlib2.d.g> {
        private final String ry;
        private final org.jf.dexlib2.d.g rz;

        @Override // org.jf.dexlib2.e.j
        public final /* synthetic */ org.jf.dexlib2.d.g bg(String str) throws IOException {
            if (str.equals(this.ry)) {
                return this.rz;
            }
            return null;
        }

        public e(String str, org.jf.dexlib2.d.g gVar) {
            this.ry = str;
            this.rz = gVar;
        }

        @Override // org.jf.dexlib2.e.j
        public final List<String> hY() throws IOException {
            return ah.u(this.ry);
        }
    }

    /* compiled from: DexFileFactory.java */
    /* renamed from: org.jf.dexlib2.c$c  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/jf/dexlib2/c$c.class */
    public static class C0018c implements p.l {
        private final File rv;
        private byte[] rw = null;
        private boolean rx = false;

        public C0018c(File file) {
            this.rv = new File(file.getAbsoluteFile().getParentFile(), com.b.a.d.b.aH(file.getAbsolutePath()) + ".vdex");
        }

        @Override // org.jf.dexlib2.d.p.l
        public final byte[] hX() {
            if (!this.rx) {
                if (this.rv.exists()) {
                    try {
                        this.rw = com.b.a.d.a.a(new FileInputStream(this.rv));
                    } catch (FileNotFoundException unused) {
                        this.rw = null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                this.rx = true;
            }
            return this.rw;
        }
    }
}