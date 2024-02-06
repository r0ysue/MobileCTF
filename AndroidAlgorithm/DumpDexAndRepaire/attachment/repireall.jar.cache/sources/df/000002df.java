package org.jf.baksmali;

import java.util.List;

/* compiled from: ListClassesCommand.java */
@org.jf.a.a.e(nb = "classes", nc = {"class", "c"})
@com.a.a.p(cB = "Lists the classes in a dex file.")
/* loaded from: repireall.jar:org/jf/baksmali/i.class */
public final class i extends e {
    @com.a.a.l(bD = {"-h", "-?", "--help"}, cd = true, bF = "Show usage information")
    private boolean rf;

    public i(List<com.a.a.j> list) {
        super(list);
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
            bf(this.rb.get(0));
            for (org.jf.dexlib2.d.f fVar : this.re.kz()) {
                System.out.println(fVar.io());
            }
        }
    }
}