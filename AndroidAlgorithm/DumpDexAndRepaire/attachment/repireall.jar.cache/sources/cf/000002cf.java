package org.jf.baksmali.b;

import java.io.IOException;
import org.jf.a.m;

/* compiled from: BooleanRenderer.java */
/* loaded from: repireall.jar:org/jf/baksmali/b/a.class */
public final class a {
    public static void a(m mVar, boolean z) throws IOException {
        if (z) {
            mVar.write("true");
        } else {
            mVar.write("false");
        }
    }
}