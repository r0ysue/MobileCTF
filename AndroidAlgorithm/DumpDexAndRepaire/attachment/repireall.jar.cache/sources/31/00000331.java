package org.jf.dexlib2.a;

import java.util.HashMap;
import java.util.Map;

/* compiled from: OdexedFieldInstructionMapper.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/l.class */
public final class l {
    private static final a[] tg = {new a('Z', org.jf.dexlib2.e.IGET_BOOLEAN, org.jf.dexlib2.e.IGET_QUICK, org.jf.dexlib2.e.IGET_VOLATILE), new a('B', org.jf.dexlib2.e.IGET_BYTE, org.jf.dexlib2.e.IGET_QUICK, org.jf.dexlib2.e.IGET_VOLATILE), new a('S', org.jf.dexlib2.e.IGET_SHORT, org.jf.dexlib2.e.IGET_QUICK, org.jf.dexlib2.e.IGET_VOLATILE), new a('C', org.jf.dexlib2.e.IGET_CHAR, org.jf.dexlib2.e.IGET_QUICK, org.jf.dexlib2.e.IGET_VOLATILE), new a('I', org.jf.dexlib2.e.IGET, org.jf.dexlib2.e.IGET_QUICK, org.jf.dexlib2.e.IGET_VOLATILE), new a('F', org.jf.dexlib2.e.IGET, org.jf.dexlib2.e.IGET_QUICK, org.jf.dexlib2.e.IGET_VOLATILE), new a('J', org.jf.dexlib2.e.IGET_WIDE, org.jf.dexlib2.e.IGET_WIDE_QUICK, org.jf.dexlib2.e.IGET_WIDE_VOLATILE), new a('D', org.jf.dexlib2.e.IGET_WIDE, org.jf.dexlib2.e.IGET_WIDE_QUICK, org.jf.dexlib2.e.IGET_WIDE_VOLATILE), new a('L', org.jf.dexlib2.e.IGET_OBJECT, org.jf.dexlib2.e.IGET_OBJECT_QUICK, org.jf.dexlib2.e.IGET_OBJECT_VOLATILE), new a('[', org.jf.dexlib2.e.IGET_OBJECT, org.jf.dexlib2.e.IGET_OBJECT_QUICK, org.jf.dexlib2.e.IGET_OBJECT_VOLATILE), new a('Z', org.jf.dexlib2.e.IPUT_BOOLEAN, org.jf.dexlib2.e.IPUT_QUICK, org.jf.dexlib2.e.IPUT_VOLATILE), new a('B', org.jf.dexlib2.e.IPUT_BYTE, org.jf.dexlib2.e.IPUT_QUICK, org.jf.dexlib2.e.IPUT_VOLATILE), new a('S', org.jf.dexlib2.e.IPUT_SHORT, org.jf.dexlib2.e.IPUT_QUICK, org.jf.dexlib2.e.IPUT_VOLATILE), new a('C', org.jf.dexlib2.e.IPUT_CHAR, org.jf.dexlib2.e.IPUT_QUICK, org.jf.dexlib2.e.IPUT_VOLATILE), new a('I', org.jf.dexlib2.e.IPUT, org.jf.dexlib2.e.IPUT_QUICK, org.jf.dexlib2.e.IPUT_VOLATILE), new a('F', org.jf.dexlib2.e.IPUT, org.jf.dexlib2.e.IPUT_QUICK, org.jf.dexlib2.e.IPUT_VOLATILE), new a('J', org.jf.dexlib2.e.IPUT_WIDE, org.jf.dexlib2.e.IPUT_WIDE_QUICK, org.jf.dexlib2.e.IPUT_WIDE_VOLATILE), new a('D', org.jf.dexlib2.e.IPUT_WIDE, org.jf.dexlib2.e.IPUT_WIDE_QUICK, org.jf.dexlib2.e.IPUT_WIDE_VOLATILE), new a('L', org.jf.dexlib2.e.IPUT_OBJECT, org.jf.dexlib2.e.IPUT_OBJECT_QUICK, org.jf.dexlib2.e.IPUT_OBJECT_VOLATILE), new a('[', org.jf.dexlib2.e.IPUT_OBJECT, org.jf.dexlib2.e.IPUT_OBJECT_QUICK, org.jf.dexlib2.e.IPUT_OBJECT_VOLATILE), new a('Z', true, org.jf.dexlib2.e.SPUT_BOOLEAN, org.jf.dexlib2.e.SPUT_VOLATILE), new a('B', true, org.jf.dexlib2.e.SPUT_BYTE, org.jf.dexlib2.e.SPUT_VOLATILE), new a('S', true, org.jf.dexlib2.e.SPUT_SHORT, org.jf.dexlib2.e.SPUT_VOLATILE), new a('C', true, org.jf.dexlib2.e.SPUT_CHAR, org.jf.dexlib2.e.SPUT_VOLATILE), new a('I', true, org.jf.dexlib2.e.SPUT, org.jf.dexlib2.e.SPUT_VOLATILE), new a('F', true, org.jf.dexlib2.e.SPUT, org.jf.dexlib2.e.SPUT_VOLATILE), new a('J', true, org.jf.dexlib2.e.SPUT_WIDE, org.jf.dexlib2.e.SPUT_WIDE_VOLATILE), new a('D', true, org.jf.dexlib2.e.SPUT_WIDE, org.jf.dexlib2.e.SPUT_WIDE_VOLATILE), new a('L', true, org.jf.dexlib2.e.SPUT_OBJECT, org.jf.dexlib2.e.SPUT_OBJECT_VOLATILE), new a('[', true, org.jf.dexlib2.e.SPUT_OBJECT, org.jf.dexlib2.e.SPUT_OBJECT_VOLATILE), new a('Z', true, org.jf.dexlib2.e.SGET_BOOLEAN, org.jf.dexlib2.e.SGET_VOLATILE), new a('B', true, org.jf.dexlib2.e.SGET_BYTE, org.jf.dexlib2.e.SGET_VOLATILE), new a('S', true, org.jf.dexlib2.e.SGET_SHORT, org.jf.dexlib2.e.SGET_VOLATILE), new a('C', true, org.jf.dexlib2.e.SGET_CHAR, org.jf.dexlib2.e.SGET_VOLATILE), new a('I', true, org.jf.dexlib2.e.SGET, org.jf.dexlib2.e.SGET_VOLATILE), new a('F', true, org.jf.dexlib2.e.SGET, org.jf.dexlib2.e.SGET_VOLATILE), new a('J', true, org.jf.dexlib2.e.SGET_WIDE, org.jf.dexlib2.e.SGET_WIDE_VOLATILE), new a('D', true, org.jf.dexlib2.e.SGET_WIDE, org.jf.dexlib2.e.SGET_WIDE_VOLATILE), new a('L', true, org.jf.dexlib2.e.SGET_OBJECT, org.jf.dexlib2.e.SGET_OBJECT_VOLATILE), new a('[', true, org.jf.dexlib2.e.SGET_OBJECT, org.jf.dexlib2.e.SGET_OBJECT_VOLATILE)};
    private static final a[] th = {new a('Z', org.jf.dexlib2.e.IGET_BOOLEAN, org.jf.dexlib2.e.IGET_BOOLEAN_QUICK), new a('B', org.jf.dexlib2.e.IGET_BYTE, org.jf.dexlib2.e.IGET_BYTE_QUICK), new a('S', org.jf.dexlib2.e.IGET_SHORT, org.jf.dexlib2.e.IGET_SHORT_QUICK), new a('C', org.jf.dexlib2.e.IGET_CHAR, org.jf.dexlib2.e.IGET_CHAR_QUICK), new a('I', org.jf.dexlib2.e.IGET, org.jf.dexlib2.e.IGET_QUICK), new a('F', org.jf.dexlib2.e.IGET, org.jf.dexlib2.e.IGET_QUICK), new a('J', org.jf.dexlib2.e.IGET_WIDE, org.jf.dexlib2.e.IGET_WIDE_QUICK), new a('D', org.jf.dexlib2.e.IGET_WIDE, org.jf.dexlib2.e.IGET_WIDE_QUICK), new a('L', org.jf.dexlib2.e.IGET_OBJECT, org.jf.dexlib2.e.IGET_OBJECT_QUICK), new a('[', org.jf.dexlib2.e.IGET_OBJECT, org.jf.dexlib2.e.IGET_OBJECT_QUICK), new a('Z', org.jf.dexlib2.e.IPUT_BOOLEAN, org.jf.dexlib2.e.IPUT_BOOLEAN_QUICK), new a('B', org.jf.dexlib2.e.IPUT_BYTE, org.jf.dexlib2.e.IPUT_BYTE_QUICK), new a('S', org.jf.dexlib2.e.IPUT_SHORT, org.jf.dexlib2.e.IPUT_SHORT_QUICK), new a('C', org.jf.dexlib2.e.IPUT_CHAR, org.jf.dexlib2.e.IPUT_CHAR_QUICK), new a('I', org.jf.dexlib2.e.IPUT, org.jf.dexlib2.e.IPUT_QUICK), new a('F', org.jf.dexlib2.e.IPUT, org.jf.dexlib2.e.IPUT_QUICK), new a('J', org.jf.dexlib2.e.IPUT_WIDE, org.jf.dexlib2.e.IPUT_WIDE_QUICK), new a('D', org.jf.dexlib2.e.IPUT_WIDE, org.jf.dexlib2.e.IPUT_WIDE_QUICK), new a('L', org.jf.dexlib2.e.IPUT_OBJECT, org.jf.dexlib2.e.IPUT_OBJECT_QUICK), new a('[', org.jf.dexlib2.e.IPUT_OBJECT, org.jf.dexlib2.e.IPUT_OBJECT_QUICK)};
    private final a[][][] ti = new a[2][2][10];
    private final Map<org.jf.dexlib2.e, Integer> tj = new HashMap(30);

    /* compiled from: OdexedFieldInstructionMapper.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/a/l$a.class */
    private static class a {
        public final char tk;
        private boolean tl;
        public final org.jf.dexlib2.e tm;
        public final org.jf.dexlib2.e tn;
        public final org.jf.dexlib2.e to;

        public a(char c, org.jf.dexlib2.e eVar, org.jf.dexlib2.e eVar2, org.jf.dexlib2.e eVar3) {
            this.tk = c;
            this.tl = false;
            this.tm = eVar;
            this.tn = eVar2;
            this.to = eVar3;
        }

        public a(char c, boolean z, org.jf.dexlib2.e eVar, org.jf.dexlib2.e eVar2) {
            this.tk = c;
            this.tl = true;
            this.tm = eVar;
            this.tn = null;
            this.to = eVar2;
        }

        public a(char c, org.jf.dexlib2.e eVar, org.jf.dexlib2.e eVar2) {
            this.tk = c;
            this.tl = false;
            this.tm = eVar;
            this.tn = eVar2;
            this.to = null;
        }
    }

    private static int l(char c) {
        switch (c) {
            case 'B':
            case 'C':
            case 'F':
            case 'I':
            case 'S':
            case 'Z':
                return 0;
            case 'D':
            case 'J':
                return 1;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            default:
                throw new RuntimeException(String.format("Unknown type %s: ", Character.valueOf(c)));
            case 'L':
            case '[':
                return 2;
        }
    }

    private static int m(char c) {
        switch (c) {
            case 'B':
                return 1;
            case 'C':
                return 3;
            case 'D':
                return 7;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            default:
                throw new RuntimeException(String.format("Unknown type %s: ", Character.valueOf(c)));
            case 'F':
                return 5;
            case 'I':
                return 4;
            case 'J':
                return 6;
            case 'L':
                return 8;
            case 'S':
                return 2;
            case 'Z':
                return 0;
            case '[':
                return 9;
        }
    }

    private static boolean b(org.jf.dexlib2.e eVar) {
        return (eVar.flags & 16) != 0;
    }

    private static boolean c(org.jf.dexlib2.e eVar) {
        return (eVar.flags & org.jf.dexlib2.e.STATIC_FIELD_ACCESSOR) != 0;
    }

    public l(boolean z) {
        a[] aVarArr;
        a[] aVarArr2;
        if (z) {
            aVarArr = th;
        } else {
            aVarArr = tg;
        }
        for (a aVar : aVarArr) {
            this.ti[b(aVar.tm) ? (char) 0 : (char) 1][c(aVar.tm) ? (char) 1 : (char) 0][m(aVar.tk)] = aVar;
            if (aVar.tn != null) {
                this.tj.put(aVar.tn, Integer.valueOf(l(aVar.tk)));
            }
            if (aVar.to != null) {
                this.tj.put(aVar.to, Integer.valueOf(l(aVar.tk)));
            }
        }
    }

    public final org.jf.dexlib2.e a(String str, org.jf.dexlib2.e eVar) {
        a aVar = this.ti[b(eVar) ? (char) 0 : (char) 1][c(eVar) ? (char) 1 : (char) 0][m(str.charAt(0))];
        char c = aVar.tk;
        Integer num = this.tj.get(eVar);
        if (num != null) {
            if (!(num.intValue() == l(c))) {
                throw new org.jf.dexlib2.a.a(String.format("Incorrect field type \"%s\" for %s", str, eVar.name), new Object[0]);
            }
            return aVar.tm;
        }
        throw new RuntimeException("Unexpected opcode: " + eVar.name);
    }
}