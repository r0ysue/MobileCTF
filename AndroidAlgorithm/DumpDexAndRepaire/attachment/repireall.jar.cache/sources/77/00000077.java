package com.a.a.a;

/* compiled from: DoubleConverter.java */
/* loaded from: repireall.jar:com/a/a/a/e.class */
public class e extends a<Double> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: at */
    public Double af(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            throw null;
        }
    }
}