package org.jf.a;

import java.io.IOException;
import java.io.Writer;

/* compiled from: TwoColumnOutput.java */
/* loaded from: repireall.jar:org/jf/a/u.class */
public final class u {
    private final Writer Gk;
    private final int Gl;
    private final int Gm;
    private final String Gn;
    private String[] Go = null;
    private String[] Gp = null;

    public u(Writer writer, int i, int i2, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        this.Gk = writer;
        this.Gl = i;
        this.Gm = i2;
        this.Gn = str;
    }

    public final void l(String str, String str2) throws IOException {
        this.Go = t.a(str, this.Gl, this.Go);
        this.Gp = t.a(str2, this.Gm, this.Gp);
        int length = this.Go.length;
        int length2 = this.Gp.length;
        int i = 0;
        while (true) {
            if (i < length || i < length2) {
                String str3 = null;
                String str4 = null;
                if (i < length) {
                    String str5 = this.Go[i];
                    str3 = str5;
                    if (str5 == null) {
                        length = i;
                    }
                }
                if (i < length2) {
                    String str6 = this.Gp[i];
                    str4 = str6;
                    if (str6 == null) {
                        length2 = i;
                    }
                }
                if (str3 != null || str4 != null) {
                    int i2 = 0;
                    if (str3 != null) {
                        this.Gk.write(str3);
                        i2 = str3.length();
                    }
                    int i3 = this.Gl - i2;
                    if (i3 > 0) {
                        Writer writer = this.Gk;
                        for (int i4 = i3; i4 > 0; i4--) {
                            writer.write(32);
                        }
                    }
                    this.Gk.write(this.Gn);
                    if (str4 != null) {
                        this.Gk.write(str4);
                    }
                    this.Gk.write(10);
                }
                i++;
            } else {
                return;
            }
        }
    }
}