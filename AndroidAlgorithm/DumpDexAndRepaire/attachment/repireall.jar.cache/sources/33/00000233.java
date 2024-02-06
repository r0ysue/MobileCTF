package com.b.a.f.a;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ExecutionList.java */
/* loaded from: repireall.jar:com/b/a/f/a/d.class */
public final class d {
    private static Logger nh = Logger.getLogger(d.class.getName());
    private a ni;
    private boolean nj;

    public final void b(Runnable runnable, Executor executor) {
        com.b.a.a.i.a(runnable, "Runnable was null.");
        com.b.a.a.i.a(executor, "Executor was null.");
        synchronized (this) {
            if (!this.nj) {
                this.ni = new a(runnable, executor, this.ni);
            } else {
                c(runnable, executor);
            }
        }
    }

    public final void gm() {
        a aVar;
        synchronized (this) {
            if (this.nj) {
                return;
            }
            this.nj = true;
            a aVar2 = this.ni;
            this.ni = null;
            a aVar3 = null;
            while (true) {
                aVar = aVar3;
                if (aVar2 == null) {
                    break;
                }
                a aVar4 = aVar2;
                aVar2 = aVar2.nm;
                aVar4.nm = aVar;
                aVar3 = aVar4;
            }
            while (aVar != null) {
                c(aVar.nk, aVar.nl);
                aVar = aVar.nm;
            }
        }
    }

    private static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = nh;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(String.valueOf(runnable));
            String valueOf2 = String.valueOf(String.valueOf(executor));
            logger.log(level, new StringBuilder(57 + valueOf.length() + valueOf2.length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), (Throwable) e);
        }
    }

    /* compiled from: ExecutionList.java */
    /* loaded from: repireall.jar:com/b/a/f/a/d$a.class */
    private static final class a {
        final Runnable nk;
        final Executor nl;
        a nm;

        a(Runnable runnable, Executor executor, a aVar) {
            this.nk = runnable;
            this.nl = executor;
            this.nm = aVar;
        }
    }
}