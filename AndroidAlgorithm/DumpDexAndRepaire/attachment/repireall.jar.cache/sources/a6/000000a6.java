package com.b.a.a;

import java.util.Arrays;

/* compiled from: CharMatcher.java */
/* loaded from: repireall.jar:com/b/a/a/b.class */
public abstract class b implements j<Character> {
    private static final String fF;
    public static final AnonymousClass10 fG;
    private String fH;
    static final int fI;

    public abstract boolean g(char c2);

    /* JADX WARN: Type inference failed for: r0v21, types: [com.b.a.a.b$10] */
    static {
        new b() { // from class: com.b.a.a.b.1
            @Override // com.b.a.a.b, com.b.a.a.j
            public final /* synthetic */ boolean apply(Character ch) {
                return super.apply(ch);
            }

            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                switch (c2) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case SETS_WIDE_REGISTER:
                    case 133:
                    case 5760:
                    case 8232:
                    case 8233:
                    case 8287:
                    case 12288:
                        return true;
                    case 8199:
                        return false;
                    default:
                        return c2 >= 8192 && c2 <= 8202;
                }
            }

            @Override // com.b.a.a.b
            public final String toString() {
                return "CharMatcher.BREAKING_WHITESPACE";
            }
        };
        a((char) 0, (char) 127, "CharMatcher.ASCII");
        StringBuilder sb = new StringBuilder(31);
        for (int i = 0; i < 31; i++) {
            sb.append((char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + '\t'));
        }
        fF = sb.toString();
        new c("CharMatcher.DIGIT", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), fF.toCharArray());
        new b("CharMatcher.JAVA_DIGIT") { // from class: com.b.a.a.b.4
            @Override // com.b.a.a.b, com.b.a.a.j
            public final /* synthetic */ boolean apply(Character ch) {
                return super.apply(ch);
            }

            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return Character.isDigit(c2);
            }
        };
        new b("CharMatcher.JAVA_LETTER") { // from class: com.b.a.a.b.5
            @Override // com.b.a.a.b, com.b.a.a.j
            public final /* synthetic */ boolean apply(Character ch) {
                return super.apply(ch);
            }

            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return Character.isLetter(c2);
            }
        };
        new b("CharMatcher.JAVA_LETTER_OR_DIGIT") { // from class: com.b.a.a.b.6
            @Override // com.b.a.a.b, com.b.a.a.j
            public final /* synthetic */ boolean apply(Character ch) {
                return super.apply(ch);
            }

            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return Character.isLetterOrDigit(c2);
            }
        };
        new b("CharMatcher.JAVA_UPPER_CASE") { // from class: com.b.a.a.b.7
            @Override // com.b.a.a.b, com.b.a.a.j
            public final /* synthetic */ boolean apply(Character ch) {
                return super.apply(ch);
            }

            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return Character.isUpperCase(c2);
            }
        };
        new b("CharMatcher.JAVA_LOWER_CASE") { // from class: com.b.a.a.b.8
            @Override // com.b.a.a.b, com.b.a.a.j
            public final /* synthetic */ boolean apply(Character ch) {
                return super.apply(ch);
            }

            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return Character.isLowerCase(c2);
            }
        };
        b((char) 0, (char) 31).a(b((char) 127, (char) 159)).aC("CharMatcher.JAVA_ISO_CONTROL");
        new c("CharMatcher.INVISIBLE", "��\u007f\u00ad\u0600\u061c\u06dd\u070f\u1680\u180e\u2000\u2028\u205f\u2066\u2067\u2068\u2069\u206a\u3000�\ufeff\ufff9\ufffa".toCharArray(), "  \u00ad\u0604\u061c\u06dd\u070f\u1680\u180e\u200f \u2064\u2066\u2067\u2068\u2069\u206f\u3000\uf8ff\ufeff\ufff9\ufffb".toCharArray());
        new c("CharMatcher.SINGLE_WIDTH", "��־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        new a("CharMatcher.ANY") { // from class: com.b.a.a.b.9
            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return true;
            }

            @Override // com.b.a.a.b
            public final int a(CharSequence charSequence, int i2) {
                int length = charSequence.length();
                i.b(i2, length);
                if (i2 == length) {
                    return -1;
                }
                return i2;
            }

            @Override // com.b.a.a.b
            public final b a(b bVar) {
                i.i(bVar);
                return this;
            }
        };
        fG = new a("CharMatcher.NONE") { // from class: com.b.a.a.b.10
            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return false;
            }

            @Override // com.b.a.a.b
            public final int a(CharSequence charSequence, int i2) {
                i.b(i2, charSequence.length());
                return -1;
            }

            @Override // com.b.a.a.b
            public final b a(b bVar) {
                return (b) i.i(bVar);
            }
        };
        fI = Integer.numberOfLeadingZeros(32 - 1);
        new a("WHITESPACE") { // from class: com.b.a.a.b.3
            @Override // com.b.a.a.b
            public final boolean g(char c2) {
                return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((c2 * 48906) >>> fI) == c2;
            }
        };
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: repireall.jar:com/b/a/a/b$c.class */
    private static class c extends b {
        private final char[] fO;
        private final char[] fP;

        @Override // com.b.a.a.b, com.b.a.a.j
        public final /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        c(String str, char[] cArr, char[] cArr2) {
            super(str);
            this.fO = cArr;
            this.fP = cArr2;
            i.z(cArr.length == cArr2.length);
            for (int i = 0; i < cArr.length; i++) {
                i.z(cArr[i] <= cArr2[i]);
                if (i + 1 < cArr.length) {
                    i.z(cArr2[i] < cArr[i + 1]);
                }
            }
        }

        @Override // com.b.a.a.b
        public final boolean g(char c) {
            int binarySearch = Arrays.binarySearch(this.fO, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ (-1)) - 1;
            return i >= 0 && c <= this.fP[i];
        }
    }

    private static String e(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static b f(final char c2) {
        String valueOf = String.valueOf(String.valueOf(e(c2)));
        return new a(new StringBuilder(18 + valueOf.length()).append("CharMatcher.is('").append(valueOf).append("')").toString()) { // from class: com.b.a.a.b.11
            @Override // com.b.a.a.b
            public final boolean g(char c3) {
                return c3 == c2;
            }

            @Override // com.b.a.a.b
            public final b a(b bVar) {
                return bVar.g(c2) ? bVar : super.a(bVar);
            }
        };
    }

    private static b b(char c2, char c3) {
        i.z(c3 >= c2);
        String valueOf = String.valueOf(String.valueOf(e(c2)));
        String valueOf2 = String.valueOf(String.valueOf(e(c3)));
        return a(c2, c3, new StringBuilder(27 + valueOf.length() + valueOf2.length()).append("CharMatcher.inRange('").append(valueOf).append("', '").append(valueOf2).append("')").toString());
    }

    private static b a(final char c2, final char c3, String str) {
        return new a(str) { // from class: com.b.a.a.b.2
            @Override // com.b.a.a.b
            public final boolean g(char c4) {
                return c2 <= c4 && c4 <= c3;
            }
        };
    }

    b(String str) {
        this.fH = str;
    }

    protected b() {
        this.fH = super.toString();
    }

    public b a(b bVar) {
        return new C0001b(this, (b) i.i(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CharMatcher.java */
    /* renamed from: com.b.a.a.b$b  reason: collision with other inner class name */
    /* loaded from: repireall.jar:com/b/a/a/b$b.class */
    public static class C0001b extends b {
        private b fM;
        private b fN;

        @Override // com.b.a.a.b, com.b.a.a.j
        public final /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        private C0001b(b bVar, b bVar2, String str) {
            super(str);
            this.fM = (b) i.i(bVar);
            this.fN = (b) i.i(bVar2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        C0001b(com.b.a.a.b r9, com.b.a.a.b r10) {
            /*
                r8 = this;
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r9
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r9 = r3
                r3 = r10
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r10 = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = r3
                r5 = 18
                r6 = r9
                int r6 = r6.length()
                int r5 = r5 + r6
                r6 = r10
                int r6 = r6.length()
                int r5 = r5 + r6
                r4.<init>(r5)
                java.lang.String r4 = "CharMatcher.or("
                java.lang.StringBuilder r3 = r3.append(r4)
                r4 = r9
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = ", "
                java.lang.StringBuilder r3 = r3.append(r4)
                r4 = r10
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = ")"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.b.C0001b.<init>(com.b.a.a.b, com.b.a.a.b):void");
        }

        @Override // com.b.a.a.b
        public final boolean g(char c) {
            return this.fM.g(c) || this.fN.g(c);
        }

        @Override // com.b.a.a.b
        final b aC(String str) {
            return new C0001b(this.fM, this.fN, str);
        }
    }

    b aC(String str) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: repireall.jar:com/b/a/a/b$a.class */
    static abstract class a extends b {
        @Override // com.b.a.a.b, com.b.a.a.j
        public /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        a(String str) {
            super(str);
        }
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        i.b(i, length);
        for (int i2 = i; i2 < length; i2++) {
            if (g(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.b.a.a.j
    @Deprecated
    /* renamed from: a */
    public final boolean apply(Character ch) {
        return g(ch.charValue());
    }

    public String toString() {
        return this.fH;
    }
}