package com.b.a.b;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* compiled from: Striped64.java */
/* loaded from: repireall.jar:com/b/a/b/n.class */
abstract class n extends Number {
    static final ThreadLocal<int[]> iy = new ThreadLocal<>();
    static final Random iz = new Random();
    static final int iA = Runtime.getRuntime().availableProcessors();
    volatile transient a[] iB;
    volatile transient long iC;
    volatile transient int iD;
    private static final Unsafe iE;
    private static final long iF;
    private static final long iG;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long a(long j, long j2);

    static /* synthetic */ Unsafe dU() {
        return dT();
    }

    /* compiled from: Striped64.java */
    /* loaded from: repireall.jar:com/b/a/b/n$a.class */
    static final class a {
        volatile long iH;
        private static final Unsafe iI;
        private static final long iJ;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(long j) {
            this.iH = j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean c(long j, long j2) {
            return iI.compareAndSwapLong(this, iJ, j, j2);
        }

        static {
            try {
                iI = n.dU();
                iJ = iI.objectFieldOffset(a.class.getDeclaredField("value"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }

    static {
        try {
            iE = dT();
            iF = iE.objectFieldOffset(n.class.getDeclaredField("base"));
            iG = iE.objectFieldOffset(n.class.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(long j, long j2) {
        return iE.compareAndSwapLong(this, iF, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean dS() {
        return iE.compareAndSwapInt(this, iG, 0, 1);
    }

    private static Unsafe dT() {
        try {
            return Unsafe.getUnsafe();
        } catch (SecurityException unused) {
            try {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.b.a.b.n.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* synthetic */ Unsafe run() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        }
    }
}