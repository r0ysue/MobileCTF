package antlr;

/* compiled from: Utils.java */
/* loaded from: repireall.jar:antlr/ci.class */
public final class ci {
    private static boolean dE;
    private static boolean dF;

    static {
        dE = true;
        dF = false;
        if ("true".equalsIgnoreCase(System.getProperty("ANTLR_DO_NOT_EXIT", "false"))) {
            dE = false;
        }
        if ("true".equalsIgnoreCase(System.getProperty("ANTLR_USE_DIRECT_CLASS_LOADING", "false"))) {
            dF = true;
        }
    }

    public static Class L(String str) throws ClassNotFoundException {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (!dF && contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
            return Class.forName(str);
        } catch (Exception unused) {
            return Class.forName(str);
        }
    }

    public static Object M(String str) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return L(str).newInstance();
    }

    public static void B(String str) {
        if (dE) {
            System.exit(1);
        }
        throw new RuntimeException(new StringBuffer("ANTLR Panic: ").append(str).toString());
    }
}