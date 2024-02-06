package com.b.a.b;

/* compiled from: RemovalCause.java */
/* loaded from: repireall.jar:com/b/a/b/k.class */
public enum k {
    EXPLICIT { // from class: com.b.a.b.k.1
        @Override // com.b.a.b.k
        final boolean wasEvicted() {
            return false;
        }
    },
    REPLACED { // from class: com.b.a.b.k.2
        @Override // com.b.a.b.k
        final boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED { // from class: com.b.a.b.k.3
        @Override // com.b.a.b.k
        final boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED { // from class: com.b.a.b.k.4
        @Override // com.b.a.b.k
        final boolean wasEvicted() {
            return true;
        }
    },
    SIZE { // from class: com.b.a.b.k.5
        @Override // com.b.a.b.k
        final boolean wasEvicted() {
            return true;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean wasEvicted();
}