package org.jf.dexlib2;

import java.util.HashMap;

/* compiled from: AccessFlags.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a.class */
public enum a {
    PUBLIC(1, "public", true, true, true),
    PRIVATE(2, "private", true, true, true),
    PROTECTED(4, "protected", true, true, true),
    STATIC(8, "static", true, true, true),
    FINAL(16, "final", true, true, true),
    SYNCHRONIZED(32, "synchronized", false, true, false),
    VOLATILE(64, "volatile", false, false, true),
    BRIDGE(64, "bridge", false, true, false),
    TRANSIENT(e.VOLATILE_FIELD_ACCESSOR, "transient", false, false, true),
    VARARGS(e.VOLATILE_FIELD_ACCESSOR, "varargs", false, true, false),
    NATIVE(e.STATIC_FIELD_ACCESSOR, "native", false, true, false),
    INTERFACE(e.JUMBO_OPCODE, "interface", true, false, false),
    ABSTRACT(e.CAN_INITIALIZE_REFERENCE, "abstract", true, true, false),
    STRICTFP(2048, "strictfp", false, true, false),
    SYNTHETIC(4096, "synthetic", true, true, true),
    ANNOTATION(8192, "annotation", true, false, false),
    ENUM(16384, "enum", true, false, true),
    CONSTRUCTOR(65536, "constructor", false, true, false),
    DECLARED_SYNCHRONIZED(131072, "declared-synchronized", false, true, false);
    
    private int value;
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForMethod;
    private boolean validForField;
    private static final a[] allFlags = values();
    private static HashMap<String, a> accessFlagsByName = new HashMap<>();

    static {
        a[] aVarArr;
        for (a aVar : allFlags) {
            accessFlagsByName.put(aVar.accessFlagName, aVar);
        }
    }

    a(int i, String str, boolean z, boolean z2, boolean z3) {
        this.value = i;
        this.accessFlagName = str;
        this.validForClass = z;
        this.validForMethod = z2;
        this.validForField = z3;
    }

    public final boolean isSet(int i) {
        return (this.value & i) != 0;
    }

    public static a[] getAccessFlagsForClass(int i) {
        a[] aVarArr;
        a[] aVarArr2;
        int i2 = 0;
        for (a aVar : allFlags) {
            if (aVar.validForClass && (i & aVar.value) != 0) {
                i2++;
            }
        }
        a[] aVarArr3 = new a[i2];
        int i3 = 0;
        for (a aVar2 : allFlags) {
            if (aVar2.validForClass && (i & aVar2.value) != 0) {
                int i4 = i3;
                i3++;
                aVarArr3[i4] = aVar2;
            }
        }
        return aVarArr3;
    }

    private static String formatAccessFlags(a[] aVarArr) {
        int i = 0;
        for (a aVar : aVarArr) {
            i += aVar.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(i);
        for (a aVar2 : aVarArr) {
            sb.append(aVar2.toString());
            sb.append(" ");
        }
        if (aVarArr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    public static String formatAccessFlagsForClass(int i) {
        return formatAccessFlags(getAccessFlagsForClass(i));
    }

    public static a[] getAccessFlagsForMethod(int i) {
        a[] aVarArr;
        a[] aVarArr2;
        int i2 = 0;
        for (a aVar : allFlags) {
            if (aVar.validForMethod && (i & aVar.value) != 0) {
                i2++;
            }
        }
        a[] aVarArr3 = new a[i2];
        int i3 = 0;
        for (a aVar2 : allFlags) {
            if (aVar2.validForMethod && (i & aVar2.value) != 0) {
                int i4 = i3;
                i3++;
                aVarArr3[i4] = aVar2;
            }
        }
        return aVarArr3;
    }

    public static String formatAccessFlagsForMethod(int i) {
        return formatAccessFlags(getAccessFlagsForMethod(i));
    }

    public static a[] getAccessFlagsForField(int i) {
        a[] aVarArr;
        a[] aVarArr2;
        int i2 = 0;
        for (a aVar : allFlags) {
            if (aVar.validForField && (i & aVar.value) != 0) {
                i2++;
            }
        }
        a[] aVarArr3 = new a[i2];
        int i3 = 0;
        for (a aVar2 : allFlags) {
            if (aVar2.validForField && (i & aVar2.value) != 0) {
                int i4 = i3;
                i3++;
                aVarArr3[i4] = aVar2;
            }
        }
        return aVarArr3;
    }

    public static String formatAccessFlagsForField(int i) {
        return formatAccessFlags(getAccessFlagsForField(i));
    }

    public static a getAccessFlag(String str) {
        return accessFlagsByName.get(str);
    }

    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.accessFlagName;
    }
}