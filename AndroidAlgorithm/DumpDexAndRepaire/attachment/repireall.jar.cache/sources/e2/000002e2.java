package org.jf.baksmali;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ListDexCommand.java */
@org.jf.a.a.e(nb = "dex", nc = {"d"})
@com.a.a.p(cB = "Lists the dex files in an apk/oat file.")
/* loaded from: repireall.jar:org/jf/baksmali/l.class */
public final class l extends org.jf.a.a.b {
    @com.a.a.l(bD = {"-h", "-?", "--help"}, cd = true, bF = "Show usage information")
    private boolean rf;
    @org.jf.a.a.d(mZ = {"file"})
    @com.a.a.l(bF = "An apk or oat file.")
    private List<String> rb;

    public l(List<com.a.a.j> list) {
        super(list);
        this.rb = new ArrayList();
    }

    @Override // org.jf.a.a.b
    public final void run() {
        boolean z = this.rf;
        if (this.rb == null || this.rb.isEmpty()) {
            mX();
        } else if (this.rb.size() > 1) {
            System.err.println("Too many files specified");
            mX();
        } else {
            String str = this.rb.get(0);
            File file = new File(str);
            if (!file.exists()) {
                System.err.println(String.format("Could not find the file: %s", str));
                System.exit(-1);
            }
            try {
                for (String str2 : org.jf.dexlib2.c.b(file, org.jf.dexlib2.f.hZ()).hY()) {
                    System.out.println(str2);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}