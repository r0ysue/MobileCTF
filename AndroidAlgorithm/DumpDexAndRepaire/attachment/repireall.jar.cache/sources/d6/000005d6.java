package org.jf.smali;

import com.a.a.j;
import com.a.a.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.jf.a.a.c;
import org.jf.a.a.e;
import org.jf.smali.b;

@e(na = true, nb = "smali", nd = "See smali help <command> for more information about a specific command")
/* loaded from: repireall.jar:org/jf/smali/Main.class */
public class Main extends org.jf.a.a.b {
    private static String rp = hW();
    @l(bD = {"-h", "-?", "--help"}, cd = true, bF = "Show usage information")
    private boolean rf;
    @l(bD = {"-v", "--version"}, cd = true, bF = "Print the version of baksmali and then exit")
    private boolean rq;
    private j rr;

    @Override // org.jf.a.a.b
    public final void run() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.jf.a.a.b
    public final j hV() {
        return this.rr;
    }

    public Main() {
        super(new ArrayList());
    }

    public static void main(String[] strArr) {
        Main main = new Main();
        j jVar = new j(main);
        main.rr = jVar;
        jVar.aj("smali");
        List<j> mY = main.mY();
        c.a(jVar, new a(mY));
        c.a(jVar, new b(mY));
        c.a(jVar, new b.a(mY));
        jVar.d(strArr);
        boolean z = main.rq;
        if (jVar.bT() == null) {
            main.mX();
            return;
        }
        boolean z2 = main.rf;
        ((org.jf.a.a.b) jVar.bS().get(jVar.bT()).bU().get(0)).run();
    }

    private static String hW() {
        InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream("smali.properties");
        String str = "[unknown version]";
        if (resourceAsStream != null) {
            Properties properties = new Properties();
            try {
                properties.load(resourceAsStream);
                str = properties.getProperty("application.version");
            } catch (IOException unused) {
            }
        }
        return str;
    }
}