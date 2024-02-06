package org.jf.a;

import com.b.a.c.bb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.regex.Pattern;

/* compiled from: ClassFileNameHandler.java */
/* loaded from: repireall.jar:org/jf/a/f.class */
public class f {
    private a Fv;
    private String Fw;
    private static Pattern Fy;
    private static /* synthetic */ boolean pL;
    private final int Fr = -1;
    private final int Fs = 0;
    private final int Ft = 1;
    private int Fu = -1;
    private boolean Fx = System.getProperty("os.name").startsWith("Windows");

    static /* synthetic */ boolean bC(String str) {
        return Fy.matcher(str).matches();
    }

    static /* synthetic */ String k(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 1);
        if (lastIndexOf < 0) {
            sb.append(str);
            sb.append(str2);
        } else {
            sb.append(str.subSequence(0, lastIndexOf));
            sb.append(str2);
            sb.append(str.subSequence(lastIndexOf, str.length()));
        }
        return sb.toString();
    }

    static /* synthetic */ int bD(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < str.length()) {
                int codePointAt = str.codePointAt(i3);
                i += bP(codePointAt);
                i2 = i3 + Character.charCount(codePointAt);
            } else {
                return i;
            }
        }
    }

    static /* synthetic */ int b(f fVar) {
        return 249;
    }

    static {
        pL = !f.class.desiredAssertionStatus();
        Fy = Pattern.compile("^(CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(\\..*)?$", 2);
    }

    public f(File file, String str) {
        this.Fv = new a(file);
        this.Fw = str;
    }

    public final File bB(String str) {
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            throw new RuntimeException("Not a valid dalvik class name");
        }
        int i = 1;
        for (int i2 = 1; i2 < str.length() - 1; i2++) {
            if (str.charAt(i2) == '/') {
                i++;
            }
        }
        String[] strArr = new String[i];
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i5 < str.length() - 1) {
            if (str.charAt(i5) == '/') {
                if (i5 - i4 == 0) {
                    throw new RuntimeException("Not a valid dalvik class name");
                }
                int i6 = i3;
                i3++;
                strArr[i6] = str.substring(i4, i5);
                i5++;
                i4 = i5;
            }
            i5++;
        }
        if (i4 >= str.length() - 1) {
            throw new RuntimeException("Not a valid dalvik class name");
        }
        strArr[i3] = str.substring(i4, str.length() - 1);
        return a(this.Fv, strArr, 0);
    }

    private File a(a aVar, String[] strArr, int i) {
        while (i != strArr.length - 1) {
            a aVar2 = (a) aVar.a((c) new a(aVar, strArr[i]));
            i++;
            strArr = strArr;
            aVar = aVar2;
            this = this;
        }
        b bVar = new b(this, aVar, strArr[i] + this.Fw, (byte) 0);
        aVar.a(bVar);
        String mT = bVar.mT();
        if (pL || mT != null) {
            return new File(aVar.Fz, mT);
        }
        throw new AssertionError();
    }

    private static int bP(int i) {
        if (i < 128) {
            return 1;
        }
        if (i < 2048) {
            return 2;
        }
        if (i < 65536) {
            return 3;
        }
        return 4;
    }

    static String i(String str, int i) {
        int i2 = i + 1;
        try {
            IntBuffer asIntBuffer = ByteBuffer.wrap(str.getBytes("UTF-32BE")).asIntBuffer();
            int[] iArr = new int[asIntBuffer.limit()];
            asIntBuffer.get(iArr);
            int length = iArr.length / 2;
            int i3 = length;
            int i4 = length + 1;
            int bP = bP(iArr[length]);
            if (iArr.length % 2 == 0 && bP < i2) {
                bP += bP(iArr[i4]);
                i4++;
            }
            while (bP < i2 && (i3 > 0 || i4 < iArr.length)) {
                if (i3 > 0) {
                    i3--;
                    bP += bP(iArr[i3]);
                }
                if (bP < i2 && i4 < iArr.length) {
                    bP += bP(iArr[i4]);
                    i4++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < i3; i5++) {
                sb.appendCodePoint(iArr[i5]);
            }
            sb.append('#');
            for (int i6 = i4; i6 < iArr.length; i6++) {
                sb.appendCodePoint(iArr[i6]);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClassFileNameHandler.java */
    /* loaded from: repireall.jar:org/jf/a/f$c.class */
    public abstract class c {
        public final a FD;
        public final String FE;
        protected String FF;

        protected abstract String bQ(int i);

        /* synthetic */ c(f fVar, a aVar, String str, byte b) {
            this(aVar, str);
        }

        private c(a aVar, String str) {
            this.FF = null;
            this.FD = aVar;
            this.FE = str;
        }

        public final String Y(boolean z) {
            String str = this.FE;
            if (!z && this.FD != null && !this.FD.mS()) {
                str = str.toLowerCase();
            }
            if (f.this.Fx && f.bC(str)) {
                str = f.k(str, "#");
            }
            int bD = f.bD(str);
            if (bD > f.b(f.this)) {
                str = f.i(str, bD - f.b(f.this));
            }
            return str;
        }

        public final String mT() {
            return this.FF;
        }

        public void bR(int i) {
            if (i < 0 || i > 99999) {
                throw new IllegalArgumentException("suffix must be in [0, 100000)");
            }
            if (this.FF != null) {
                throw new IllegalStateException("The suffix can only be set once");
            }
            this.FF = bQ(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClassFileNameHandler.java */
    /* loaded from: repireall.jar:org/jf/a/f$a.class */
    public class a extends c {
        private File Fz;
        private int FA;
        private final bb<String, c> FB;
        private static /* synthetic */ boolean pL;

        static {
            pL = !f.class.desiredAssertionStatus();
        }

        public a(File file) {
            super(f.this, null, file.getName(), (byte) 0);
            this.Fz = null;
            this.FA = f.this.Fu;
            this.FB = com.b.a.c.j.eo();
            this.Fz = file;
            this.FF = this.Fz.getName();
        }

        public a(a aVar, String str) {
            super(f.this, aVar, str, (byte) 0);
            this.Fz = null;
            this.FA = f.this.Fu;
            this.FB = com.b.a.c.j.eo();
        }

        public final synchronized c a(c cVar) {
            Collection<c> r = this.FB.r(cVar.Y(false));
            if (cVar instanceof a) {
                for (c cVar2 : r) {
                    if (cVar2.FE.equals(cVar.FE)) {
                        return cVar2;
                    }
                }
            }
            cVar.bR(r.size());
            r.add(cVar);
            return cVar;
        }

        @Override // org.jf.a.f.c
        protected final String bQ(int i) {
            if (i > 0) {
                return Y(true) + "." + Integer.toString(i);
            }
            return Y(true);
        }

        @Override // org.jf.a.f.c
        public final void bR(int i) {
            super.bR(i);
            String mT = mT();
            if (this.FD != null && mT != null) {
                this.Fz = new File(this.FD.Fz, mT);
            }
        }

        protected final boolean mS() {
            if (mT() == null || this.Fz == null) {
                throw new IllegalStateException("Must call setSuffix() first");
            }
            if (this.FA != -1) {
                return this.FA == 1;
            }
            File file = this.Fz;
            if (file.exists() && file.isFile() && !file.delete()) {
                throw new i("Can't delete %s to make it into a directory", file.getAbsolutePath());
            }
            if (!file.exists() && !file.mkdirs()) {
                throw new i("Couldn't create directory %s", file.getAbsolutePath());
            }
            try {
                boolean a = a(file);
                this.FA = a ? 1 : 0;
                return a;
            } catch (IOException unused) {
                return false;
            }
        }

        private static boolean a(File file) throws IOException {
            File file2;
            File file3;
            int i = 1;
            while (true) {
                file2 = new File(file, "test." + i);
                int i2 = i;
                i++;
                file3 = new File(file, "TEST." + i2);
                if (!file2.exists()) {
                    try {
                        if (!file3.exists()) {
                            try {
                                break;
                            } catch (IOException e) {
                                try {
                                    file2.delete();
                                } catch (Exception unused) {
                                }
                                throw e;
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            file2.delete();
                        } catch (Exception unused2) {
                        }
                        try {
                            file3.delete();
                        } catch (Exception unused3) {
                        }
                        throw th;
                    }
                }
            }
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write("test");
            fileWriter.flush();
            fileWriter.close();
            if (file3.exists()) {
                try {
                    file2.delete();
                } catch (Exception unused4) {
                }
                try {
                    file3.delete();
                    return false;
                } catch (Exception unused5) {
                    return false;
                }
            } else if (file3.createNewFile()) {
                try {
                    file2.delete();
                } catch (Exception unused6) {
                }
                try {
                    file3.delete();
                    return true;
                } catch (Exception unused7) {
                    return true;
                }
            } else {
                try {
                    CharBuffer allocate = CharBuffer.allocate(32);
                    FileReader fileReader = new FileReader(file3);
                    while (fileReader.read(allocate) != -1 && allocate.length() < 4) {
                    }
                    if (allocate.length() == 4 && allocate.toString().equals("test")) {
                        try {
                            file2.delete();
                        } catch (Exception unused8) {
                        }
                        try {
                            file3.delete();
                            return false;
                        } catch (Exception unused9) {
                            return false;
                        }
                    } else if (!pL) {
                        throw new AssertionError();
                    } else {
                        try {
                            file2.delete();
                        } catch (Exception unused10) {
                        }
                        try {
                            file3.delete();
                            return false;
                        } catch (Exception unused11) {
                            return false;
                        }
                    }
                } catch (FileNotFoundException unused12) {
                    try {
                        file2.delete();
                    } catch (Exception unused13) {
                    }
                    try {
                        file3.delete();
                        return true;
                    } catch (Exception unused14) {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClassFileNameHandler.java */
    /* loaded from: repireall.jar:org/jf/a/f$b.class */
    public class b extends c {
        /* synthetic */ b(f fVar, a aVar, String str, byte b) {
            this(aVar, str);
        }

        private b(a aVar, String str) {
            super(f.this, aVar, str, (byte) 0);
        }

        @Override // org.jf.a.f.c
        protected final String bQ(int i) {
            if (i > 0) {
                return f.k(Y(true), "." + Integer.toString(i));
            }
            return Y(true);
        }
    }
}