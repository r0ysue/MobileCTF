package com.b.a.a;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Joiner.java */
/* loaded from: repireall.jar:com/b/a/a/f.class */
public class f {
    private final String fS;

    /* synthetic */ f(f fVar, byte b) {
        this(fVar);
    }

    public static f aD(String str) {
        return new f(str);
    }

    public static f h(char c) {
        return new f(String.valueOf(c));
    }

    private f(String str) {
        this.fS = (String) i.i(str);
    }

    private f(f fVar) {
        this.fS = fVar.fS;
    }

    public final StringBuilder a(StringBuilder sb, Iterator<?> it) {
        try {
            i.i(sb);
            if (it.hasNext()) {
                sb.append(g(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.fS);
                    sb.append(g(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String b(Iterable<?> iterable) {
        return a(new StringBuilder(), iterable.iterator()).toString();
    }

    public final String a(Serializable[] serializableArr) {
        return b(Arrays.asList(serializableArr));
    }

    public f aE(final String str) {
        i.i(str);
        return new f(this) { // from class: com.b.a.a.f.1
            @Override // com.b.a.a.f
            final CharSequence g(Object obj) {
                return obj == null ? str : f.this.g(obj);
            }

            @Override // com.b.a.a.f
            public final f aE(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public final a aF(String str) {
        return new a(this, str, (byte) 0);
    }

    /* compiled from: Joiner.java */
    /* loaded from: repireall.jar:com/b/a/a/f$a.class */
    public static final class a {
        private final f fV;
        private final String fW;

        /* synthetic */ a(f fVar, String str, byte b) {
            this(fVar, str);
        }

        private a(f fVar, String str) {
            this.fV = fVar;
            this.fW = (String) i.i(str);
        }

        public final StringBuilder b(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                i.i(sb);
                if (it.hasNext()) {
                    Map.Entry<?, ?> next = it.next();
                    sb.append(this.fV.g(next.getKey()));
                    sb.append((CharSequence) this.fW);
                    sb.append(this.fV.g(next.getValue()));
                    while (it.hasNext()) {
                        sb.append((CharSequence) this.fV.fS);
                        Map.Entry<?, ?> next2 = it.next();
                        sb.append(this.fV.g(next2.getKey()));
                        sb.append((CharSequence) this.fW);
                        sb.append(this.fV.g(next2.getValue()));
                    }
                }
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    CharSequence g(Object obj) {
        i.i(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}