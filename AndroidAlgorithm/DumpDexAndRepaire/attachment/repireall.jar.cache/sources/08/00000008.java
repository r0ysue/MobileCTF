package antlr.a.a;

import antlr.bk;
import java.util.Enumeration;

/* compiled from: Vector.java */
/* loaded from: repireall.jar:antlr/a/a/f.class */
public final class f implements Cloneable {
    protected Object[] dT;
    protected int dU;

    public f() {
        this(10);
    }

    public f(int i) {
        this.dU = -1;
        this.dT = new Object[i];
    }

    public final synchronized void a(Object obj) {
        H(this.dU + 2);
        Object[] objArr = this.dT;
        int i = this.dU + 1;
        this.dU = i;
        objArr[i] = obj;
    }

    public final Object clone() {
        try {
            f fVar = (f) super.clone();
            fVar.dT = new Object[this.dU + 1];
            System.arraycopy(this.dT, 0, fVar.dT, 0, this.dU + 1);
            return fVar;
        } catch (CloneNotSupportedException unused) {
            System.err.println("cannot clone Vector.super");
            return null;
        }
    }

    public final synchronized Object G(int i) {
        if (i >= this.dT.length) {
            throw new ArrayIndexOutOfBoundsException(new StringBuffer().append(i).append(" >= ").append(this.dT.length).toString());
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuffer().append(i).append(" < 0 ").toString());
        }
        return this.dT[i];
    }

    public final synchronized Enumeration bb() {
        return new g(this);
    }

    public final synchronized void H(int i) {
        if (i + 1 > this.dT.length) {
            Object[] objArr = this.dT;
            int length = this.dT.length << 1;
            if (i + 1 > length) {
                length = i + 1;
            }
            this.dT = new Object[length];
            System.arraycopy(objArr, 0, this.dT, 0, objArr.length);
        }
    }

    public final synchronized boolean a(bk bkVar) {
        int i = 0;
        while (i <= this.dU && this.dT[i] != bkVar) {
            i++;
        }
        if (i <= this.dU) {
            this.dT[i] = null;
            int i2 = this.dU - i;
            if (i2 > 0) {
                System.arraycopy(this.dT, i + 1, this.dT, i, i2);
            }
            this.dU--;
            return true;
        }
        return false;
    }

    public final synchronized void c(String str, int i) {
        if (i >= this.dT.length) {
            throw new ArrayIndexOutOfBoundsException(new StringBuffer().append(i).append(" >= ").append(this.dT.length).toString());
        }
        this.dT[i] = str;
        if (i > this.dU) {
            this.dU = i;
        }
    }

    public final int bc() {
        return this.dU + 1;
    }
}