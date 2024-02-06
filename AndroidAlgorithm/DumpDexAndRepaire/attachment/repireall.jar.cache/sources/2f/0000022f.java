package com.b.a.f.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* compiled from: AbstractFuture.java */
/* loaded from: repireall.jar:com/b/a/f/a/a.class */
public abstract class a<V> implements f<V> {
    private final C0009a<V> ne = new C0009a<>();
    private final d nf = new d();

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return this.ne.h(timeUnit.toNanos(j));
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.ne.gi();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.ne.gj();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.ne.gk();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!this.ne.B(z)) {
            return false;
        }
        this.nf.gm();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean gh() {
        return this.ne.gl();
    }

    @Override // com.b.a.f.a.f
    public final void a(Runnable runnable, Executor executor) {
        this.nf.b(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(V v) {
        boolean B = this.ne.B((C0009a<V>) v);
        if (B) {
            this.nf.gm();
        }
        return B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(Throwable th) {
        boolean b = this.ne.b((Throwable) com.b.a.a.i.i(th));
        if (b) {
            this.nf.gm();
        }
        return b;
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.b.a.f.a.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:com/b/a/f/a/a$a.class */
    static final class C0009a<V> extends AbstractQueuedSynchronizer {
        private V gb;
        private Throwable ng;

        C0009a() {
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected final int tryAcquireShared(int i) {
            if (gj()) {
                return 1;
            }
            return -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected final boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        final V h(long j) throws TimeoutException, CancellationException, ExecutionException, InterruptedException {
            if (!tryAcquireSharedNanos(-1, j)) {
                throw new TimeoutException("Timeout waiting for task.");
            }
            return getValue();
        }

        final V gi() throws CancellationException, ExecutionException, InterruptedException {
            acquireSharedInterruptibly(-1);
            return getValue();
        }

        private V getValue() throws CancellationException, ExecutionException {
            int state = getState();
            switch (state) {
                case ODEX_ONLY:
                    if (this.ng != null) {
                        throw new ExecutionException(this.ng);
                    }
                    return this.gb;
                case CAN_CONTINUE:
                case SETS_RESULT:
                    throw a.a("Task was cancelled.", this.ng);
                default:
                    throw new IllegalStateException(new StringBuilder(49).append("Error, synchronizer in invalid state: ").append(state).toString());
            }
        }

        final boolean gj() {
            return (getState() & 14) != 0;
        }

        final boolean gk() {
            return (getState() & 12) != 0;
        }

        final boolean gl() {
            return getState() == 8;
        }

        final boolean B(V v) {
            return a(v, null, 2);
        }

        final boolean b(Throwable th) {
            return a(null, th, 2);
        }

        final boolean B(boolean z) {
            return a(null, null, z ? 8 : 4);
        }

        private boolean a(V v, Throwable th, int i) {
            boolean compareAndSetState = compareAndSetState(0, 1);
            if (compareAndSetState) {
                this.gb = v;
                this.ng = (i & 12) != 0 ? new CancellationException("Future.cancel() was called.") : th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return compareAndSetState;
        }
    }

    static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}