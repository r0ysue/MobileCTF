package org.jf.smali;

import com.a.a.c.c;
import com.a.a.j;
import com.a.a.l;
import com.a.a.p;
import java.util.List;
import org.jf.a.a.d;
import org.jf.a.a.e;

/* compiled from: AssembleCommand.java */
@e(nb = "assemble", nc = {"ass", "as", "a"})
@p(cB = "Assembles smali files into a dex file.")
/* loaded from: repireall.jar:org/jf/smali/a.class */
public final class a extends org.jf.a.a.b {
    @l(bD = {"-h", "-?", "--help"}, cd = true, bF = "Show usage information for this command.")
    private boolean rf;
    @d(mZ = {"n"})
    @l(bD = {"-j", "--jobs"}, bF = "The number of threads to use. Defaults to the number of cores available.", bI = c.class)
    private int ri;
    @d(mZ = {"api"})
    @l(bD = {"-a", "--api"}, bF = "The numeric api level to use while assembling.")
    private int qI;
    @d(mZ = {"file"})
    @l(bD = {"-o", "--output"}, bF = "The name/path of the dex file to write.")
    private String Fj;
    @l(bD = {"--verbose"}, bF = "Generate verbose error messages.")
    private boolean Fk;
    @d(mZ = {"[<file>|<dir>]+"})
    @l(bF = "Assembles the given files. If a directory is specified, it will be recursively searched for any files with a .smali prefix")
    private List<String> Fl;

    public a(List<j> list) {
        super(list);
        this.ri = Runtime.getRuntime().availableProcessors();
        this.qI = 15;
        this.Fj = "out.dex";
        this.Fk = false;
    }

    @Override // org.jf.a.a.b
    public final void run() {
        boolean z = this.rf;
        List<String> list = this.Fl;
        mX();
    }
}