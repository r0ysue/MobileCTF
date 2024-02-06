package org.jf.baksmali.a.b;

import java.io.IOException;
import java.util.List;
import org.jf.a.m;
import org.jf.dexlib2.e.d.g;

/* compiled from: ArrayEncodedValueAdaptor.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/b/b.class */
public final class b {
    public static void a(m mVar, org.jf.dexlib2.e.d.b bVar, String str) throws IOException {
        mVar.write(123);
        List<? extends g> lM = bVar.lM();
        if (lM.size() == 0) {
            mVar.write(125);
            return;
        }
        mVar.write(10);
        mVar.bV(4);
        boolean z = true;
        for (g gVar : lM) {
            if (!z) {
                mVar.write(",\n");
            }
            z = false;
            c.a(mVar, gVar, str);
        }
        mVar.bW(4);
        mVar.write("\n}");
    }
}