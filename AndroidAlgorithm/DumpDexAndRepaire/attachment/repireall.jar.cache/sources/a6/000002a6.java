package org.jf.baksmali.a.b;

import java.io.IOException;
import java.util.Collection;
import org.jf.a.m;

/* compiled from: AnnotationEncodedValueAdaptor.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/b/a.class */
public abstract class a {
    public static void a(m mVar, org.jf.dexlib2.e.d.a aVar, String str) throws IOException {
        mVar.write(".subannotation ");
        mVar.write(aVar.io());
        mVar.write(10);
        b(mVar, aVar.ks(), str);
        mVar.write(".end subannotation");
    }

    public static void b(m mVar, Collection<? extends org.jf.dexlib2.e.b> collection, String str) throws IOException {
        mVar.bV(4);
        for (org.jf.dexlib2.e.b bVar : collection) {
            mVar.write(bVar.bf());
            mVar.write(" = ");
            c.a(mVar, bVar.kt(), str);
            mVar.write(10);
        }
        mVar.bW(4);
    }
}