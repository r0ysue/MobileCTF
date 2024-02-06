package org.jf.dexlib2.h;

import java.io.IOException;
import java.io.Writer;
import org.jf.a.s;

/* compiled from: ReferenceUtil.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/g.class */
public final class g {
    public static String e(org.jf.dexlib2.e.c.c cVar) {
        return b(cVar, false);
    }

    public static String b(org.jf.dexlib2.e.c.c cVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append(cVar.iG());
            sb.append("->");
        }
        sb.append(cVar.bf());
        sb.append('(');
        for (CharSequence charSequence : cVar.iH()) {
            sb.append(charSequence);
        }
        sb.append(')');
        sb.append(cVar.iI());
        return sb.toString();
    }

    public static String c(org.jf.dexlib2.e.c.b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (CharSequence charSequence : bVar.iH()) {
            sb.append(charSequence);
        }
        sb.append(')');
        sb.append(bVar.iI());
        return sb.toString();
    }

    public static void a(Writer writer, org.jf.dexlib2.e.c.c cVar, boolean z) throws IOException {
        if (!z) {
            writer.write(cVar.iG());
            writer.write("->");
        }
        writer.write(cVar.bf());
        writer.write(40);
        for (CharSequence charSequence : cVar.iH()) {
            writer.write(charSequence.toString());
        }
        writer.write(41);
        writer.write(cVar.iI());
    }

    public static String a(org.jf.dexlib2.e.c.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append(aVar.iG());
            sb.append("->");
        }
        sb.append(aVar.bf());
        sb.append(':');
        sb.append(aVar.io());
        return sb.toString();
    }

    public static String e(org.jf.dexlib2.e.c.a aVar) {
        return aVar.bf() + ':' + aVar.io();
    }

    public static void a(Writer writer, org.jf.dexlib2.e.c.a aVar, boolean z) throws IOException {
        if (!z) {
            writer.write(aVar.iG());
            writer.write("->");
        }
        writer.write(aVar.bf());
        writer.write(58);
        writer.write(aVar.io());
    }

    public static String a(org.jf.dexlib2.e.c.d dVar, String str) {
        if (dVar instanceof org.jf.dexlib2.e.c.e) {
            return String.format("\"%s\"", s.bF(((org.jf.dexlib2.e.c.e) dVar).lD()));
        }
        if (dVar instanceof org.jf.dexlib2.e.c.f) {
            return ((org.jf.dexlib2.e.c.f) dVar).io();
        }
        if (dVar instanceof org.jf.dexlib2.e.c.a) {
            org.jf.dexlib2.e.c.a aVar = (org.jf.dexlib2.e.c.a) dVar;
            return a(aVar, aVar.iG().equals(str));
        } else if (dVar instanceof org.jf.dexlib2.e.c.c) {
            org.jf.dexlib2.e.c.c cVar = (org.jf.dexlib2.e.c.c) dVar;
            return b(cVar, cVar.iG().equals(str));
        } else if (dVar instanceof org.jf.dexlib2.e.c.b) {
            return c((org.jf.dexlib2.e.c.b) dVar);
        } else {
            return null;
        }
    }
}