package com.b.a.a;

import java.util.concurrent.TimeUnit;

/* compiled from: Stopwatch.java */
/* loaded from: repireall.jar:com/b/a/a/m.class */
public final class m {
    private final q go;
    private boolean gp;
    private long gq;
    private long gr;

    public static m cY() {
        return new m();
    }

    @Deprecated
    m() {
        this(q.dc());
    }

    @Deprecated
    private m(q qVar) {
        this.go = (q) i.a(qVar, "ticker");
    }

    public final m cZ() {
        i.b(!this.gp, "This stopwatch is already running.");
        this.gp = true;
        this.gr = this.go.db();
        return this;
    }

    private long da() {
        return this.gp ? (this.go.db() - this.gr) + this.gq : this.gq;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(da(), TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long da = da();
        if (TimeUnit.DAYS.convert(da, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(da, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(da, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(da, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(da, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(da, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        TimeUnit timeUnit2 = timeUnit;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(da / TimeUnit.NANOSECONDS.convert(1L, timeUnit2));
        switch (AnonymousClass1.gs[timeUnit2.ordinal()]) {
            case CAN_THROW:
                str = "ns";
                break;
            case ODEX_ONLY:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case CAN_CONTINUE:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        objArr[1] = str;
        return String.format("%.4g %s", objArr);
    }

    /* compiled from: Stopwatch.java */
    /* renamed from: com.b.a.a.m$1  reason: invalid class name */
    /* loaded from: repireall.jar:com/b/a/a/m$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] gs = new int[TimeUnit.values().length];

        static {
            try {
                gs[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                gs[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                gs[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                gs[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                gs[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                gs[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                gs[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}