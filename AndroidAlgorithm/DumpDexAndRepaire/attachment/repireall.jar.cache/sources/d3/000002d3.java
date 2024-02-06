package org.jf.baksmali.b;

import java.io.IOException;
import org.jf.a.m;

/* compiled from: FloatRenderer.java */
/* loaded from: repireall.jar:org/jf/baksmali/b/e.class */
public final class e {
    public static void a(m mVar, float f) throws IOException {
        mVar.write(Float.toString(f));
        mVar.write(102);
    }
}