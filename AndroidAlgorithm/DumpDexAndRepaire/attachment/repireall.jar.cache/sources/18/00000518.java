package org.jf.dexlib2.f.d;

import com.b.a.c.ah;
import org.jf.a.k;

/* compiled from: CharSequenceConverter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/f/d/a.class */
public final class a {
    private static final k<String, CharSequence> AF = new k<String, CharSequence>() { // from class: org.jf.dexlib2.f.d.a.1
        @Override // org.jf.a.k
        protected final /* synthetic */ String O(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // org.jf.a.k
        protected final /* bridge */ /* synthetic */ boolean P(CharSequence charSequence) {
            return charSequence instanceof String;
        }
    };

    public static ah<String> m(Iterable<? extends CharSequence> iterable) {
        return AF.n(iterable);
    }
}