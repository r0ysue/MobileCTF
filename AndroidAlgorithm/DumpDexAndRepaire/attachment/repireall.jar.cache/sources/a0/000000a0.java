package com.a.a;

import com.a.a.b;

/* compiled from: StringKey.java */
/* loaded from: repireall.jar:com/a/a/s.class */
public final class s implements b.a {
    private String fg;

    public s(String str) {
        this.fg = str;
    }

    @Override // com.a.a.b.a
    public final String bf() {
        return this.fg;
    }

    public final String toString() {
        return this.fg;
    }

    public final int hashCode() {
        return 31 + (this.fg == null ? 0 : this.fg.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.fg == null) {
            if (sVar.fg != null) {
                return false;
            }
            return true;
        } else if (!this.fg.equals(sVar.fg)) {
            return false;
        } else {
            return true;
        }
    }
}