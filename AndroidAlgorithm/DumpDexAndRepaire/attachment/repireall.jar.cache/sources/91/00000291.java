package org.jf.a;

import java.text.BreakIterator;
import java.util.Iterator;

/* compiled from: StringWrapper.java */
/* loaded from: repireall.jar:org/jf/a/t.class */
public final class t {
    public static Iterable<String> j(final String str, final int i) {
        final BreakIterator lineInstance = BreakIterator.getLineInstance();
        lineInstance.setText(str);
        return new Iterable<String>() { // from class: org.jf.a.t.1
            @Override // java.lang.Iterable
            public final Iterator<String> iterator() {
                return new Iterator<String>() { // from class: org.jf.a.t.1.1
                    private int Gg = 0;
                    private boolean Gh = false;
                    private String Gi;

                    @Override // java.util.Iterator
                    public final /* bridge */ /* synthetic */ String next() {
                        String str2 = this.Gi;
                        this.Gi = null;
                        this.Gh = false;
                        return str2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
                        r6.Gi = r6.substring(r6.Gg, r8);
                        r6.Gh = true;
                        r6.Gg = r8;
                     */
                    @Override // java.util.Iterator
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean hasNext() {
                        /*
                            Method dump skipped, instructions count: 207
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: org.jf.a.t.AnonymousClass1.C00121.hasNext():boolean");
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static String[] a(String str, int i, String[] strArr) {
        if (strArr == null) {
            strArr = new String[(int) (((str.length() / i) * 1.5d) + 1.0d)];
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < str.length()) {
            if (str.charAt(i4) == '\n') {
                int i5 = i3;
                i3++;
                strArr = a(strArr, str.substring(i2, i4), i5);
                i2 = i4 + 1;
            } else if (i4 - i2 == i) {
                int i6 = i3;
                i3++;
                strArr = a(strArr, str.substring(i2, i4), i6);
                i2 = i4;
            }
            i4++;
        }
        if (i2 != i4 || i4 == 0) {
            String substring = str.substring(i2);
            int i7 = i3;
            i3++;
            int length = strArr.length + 1;
            String[] strArr2 = strArr;
            if (i7 >= strArr2.length) {
                strArr2 = a(strArr2, length);
            }
            strArr2[i7] = substring;
            strArr = strArr2;
        }
        if (i3 < strArr.length) {
            strArr[i3] = null;
        }
        return strArr;
    }

    private static String[] a(String[] strArr, String str, int i) {
        if (i >= strArr.length) {
            strArr = a(strArr, (int) Math.ceil((strArr.length + 1) * 1.5d));
        }
        strArr[i] = str;
        return strArr;
    }

    private static String[] a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }
}