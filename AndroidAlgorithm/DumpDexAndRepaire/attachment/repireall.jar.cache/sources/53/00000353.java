package org.jf.dexlib2.b;

import com.b.a.a.h;
import java.util.Comparator;
import org.jf.dexlib2.e.c.f;

/* compiled from: BaseExceptionHandler.java */
/* loaded from: repireall.jar:org/jf/dexlib2/b/c.class */
public abstract class c implements org.jf.dexlib2.e.e {
    @Override // org.jf.dexlib2.e.e
    public f ja() {
        final String jd = jd();
        if (jd != null) {
            return new org.jf.dexlib2.b.a.e() { // from class: org.jf.dexlib2.b.c.1
                @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
                public final String io() {
                    return jd;
                }
            };
        }
        return null;
    }

    public int hashCode() {
        String jd = jd();
        return ((jd == null ? 0 : jd.hashCode()) * 31) + je();
    }

    public boolean equals(Object obj) {
        if (obj instanceof org.jf.dexlib2.e.e) {
            org.jf.dexlib2.e.e eVar = (org.jf.dexlib2.e.e) obj;
            return h.e(jd(), eVar.jd()) && je() == eVar.je();
        }
        return false;
    }

    @Override // org.jf.dexlib2.e.e, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(org.jf.dexlib2.e.e eVar) {
        String jd = jd();
        if (jd == null) {
            if (eVar.jd() != null) {
                return 1;
            }
        } else if (eVar.jd() == null) {
            return -1;
        } else {
            int compareTo = jd.compareTo(eVar.jd());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return com.b.a.e.b.h(je(), eVar.je());
    }

    static {
        new Comparator<org.jf.dexlib2.e.e>() { // from class: org.jf.dexlib2.b.c.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(org.jf.dexlib2.e.e eVar, org.jf.dexlib2.e.e eVar2) {
                org.jf.dexlib2.e.e eVar3 = eVar2;
                String jd = eVar.jd();
                if (jd == null) {
                    if (eVar3.jd() != null) {
                        return 1;
                    }
                    return 0;
                } else if (eVar3.jd() == null) {
                    return -1;
                } else {
                    return jd.compareTo(eVar3.jd());
                }
            }
        };
    }
}