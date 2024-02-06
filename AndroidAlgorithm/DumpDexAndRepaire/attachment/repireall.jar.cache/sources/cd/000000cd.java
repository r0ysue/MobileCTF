package com.b.a.a;

import java.util.Iterator;

/* compiled from: Splitter.java */
/* loaded from: repireall.jar:com/b/a/a/l.class */
public final class l {
    private final com.b.a.a.b gf;
    private final boolean gg;
    private final b gh;
    private final int gi;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Splitter.java */
    /* loaded from: repireall.jar:com/b/a/a/l$b.class */
    public interface b {
        Iterator<String> b(l lVar, CharSequence charSequence);
    }

    static /* synthetic */ Iterator a(l lVar, CharSequence charSequence) {
        return lVar.gh.b(lVar, charSequence);
    }

    private l(AnonymousClass1 anonymousClass1) {
        this(anonymousClass1, false, com.b.a.a.b.fG, Integer.MAX_VALUE);
    }

    private l(b bVar, boolean z, com.b.a.a.b bVar2, int i) {
        this.gh = bVar;
        this.gg = false;
        this.gf = bVar2;
        this.gi = Integer.MAX_VALUE;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.b.a.a.l$1] */
    public static l i(char c) {
        final com.b.a.a.b f = com.b.a.a.b.f('/');
        i.i(f);
        return new l(new b() { // from class: com.b.a.a.l.1
            @Override // com.b.a.a.l.b
            public final /* synthetic */ Iterator b(l lVar, CharSequence charSequence) {
                return new a(lVar, charSequence) { // from class: com.b.a.a.l.1.1
                    @Override // com.b.a.a.l.a
                    final int I(int i) {
                        return com.b.a.a.b.this.a(this.gn, i);
                    }

                    @Override // com.b.a.a.l.a
                    final int J(int i) {
                        return i + 1;
                    }
                };
            }
        });
    }

    public final Iterable<String> aG(final CharSequence charSequence) {
        i.i(charSequence);
        return new Iterable<String>() { // from class: com.b.a.a.l.2
            @Override // java.lang.Iterable
            public final Iterator<String> iterator() {
                return l.a(l.this, charSequence);
            }

            public final String toString() {
                return f.aD(", ").a(new StringBuilder("["), iterator()).append(']').toString();
            }
        };
    }

    /* compiled from: Splitter.java */
    /* loaded from: repireall.jar:com/b/a/a/l$a.class */
    private static abstract class a extends com.b.a.a.a<String> {
        final CharSequence gn;
        private com.b.a.a.b gf;
        private boolean gg;
        private int an = 0;
        private int gi;

        abstract int I(int i);

        abstract int J(int i);

        @Override // com.b.a.a.a
        protected final /* synthetic */ String cR() {
            int i;
            int i2 = this.an;
            while (this.an != -1) {
                int i3 = i2;
                int I = I(this.an);
                if (I == -1) {
                    i = this.gn.length();
                    this.an = -1;
                } else {
                    i = I;
                    this.an = J(I);
                }
                if (this.an == i2) {
                    this.an++;
                    if (this.an >= this.gn.length()) {
                        this.an = -1;
                    }
                } else {
                    while (i3 < i && this.gf.g(this.gn.charAt(i3))) {
                        i3++;
                    }
                    while (i > i3 && this.gf.g(this.gn.charAt(i - 1))) {
                        i--;
                    }
                    if (this.gg && i3 == i) {
                        i2 = this.an;
                    } else {
                        if (this.gi == 1) {
                            i = this.gn.length();
                            this.an = -1;
                            while (i > i3 && this.gf.g(this.gn.charAt(i - 1))) {
                                i--;
                            }
                        } else {
                            this.gi--;
                        }
                        return this.gn.subSequence(i3, i).toString();
                    }
                }
            }
            cS();
            return null;
        }

        protected a(l lVar, CharSequence charSequence) {
            this.gf = lVar.gf;
            this.gg = lVar.gg;
            this.gi = lVar.gi;
            this.gn = charSequence;
        }
    }
}