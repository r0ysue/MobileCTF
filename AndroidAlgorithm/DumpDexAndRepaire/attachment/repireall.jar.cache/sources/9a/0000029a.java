package org.jf.baksmali.a;

import java.io.IOException;
import java.util.Collection;

/* compiled from: AnnotationFormatter.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/a.class */
public final class a {
    public static void a(org.jf.a.m mVar, Collection<? extends org.jf.dexlib2.e.a> collection, String str) throws IOException {
        boolean z = true;
        for (org.jf.dexlib2.e.a aVar : collection) {
            if (!z) {
                mVar.write(10);
            }
            z = false;
            mVar.write(".annotation ");
            mVar.write(org.jf.dexlib2.b.af(aVar.kr()));
            mVar.write(32);
            mVar.write(aVar.io());
            mVar.write(10);
            org.jf.baksmali.a.b.a.b(mVar, aVar.ks(), str);
            mVar.write(".end annotation\n");
        }
    }
}