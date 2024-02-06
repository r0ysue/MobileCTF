package org.jf.dexlib2.a;

import com.b.a.c.ao;
import com.b.a.c.ax;
import java.io.Serializable;
import java.util.List;

/* compiled from: ClassPath.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/e.class */
public final class e {
    private List<h> rX;
    private final boolean rY;
    public final int rZ;
    private final com.b.a.b.d<String, o> sa = new com.b.a.b.d<String, o>() { // from class: org.jf.dexlib2.a.e.1
        @Override // com.b.a.b.d
        public final /* synthetic */ o k(String str) throws Exception {
            String str2 = str;
            if (str2.charAt(0) == '[') {
                return new d(e.this, str2);
            }
            return new g(e.this, str2);
        }
    };
    private com.b.a.b.f<String, o> sb = com.b.a.b.c.de().a(this.sa);
    private final com.b.a.a.o<l> sc = com.b.a.a.p.a(new com.b.a.a.o<l>() { // from class: org.jf.dexlib2.a.e.2
        @Override // com.b.a.a.o
        public final /* synthetic */ l get() {
            return new l(e.this.it());
        }
    });
    private final p rW = new p(this);

    public e(Iterable<? extends h> iterable, boolean z, int i) {
        this.sb.a(this.rW.io(), this.rW);
        this.rY = z;
        this.rZ = i;
        bi("Z");
        bi("B");
        bi("S");
        bi("C");
        bi("I");
        bi("J");
        bi("F");
        bi("D");
        bi("L");
        this.rX = ax.j(iterable);
        this.rX.add(new i(new org.jf.dexlib2.f.d(org.jf.dexlib2.f.hZ(), ao.a(new org.jf.dexlib2.a.a.a(Class.class), new org.jf.dexlib2.a.a.a(Cloneable.class), new org.jf.dexlib2.a.a.a(Object.class), new org.jf.dexlib2.a.a.a(Serializable.class), new org.jf.dexlib2.a.a.a(String.class), new org.jf.dexlib2.a.a.a(Throwable.class), new org.jf.dexlib2.a.a.a[0]))));
    }

    private void bi(String str) {
        this.sb.a(str, new m(this, str));
    }

    public final boolean it() {
        return this.rZ != -1;
    }

    public final o a(CharSequence charSequence) {
        return this.sb.l(charSequence.toString());
    }

    public final org.jf.dexlib2.e.c bj(String str) {
        for (h hVar : this.rX) {
            org.jf.dexlib2.e.c bj = hVar.bj(str);
            if (bj != null) {
                return bj;
            }
        }
        throw new q("Could not resolve class %s", str);
    }

    public final o iu() {
        return this.rW;
    }

    public final boolean iv() {
        return this.rY;
    }

    public final l iw() {
        return this.sc.get();
    }
}