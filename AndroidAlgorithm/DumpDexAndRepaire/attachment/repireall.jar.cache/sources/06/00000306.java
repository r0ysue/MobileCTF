package org.jf.dexlib2.a.a;

import com.b.a.c.ao;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.List;
import java.util.Set;
import org.jf.dexlib2.e.g;
import org.jf.dexlib2.e.h;
import org.jf.dexlib2.e.i;

/* compiled from: ReflectionMethod.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/a/d.class */
public final class d extends org.jf.dexlib2.b.a.c implements g {
    private final Method ua;

    public d(Method method) {
        this.ua = method;
    }

    @Override // org.jf.dexlib2.e.g
    public final List<? extends i> bQ() {
        final Method method = this.ua;
        return new AbstractList<i>() { // from class: org.jf.dexlib2.a.a.d.1
            private final Class[] ub;

            {
                this.ub = method.getParameterTypes();
            }

            @Override // java.util.AbstractList, java.util.List
            public final /* synthetic */ Object get(final int i) {
                return new org.jf.dexlib2.b.d() { // from class: org.jf.dexlib2.a.a.d.1.1
                    @Override // org.jf.dexlib2.e.i
                    public final Set<? extends org.jf.dexlib2.e.a> iK() {
                        return ao.fl();
                    }

                    @Override // org.jf.dexlib2.e.i, org.jf.dexlib2.e.a.e
                    public final String bf() {
                        return null;
                    }

                    @Override // org.jf.dexlib2.e.c.f, org.jf.dexlib2.e.c
                    public final String io() {
                        return org.jf.dexlib2.a.a.a.a.bo(AnonymousClass1.this.ub[i].getName());
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.ub.length;
            }
        };
    }

    @Override // org.jf.dexlib2.e.g
    public final int iJ() {
        return this.ua.getModifiers();
    }

    @Override // org.jf.dexlib2.e.g
    public final Set<? extends org.jf.dexlib2.e.a> iK() {
        return ao.fl();
    }

    @Override // org.jf.dexlib2.e.g
    public final h iL() {
        return null;
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String iG() {
        return org.jf.dexlib2.a.a.a.a.bo(this.ua.getDeclaringClass().getName());
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String bf() {
        return this.ua.getName();
    }

    @Override // org.jf.dexlib2.e.c.c
    public final List<String> iH() {
        return new AbstractList<String>() { // from class: org.jf.dexlib2.a.a.d.2
            private final List<? extends i> uf;

            {
                this.uf = d.this.bQ();
            }

            @Override // java.util.AbstractList, java.util.List
            public final /* synthetic */ Object get(int i) {
                return this.uf.get(i).io();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.uf.size();
            }
        };
    }

    @Override // org.jf.dexlib2.e.c.c, org.jf.dexlib2.e.g
    public final String iI() {
        return org.jf.dexlib2.a.a.a.a.bo(this.ua.getReturnType().getName());
    }
}