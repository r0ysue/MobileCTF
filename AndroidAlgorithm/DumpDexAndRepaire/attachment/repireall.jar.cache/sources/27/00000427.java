package org.jf.dexlib2.d.e;

import org.jf.a.i;
import org.jf.dexlib2.d.o;
import org.jf.dexlib2.f.e.k;
import org.jf.dexlib2.f.e.l;
import org.jf.dexlib2.f.e.m;
import org.jf.dexlib2.f.e.p;

/* compiled from: DexBackedEncodedValue.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d/e/c.class */
public abstract class c {
    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.Exception] */
    public static org.jf.dexlib2.e.d.g f(o oVar) {
        ?? kd = oVar.kd();
        try {
            int kn = oVar.kn();
            int i = kn & 31;
            int i2 = kn >>> 5;
            switch (i) {
                case 0:
                    org.jf.dexlib2.h.f.j(i2, 0);
                    return new org.jf.dexlib2.f.e.d((byte) oVar.kp());
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
                default:
                    throw new i("Invalid encoded_value type: 0x%x", Integer.valueOf(i));
                case ODEX_ONLY:
                    org.jf.dexlib2.h.f.j(i2, 1);
                    return new p((short) oVar.aI(i2 + 1));
                case 3:
                    org.jf.dexlib2.h.f.j(i2, 1);
                    return new org.jf.dexlib2.f.e.e((char) oVar.aJ(i2 + 1));
                case CAN_CONTINUE:
                    org.jf.dexlib2.h.f.j(i2, 3);
                    return new l(oVar.aI(i2 + 1));
                case 6:
                    org.jf.dexlib2.h.f.j(i2, 7);
                    return new m(oVar.aM(i2 + 1));
                case SETS_REGISTER:
                    org.jf.dexlib2.h.f.j(i2, 3);
                    return new k(Float.intBitsToFloat(oVar.aK(i2 + 1)));
                case 17:
                    org.jf.dexlib2.h.f.j(i2, 7);
                    return new org.jf.dexlib2.f.e.f(Double.longBitsToDouble(oVar.aL(i2 + 1)));
                case 23:
                    org.jf.dexlib2.h.f.j(i2, 3);
                    return new g(oVar, i2);
                case 24:
                    org.jf.dexlib2.h.f.j(i2, 3);
                    return new h(oVar, i2);
                case 25:
                    org.jf.dexlib2.h.f.j(i2, 3);
                    return new e(oVar, i2);
                case 26:
                    org.jf.dexlib2.h.f.j(i2, 3);
                    return new f(oVar, i2);
                case 27:
                    org.jf.dexlib2.h.f.j(i2, 3);
                    return new d(oVar, i2);
                case 28:
                    org.jf.dexlib2.h.f.j(i2, 0);
                    return new b(oVar);
                case 29:
                    org.jf.dexlib2.h.f.j(i2, 0);
                    return new a(oVar);
                case 30:
                    org.jf.dexlib2.h.f.j(i2, 0);
                    return org.jf.dexlib2.f.e.o.AT;
                case 31:
                    org.jf.dexlib2.h.f.j(i2, 1);
                    return org.jf.dexlib2.f.e.c.W(i2 == 1);
            }
        } catch (Exception e) {
            throw i.a(kd, "Error while reading encoded value at offset 0x%x", Integer.valueOf((int) kd));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.Exception] */
    public static void e(o oVar) {
        ?? kd = oVar.kd();
        try {
            int kn = oVar.kn();
            int i = kn & 31;
            switch (i) {
                case 0:
                    oVar.kq();
                    return;
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
                default:
                    throw new i("Invalid encoded_value type: 0x%x", Integer.valueOf(i));
                case ODEX_ONLY:
                case 3:
                case CAN_CONTINUE:
                case 6:
                case SETS_REGISTER:
                case 17:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    oVar.aH((kn >>> 5) + 1);
                    return;
                case 28:
                    b.e(oVar);
                    return;
                case 29:
                    a.e(oVar);
                    return;
                case 30:
                case 31:
                    return;
            }
        } catch (Exception e) {
            throw i.a(kd, "Error while skipping encoded value at offset 0x%x", Integer.valueOf((int) kd));
        }
    }
}