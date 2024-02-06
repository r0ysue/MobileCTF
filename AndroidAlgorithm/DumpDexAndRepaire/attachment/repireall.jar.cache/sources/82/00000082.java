package com.a.a.a;

import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: URLConverter.java */
/* loaded from: repireall.jar:com/a/a/a/p.class */
public class p extends a<URL> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: az */
    public URL af(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            throw null;
        }
    }
}