package com.a.a.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: ISO8601DateConverter.java */
/* loaded from: repireall.jar:com/a/a/a/i.class */
public class i extends a<Date> {
    private static final SimpleDateFormat fy = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: av */
    public Date af(String str) {
        try {
            return fy.parse(str);
        } catch (ParseException unused) {
            String.format("an ISO-8601 formatted date (%s)", fy.toPattern());
            throw null;
        }
    }
}