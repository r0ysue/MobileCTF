package org.jf.dexlib2.a.a;

import com.b.a.c.ao;
import java.lang.reflect.Field;
import java.util.Set;
import org.jf.dexlib2.e.d.g;
import org.jf.dexlib2.e.f;

/* compiled from: ReflectionField.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/a/c.class */
public final class c extends org.jf.dexlib2.b.a.a implements f {
    private final Field tZ;

    public c(Field field) {
        this.tZ = field;
    }

    @Override // org.jf.dexlib2.e.f
    public final int iJ() {
        return this.tZ.getModifiers();
    }

    @Override // org.jf.dexlib2.e.f
    public final g iZ() {
        return null;
    }

    @Override // org.jf.dexlib2.e.f
    public final Set<? extends org.jf.dexlib2.e.a> iK() {
        return ao.fl();
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String iG() {
        return org.jf.dexlib2.a.a.a.a.bo(this.tZ.getDeclaringClass().getName());
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String bf() {
        return this.tZ.getName();
    }

    @Override // org.jf.dexlib2.e.c.a, org.jf.dexlib2.e.f
    public final String io() {
        return org.jf.dexlib2.a.a.a.a.bo(this.tZ.getType().getName());
    }
}