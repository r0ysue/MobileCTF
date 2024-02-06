package com.a.a.a;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: URIConverter.java */
/* loaded from: repireall.jar:com/a/a/a/o.class */
public class o extends a<URI> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.a.a.f
    /* renamed from: ay */
    public URI af(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            throw null;
        }
    }
}