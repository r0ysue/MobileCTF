package com.b.a.c;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ByFunctionOrdering.java */
/* loaded from: repireall.jar:com/b/a/c/m.class */
public final class m<F, T> extends bf<F> implements Serializable {
    private com.b.a.a.d<F, ? extends T> jp;
    private bf<T> jq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(com.b.a.a.d<F, ? extends T> dVar, bf<T> bfVar) {
        this.jp = (com.b.a.a.d) com.b.a.a.i.i(dVar);
        this.jq = (bf) com.b.a.a.i.i(bfVar);
    }

    @Override // com.b.a.c.bf, java.util.Comparator
    public final int compare(F f, F f2) {
        return this.jq.compare(this.jp.apply(f), this.jp.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.jp.equals(mVar.jp) && this.jq.equals(mVar.jq);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.jp, this.jq});
    }

    public final String toString() {
        String valueOf = String.valueOf(String.valueOf(this.jq));
        String valueOf2 = String.valueOf(String.valueOf(this.jp));
        return new StringBuilder(13 + valueOf.length() + valueOf2.length()).append(valueOf).append(".onResultOf(").append(valueOf2).append(")").toString();
    }
}