package com.b.a.c;

import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
/* loaded from: repireall.jar:com/b/a/c/b.class */
public abstract class b<T> extends cf<T> {
    private int iM = a.NOT_READY$1572a20f;
    private T fD;

    protected abstract T cR();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: AbstractIterator.java */
    /* loaded from: repireall.jar:com/b/a/c/b$a.class */
    public static final class a {
        public static final int READY$1572a20f = 1;
        public static final int NOT_READY$1572a20f = 2;
        public static final int DONE$1572a20f = 3;
        public static final int FAILED$1572a20f = 4;
        private static final /* synthetic */ int[] $VALUES$12ff0e74 = {READY$1572a20f, NOT_READY$1572a20f, DONE$1572a20f, FAILED$1572a20f};

        public static int[] values$55dd66eb() {
            return (int[]) $VALUES$12ff0e74.clone();
        }

        private a(String str, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T dV() {
        this.iM = a.DONE$1572a20f;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractIterator.java */
    /* renamed from: com.b.a.c.b$1  reason: invalid class name */
    /* loaded from: repireall.jar:com/b/a/c/b$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] iN = new int[a.values$55dd66eb().length];

        static {
            try {
                iN[a.DONE$1572a20f - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iN[a.READY$1572a20f - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.b.a.a.i.A(this.iM != a.FAILED$1572a20f);
        switch (AnonymousClass1.iN[this.iM - 1]) {
            case CAN_THROW:
                return false;
            case ODEX_ONLY:
                return true;
            default:
                this.iM = a.FAILED$1572a20f;
                this.fD = cR();
                if (this.iM != a.DONE$1572a20f) {
                    this.iM = a.READY$1572a20f;
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.iM = a.NOT_READY$1572a20f;
        T t = this.fD;
        this.fD = null;
        return t;
    }
}