package org.jf.dexlib2.h;

import com.b.a.a.n;
import com.b.a.c.ba;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jf.a.u;

/* compiled from: AnnotatedBytes.java */
/* loaded from: repireall.jar:org/jf/dexlib2/h/a.class */
public class a {
    private int CB;
    private int CC;
    private int CD;
    private TreeMap<Integer, C0032a> CA = ba.fP();
    private int CE = 8;
    private int CF = -1;
    private int CG = -1;

    public a(int i) {
        this.CD = i;
    }

    public final void bm(int i) {
        this.CB = i;
    }

    public final void a(int i, String str, Object... objArr) {
        b(i - this.CB, str, objArr);
    }

    public final void b(int i, String str, Object... objArr) {
        String str2;
        b bVar;
        Map.Entry<Integer, C0032a> higherEntry;
        b bVar2;
        if (this.CF != -1 && this.CG != -1 && (this.CB < this.CF || this.CB >= this.CG)) {
            throw new org.jf.a.i("Annotating outside the parent bounds", new Object[0]);
        }
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(str, objArr);
        } else {
            str2 = str;
        }
        int i2 = this.CB + i;
        C0032a c0032a = null;
        C0032a c0032a2 = this.CA.get(Integer.valueOf(this.CB));
        C0032a c0032a3 = c0032a2;
        if (c0032a2 == null) {
            Map.Entry<Integer, C0032a> lowerEntry = this.CA.lowerEntry(Integer.valueOf(this.CB));
            if (lowerEntry != null && (bVar2 = lowerEntry.getValue().CI) != null) {
                throw new org.jf.a.i("Cannot add annotation %s, due to existing annotation %s", a(this.CB, Integer.valueOf(this.CB + i), str2), f(lowerEntry.getKey().intValue(), bVar2.CK));
            }
        } else if (i > 0 && (bVar = c0032a3.CI) != null) {
            throw new org.jf.a.i("Cannot add annotation %s, due to existing annotation %s", a(this.CB, Integer.valueOf(this.CB + i), str2), f(this.CB, bVar.CK));
        }
        if (i > 0 && (higherEntry = this.CA.higherEntry(Integer.valueOf(this.CB))) != null) {
            int intValue = higherEntry.getKey().intValue();
            if (intValue < i2) {
                C0032a value = higherEntry.getValue();
                b bVar3 = value.CI;
                if (bVar3 != null) {
                    throw new org.jf.a.i("Cannot add annotation %s, due to existing annotation %s", a(this.CB, Integer.valueOf(this.CB + i), str2), f(intValue, bVar3.CK));
                }
                if (value.CH.size() > 0) {
                    throw new org.jf.a.i("Cannot add annotation %s, due to existing annotation %s", a(this.CB, Integer.valueOf(this.CB + i), str2), a(intValue, Integer.valueOf(intValue), value.CH.get(0).CK));
                }
                throw new org.jf.a.i("Cannot add annotation %s, due to existing annotation endpoint at %d", a(this.CB, Integer.valueOf(this.CB + i), str2), Integer.valueOf(intValue));
            } else if (intValue == i2) {
                c0032a = higherEntry.getValue();
            }
        }
        if (c0032a3 == null) {
            c0032a3 = new C0032a((byte) 0);
            this.CA.put(Integer.valueOf(this.CB), c0032a3);
        }
        if (i == 0) {
            c0032a3.CH.add(new b(this.CC, str2));
        } else {
            c0032a3.CI = new b(this.CC, str2);
            if (c0032a == null) {
                this.CA.put(Integer.valueOf(i2), new C0032a((byte) 0));
            }
        }
        this.CB += i;
    }

    private String f(int i, String str) {
        return a(i, this.CA.higherKey(Integer.valueOf(i)), str);
    }

    private static String a(int i, Integer num, String str) {
        if (num != null) {
            return String.format("[0x%x, 0x%x) \"%s\"", Integer.valueOf(i), num, str);
        }
        return String.format("[0x%x, ) \"%s\"", Integer.valueOf(i), str);
    }

    public final void mm() {
        this.CC++;
    }

    public final void mn() {
        this.CC--;
        if (this.CC < 0) {
            this.CC = 0;
        }
    }

    public final int mo() {
        return this.CB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnnotatedBytes.java */
    /* renamed from: org.jf.dexlib2.h.a$a  reason: collision with other inner class name */
    /* loaded from: repireall.jar:org/jf/dexlib2/h/a$a.class */
    public static class C0032a {
        public final List<b> CH;
        public b CI;

        private C0032a() {
            this.CH = new ArrayList();
            this.CI = null;
        }

        /* synthetic */ C0032a(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnnotatedBytes.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/h/a$b.class */
    public static class b {
        public final int CJ;
        public final String CK;

        public b(int i, String str) {
            this.CJ = i;
            this.CK = str;
        }
    }

    public final void a(Writer writer, byte[] bArr) throws IOException {
        b bVar;
        String str;
        int i = this.CD - ((8 + (this.CE << 1)) + (this.CE / 2));
        int i2 = (this.CD - i) - 1;
        String e = n.e(" ", 1000);
        u uVar = new u(writer, i2, i, "|");
        Integer[] numArr = (Integer[]) this.CA.keySet().toArray(new Integer[this.CA.size()]);
        C0032a[] c0032aArr = (C0032a[]) this.CA.values().toArray(new C0032a[this.CA.size()]);
        for (int i3 = 0; i3 < numArr.length - 1; i3++) {
            int intValue = numArr[i3].intValue();
            int intValue2 = numArr[i3 + 1].intValue();
            C0032a c0032a = c0032aArr[i3];
            for (b bVar2 : c0032a.CH) {
                uVar.l("", e.substring(0, bVar2.CJ << 1) + bVar2.CK);
            }
            if (c0032a.CI != null) {
                str = e.substring(0, bVar.CJ << 1) + bVar.CK;
            } else {
                str = "";
            }
            uVar.l(org.jf.a.j.a(bArr, intValue, intValue2 - intValue, intValue, this.CE, 6), str);
        }
        int intValue3 = numArr[numArr.length - 1].intValue();
        if (intValue3 < bArr.length) {
            uVar.l(org.jf.a.j.a(bArr, intValue3, bArr.length - intValue3, intValue3, this.CE, 6), "");
        }
    }

    public final void i(int i, int i2) {
        this.CF = i;
        this.CG = i2;
    }

    public final void mp() {
        this.CF = -1;
        this.CG = -1;
    }
}