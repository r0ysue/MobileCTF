package com.a.a.a;

import java.math.BigDecimal;

/* compiled from: BigDecimalConverter.java */
/* loaded from: repireall.jar:com/a/a/a/b.class */
public class b extends a<BigDecimal> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: ar */
    public BigDecimal af(String str) {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw null;
        }
    }
}