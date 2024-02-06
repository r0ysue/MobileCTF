package com.a.a.b;

import com.a.a.a.i;
import com.a.a.a.j;
import com.a.a.a.k;
import com.a.a.a.m;
import com.a.a.a.n;
import com.a.a.a.o;
import com.a.a.a.p;
import com.a.a.f;
import com.a.a.g;
import java.io.File;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DefaultConverterFactory.java */
/* loaded from: repireall.jar:com/a/a/b/c.class */
public final class c implements g {
    private static Map<Class, Class<? extends f<?>>> fz;

    @Override // com.a.a.g
    public final Class<? extends f<?>> b(Class cls) {
        return fz.get(cls);
    }

    static {
        HashMap hashMap = new HashMap();
        fz = hashMap;
        hashMap.put(String.class, n.class);
        fz.put(Integer.class, j.class);
        fz.put(Integer.TYPE, j.class);
        fz.put(Long.class, k.class);
        fz.put(Long.TYPE, k.class);
        fz.put(Float.class, com.a.a.a.g.class);
        fz.put(Float.TYPE, com.a.a.a.g.class);
        fz.put(Double.class, com.a.a.a.e.class);
        fz.put(Double.TYPE, com.a.a.a.e.class);
        fz.put(Boolean.class, com.a.a.a.c.class);
        fz.put(Boolean.TYPE, com.a.a.a.c.class);
        fz.put(File.class, com.a.a.a.f.class);
        fz.put(BigDecimal.class, com.a.a.a.b.class);
        fz.put(Date.class, i.class);
        fz.put(Path.class, m.class);
        fz.put(URI.class, o.class);
        fz.put(URL.class, p.class);
    }
}