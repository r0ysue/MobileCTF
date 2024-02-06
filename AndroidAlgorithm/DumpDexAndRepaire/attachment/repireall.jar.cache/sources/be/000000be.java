package com.b.a.a;

/* compiled from: MoreObjects.java */
/* loaded from: repireall.jar:com/b/a/a/g.class */
public final class g {
    public static <T> T d(T t, T t2) {
        return t != null ? t : (T) i.i(t2);
    }

    public static a h(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        int i = lastIndexOf;
        if (lastIndexOf == -1) {
            i = replaceAll.lastIndexOf(46);
        }
        return new a(replaceAll.substring(i + 1), (byte) 0);
    }

    /* compiled from: MoreObjects.java */
    /* loaded from: repireall.jar:com/b/a/a/g$a.class */
    public static final class a {
        private final String fX;
        private C0002a fY;
        private C0002a fZ;
        private boolean ga;

        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        private a(String str) {
            this.fY = new C0002a((byte) 0);
            this.fZ = this.fY;
            this.ga = false;
            this.fX = (String) i.i(str);
        }

        public final a d(String str, String str2) {
            return c(str, str2);
        }

        public final a d(String str, int i) {
            return c(str, String.valueOf(i));
        }

        public final a a(String str, long j) {
            return c(str, String.valueOf(j));
        }

        public final String toString() {
            boolean z = this.ga;
            String str = "";
            StringBuilder append = new StringBuilder(32).append(this.fX).append('{');
            C0002a c0002a = this.fY.gc;
            while (true) {
                C0002a c0002a2 = c0002a;
                if (c0002a2 != null) {
                    append.append(str);
                    str = ", ";
                    if (c0002a2.cW != null) {
                        append.append(c0002a2.cW).append('=');
                    }
                    append.append(c0002a2.gb);
                    c0002a = c0002a2.gc;
                } else {
                    return append.append('}').toString();
                }
            }
        }

        private C0002a cW() {
            C0002a c0002a = new C0002a((byte) 0);
            this.fZ.gc = c0002a;
            this.fZ = c0002a;
            return c0002a;
        }

        private a c(String str, Object obj) {
            C0002a cW = cW();
            cW.gb = obj;
            cW.cW = (String) i.i(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MoreObjects.java */
        /* renamed from: com.b.a.a.g$a$a  reason: collision with other inner class name */
        /* loaded from: repireall.jar:com/b/a/a/g$a$a.class */
        public static final class C0002a {
            String cW;
            Object gb;
            C0002a gc;

            private C0002a() {
            }

            /* synthetic */ C0002a(byte b) {
                this();
            }
        }
    }
}