package org.jf.dexlib2.h;

import org.jf.dexlib2.e.d.k;
import org.jf.dexlib2.e.d.l;
import org.jf.dexlib2.e.d.o;

/* compiled from: EncodedValueUtils.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/c.class */
public final class c {
    public static boolean d(org.jf.dexlib2.e.d.g gVar) {
        switch (gVar.jc()) {
            case 0:
                return ((org.jf.dexlib2.e.d.d) gVar).lR() == 0;
            case CAN_THROW:
            case 5:
            case 7:
            case SETS_RESULT:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return false;
            case ODEX_ONLY:
                return ((o) gVar).lV() == 0;
            case 3:
                return ((org.jf.dexlib2.e.d.e) gVar).lS() == 0;
            case CAN_CONTINUE:
                return ((k) gVar).getValue() == 0;
            case 6:
                return ((l) gVar).ln() == 0;
            case SETS_REGISTER:
                return ((org.jf.dexlib2.e.d.j) gVar).lU() == 0.0f;
            case 17:
                return ((org.jf.dexlib2.e.d.f) gVar).lT() == 0.0d;
            case 30:
                return true;
            case 31:
                return !((org.jf.dexlib2.e.d.c) gVar).lQ();
        }
    }
}