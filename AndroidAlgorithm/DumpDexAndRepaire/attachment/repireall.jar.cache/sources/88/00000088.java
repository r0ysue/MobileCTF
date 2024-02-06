package com.a.a.b;

import com.a.a.n;
import java.io.PrintWriter;

/* compiled from: JDK6Console.java */
/* loaded from: repireall.jar:com/a/a/b/d.class */
public final class d implements a {
    private Object fA;
    private PrintWriter fB;

    public d(Object obj) throws Exception {
        this.fA = obj;
        this.fB = (PrintWriter) obj.getClass().getDeclaredMethod("writer", new Class[0]).invoke(obj, new Object[0]);
    }

    @Override // com.a.a.b.a
    public final void aA(String str) {
        this.fB.print(str);
    }

    @Override // com.a.a.b.a
    public final void aB(String str) {
        this.fB.println(str);
    }

    @Override // com.a.a.b.a
    public final char[] y(boolean z) {
        try {
            this.fB.flush();
            if (z) {
                return ((String) this.fA.getClass().getDeclaredMethod("readLine", new Class[0]).invoke(this.fA, new Object[0])).toCharArray();
            }
            return (char[]) this.fA.getClass().getDeclaredMethod("readPassword", new Class[0]).invoke(this.fA, new Object[0]);
        } catch (Exception e) {
            throw new n(e);
        }
    }
}