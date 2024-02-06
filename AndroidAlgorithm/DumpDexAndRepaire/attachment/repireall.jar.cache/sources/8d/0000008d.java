package com.a.a.c;

import com.a.a.d;
import com.a.a.n;

/* compiled from: PositiveInteger.java */
/* loaded from: repireall.jar:com/a/a/c/c.class */
public final class c implements d {
    @Override // com.a.a.d
    public final void b(String str, String str2) throws n {
        if (Integer.parseInt(str2) < 0) {
            throw new n("Parameter " + str + " should be positive (found " + str2 + ")");
        }
    }
}