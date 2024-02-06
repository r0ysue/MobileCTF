package com.b.a.a;

/* compiled from: Preconditions.java */
/* loaded from: repireall.jar:com/b/a/a/i.class */
public final class i {
    public static void z(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(a(str, objArr));
        }
    }

    public static void A(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(a(str, objArr));
        }
    }

    public static <T> T i(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    public static <T> T a(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException(String.valueOf(obj));
        }
        return t;
    }

    public static int a(int i, int i2) {
        String a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
            } else {
                a = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a);
        }
        return i;
    }

    public static int b(int i, int i2) {
        return a(i, i2, "index");
    }

    private static int a(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, str));
        }
        return i;
    }

    private static String b(int i, int i2, String str) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        }
        return a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void a(int i, int i2, int i3) {
        String b;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i < 0 || i > i3) {
            b = b(i, i3, "start index");
        } else if (i2 < 0 || i2 > i3) {
            b = b(i2, i3, "end index");
        } else {
            b = a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(b);
    }

    private static String a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (16 * objArr.length));
        int i = 0;
        int i2 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i)) != -1) {
            sb.append(valueOf.substring(i, indexOf));
            int i3 = i2;
            i2++;
            sb.append(objArr[i3]);
            i = indexOf + 2;
        }
        sb.append(valueOf.substring(i));
        if (i2 < objArr.length) {
            sb.append(" [");
            int i4 = i2;
            int i5 = i2 + 1;
            sb.append(objArr[i4]);
            while (i5 < objArr.length) {
                sb.append(", ");
                int i6 = i5;
                i5++;
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}