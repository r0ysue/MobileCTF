package org.jf.baksmali.a;

import java.io.IOException;

/* compiled from: CommentMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/e.class */
public final class e extends l {
    private final String pw;
    private final double px;

    public e(String str, int i, double d) {
        super(i);
        this.pw = str;
        this.px = -2.147483648E9d;
    }

    @Override // org.jf.baksmali.a.l
    public final double hI() {
        return this.px;
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(org.jf.a.m mVar) throws IOException {
        mVar.write(35);
        mVar.write(this.pw);
        return true;
    }
}