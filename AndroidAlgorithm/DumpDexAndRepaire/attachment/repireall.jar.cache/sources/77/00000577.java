package org.jf.dexlib2;

import com.b.a.c.ba;
import java.util.HashMap;

/* compiled from: VerificationError.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h.class */
public final class h {
    private static final HashMap<String, Integer> rK;

    static {
        HashMap<String, Integer> fM = ba.fM();
        rK = fM;
        fM.put("generic-error", 1);
        rK.put("no-such-class", 2);
        rK.put("no-such-field", 3);
        rK.put("no-such-method", 4);
        rK.put("illegal-class-access", 5);
        rK.put("illegal-field-access", 6);
        rK.put("illegal-method-access", 7);
        rK.put("class-change-error", 8);
        rK.put("instantiation-error", 9);
    }

    public static String ak(int i) {
        switch (i) {
            case CAN_THROW:
                return "generic-error";
            case ODEX_ONLY:
                return "no-such-class";
            case 3:
                return "no-such-field";
            case CAN_CONTINUE:
                return "no-such-method";
            case 5:
                return "illegal-class-access";
            case 6:
                return "illegal-field-access";
            case 7:
                return "illegal-method-access";
            case SETS_RESULT:
                return "class-change-error";
            case 9:
                return "instantiation-error";
            default:
                return null;
        }
    }

    public static boolean al(int i) {
        return i > 0 && i < 10;
    }
}