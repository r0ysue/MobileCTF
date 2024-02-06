package com.a.a.a;

/* compiled from: BooleanConverter.java */
/* loaded from: repireall.jar:com/a/a/a/c.class */
public class c extends a<Boolean> {
    @Override // com.a.a.f
    public final /* synthetic */ Object af(String str) {
        if ("false".equalsIgnoreCase(str) || "true".equalsIgnoreCase(str)) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        throw null;
    }
}