package org.jf.dexlib2.f.d;

import com.b.a.c.ao;
import java.util.Iterator;
import org.jf.dexlib2.f.i;

/* compiled from: ParamUtil.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/d/b.class */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static int g(String str, int i) {
        int i2;
        int i3;
        while (true) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case 'B':
                case 'C':
                case 'D':
                case 'F':
                case 'I':
                case 'J':
                case 'S':
                case 'Z':
                    return i + 1;
                case 'E':
                case 'G':
                case 'H':
                case 'K':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                default:
                    throw new IllegalArgumentException(String.format("Param string \"%s\" contains invalid type prefix: %s", str, Character.toString(charAt)));
                case 'L':
                    do {
                        i2 = i;
                        i++;
                    } while (str.charAt(i2) != ';');
                    return i;
                case '[':
                    break;
            }
            do {
                i3 = i;
                i++;
            } while (str.charAt(i3) != '[');
            str = str;
        }
    }

    public static Iterable<i> br(final String str) {
        return new Iterable<i>() { // from class: org.jf.dexlib2.f.d.b.1
            @Override // java.lang.Iterable
            public final Iterator<i> iterator() {
                return new Iterator<i>() { // from class: org.jf.dexlib2.f.d.b.1.1
                    private int ux = 0;

                    @Override // java.util.Iterator
                    public final /* synthetic */ i next() {
                        int g = b.g(str, this.ux);
                        String substring = str.substring(this.ux, g);
                        this.ux = g;
                        return new i(substring, (ao<? extends org.jf.dexlib2.f.a>) null, (String) null);
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return this.ux < str.length();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}