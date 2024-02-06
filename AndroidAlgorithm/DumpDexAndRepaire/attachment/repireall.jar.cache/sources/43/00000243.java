package com.b.a.f.a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: Uninterruptibles.java */
/* loaded from: repireall.jar:com/b/a/f/a/j.class */
public final class j {
    public static <V> V a(Future<V> future) throws ExecutionException {
        boolean z;
        V v;
        boolean z2 = false;
        while (true) {
            try {
                z = z2;
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}