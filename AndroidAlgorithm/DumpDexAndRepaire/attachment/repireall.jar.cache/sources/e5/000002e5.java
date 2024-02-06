package org.jf.baksmali;

import java.util.List;

/* compiled from: ListHelpCommand.java */
@org.jf.a.a.e(nb = "help", nc = {"h"})
@com.a.a.p(cB = "Shows usage information")
/* loaded from: repireall.jar:org/jf/baksmali/o.class */
public class o extends org.jf.a.a.b {
    @org.jf.a.a.d(mZ = {"commands"})
    @com.a.a.l(bF = "If specified, show the detailed usage information for the given commands")
    private List<String> rm;

    public o(List<com.a.a.j> list) {
        super(list);
    }

    @Override // org.jf.a.a.b
    public final void run() {
        List<String> list = this.rm;
        System.out.println(new org.jf.a.a.f().cg(org.jf.a.h.mU()).i(this.Gv));
    }

    /* compiled from: ListHelpCommand.java */
    @org.jf.a.a.e(nb = "hlep")
    @com.a.a.p(bH = true)
    /* loaded from: repireall.jar:org/jf/baksmali/o$a.class */
    public static class a extends o {
        public a(List<com.a.a.j> list) {
            super(list);
        }
    }
}