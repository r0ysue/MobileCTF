package com.b.a.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
/* loaded from: repireall.jar:com/b/a/a/a.class */
abstract class a<T> implements Iterator<T> {
    private int fC = EnumC0000a.NOT_READY$3a9f268;
    private T fD;

    protected abstract T cR();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: AbstractIterator.java */
    /* renamed from: com.b.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:com/b/a/a/a$a.class */
    public static final class EnumC0000a {
        public static final int READY$3a9f268 = 1;
        public static final int NOT_READY$3a9f268 = 2;
        public static final int DONE$3a9f268 = 3;
        public static final int FAILED$3a9f268 = 4;
        private static final /* synthetic */ int[] $VALUES$714e8353 = {READY$3a9f268, NOT_READY$3a9f268, DONE$3a9f268, FAILED$3a9f268};

        public static int[] values$3e3d1bae() {
            return (int[]) $VALUES$714e8353.clone();
        }

        private EnumC0000a(String str, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T cS() {
        this.fC = EnumC0000a.DONE$3a9f268;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractIterator.java */
    /* renamed from: com.b.a.a.a$1  reason: invalid class name */
    /* loaded from: repireall.jar:com/b/a/a/a$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fE = new int[EnumC0000a.values$3e3d1bae().length];

        static {
            try {
                fE[EnumC0000a.DONE$3a9f268 - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fE[EnumC0000a.READY$3a9f268 - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i.A(this.fC != EnumC0000a.FAILED$3a9f268);
        switch (AnonymousClass1.fE[this.fC - 1]) {
            case CAN_THROW:
                return false;
            case ODEX_ONLY:
                return true;
            default:
                this.fC = EnumC0000a.FAILED$3a9f268;
                this.fD = cR();
                if (this.fC != EnumC0000a.DONE$3a9f268) {
                    this.fC = EnumC0000a.READY$3a9f268;
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
        this.fC = EnumC0000a.NOT_READY$3a9f268;
        T t = this.fD;
        this.fD = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}