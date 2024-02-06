package org.jf.baksmali;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jf.dexlib2.d.g;
import org.jf.dexlib2.d.l;
import org.jf.dexlib2.d.p;

/* compiled from: ListDependenciesCommand.java */
@org.jf.a.a.e(nb = "dependencies", nc = {"deps", "dep"})
@com.a.a.p(cB = "Lists the stored dependencies in an odex/oat file.")
/* loaded from: repireall.jar:org/jf/baksmali/k.class */
public final class k extends org.jf.a.a.b {
    @com.a.a.l(bD = {"-h", "-?", "--help"}, cd = true, bF = "Show usage information")
    private boolean rf;
    @org.jf.a.a.d(mZ = {"file"})
    @com.a.a.l(bF = "An oat/odex file")
    private List<String> rb;

    public k(List<com.a.a.j> list) {
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
            BufferedInputStream bufferedInputStream = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            } catch (FileNotFoundException unused) {
                System.err.println("Could not find file: " + str);
                System.exit(-1);
            }
            try {
                for (String str2 : org.jf.dexlib2.d.p.a(bufferedInputStream).kV()) {
                    System.out.println(str2);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (p.d unused2) {
                try {
                    for (String str3 : org.jf.dexlib2.d.l.b(org.jf.dexlib2.f.hZ(), bufferedInputStream).kR()) {
                        System.out.println(str3);
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                } catch (g.b unused3) {
                    System.err.println(str + " is not an odex or oat file.");
                    System.exit(-1);
                } catch (l.a unused4) {
                    System.err.println(str + " is not an odex or oat file.");
                    System.exit(-1);
                }
            }
        }
    }
}