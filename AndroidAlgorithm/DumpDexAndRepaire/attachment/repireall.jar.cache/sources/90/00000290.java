package org.jf.a;

import java.io.IOException;

/* compiled from: StringUtils.java */
/* loaded from: repireall.jar:org/jf/a/s.class */
public final class s {
    public static void b(m mVar, char c) throws IOException {
        if (c >= ' ' && c < 127) {
            if (c == '\'' || c == '\"' || c == '\\') {
                mVar.write(92);
            }
            mVar.write(c);
            return;
        }
        if (c <= 127) {
            switch (c) {
                case '\t':
                    mVar.write("\\t");
                    return;
                case '\n':
                    mVar.write("\\n");
                    return;
                case '\r':
                    mVar.write("\\r");
                    return;
            }
        }
        mVar.write("\\u");
        mVar.write(Character.forDigit(c >> '\f', 16));
        mVar.write(Character.forDigit((c >> '\b') & 15, 16));
        mVar.write(Character.forDigit((c >> 4) & 15, 16));
        mVar.write(Character.forDigit(c & 15, 16));
    }

    public static void b(m mVar, String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt < 127) {
                if (charAt == '\'' || charAt == '\"' || charAt == '\\') {
                    mVar.write(92);
                }
                mVar.write(charAt);
            } else {
                if (charAt <= 127) {
                    switch (charAt) {
                        case '\t':
                            mVar.write("\\t");
                            break;
                        case '\n':
                            mVar.write("\\n");
                            break;
                        case '\r':
                            mVar.write("\\r");
                            break;
                    }
                }
                mVar.write("\\u");
                mVar.write(Character.forDigit(charAt >> '\f', 16));
                mVar.write(Character.forDigit((charAt >> '\b') & 15, 16));
                mVar.write(Character.forDigit((charAt >> 4) & 15, 16));
                mVar.write(Character.forDigit(charAt & 15, 16));
            }
        }
    }

    public static String bF(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt < 127) {
                if (charAt == '\'' || charAt == '\"' || charAt == '\\') {
                    sb.append('\\');
                }
                sb.append(charAt);
            } else {
                if (charAt <= 127) {
                    switch (charAt) {
                        case '\t':
                            sb.append("\\t");
                            break;
                        case '\n':
                            sb.append("\\n");
                            break;
                        case '\r':
                            sb.append("\\r");
                            break;
                    }
                }
                sb.append("\\u");
                sb.append(Character.forDigit(charAt >> '\f', 16));
                sb.append(Character.forDigit((charAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((charAt >> 4) & 15, 16));
                sb.append(Character.forDigit(charAt & 15, 16));
            }
        }
        return sb.toString();
    }
}