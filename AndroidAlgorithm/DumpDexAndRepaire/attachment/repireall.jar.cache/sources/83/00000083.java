package com.a.a;

import java.util.HashMap;
import java.util.Map;

/* compiled from: FuzzyMap.java */
/* loaded from: repireall.jar:com/a/a/b.class */
public final class b {

    /* compiled from: FuzzyMap.java */
    /* loaded from: repireall.jar:com/a/a/b$a.class */
    interface a {
        String bf();
    }

    public static <V> V a(Map<? extends a, V> map, a aVar, boolean z, boolean z2) {
        V v;
        if (!z2) {
            if (z) {
                return map.get(aVar);
            }
            for (a aVar2 : map.keySet()) {
                if (aVar2.bf().equalsIgnoreCase(aVar.bf())) {
                    return map.get(aVar2);
                }
            }
            return null;
        }
        String bf = aVar.bf();
        HashMap hashMap = new HashMap();
        for (a aVar3 : map.keySet()) {
            String bf2 = aVar3.bf();
            if ((z && bf2.startsWith(bf)) || (!z && bf2.toLowerCase().startsWith(bf.toLowerCase()))) {
                hashMap.put(bf2, map.get(aVar3));
            }
        }
        if (hashMap.size() > 1) {
            throw new n("Ambiguous option: " + aVar + " matches " + hashMap.keySet());
        }
        if (hashMap.size() == 1) {
            v = hashMap.values().iterator().next();
        } else {
            v = null;
        }
        return v;
    }
}