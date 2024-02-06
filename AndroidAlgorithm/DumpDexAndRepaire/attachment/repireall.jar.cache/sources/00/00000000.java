package antlr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;

/* loaded from: repireall.jar:antlr/Tool.class */
public class Tool {

    /* renamed from: do */
    private String f0do;
    private boolean dj = false;
    private boolean dk = false;
    private boolean dl = false;
    private boolean dm = false;
    private String dn = ".";
    private transient Reader dp = new InputStreamReader(System.in);
    protected String dq = "LITERAL_";
    protected boolean dr = false;
    private az ds = null;
    protected String dt = null;
    protected String du = null;
    protected boolean dv = true;
    protected boolean dw = false;
    private antlr.a.a.b dx = new antlr.a.a.b();
    private ae di = new ae(this);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JavaClassParseException: Unknown opcode: 0xa8 in method: antlr.Tool.a(java.lang.String, java.lang.String):void, file: repireall.jar:antlr/Tool.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:158)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:409)
        	at jadx.core.ProcessClass.process(ProcessClass.java:67)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:383)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:307)
        Caused by: jadx.plugins.input.java.utils.JavaClassParseException: Unknown opcode: 0xa8
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:71)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:48)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:148)
        	... 5 more
        */
    public final void a(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
        /*
        // Can't load method instructions: Load method exception: JavaClassParseException: Unknown opcode: 0xa8 in method: antlr.Tool.a(java.lang.String, java.lang.String):void, file: repireall.jar:antlr/Tool.class
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.Tool.a(java.lang.String, java.lang.String):void");
    }

    private int b(String[] strArr) {
        antlr.preprocessor.Tool tool = new antlr.preprocessor.Tool(this, strArr);
        boolean bB = tool.bB();
        String[] bC = tool.bC();
        int i = 0;
        while (i < bC.length) {
            if (bC[i].equals("-diagnostic")) {
                this.dk = true;
                this.dm = false;
                A(i);
            } else if (bC[i].equals("-o")) {
                A(i);
                if (i + 1 >= bC.length) {
                    B("missing output directory with -o option; ignoring");
                } else {
                    i++;
                    this.dn = bC[i];
                    A(i);
                }
            } else if (bC[i].equals("-html")) {
                this.dm = true;
                this.dk = false;
                A(i);
            } else if (bC[i].equals("-docbook")) {
                this.dl = true;
                this.dk = false;
                A(i);
            } else if (bC[i].charAt(0) != '-') {
                this.f0do = bC[i];
                A(i);
            }
            i++;
        }
        if (bB) {
            this.dp = aV();
            bt btVar = new bt(new d(this.dp));
            aw awVar = new aw(this, strArr, new ar(this));
            try {
                e eVar = new e(btVar, awVar, this);
                eVar.u(this.f0do);
                eVar.v();
                if (this.dj) {
                    E("Exiting due to errors.");
                }
                antlr.a.a.b bVar = this.dx;
                for (int i2 = 0; i2 < bC.length; i2++) {
                    if (!bVar.D(i2)) {
                        J(new StringBuffer("invalid command-line argument: ").append(bC[i2]).append("; ignored").toString());
                    }
                }
                String stringBuffer = new StringBuffer("antlr.").append(this.dk ? "Diagnostic" : this.dm ? "HTML" : this.dl ? "DocBook" : awVar.ba).append("CodeGenerator").toString();
                try {
                    aa aaVar = (aa) ci.M(stringBuffer);
                    return 0;
                } catch (ClassNotFoundException unused) {
                    F(new StringBuffer("Cannot instantiate code-generator: ").append(stringBuffer).toString());
                    return 0;
                } catch (IllegalAccessException unused2) {
                    F(new StringBuffer("code-generator class '").append(stringBuffer).append("' is not accessible").toString());
                    return 0;
                } catch (IllegalArgumentException unused3) {
                    F(new StringBuffer("Cannot instantiate code-generator: ").append(stringBuffer).toString());
                    return 0;
                } catch (InstantiationException unused4) {
                    F(new StringBuffer("Cannot instantiate code-generator: ").append(stringBuffer).toString());
                    return 0;
                }
            } catch (bh e) {
                E(new StringBuffer("Unhandled parser error: ").append(e.getMessage()).toString());
                return 0;
            } catch (bz e2) {
                E(new StringBuffer("TokenStreamException: ").append(e2.getMessage()).toString());
                return 0;
            }
        }
        return 1;
    }

    public final void B(String str) {
        this.dj = true;
        System.err.println(new StringBuffer("error: ").append(str).toString());
    }

    public final void a(String str, String str2, int i, int i2) {
        this.dj = true;
        System.err.println(new StringBuffer().append(aj.as().a(str2, i, i2)).append(str).toString());
    }

    public static String C(String str) {
        int lastIndexOf = str.lastIndexOf(System.getProperty("file.separator"));
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public final String aU() {
        return this.dn;
    }

    public static void main(String[] strArr) {
        System.err.println("ANTLR Parser Generator   Version 2.7.7 (20060906)   1989-2005");
        try {
            boolean z = false;
            if (strArr.length == 0) {
                z = true;
            } else {
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i].equals("-h") || strArr[i].equals("-help") || strArr[i].equals("--help")) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                new Tool().b(strArr);
                return;
            }
            System.err.println("usage: java antlr.Tool [args] file.g");
            System.err.println("  -o outputDir       specify output directory where all output generated.");
            System.err.println("  -glib superGrammar specify location of supergrammar file.");
            System.err.println("  -debug             launch the ParseView debugger upon parser invocation.");
            System.err.println("  -html              generate a html file from your grammar.");
            System.err.println("  -docbook           generate a docbook sgml file from your grammar.");
            System.err.println("  -diagnostic        generate a textfile with diagnostics.");
            System.err.println("  -trace             have all rules call traceIn/traceOut.");
            System.err.println("  -traceLexer        have lexer rules call traceIn/traceOut.");
            System.err.println("  -traceParser       have parser rules call traceIn/traceOut.");
            System.err.println("  -traceTreeParser   have tree parser rules call traceIn/traceOut.");
            System.err.println("  -h|-help|--help    this message");
        } catch (Exception e) {
            System.err.println(new StringBuffer().append(System.getProperty("line.separator")).append(System.getProperty("line.separator")).toString());
            System.err.println(new StringBuffer("#$%%*&@# internal error: ").append(e.toString()).toString());
            System.err.println("[complain to nearest government official");
            System.err.println(" or send hate-mail to parrt@antlr.org;");
            System.err.println(new StringBuffer(" please send stack trace with report.]").append(System.getProperty("line.separator")).toString());
            e.printStackTrace();
        }
    }

    public final PrintWriter D(String str) throws IOException {
        if (this.dn != ".") {
            File file = new File(this.dn);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return new PrintWriter(new bg(new StringBuffer().append(this.dn).append(System.getProperty("file.separator")).append(str).toString()));
    }

    private Reader aV() {
        BufferedReader bufferedReader = null;
        try {
            if (this.f0do != null) {
                bufferedReader = new BufferedReader(new FileReader(this.f0do));
            }
        } catch (IOException unused) {
            E(new StringBuffer("cannot open grammar file ").append(this.f0do).toString());
        }
        return bufferedReader;
    }

    private static void E(String str) {
        System.err.println(str);
        ci.B(str);
    }

    public final void F(String str) {
        E(new StringBuffer("panic: ").append(str).toString());
    }

    public static antlr.a.a.f a(String str, char c) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        antlr.a.a.f fVar = new antlr.a.a.f(10);
        while (stringTokenizer.hasMoreTokens()) {
            fVar.a(stringTokenizer.nextToken());
        }
        if (fVar.bc() == 0) {
            return null;
        }
        return fVar;
    }

    public static String G(String str) {
        int lastIndexOf = str.lastIndexOf(System.getProperty("file.separator"));
        if (lastIndexOf == -1) {
            return new StringBuffer(".").append(System.getProperty("file.separator")).toString();
        }
        return str.substring(0, lastIndexOf + 1);
    }

    public final void A(int i) {
        this.dx.B(i);
    }

    public final void H(String str) {
        this.dn = str;
    }

    public static void I(String str) {
        System.err.println(new StringBuffer("error: ").append(str).toString());
    }

    public static void J(String str) {
        System.err.println(new StringBuffer("warning: ").append(str).toString());
    }

    public static void b(String str, String str2, int i, int i2) {
        System.err.println(new StringBuffer().append(aj.as().a(str2, i, i2)).append("warning:").append(str).toString());
    }

    public final void K(String str) {
        if (this.ds == null) {
            this.ds = new az(bq.a(str, "\"", "\""));
        }
    }
}