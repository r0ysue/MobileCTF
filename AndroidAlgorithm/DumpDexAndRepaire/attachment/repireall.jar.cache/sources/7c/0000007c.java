package com.a.a.a;

/* compiled from: IntegerConverter.java */
/* loaded from: repireall.jar:com/a/a/a/j.class */
public class j extends a<Integer> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: aw */
    public Integer af(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            throw null;
        }
    }
}