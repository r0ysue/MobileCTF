package org.antlr.stringtemplate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: StringTemplateGroup.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/e.class */
public final class e {
    private String cW;
    private HashMap of;
    private HashMap og;
    private Class oh;
    private static Class oi;
    private String oj;
    private static Map ok;
    private e ol;
    private List om;
    private boolean on;
    private Class oo;
    protected boolean op;
    private Map nV;
    private d nS;
    private static AnonymousClass1 oq;
    private static c or;
    private int os;
    private long ot;
    private String ou;
    private static Class ov;

    private static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [org.antlr.stringtemplate.e$1] */
    static {
        Class cls;
        if (ov == null) {
            cls = f("org.antlr.stringtemplate.a.j");
            ov = cls;
        } else {
            cls = ov;
        }
        oi = cls;
        ok = Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        oq = new d() { // from class: org.antlr.stringtemplate.e.1
            @Override // org.antlr.stringtemplate.d
            public final void b(String str, Throwable th) {
                System.err.println(str);
                if (th != null) {
                    th.printStackTrace(System.err);
                }
            }

            @Override // org.antlr.stringtemplate.d
            public final void J(String str) {
                System.out.println(str);
            }
        };
        or = new c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.Class r3 = org.antlr.stringtemplate.e.ov
            if (r3 != 0) goto L15
            java.lang.String r3 = "org.antlr.stringtemplate.a.j"
            java.lang.Class r3 = f(r3)
            r4 = r3
            org.antlr.stringtemplate.e.ov = r4
            goto L18
        L15:
            java.lang.Class r3 = org.antlr.stringtemplate.e.ov
        L18:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.antlr.stringtemplate.e.<init>(java.lang.String, java.lang.String):void");
    }

    private e(String str, String str2, Class cls) {
        this.of = new HashMap();
        this.og = new HashMap();
        this.oh = null;
        this.oj = null;
        this.ol = null;
        this.om = null;
        this.on = false;
        this.op = false;
        this.nS = oq;
        this.os = 2147483;
        this.ot = 0L;
        this.ou = System.getProperty("file.encoding");
        this.cW = str;
        this.oj = str2;
        this.ot = System.currentTimeMillis();
        ok.put(str, this);
        this.oh = cls;
    }

    public e(String str) {
        this(str, null, null);
    }

    public final Class gS() {
        if (this.oh != null) {
            return this.oh;
        }
        return oi;
    }

    public final String gT() {
        return this.cW;
    }

    public static c gU() {
        return new c();
    }

    private c c(c cVar, String str) throws IllegalArgumentException {
        c e = e(cVar, str);
        if (e != null) {
            return e.gy();
        }
        return null;
    }

    public final c d(c cVar, String str) throws IllegalArgumentException {
        c c;
        if (str.startsWith("super.")) {
            c = cVar.gG().c(cVar, str);
        } else {
            c = c(cVar, str);
        }
        c.a(this);
        c.a(cVar);
        return c;
    }

    public final synchronized c e(c cVar, String str) throws IllegalArgumentException {
        if (str.startsWith("super.")) {
            e eVar = this.ol;
            throw new IllegalArgumentException(new StringBuffer().append(this.cW).append(" has no super group; invalid template: ").append(str).toString());
        }
        boolean z = this.on;
        if (this.os == 0 || System.currentTimeMillis() - this.ot >= ((long) (this.os * 1000))) {
            this.of.clear();
            this.ot = System.currentTimeMillis();
        }
        c cVar2 = (c) this.of.get(str);
        c cVar3 = cVar2;
        if (cVar2 == null) {
            boolean z2 = this.on;
            c aY = aY(aZ(str));
            cVar3 = aY;
            if (aY == null) {
                e eVar2 = this.ol;
            }
            if (cVar3 != null) {
                this.of.put(str, cVar3);
            } else {
                this.of.put(str, or);
                String str2 = "";
                if (cVar != null) {
                    str2 = new StringBuffer("; context is ").append(cVar.gR()).toString();
                }
                LinkedList linkedList = new LinkedList();
                e eVar3 = this;
                while (true) {
                    e eVar4 = eVar3;
                    if (eVar4 == null) {
                        break;
                    }
                    linkedList.add(0, eVar4.cW);
                    eVar3 = eVar4.ol;
                }
                throw new IllegalArgumentException(new StringBuffer("Can't find template ").append(aZ(str)).append(new StringBuffer().append(str2).append("; group hierarchy is ").append(linkedList.toString().replaceAll(",", "")).toString()).toString());
            }
        } else if (cVar3 == or) {
            return null;
        }
        return cVar3;
    }

    private c a(String str, BufferedReader bufferedReader) throws IOException {
        String property = System.getProperty("line.separator");
        StringBuffer stringBuffer = new StringBuffer(300);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            stringBuffer.append(readLine);
            stringBuffer.append(property);
        }
        String trim = stringBuffer.toString().trim();
        if (trim.length() == 0) {
            a(new StringBuffer("no text in template '").append(str).append("'").toString(), (Exception) null);
            return null;
        }
        return g(str, trim);
    }

    private c aY(String str) {
        c cVar = null;
        String str2 = str;
        int lastIndexOf = str.lastIndexOf(".st");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(0, lastIndexOf);
        }
        String str3 = str2;
        if (this.oj == null) {
            InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(str);
            InputStream inputStream = resourceAsStream;
            if (resourceAsStream == null) {
                inputStream = getClass().getClassLoader().getResourceAsStream(str);
            }
            if (inputStream == null) {
                return null;
            }
            BufferedReader bufferedReader = null;
            try {
                try {
                    bufferedReader = new BufferedReader(b(inputStream));
                    cVar = a(str3, bufferedReader);
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        a(new StringBuffer("Cannot close template file: ").append(str).toString(), e);
                    }
                } catch (IOException e2) {
                    a(new StringBuffer("Problem reading template file: ").append(str).toString(), e2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            a(new StringBuffer("Cannot close template file: ").append(str).toString(), e3);
                        }
                    }
                }
                return cVar;
            } catch (Throwable th) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        a(new StringBuffer("Cannot close template file: ").append(str).toString(), e4);
                    }
                }
                throw th;
            }
        }
        return f(str3, new StringBuffer().append(this.oj).append("/").append(str).toString());
    }

    private static String aZ(String str) {
        return new StringBuffer().append(str).append(".st").toString();
    }

    private c f(String str, String str2) {
        BufferedReader bufferedReader = null;
        c cVar = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(b(new FileInputStream(str2)));
            cVar = a(str, bufferedReader2);
            bufferedReader2.close();
            bufferedReader = null;
        } catch (IOException unused) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                    a(new StringBuffer("Cannot close template file: ").append(str2).toString(), (Exception) null);
                }
            }
        }
        return cVar;
    }

    private InputStreamReader b(InputStream inputStream) {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, this.ou);
        } catch (UnsupportedEncodingException unused) {
            a(new StringBuffer("Invalid file character encoding: ").append(this.ou).toString(), (Exception) null);
        }
        return inputStreamReader;
    }

    public final synchronized c g(String str, String str2) {
        if (str != null && str.indexOf(46) >= 0) {
            throw new IllegalArgumentException("cannot have '.' in template names");
        }
        c gU = gU();
        gU.aN(str);
        gU.a(this);
        gU.b(this);
        gU.aO(str2);
        gU.nS = this.nS;
        this.of.put(str, gU);
        return gU;
    }

    public final c a(c cVar, String str, String str2, int i) {
        c g = g(h(cVar.gE(), str), str2);
        g.D(true);
        g.Z(i);
        cVar.gA().aV(str);
        return g;
    }

    public static String h(String str, String str2) {
        return new StringBuffer("region__").append(str).append("__").append(str2).toString();
    }

    public static String ba(String str) {
        return str.substring(8, str.lastIndexOf("__"));
    }

    public final d gV() {
        return this.nS;
    }

    public final f a(StringWriter stringWriter) {
        Class cls = this.oo;
        return new b(stringWriter);
    }

    public final a f(Class cls) {
        Map map = this.nV;
        e eVar = this.ol;
        return null;
    }

    public final Map bb(String str) {
        if (this.og == null) {
            e eVar = this.ol;
            return null;
        }
        Map map = (Map) this.og.get(str);
        if (map == null) {
            e eVar2 = this.ol;
        }
        return map;
    }

    public final void bc(String str) {
        a(str, (Exception) null);
    }

    private void a(String str, Exception exc) {
        if (this.nS != null) {
            this.nS.b(str, exc);
            return;
        }
        System.err.println(new StringBuffer("StringTemplate: ").append(str).toString());
        if (exc != null) {
            exc.printStackTrace();
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<String> arrayList = new ArrayList(this.of.keySet());
        Collections.sort(arrayList);
        stringBuffer.append(new StringBuffer("group ").append(this.cW).append(";\n").toString());
        c cVar = new c("$args;separator=\",\"$");
        for (String str : arrayList) {
            c cVar2 = (c) this.of.get(str);
            if (cVar2 != or) {
                c gy = cVar.gy();
                cVar = gy;
                gy.d("args", cVar2.gN());
                stringBuffer.append(new StringBuffer().append(str).append("(").append(cVar).append(")").toString());
                stringBuffer.append(" ::= <<");
                stringBuffer.append(cVar2.gI());
                stringBuffer.append(">>\n");
            }
        }
        return stringBuffer.toString();
    }
}