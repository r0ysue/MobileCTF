package org.jf.baksmali.a;

import java.io.IOException;

/* compiled from: LabelMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/j.class */
public class j extends l {
    private final org.jf.baksmali.c qa;
    private final String qb;
    private int qc;

    @Override // org.jf.baksmali.a.l, java.lang.Comparable
    public /* synthetic */ int compareTo(l lVar) {
        return compareTo(lVar);
    }

    public j(org.jf.baksmali.c cVar, int i, String str) {
        super(i);
        this.qa = cVar;
        this.qb = str;
    }

    @Override // org.jf.baksmali.a.l
    public double hI() {
        return 0.0d;
    }

    @Override // org.jf.baksmali.a.l
    public final int a(l lVar) {
        int compareTo = super.compareTo(lVar);
        int i = compareTo;
        if (compareTo == 0 && (lVar instanceof j)) {
            i = this.qb.compareTo(((j) lVar).qb);
        }
        return i;
    }

    public int hashCode() {
        return hQ();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && compareTo((l) obj) == 0;
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(org.jf.a.m mVar) throws IOException {
        mVar.write(58);
        mVar.write(this.qb);
        if (this.qa.qL) {
            mVar.l(this.qc);
            return true;
        }
        mVar.l(hK());
        return true;
    }

    public final String hM() {
        return this.qb;
    }

    public int hK() {
        return hQ();
    }

    public final void ac(int i) {
        this.qc = i;
    }
}