package org.jf.baksmali.a.b;

import java.io.IOException;
import org.jf.a.m;
import org.jf.baksmali.b.f;
import org.jf.baksmali.b.h;
import org.jf.dexlib2.e.d.d;
import org.jf.dexlib2.e.d.e;
import org.jf.dexlib2.e.d.g;
import org.jf.dexlib2.e.d.i;
import org.jf.dexlib2.e.d.j;
import org.jf.dexlib2.e.d.k;
import org.jf.dexlib2.e.d.l;
import org.jf.dexlib2.e.d.o;
import org.jf.dexlib2.e.d.p;
import org.jf.dexlib2.e.d.q;

/* compiled from: EncodedValueAdaptor.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/b/c.class */
public abstract class c {
    public static void a(m mVar, g gVar, String str) throws IOException {
        switch (gVar.jc()) {
            case 0:
                org.jf.baksmali.b.b.a(mVar, ((d) gVar).lR());
                return;
            case CAN_THROW:
            case 5:
            case 7:
            case SETS_RESULT:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                return;
            case ODEX_ONLY:
                h.a(mVar, ((o) gVar).lV());
                return;
            case 3:
                org.jf.baksmali.b.c.a(mVar, ((e) gVar).lS());
                return;
            case CAN_CONTINUE:
                f.e(mVar, ((k) gVar).getValue());
                return;
            case 6:
                org.jf.baksmali.b.g.b(mVar, ((l) gVar).ln());
                return;
            case SETS_REGISTER:
                org.jf.baksmali.b.e.a(mVar, ((j) gVar).lU());
                return;
            case 17:
                org.jf.baksmali.b.d.a(mVar, ((org.jf.dexlib2.e.d.f) gVar).lT());
                return;
            case 23:
                org.jf.baksmali.a.o.a(mVar, ((p) gVar).lP());
                return;
            case 24:
                mVar.write(((q) gVar).lP());
                return;
            case 25:
                i iVar = (i) gVar;
                boolean z = false;
                if (iVar.lN().iG().equals(str)) {
                    z = true;
                }
                org.jf.dexlib2.h.g.a(mVar, iVar.lN(), z);
                return;
            case 26:
                org.jf.dexlib2.e.d.m mVar2 = (org.jf.dexlib2.e.d.m) gVar;
                boolean z2 = false;
                if (mVar2.lO().iG().equals(str)) {
                    z2 = true;
                }
                org.jf.dexlib2.h.g.a(mVar, mVar2.lO(), z2);
                return;
            case 27:
                org.jf.dexlib2.e.d.h hVar = (org.jf.dexlib2.e.d.h) gVar;
                boolean z3 = false;
                if (hVar.lN().iG().equals(str)) {
                    z3 = true;
                }
                mVar.write(".enum ");
                org.jf.dexlib2.h.g.a(mVar, hVar.lN(), z3);
                return;
            case 28:
                b.a(mVar, (org.jf.dexlib2.e.d.b) gVar, str);
                return;
            case 29:
                a.a(mVar, (org.jf.dexlib2.e.d.a) gVar, str);
                return;
            case 30:
                mVar.write("null");
                return;
            case 31:
                org.jf.baksmali.b.a.a(mVar, ((org.jf.dexlib2.e.d.c) gVar).lQ());
                return;
        }
    }
}