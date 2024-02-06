package org.antlr.stringtemplate.a;

import antlr.bh;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ConditionalExpr.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/a/i.class */
public final class i extends org.antlr.stringtemplate.a.a {
    org.antlr.stringtemplate.c oS;
    ArrayList oT;
    org.antlr.stringtemplate.c oU;

    /* compiled from: ConditionalExpr.java */
    /* loaded from: repireall.jar:org/antlr/stringtemplate/a/i$a.class */
    protected static class a {
        org.antlr.stringtemplate.a.a oY;
        org.antlr.stringtemplate.c oZ;

        protected a() {
        }
    }

    public i(org.antlr.stringtemplate.c cVar, antlr.a.a aVar) {
        super(cVar, aVar, null);
        this.oS = null;
        this.oT = null;
        this.oU = null;
    }

    @Override // org.antlr.stringtemplate.a.a, org.antlr.stringtemplate.a.k
    public final int a(org.antlr.stringtemplate.c cVar, org.antlr.stringtemplate.f fVar) throws IOException {
        if (this.oz == null || fVar == null) {
            return 0;
        }
        b bVar = new b(cVar, this, fVar);
        int i = 0;
        try {
            boolean z = false;
            if (bVar.l(this.oz.T())) {
                i = a(cVar, fVar, this.oS);
                z = true;
            } else if (this.oT != null && this.oT.size() > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.oT.size()) {
                        break;
                    }
                    a aVar = (a) this.oT.get(i2);
                    if (!bVar.l(aVar.oY.oz)) {
                        i2++;
                    } else {
                        a(cVar, fVar, aVar.oZ);
                        z = true;
                        break;
                    }
                }
            }
            if (!z && this.oU != null) {
                org.antlr.stringtemplate.c gy = this.oU.gy();
                gy.a(cVar);
                gy.a(cVar.gF());
                gy.b(cVar.gG());
                i = gy.a(fVar);
            }
            if (!z) {
                if (this.oU == null) {
                    i = -1;
                }
            }
        } catch (bh e) {
            cVar.b(new StringBuffer("can't evaluate tree: ").append(this.oz.Z()).toString(), e);
        }
        return i;
    }

    private static int a(org.antlr.stringtemplate.c cVar, org.antlr.stringtemplate.f fVar, org.antlr.stringtemplate.c cVar2) throws IOException {
        org.antlr.stringtemplate.c gy = cVar2.gy();
        gy.a(cVar);
        gy.a(cVar.gF());
        gy.b(cVar.gG());
        return gy.a(fVar);
    }
}