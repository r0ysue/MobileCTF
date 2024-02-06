package org.jf.baksmali.a;

import java.io.IOException;

/* compiled from: MethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/l.class */
public abstract class l implements Comparable<l> {
    protected final int qq;

    public abstract double hI();

    public abstract boolean a(org.jf.a.m mVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public l(int i) {
        this.qq = i;
    }

    public final int hQ() {
        return this.qq;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(l lVar) {
        int compareTo = Integer.valueOf(this.qq).compareTo(Integer.valueOf(lVar.qq));
        if (compareTo == 0) {
            return Double.valueOf(hI()).compareTo(Double.valueOf(lVar.hI()));
        }
        return compareTo;
    }
}