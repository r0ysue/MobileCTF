package org.jf.dexlib2;

import com.b.a.c.ba;
import com.b.a.c.bi;
import java.util.EnumMap;
import java.util.HashMap;

/* compiled from: Opcodes.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f.class */
public final class f {
    public final int rE;
    private int rF;
    private final e[] rG = new e[255];
    private final EnumMap<e, Short> rH;
    private final HashMap<String, e> rI;

    public static f ag(int i) {
        return new f(i, -1);
    }

    public static f ah(int i) {
        return new f(-1, i);
    }

    public static f hZ() {
        return ag(20);
    }

    private f(int i, int i2) {
        int i3;
        int i4;
        e[] values;
        bi<Integer, Short> biVar;
        int i5;
        if (i >= 21) {
            this.rE = i;
            switch (i) {
                case 19:
                case 20:
                    i5 = 7;
                    break;
                case 21:
                    i5 = 39;
                    break;
                case 22:
                    i5 = 45;
                    break;
                case 23:
                    i5 = 64;
                    break;
                case 24:
                case 25:
                    i5 = 79;
                    break;
                default:
                    if (i > 25) {
                        i5 = 87;
                        break;
                    } else {
                        i5 = -1;
                        break;
                    }
            }
            this.rF = i5;
        } else if (i2 >= 0 && i2 < 39) {
            if (i2 >= 87) {
                i3 = 26;
            } else if (i2 >= 79) {
                i3 = 24;
            } else if (i2 >= 64) {
                i3 = 23;
            } else if (i2 >= 45) {
                i3 = 22;
            } else if (i2 >= 39) {
                i3 = 21;
            } else {
                i3 = 19;
            }
            this.rE = i3;
            this.rF = i2;
        } else {
            this.rE = i;
            this.rF = i2;
        }
        this.rH = new EnumMap<>(e.class);
        this.rI = ba.fM();
        if (ia()) {
            i4 = this.rF;
        } else {
            i4 = this.rE;
        }
        for (e eVar : e.values()) {
            if (ia()) {
                biVar = eVar.artVersionToValueMap;
            } else {
                biVar = eVar.apiToValueMap;
            }
            Short a = biVar.a(Integer.valueOf(i4));
            if (a != null) {
                if (!eVar.format.isPayloadFormat) {
                    this.rG[a.shortValue()] = eVar;
                }
                this.rH.put((EnumMap<e, Short>) eVar, (e) a);
                this.rI.put(eVar.name.toLowerCase(), eVar);
            }
        }
    }

    public final e ai(int i) {
        switch (i) {
            case STATIC_FIELD_ACCESSOR:
                return e.PACKED_SWITCH_PAYLOAD;
            case JUMBO_OPCODE:
                return e.SPARSE_SWITCH_PAYLOAD;
            case 768:
                return e.ARRAY_PAYLOAD;
            default:
                if (i >= 0 && i < this.rG.length) {
                    return this.rG[i];
                }
                return null;
        }
    }

    public final Short a(e eVar) {
        return this.rH.get(eVar);
    }

    private boolean ia() {
        return this.rF != -1;
    }
}