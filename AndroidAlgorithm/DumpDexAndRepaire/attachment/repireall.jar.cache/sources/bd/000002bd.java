package org.jf.baksmali.a;

import java.io.IOException;

/* compiled from: CommentedOutMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/f.class */
public final class f extends l {
    private final l py;

    public f(org.jf.baksmali.a.c.b bVar) {
        super(bVar.hQ());
        this.py = bVar;
    }

    @Override // org.jf.baksmali.a.l
    public final double hI() {
        return this.py.hI() + 0.001d;
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(org.jf.a.m mVar) throws IOException {
        mVar.write(35);
        this.py.a(mVar);
        return true;
    }
}