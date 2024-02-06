package org.jf.smali;

import com.a.a.j;
import com.a.a.l;
import com.a.a.p;
import java.util.List;
import org.jf.a.a.d;
import org.jf.a.a.e;
import org.jf.a.a.f;
import org.jf.a.h;

/* compiled from: HelpCommand.java */
@e(nb = "help", nc = {"h"})
@p(cB = "Shows usage information")
/* loaded from: repireall.jar:org/jf/smali/b.class */
public class b extends org.jf.a.a.b {
    @d(mZ = {"commands"})
    @l(bF = "If specified, show the detailed usage information for the given commands")
    private List<String> rm;

    public b(List<j> list) {
        super(list);
    }

    @Override // org.jf.a.a.b
    public final void run() {
        this.Gv.get(this.Gv.size() - 1);
        List<String> list = this.rm;
        System.out.println(new f().cg(h.mU()).i(this.Gv));
    }

    /* compiled from: HelpCommand.java */
    @e(nb = "hlep")
    @p(bH = true)
    /* loaded from: repireall.jar:org/jf/smali/b$a.class */
    public static class a extends b {
        public a(List<j> list) {
            super(list);
        }
    }
}