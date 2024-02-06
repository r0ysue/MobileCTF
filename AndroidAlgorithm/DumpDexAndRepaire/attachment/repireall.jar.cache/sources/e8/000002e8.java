package org.jf.baksmali;

import java.util.List;

/* compiled from: ListReferencesCommand.java */
/* loaded from: repireall.jar:org/jf/baksmali/q.class */
public abstract class q extends e {
    private final int rn;
    @com.a.a.l(bD = {"-h", "-?", "--help"}, cd = true, bF = "Show usage information")
    private boolean rf;

    public q(List<com.a.a.j> list, int i) {
        super(list);
        this.rn = i;
    }

    @Override // org.jf.a.a.b
    public final void run() {
        List<org.jf.dexlib2.e.c.d> kH;
        boolean z = this.rf;
        if (this.rb == null || this.rb.isEmpty()) {
            mX();
        } else if (this.rb.size() > 1) {
            System.err.println("Too many files specified");
            mX();
        } else {
            bf(this.rb.get(0));
            org.jf.dexlib2.d.g gVar = this.re;
            int i = this.rn;
            switch (i) {
                case 0:
                    kH = gVar.kE();
                    break;
                case CAN_THROW:
                    kH = gVar.kF();
                    break;
                case ODEX_ONLY:
                    kH = gVar.kH();
                    break;
                case 3:
                    kH = gVar.kG();
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Invalid reference type: %d", Integer.valueOf(i)));
            }
            for (org.jf.dexlib2.e.c.d dVar : kH) {
                System.out.println(org.jf.dexlib2.h.g.a(dVar, (String) null));
            }
        }
    }
}