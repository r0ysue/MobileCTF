package com.b.a.c;

/* compiled from: BoundType.java */
/* loaded from: repireall.jar:com/b/a/c/l.class */
public enum l {
    OPEN { // from class: com.b.a.c.l.1
        @Override // com.b.a.c.l
        final l flip() {
            return CLOSED;
        }
    },
    CLOSED { // from class: com.b.a.c.l.2
        @Override // com.b.a.c.l
        final l flip() {
            return OPEN;
        }
    };

    abstract l flip();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l forBoolean(boolean z) {
        return z ? CLOSED : OPEN;
    }
}