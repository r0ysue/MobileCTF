package org.jf.dexlib2.a;

import com.b.a.c.ba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: AnalyzedInstruction.java */
/* loaded from: repireall.jar:org/jf/dexlib2/a/b.class */
public class b implements Comparable<b> {
    private k qu;
    protected org.jf.dexlib2.e.b.f pK;
    protected final int rL;
    private n[] rO;
    protected final n[] rP;
    protected final org.jf.dexlib2.e.b.f rR;
    private static /* synthetic */ boolean pL;
    private TreeSet<b> rM = new TreeSet<>();
    protected final LinkedList<b> rN = new LinkedList<>();
    private Map<a, n> rQ = null;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        b bVar2 = bVar;
        if (this.rL < bVar2.rL) {
            return -1;
        }
        if (this.rL == bVar2.rL) {
            return 0;
        }
        return 1;
    }

    static {
        pL = !b.class.desiredAssertionStatus();
    }

    public b(k kVar, org.jf.dexlib2.e.b.f fVar, int i, int i2) {
        this.qu = kVar;
        this.pK = fVar;
        this.rR = fVar;
        this.rL = i;
        this.rP = new n[i2];
        this.rO = new n[i2];
        n a2 = n.a((byte) 0, (o) null);
        for (int i3 = 0; i3 < i2; i3++) {
            this.rO[i3] = a2;
            this.rP[i3] = a2;
        }
    }

    public final int ic() {
        return this.rL;
    }

    public final int id() {
        return this.rM.size();
    }

    public final SortedSet<b> ie() {
        return Collections.unmodifiableSortedSet(this.rM);
    }

    public n a(b bVar, int i) {
        n nVar;
        if (this.rQ != null && (nVar = this.rQ.get(new a(bVar, i))) != null) {
            return nVar;
        }
        return bVar.rP[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(b bVar) {
        return this.rM.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(b bVar) {
        this.rN.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(org.jf.dexlib2.e.b.f fVar) {
        if (!pL && !this.rR.iQ().odexOnly()) {
            throw new AssertionError();
        }
        this.pK = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: if  reason: not valid java name */
    public final void m108if() {
        if (!pL && !this.rR.iQ().odexOnly()) {
            throw new AssertionError();
        }
        this.pK = this.rR;
    }

    public final org.jf.dexlib2.e.b.f ig() {
        return this.pK;
    }

    public final org.jf.dexlib2.e.b.f ih() {
        return this.rR;
    }

    public final boolean ii() {
        return this.rM.size() != 0 && this.rM.first().rL == -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i, n nVar, BitSet bitSet, boolean z) {
        n a2;
        if (pL || (i >= 0 && i < this.rP.length)) {
            if (pL || nVar != null) {
                n nVar2 = this.rO[i];
                if (z) {
                    a2 = am(i);
                } else {
                    a2 = nVar2.a(nVar);
                }
                if (a2.equals(nVar2)) {
                    return false;
                }
                this.rO[i] = a2;
                bitSet.clear(this.rL);
                if (!an(i)) {
                    this.rP[i] = a2;
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private n am(int i) {
        n nVar = null;
        Iterator<b> it = this.rM.iterator();
        while (it.hasNext()) {
            n a2 = a(it.next(), i);
            if (a2 != null) {
                if (nVar == null) {
                    nVar = a2;
                } else {
                    nVar = a2.a(nVar);
                }
            }
        }
        if (nVar == null) {
            throw new IllegalStateException();
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i, n nVar) {
        if (pL || (i >= 0 && i < this.rP.length)) {
            if (pL || nVar != null) {
                if (this.rP[i].equals(nVar)) {
                    return false;
                }
                this.rP[i] = nVar;
                return true;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(b bVar, int i, n nVar, BitSet bitSet) {
        if (this.rQ == null) {
            this.rQ = ba.fM();
        }
        this.rQ.put(new a(bVar, i), nVar);
        n am = am(i);
        if (this.rO[i].equals(am)) {
            return false;
        }
        this.rO[i] = am;
        bitSet.clear(this.rL);
        if (!an(i) && !this.rP[i].equals(am)) {
            this.rP[i] = am;
            return true;
        }
        return false;
    }

    public final boolean ij() {
        if (!this.pK.iQ().canInitializeReference()) {
            return false;
        }
        org.jf.dexlib2.e.c.d jP = ((org.jf.dexlib2.e.b.m) this.pK).jP();
        if (jP instanceof org.jf.dexlib2.e.c.c) {
            return ((org.jf.dexlib2.e.c.c) jP).bf().equals("<init>");
        }
        return false;
    }

    private boolean an(int i) {
        int jZ;
        if (ij()) {
            if (this.pK instanceof org.jf.dexlib2.e.b.c) {
                if (!pL && ((org.jf.dexlib2.e.b.c) this.pK).im() <= 0) {
                    throw new AssertionError();
                }
                jZ = ((org.jf.dexlib2.e.b.c) this.pK).jS();
            } else if (!pL && !(this.pK instanceof org.jf.dexlib2.e.b.n)) {
                throw new AssertionError();
            } else {
                org.jf.dexlib2.e.b.n nVar = (org.jf.dexlib2.e.b.n) this.pK;
                if (!pL && nVar.im() <= 0) {
                    throw new AssertionError();
                }
                jZ = nVar.jZ();
            }
            n nVar2 = this.rO[jZ];
            if (nVar2.tp == 0) {
                n nVar3 = this.rO[i];
                if (nVar3.tp == 16 || nVar3.tp == 17) {
                    return true;
                }
            }
            if (nVar2.tp != 16 && nVar2.tp != 17) {
                return false;
            }
            if (i == jZ) {
                return true;
            }
            return nVar2.equals(this.rO[i]);
        }
        if (this.rL > 0 && this.qu.iM().it() && this.rM.size() == 1 && (this.pK.iQ() == org.jf.dexlib2.e.IF_EQZ || this.pK.iQ() == org.jf.dexlib2.e.IF_NEZ)) {
            b first = this.rM.first();
            if (first.pK.iQ() == org.jf.dexlib2.e.INSTANCE_OF && k.a(first, this, this.qu.iM())) {
                org.jf.dexlib2.e.b.a.o oVar = (org.jf.dexlib2.e.b.a.o) first.pK;
                if (i == oVar.jN()) {
                    return true;
                }
                if (this.rL > 1) {
                    int i2 = -1;
                    n nVar4 = null;
                    Iterator<b> it = first.rM.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b next = it.next();
                        org.jf.dexlib2.e iQ = next.pK.iQ();
                        if (iQ == org.jf.dexlib2.e.MOVE_OBJECT || iQ == org.jf.dexlib2.e.MOVE_OBJECT_16 || iQ == org.jf.dexlib2.e.MOVE_OBJECT_FROM16) {
                            org.jf.dexlib2.e.b.r rVar = (org.jf.dexlib2.e.b.r) next.pK;
                            n nVar5 = next.rP[rVar.jN()];
                            if (rVar.jK() != oVar.jN()) {
                                i2 = -1;
                                break;
                            } else if (nVar5.tq == null) {
                                i2 = -1;
                                break;
                            } else {
                                if (nVar4 == null) {
                                    nVar4 = n.a(this.qu.iM(), (org.jf.dexlib2.e.c.f) oVar.jP());
                                }
                                if (k.a(nVar5, nVar4)) {
                                    if (i2 != -1) {
                                        if (i2 != rVar.jN()) {
                                            i2 = -1;
                                            break;
                                        }
                                    } else {
                                        i2 = rVar.jN();
                                    }
                                }
                            }
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    if (i2 != -1 && i == i2) {
                        return true;
                    }
                }
            }
        }
        if (!this.pK.iQ().setsRegister()) {
            return false;
        }
        int il = il();
        if (i == il) {
            return true;
        }
        if (this.pK.iQ().setsWideRegister() && i == il + 1) {
            return true;
        }
        return false;
    }

    public final int il() {
        if (!this.pK.iQ().setsRegister()) {
            throw new org.jf.a.i("Cannot call getDestinationRegister() for an instruction that doesn't store a value", new Object[0]);
        }
        return ((org.jf.dexlib2.e.b.k) this.pK).jK();
    }

    public final int im() {
        return this.rP.length;
    }

    public final n ao(int i) {
        return this.rP[i];
    }

    public final n ap(int i) {
        return this.rO[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnalyzedInstruction.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/a/b$a.class */
    public static class a {
        private b qs;
        private int rS;

        public a(b bVar, int i) {
            this.qs = bVar;
            this.rS = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return com.b.a.a.h.e(Integer.valueOf(this.rS), Integer.valueOf(aVar.rS)) && com.b.a.a.h.e(this.qs, aVar.qs);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.qs, Integer.valueOf(this.rS)});
        }
    }

    public final List<Integer> ik() {
        int jZ;
        ArrayList arrayList = new ArrayList();
        if (this.pK.iQ().setsRegister()) {
            arrayList.add(Integer.valueOf(il()));
        }
        if (this.pK.iQ().setsWideRegister()) {
            arrayList.add(Integer.valueOf(il() + 1));
        }
        if (ij()) {
            if (this.pK instanceof org.jf.dexlib2.e.b.c) {
                jZ = ((org.jf.dexlib2.e.b.c) this.pK).jS();
                if (!pL && ((org.jf.dexlib2.e.b.c) this.pK).im() <= 0) {
                    throw new AssertionError();
                }
            } else if (!pL && !(this.pK instanceof org.jf.dexlib2.e.b.n)) {
                throw new AssertionError();
            } else {
                org.jf.dexlib2.e.b.n nVar = (org.jf.dexlib2.e.b.n) this.pK;
                if (!pL && nVar.im() <= 0) {
                    throw new AssertionError();
                }
                jZ = nVar.jZ();
            }
            n nVar2 = this.rO[jZ];
            if (nVar2.tp != 16 && nVar2.tp != 17) {
                if (nVar2.tp == 0) {
                    for (int i = 0; i < this.rO.length; i++) {
                        n nVar3 = this.rO[i];
                        if (nVar3.tp == 16 || nVar3.tp == 17) {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                }
            } else {
                arrayList.add(Integer.valueOf(jZ));
                n nVar4 = this.rO[jZ];
                for (int i2 = 0; i2 < this.rO.length; i2++) {
                    if (i2 != jZ) {
                        n nVar5 = this.rO[i2];
                        if (nVar5.equals(nVar4)) {
                            arrayList.add(Integer.valueOf(i2));
                        } else if ((nVar5.tp == 16 || nVar5.tp == 17) && this.rP[i2].tp == 0) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                }
            }
        }
        if (this.rL > 0 && this.qu.iM().it() && this.rM.size() == 1 && (this.pK.iQ() == org.jf.dexlib2.e.IF_EQZ || this.pK.iQ() == org.jf.dexlib2.e.IF_NEZ)) {
            b first = this.rM.first();
            if (first.pK.iQ() == org.jf.dexlib2.e.INSTANCE_OF && k.a(first, this, this.qu.iM())) {
                org.jf.dexlib2.e.b.a.o oVar = (org.jf.dexlib2.e.b.a.o) first.pK;
                arrayList.add(Integer.valueOf(oVar.jN()));
                if (this.rL > 1) {
                    int i3 = -1;
                    n nVar6 = null;
                    Iterator<b> it = first.rM.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b next = it.next();
                        org.jf.dexlib2.e iQ = next.pK.iQ();
                        if (iQ == org.jf.dexlib2.e.MOVE_OBJECT || iQ == org.jf.dexlib2.e.MOVE_OBJECT_16 || iQ == org.jf.dexlib2.e.MOVE_OBJECT_FROM16) {
                            org.jf.dexlib2.e.b.r rVar = (org.jf.dexlib2.e.b.r) next.pK;
                            n nVar7 = next.rP[rVar.jN()];
                            if (rVar.jK() != oVar.jN()) {
                                i3 = -1;
                                break;
                            } else if (nVar7.tq == null) {
                                i3 = -1;
                                break;
                            } else {
                                if (nVar6 == null) {
                                    nVar6 = n.a(this.qu.iM(), (org.jf.dexlib2.e.c.f) oVar.jP());
                                }
                                if (k.a(nVar7, nVar6)) {
                                    if (i3 != -1) {
                                        if (i3 != rVar.jN()) {
                                            i3 = -1;
                                            break;
                                        }
                                    } else {
                                        i3 = rVar.jN();
                                    }
                                }
                            }
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
            }
        }
        return arrayList;
    }
}