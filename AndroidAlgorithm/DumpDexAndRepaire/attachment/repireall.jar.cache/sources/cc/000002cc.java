package org.jf.baksmali.a;

import java.io.IOException;
import java.io.Writer;
import org.jf.dexlib2.h.i;

/* compiled from: SyntheticAccessCommentMethodItem.java */
/* loaded from: repireall.jar:org/jf/baksmali/a/q.class */
public final class q extends l {
    private final i.a qA;

    public q(i.a aVar, int i) {
        super(i);
        this.qA = aVar;
    }

    @Override // org.jf.baksmali.a.l
    public final double hI() {
        return 99.8d;
    }

    @Override // org.jf.baksmali.a.l
    public final boolean a(org.jf.a.m mVar) throws IOException {
        boolean z;
        mVar.write("# ");
        switch (this.qA.De) {
            case 0:
                mVar.write("invokes: ");
                break;
            case CAN_THROW:
                mVar.write("getter for: ");
                break;
            case ODEX_ONLY:
                mVar.write("setter for: ");
                break;
            case 3:
                mVar.write("operator++ for: ");
                break;
            case CAN_CONTINUE:
                mVar.write("++operator for: ");
                break;
            case 5:
                mVar.write("operator-- for: ");
                break;
            case 6:
                mVar.write("--operator for: ");
                break;
            case 7:
                mVar.write("+= operator for: ");
                break;
            case SETS_RESULT:
                mVar.write("-= operator for: ");
                break;
            case 9:
                mVar.write("*= operator for: ");
                break;
            case 10:
                mVar.write("/= operator for: ");
                break;
            case 11:
                mVar.write("%= operator for: ");
                break;
            case 12:
                mVar.write("&= operator for: ");
                break;
            case 13:
                mVar.write("|= operator for: ");
                break;
            case 14:
                mVar.write("^= operator for: ");
                break;
            case 15:
                mVar.write("<<= operator for: ");
                break;
            case SETS_REGISTER:
                mVar.write(">>= operator for: ");
                break;
            case 17:
                mVar.write(">>>= operator for: ");
                break;
            default:
                throw new org.jf.a.i("Unknown access type: %d", Integer.valueOf(this.qA.De));
        }
        if (this.qA.De == 0) {
            z = true;
        } else {
            z = true;
        }
        boolean z2 = z;
        org.jf.dexlib2.e.c.d dVar = this.qA.Df;
        switch (z2) {
            case false:
                o.a(mVar, ((org.jf.dexlib2.e.c.e) dVar).lD());
                return true;
            case CAN_THROW:
                mVar.write(((org.jf.dexlib2.e.c.f) dVar).io());
                return true;
            case ODEX_ONLY:
                org.jf.dexlib2.h.g.a((Writer) mVar, (org.jf.dexlib2.e.c.a) dVar, false);
                return true;
            case true:
                org.jf.dexlib2.h.g.a((Writer) mVar, (org.jf.dexlib2.e.c.c) dVar, false);
                return true;
            default:
                throw new IllegalStateException("Unknown reference type");
        }
    }
}