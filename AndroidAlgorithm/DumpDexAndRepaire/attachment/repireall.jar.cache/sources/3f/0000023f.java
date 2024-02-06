package com.b.a.f.a;

import java.util.concurrent.Executor;

/* compiled from: MoreExecutors.java */
/* loaded from: repireall.jar:com/b/a/f/a/g.class */
public final class g {
    public static Executor gn() {
        return a.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MoreExecutors.java */
    /* loaded from: repireall.jar:com/b/a/f/a/g$a.class */
    public enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}