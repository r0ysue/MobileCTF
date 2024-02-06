package com.b.a.b;

import java.util.Arrays;

/* compiled from: CacheStats.java */
/* loaded from: repireall.jar:com/b/a/b/e.class */
public final class e {
    private final long gV;
    private final long gW;
    private final long gX;
    private final long gY;
    private final long gZ;
    private final long ha;

    public e(long j, long j2, long j3, long j4, long j5, long j6) {
        com.b.a.a.i.z(0 >= 0);
        com.b.a.a.i.z(0 >= 0);
        com.b.a.a.i.z(0 >= 0);
        com.b.a.a.i.z(0 >= 0);
        com.b.a.a.i.z(0 >= 0);
        com.b.a.a.i.z(0 >= 0);
        this.gV = 0L;
        this.gW = 0L;
        this.gX = 0L;
        this.gY = 0L;
        this.gZ = 0L;
        this.ha = 0L;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.gV), Long.valueOf(this.gW), Long.valueOf(this.gX), Long.valueOf(this.gY), Long.valueOf(this.gZ), Long.valueOf(this.ha)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.gV == eVar.gV && this.gW == eVar.gW && this.gX == eVar.gX && this.gY == eVar.gY && this.gZ == eVar.gZ && this.ha == eVar.ha;
        }
        return false;
    }

    public final String toString() {
        return com.b.a.a.g.h(this).a("hitCount", this.gV).a("missCount", this.gW).a("loadSuccessCount", this.gX).a("loadExceptionCount", this.gY).a("totalLoadTime", this.gZ).a("evictionCount", this.ha).toString();
    }
}