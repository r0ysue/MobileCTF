package antlr.build;

import antlr.ci;

/* loaded from: repireall.jar:antlr/build/Tool.class */
public class Tool {
    private String dI;
    private static Class dJ;

    public Tool() {
        this.dI = null;
        this.dI = System.getProperty("os.name");
    }

    public static void main(String[] strArr) {
        Class<?> cls;
        if (strArr.length != 1) {
            System.err.println("usage: java antlr.build.Tool action");
            return;
        }
        String str = strArr[0];
        Tool tool = new Tool();
        if (str == null) {
            System.err.println(new StringBuffer("antlr.build.Tool: ").append("missing app or action").toString());
            return;
        }
        Class cls2 = null;
        Object obj = null;
        try {
            obj = ci.M("antlr.build.a");
        } catch (Exception e) {
            try {
                if (!"antlr.build.a".startsWith("antlr.build.")) {
                    cls2 = ci.L(new StringBuffer("antlr.build.").append("antlr.build.a").toString());
                }
                a(new StringBuffer("no such application ").append("antlr.build.a").toString(), e);
            } catch (Exception e2) {
                a(new StringBuffer("no such application ").append("antlr.build.a").toString(), e2);
            }
        }
        if (cls2 == null || obj == null) {
            return;
        }
        try {
            Class cls3 = cls2;
            Class<?>[] clsArr = new Class[1];
            if (dJ == null) {
                cls = f("antlr.build.Tool");
                dJ = cls;
            } else {
                cls = dJ;
            }
            clsArr[0] = cls;
            cls3.getMethod(str, clsArr).invoke(obj, tool);
        } catch (Exception e3) {
            a(new StringBuffer("no such action for application ").append("antlr.build.a").toString(), e3);
        }
    }

    private static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static void a(String str, Exception exc) {
        System.err.println(new StringBuffer("antlr.build.Tool: ").append(str).toString());
        exc.printStackTrace(System.err);
    }
}