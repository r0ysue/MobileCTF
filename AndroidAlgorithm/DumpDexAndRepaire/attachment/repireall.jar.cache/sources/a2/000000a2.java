package com.a.a;

import java.lang.reflect.InvocationTargetException;

/* compiled from: WrappedParameter.java */
/* loaded from: repireall.jar:com/a/a/u.class */
public final class u {
    private l fw;
    private a fx;

    public u(l lVar) {
        this.fw = lVar;
    }

    public u(a aVar) {
        this.fx = aVar;
    }

    public final l cE() {
        return this.fw;
    }

    public final a cF() {
        return this.fx;
    }

    public final int cG() {
        if (this.fw != null) {
            return this.fw.bW();
        }
        return 1;
    }

    public final boolean cH() {
        return this.fw != null ? this.fw.bH() : this.fx.bH();
    }

    public final boolean cI() {
        return this.fw != null ? this.fw.bE() : this.fx.bE();
    }

    public final boolean cJ() {
        if (this.fw != null) {
            return this.fw.bX();
        }
        return false;
    }

    public final String[] cK() {
        return this.fw != null ? this.fw.bD() : this.fx.bD();
    }

    public final boolean cL() {
        if (this.fw != null) {
            return this.fw.ca();
        }
        return false;
    }

    public final Class<? extends d> cM() {
        return this.fw != null ? this.fw.bI() : this.fx.bI();
    }

    public final Class<? extends h> cN() {
        return this.fw != null ? this.fw.bK() : this.fx.bK();
    }

    public final boolean cO() {
        if (this.fw != null) {
            return this.fw.cc();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.SecurityException] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.NoSuchMethodException] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.IllegalAccessException] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.reflect.InvocationTargetException] */
    public final void a(o oVar, Object obj, Object obj2) {
        if (this.fw != null) {
            oVar.a(obj, obj2);
            return;
        }
        String bJ = this.fx.bJ();
        String obj3 = obj2.toString();
        int indexOf = obj3.indexOf(bJ);
        if (indexOf == -1) {
            throw new n("Dynamic parameter expected a value of the form a" + bJ + "b but got:" + obj3);
        }
        ?? r0 = this;
        try {
            r0 = oVar.cr().getMethod("put", Object.class, Object.class).invoke(oVar.get(obj), obj3.substring(0, indexOf), obj3.substring(indexOf + 1));
        } catch (IllegalAccessException e) {
            r0.printStackTrace();
        } catch (NoSuchMethodException e2) {
            r0.printStackTrace();
        } catch (SecurityException e3) {
            r0.printStackTrace();
        } catch (InvocationTargetException e4) {
            r0.printStackTrace();
        }
    }

    public final boolean cP() {
        return this.fw != null && this.fw.cd();
    }

    public final boolean cQ() {
        return this.fw != null && this.fw.ce();
    }
}