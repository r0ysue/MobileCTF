package antlr.a.a;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* compiled from: VectorEnumerator.java */
/* loaded from: repireall.jar:antlr/a/a/g.class */
final class g implements Enumeration {
    private f dV;
    private int dW = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar) {
        this.dV = fVar;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        boolean z;
        synchronized (this.dV) {
            z = this.dW <= this.dV.dU;
        }
        return z;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Object obj;
        synchronized (this.dV) {
            if (this.dW <= this.dV.dU) {
                Object[] objArr = this.dV.dT;
                int i = this.dW;
                this.dW = i + 1;
                obj = objArr[i];
            } else {
                throw new NoSuchElementException("VectorEnumerator");
            }
        }
        return obj;
    }
}