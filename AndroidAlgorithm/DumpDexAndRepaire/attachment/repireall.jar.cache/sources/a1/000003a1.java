package org.jf.dexlib2;

/* compiled from: Format.java */
/* loaded from: repireall.jar:org/jf/dexlib2/d.class */
public enum d {
    Format10t(2),
    Format10x(2),
    Format11n(2),
    Format11x(2),
    Format12x(2),
    Format20bc(4),
    Format20t(4),
    Format21c(4),
    Format21ih(4),
    Format21lh(4),
    Format21s(4),
    Format21t(4),
    Format22b(4),
    Format22c(4),
    Format22cs(4),
    Format22s(4),
    Format22t(4),
    Format22x(4),
    Format23x(4),
    Format30t(6),
    Format31c(6),
    Format31i(6),
    Format31t(6),
    Format32x(6),
    Format35c(6),
    Format35mi(6),
    Format35ms(6),
    Format3rc(6),
    Format3rmi(6),
    Format3rms(6),
    Format45cc(8),
    Format4rcc(8),
    Format51l(10),
    ArrayPayload(-1, true),
    PackedSwitchPayload(-1, true),
    SparseSwitchPayload(-1, true),
    UnresolvedOdexInstruction(-1);
    
    public final int size;
    public final boolean isPayloadFormat;

    d(int i) {
        this(i, false);
    }

    d(int i, boolean z) {
        this.size = i;
        this.isPayloadFormat = z;
    }
}