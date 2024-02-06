package org.jf.a.a;

import com.a.a.j;
import com.a.a.m;
import com.a.a.p;
import com.b.a.c.au;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jf.a.w;

/* compiled from: HelpFormatter.java */
/* loaded from: repireall.jar:org/jf/a/a/f.class */
public final class f {
    private int Gw = 80;

    public final f cg(int i) {
        this.Gw = i;
        return this;
    }

    private static e d(j jVar) {
        e eVar = (e) jVar.bU().get(0).getClass().getAnnotation(e.class);
        if (eVar == null) {
            throw new IllegalStateException("All commands should have an ExtendedParameters annotation");
        }
        return eVar;
    }

    private static int c(m mVar) {
        if (mVar.ck().cG() > 0) {
            return mVar.ck().cG();
        }
        Class<?> cr = mVar.cl().cr();
        if (cr == Boolean.TYPE || cr == Boolean.class) {
            return 0;
        }
        return 1;
    }

    public final String i(List<j> list) {
        try {
            StringWriter stringWriter = new StringWriter();
            w wVar = new w(stringWriter, this.Gw - 5, this.Gw);
            j jVar = (j) au.a(list);
            wVar.write("usage:");
            wVar.ce(2);
            for (j jVar2 : list) {
                wVar.write(" ");
                wVar.write(c.b(jVar2));
            }
            if (d(jVar).na()) {
                for (m mVar : jVar.bQ()) {
                    if (!mVar.ck().cH()) {
                        wVar.write(" [");
                        wVar.write(mVar.ck().cE().bD()[0]);
                        wVar.write("]");
                    }
                }
            } else if (!jVar.bQ().isEmpty()) {
                wVar.write(" [<options>]");
            }
            if (!jVar.bS().isEmpty()) {
                wVar.write(" [<command [<args>]]");
            }
            if (jVar.bR() != null) {
                String[] b = c.b(jVar.bR());
                if (b.length == 0) {
                    wVar.write(" <args>");
                } else {
                    String str = b[0];
                    boolean z = (str.startsWith("<") || str.startsWith("[")) ? false : true;
                    wVar.write(" ");
                    if (z) {
                        wVar.write("<");
                    }
                    wVar.write(b[0]);
                    if (z) {
                        wVar.write(">");
                    }
                }
            }
            wVar.cf(2);
            String c = c.c(jVar);
            if (c != null) {
                wVar.write("\n");
                wVar.write(c);
            }
            if (!jVar.bQ().isEmpty() || jVar.bR() != null) {
                wVar.write("\n\nOptions:");
                wVar.ce(2);
                List<m> a = com.a.a.b.e.a(jVar.bQ());
                final Pattern compile = Pattern.compile("^-*(.*)$");
                Collections.sort(a, new Comparator<m>() { // from class: org.jf.a.a.f.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(m mVar2, m mVar3) {
                        m mVar4 = mVar3;
                        Matcher matcher = compile.matcher(mVar2.ck().cK()[0]);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            Matcher matcher2 = compile.matcher(mVar4.ck().cK()[0]);
                            if (!matcher2.matches()) {
                                throw new IllegalStateException();
                            }
                            return group.compareTo(matcher2.group(1));
                        }
                        throw new IllegalStateException();
                    }
                });
                for (m mVar2 : a) {
                    if (!mVar2.ck().cH()) {
                        wVar.write("\n");
                        wVar.ce(4);
                        if (!mVar2.cj().isEmpty()) {
                            wVar.write(com.b.a.a.f.h(',').a(mVar2.ck().cK()));
                        }
                        if (c(mVar2) > 0) {
                            String[] b2 = c.b(mVar2);
                            for (int i = 0; i < c(mVar2); i++) {
                                wVar.write(" ");
                                if (i < b2.length) {
                                    wVar.write("<");
                                    wVar.write(b2[i]);
                                    wVar.write(">");
                                } else {
                                    wVar.write("<arg>");
                                }
                            }
                        }
                        if (mVar2.ch() != null && !mVar2.ch().isEmpty()) {
                            wVar.write(" - ");
                            wVar.write(mVar2.ch());
                        }
                        if (mVar2.cg() != null) {
                            String str2 = null;
                            if (mVar2.cl().cr() == Boolean.class || mVar2.cl().cr() == Boolean.TYPE) {
                                if (((Boolean) mVar2.cg()).booleanValue()) {
                                    str2 = "True";
                                }
                            } else if (!List.class.isAssignableFrom(mVar2.cl().cr()) || !((List) mVar2.cg()).isEmpty()) {
                                str2 = mVar2.cg().toString();
                            }
                            if (str2 != null) {
                                wVar.write(" (default: ");
                                wVar.write(str2);
                                wVar.write(")");
                            }
                        }
                        wVar.cf(4);
                    }
                }
                if (jVar.bR() != null) {
                    String[] b3 = c.b(jVar.bR());
                    wVar.write("\n");
                    wVar.ce(4);
                    if (b3.length > 0) {
                        wVar.write("<");
                        wVar.write(b3[0]);
                        wVar.write(">");
                    } else {
                        wVar.write("<args>");
                    }
                    if (jVar.bP() != null) {
                        wVar.write(" - ");
                        wVar.write(jVar.bP());
                    }
                    wVar.cf(4);
                }
                wVar.cf(2);
            }
            if (!jVar.bS().isEmpty()) {
                wVar.write("\n\nCommands:");
                wVar.ce(2);
                List<Map.Entry> a2 = com.a.a.b.e.a(jVar.bS().entrySet());
                Collections.sort(a2, new Comparator<Map.Entry<String, j>>() { // from class: org.jf.a.a.f.2
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Map.Entry<String, j> entry, Map.Entry<String, j> entry2) {
                        return entry.getKey().compareTo(entry2.getKey());
                    }
                });
                for (Map.Entry entry : a2) {
                    String str3 = (String) entry.getKey();
                    j jVar3 = (j) entry.getValue();
                    if (!((p) jVar3.bU().get(0).getClass().getAnnotation(p.class)).bH()) {
                        wVar.write("\n");
                        wVar.ce(4);
                        wVar.write(str3);
                        ArrayList arrayList = new ArrayList(Arrays.asList(d(jVar3).nc()));
                        if (!arrayList.isEmpty()) {
                            wVar.write("(");
                            wVar.write(com.b.a.a.f.h(',').b(arrayList));
                            wVar.write(")");
                        }
                        String ak = jVar.ak(str3);
                        if (ak != null) {
                            wVar.write(" - ");
                            wVar.write(ak);
                        }
                        wVar.cf(4);
                    }
                }
                wVar.cf(2);
            }
            String nd = d(jVar).nd();
            if (!nd.isEmpty()) {
                wVar.write("\n\n");
                wVar.write(nd);
            }
            wVar.flush();
            return stringWriter.getBuffer().toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}