package org.jf.a;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: ExceptionWithContext.java */
/* loaded from: repireall.jar:org/jf/a/i.class */
public class i extends RuntimeException {
    private StringBuffer FG;

    public static i a(Exception exc, String str, Object... objArr) {
        i iVar;
        if (exc instanceof i) {
            iVar = (i) exc;
        } else {
            iVar = new i(exc);
        }
        iVar.bE(String.format(str, objArr));
        return iVar;
    }

    public i(String str, Object... objArr) {
        this(null, str, objArr);
    }

    private i(Throwable th) {
        this(th, null, new Object[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(java.lang.Throwable r7, java.lang.String r8, java.lang.Object... r9) {
        /*
            r6 = this;
            r0 = r6
            r1 = r8
            if (r1 == 0) goto L19
            r1 = r8
            r2 = r9
            r9 = r2
            r2 = r1
            r8 = r2
            if (r1 != 0) goto L11
            r1 = 0
            goto L25
        L11:
            r1 = r8
            r2 = r9
            java.lang.String r1 = java.lang.String.format(r1, r2)
            goto L25
        L19:
            r1 = r7
            if (r1 == 0) goto L24
            r1 = r7
            java.lang.String r1 = r1.getMessage()
            goto L25
        L24:
            r1 = 0
        L25:
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r7
            boolean r0 = r0 instanceof org.jf.a.i
            if (r0 == 0) goto L58
            r0 = r7
            org.jf.a.i r0 = (org.jf.a.i) r0
            java.lang.StringBuffer r0 = r0.FG
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r6
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = r1
            r3 = r7
            int r3 = r3.length()
            r4 = 200(0xc8, float:2.8E-43)
            int r3 = r3 + r4
            r2.<init>(r3)
            r0.FG = r1
            r0 = r6
            java.lang.StringBuffer r0 = r0.FG
            r1 = r7
            java.lang.StringBuffer r0 = r0.append(r1)
            return
        L58:
            r0 = r6
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = r1
            r3 = 200(0xc8, float:2.8E-43)
            r2.<init>(r3)
            r0.FG = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jf.a.i.<init>(java.lang.Throwable, java.lang.String, java.lang.Object[]):void");
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.FG);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.FG);
    }

    public final void bE(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        this.FG.append(str);
        if (!str.endsWith("\n")) {
            this.FG.append('\n');
        }
    }
}