package com.a.a.a;

/* compiled from: LongConverter.java */
/* loaded from: repireall.jar:com/a/a/a/k.class */
public class k extends a<Long> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: ax */
    public Long af(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            throw null;
        }
    }
}