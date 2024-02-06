package org.jf.baksmali.a.a;

import java.io.IOException;
import org.jf.a.m;
import org.jf.baksmali.a.o;

/* compiled from: LocalFormatter.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a/f.class */
public final class f {
    public static void a(m mVar, String str, String str2, String str3) throws IOException {
        if (str != null) {
            o.a(mVar, str);
        } else {
            mVar.write("null");
        }
        mVar.write(58);
        if (str2 != null) {
            mVar.write(str2);
        } else {
            mVar.write("V");
        }
        if (str3 != null) {
            mVar.write(", ");
            o.a(mVar, str3);
        }
    }
}