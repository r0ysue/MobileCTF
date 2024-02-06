package org.jf.dexlib2.b.a;

import org.jf.dexlib2.e.c.f;

/* compiled from: BaseTypeReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/a/e.class */
public abstract class e implements f {
    public int hashCode() {
        return io().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof f) {
                return io().equals(((f) obj).io());
            }
            if (obj instanceof CharSequence) {
                return io().equals(obj.toString());
            }
            return false;
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.c.f, java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(CharSequence charSequence) {
        return io().compareTo(charSequence.toString());
    }

    @Override // java.lang.CharSequence
    public int length() {
        return io().length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return io().charAt(i);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return io().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return io();
    }
}