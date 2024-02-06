package org.jf.dexlib2.b.a;

/* compiled from: BaseStringReference.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/a/d.class */
public abstract class d implements org.jf.dexlib2.e.c.e {
    public int hashCode() {
        return lD().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof org.jf.dexlib2.e.c.e)) {
            return lD().equals(((org.jf.dexlib2.e.c.e) obj).lD());
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.c.e, java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(CharSequence charSequence) {
        return lD().compareTo(charSequence.toString());
    }

    @Override // java.lang.CharSequence
    public int length() {
        return lD().length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return lD().charAt(i);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return lD().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return lD();
    }
}