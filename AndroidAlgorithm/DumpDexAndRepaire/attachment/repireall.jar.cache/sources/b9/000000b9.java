package com.b.a.a;

/* compiled from: Functions.java */
/* loaded from: repireall.jar:com/b/a/a/e.class */
public final class e {
    public static d<Object, String> cV() {
        return a.INSTANCE;
    }

    /* compiled from: Functions.java */
    /* loaded from: repireall.jar:com/b/a/a/e$a.class */
    private enum a implements d<Object, String> {
        INSTANCE;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.b.a.a.d
        public final String apply(Object obj) {
            i.i(obj);
            return obj.toString();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "toString";
        }
    }
}