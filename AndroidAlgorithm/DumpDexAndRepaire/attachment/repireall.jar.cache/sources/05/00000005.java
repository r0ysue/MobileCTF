package antlr.a.a;

import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: IndexedVector.java */
/* loaded from: repireall.jar:antlr/a/a/c.class */
public final class c {
    private f dN = new f(10);
    private Hashtable dO = new Hashtable(10);

    public c() {
    }

    public c(int i) {
    }

    public final synchronized void a(String str, Object obj) {
        this.dN.a(obj);
        this.dO.put(str, obj);
    }

    public final Object F(int i) {
        return this.dN.G(i);
    }

    public final Enumeration ba() {
        return this.dN.bb();
    }

    public final Object O(String str) {
        return this.dO.get(str);
    }

    public final int size() {
        return this.dN.bc();
    }
}