package org.jf.dexlib2.h;

import java.util.Collection;

/* compiled from: MethodUtil.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/e.class */
public final class e {
    private static int CO = (org.jf.dexlib2.a.STATIC.getValue() | org.jf.dexlib2.a.PRIVATE.getValue()) | org.jf.dexlib2.a.CONSTRUCTOR.getValue();
    public static com.b.a.a.j<org.jf.dexlib2.e.g> CP = new com.b.a.a.j<org.jf.dexlib2.e.g>() { // from class: org.jf.dexlib2.h.e.1
        @Override // com.b.a.a.j
        public final /* synthetic */ boolean apply(org.jf.dexlib2.e.g gVar) {
            org.jf.dexlib2.e.g gVar2 = gVar;
            return gVar2 != null && e.b(gVar2);
        }
    };
    public static com.b.a.a.j<org.jf.dexlib2.e.g> CQ = new com.b.a.a.j<org.jf.dexlib2.e.g>() { // from class: org.jf.dexlib2.h.e.2
        @Override // com.b.a.a.j
        public final /* synthetic */ boolean apply(org.jf.dexlib2.e.g gVar) {
            org.jf.dexlib2.e.g gVar2 = gVar;
            return (gVar2 == null || e.b(gVar2)) ? false : true;
        }
    };

    public static boolean b(org.jf.dexlib2.e.g gVar) {
        return (gVar.iJ() & CO) != 0;
    }

    public static boolean c(org.jf.dexlib2.e.g gVar) {
        return org.jf.dexlib2.a.STATIC.isSet(gVar.iJ());
    }

    public static boolean d(org.jf.dexlib2.e.g gVar) {
        return gVar.bf().equals("<init>");
    }

    public static boolean e(org.jf.dexlib2.e.g gVar) {
        return (gVar.iJ() & ((org.jf.dexlib2.a.PRIVATE.getValue() | org.jf.dexlib2.a.PROTECTED.getValue()) | org.jf.dexlib2.a.PUBLIC.getValue())) == 0;
    }

    public static int f(org.jf.dexlib2.e.g gVar) {
        return a(gVar, c(gVar));
    }

    public static int a(org.jf.dexlib2.e.c.c cVar, boolean z) {
        return a(cVar.iH(), z);
    }

    public static int a(Collection<? extends CharSequence> collection, boolean z) {
        int i = 0;
        for (CharSequence charSequence : collection) {
            char charAt = charSequence.charAt(0);
            if (charAt == 'J' || charAt == 'D') {
                i += 2;
            } else {
                i++;
            }
        }
        if (!z) {
            i++;
        }
        return i;
    }

    private static char c(CharSequence charSequence) {
        if (charSequence.length() > 1) {
            return 'L';
        }
        return charSequence.charAt(0);
    }

    public static String a(Collection<? extends CharSequence> collection, String str) {
        StringBuilder sb = new StringBuilder(collection.size() + 1);
        sb.append(c(str));
        for (CharSequence charSequence : collection) {
            sb.append(c(charSequence));
        }
        return sb.toString();
    }

    public static boolean a(org.jf.dexlib2.e.g gVar, org.jf.dexlib2.e.c.c cVar) {
        return gVar.bf().equals(cVar.bf()) && gVar.iI().equals(cVar.iI()) && org.jf.a.e.a(gVar.iH(), cVar.iH());
    }
}