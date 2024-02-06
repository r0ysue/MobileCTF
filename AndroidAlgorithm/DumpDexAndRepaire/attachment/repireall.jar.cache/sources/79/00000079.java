package com.a.a.a;

/* compiled from: FloatConverter.java */
/* loaded from: repireall.jar:com/a/a/a/g.class */
public class g extends a<Float> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: au */
    public Float af(String str) {
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            throw null;
        }
    }
}