package com.a.a.b;

import com.a.a.n;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: DefaultConsole.java */
/* loaded from: repireall.jar:com/a/a/b/b.class */
public final class b implements a {
    @Override // com.a.a.b.a
    public final void aA(String str) {
        System.out.print(str);
    }

    @Override // com.a.a.b.a
    public final void aB(String str) {
        System.out.println(str);
    }

    @Override // com.a.a.b.a
    public final char[] y(boolean z) {
        try {
            return new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        } catch (IOException e) {
            throw new n(e);
        }
    }
}