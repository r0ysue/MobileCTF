package antlr.build;

/* compiled from: ANTLR.java */
/* loaded from: repireall.jar:antlr/build/a.class */
public class a {
    private static String dG = "javac";
    private static String dH = ".";

    static {
        String[] strArr = {"antlr", "antlr/actions/cpp", "antlr/actions/java", "antlr/actions/csharp", "antlr/collections", "antlr/collections/impl", "antlr/debug", "antlr/ASdebug", "antlr/debug/misc", "antlr/preprocessor"};
    }

    public a() {
        dG = System.getProperty("antlr.build.compiler", dG);
        dH = System.getProperty("antlr.build.root", dH);
    }
}