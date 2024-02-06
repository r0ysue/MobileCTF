package org.jf.dexlib2.i;

import com.b.a.c.bf;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import org.jf.dexlib2.e.b;
import org.jf.dexlib2.e.c.a;
import org.jf.dexlib2.e.c.c;

/* compiled from: EncodedValueWriter.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/g.class */
public abstract class g<StringKey, TypeKey, FieldRefKey extends org.jf.dexlib2.e.c.a, MethodRefKey extends org.jf.dexlib2.e.c.c, AnnotationElement extends org.jf.dexlib2.e.b, EncodedValue> {
    private final e DZ;
    private final p<StringKey, ?> Ea;
    private final r<?, TypeKey, ?> Eb;
    private final h<?, ?, FieldRefKey, ?> Ec;
    private final k<?, ?, ?, MethodRefKey, ?> Ed;
    private final a<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> Ee;

    protected abstract void ae(EncodedValue encodedvalue) throws IOException;

    public g(e eVar, p<StringKey, ?> pVar, r<?, TypeKey, ?> rVar, h<?, ?, FieldRefKey, ?> hVar, k<?, ?, ?, MethodRefKey, ?> kVar, a<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> aVar) {
        this.DZ = eVar;
        this.Ea = pVar;
        this.Eb = rVar;
        this.Ec = hVar;
        this.Ed = kVar;
        this.Ee = aVar;
    }

    /* JADX WARN: Incorrect types in method signature: (TTypeKey;Ljava/util/Collection<+TAnnotationElement;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(CharSequence charSequence, Set set) throws IOException {
        this.DZ.n(29, 0);
        e.b(this.DZ, this.Eb.ag(charSequence));
        e.b(this.DZ, set.size());
        for (org.jf.dexlib2.e.b bVar : bf.c(org.jf.dexlib2.b.b.uk).f(set)) {
            e.b(this.DZ, this.Ea.ag(this.Ee.c(bVar)));
            ae(this.Ee.d(bVar));
        }
    }

    public final void f(Collection<? extends EncodedValue> collection) throws IOException {
        this.DZ.n(28, 0);
        e.b(this.DZ, collection.size());
        for (EncodedValue encodedvalue : collection) {
            ae(encodedvalue);
        }
    }

    public final void X(boolean z) throws IOException {
        this.DZ.n(31, z ? 1 : 0);
    }

    public final void a(byte b) throws IOException {
        this.DZ.o(0, b);
    }

    public final void n(char c) throws IOException {
        this.DZ.p(3, c);
    }

    public final void a(double d) throws IOException {
        this.DZ.b(17, d);
    }

    public final void f(FieldRefKey fieldrefkey) throws IOException {
        this.DZ.p(27, this.Ec.ag(fieldrefkey));
    }

    public final void g(FieldRefKey fieldrefkey) throws IOException {
        this.DZ.p(25, this.Ec.ag(fieldrefkey));
    }

    public final void a(float f) throws IOException {
        this.DZ.a(16, f);
    }

    public final void bJ(int i) throws IOException {
        this.DZ.o(4, i);
    }

    public final void k(long j) throws IOException {
        this.DZ.a(6, j);
    }

    public final void g(MethodRefKey methodrefkey) throws IOException {
        this.DZ.p(26, this.Ed.ag(methodrefkey));
    }

    public final void mE() throws IOException {
        this.DZ.write(30);
    }

    public final void bK(int i) throws IOException {
        this.DZ.o(2, i);
    }

    /* JADX WARN: Incorrect types in method signature: (TStringKey;)V */
    public final void e(CharSequence charSequence) throws IOException {
        this.DZ.p(23, this.Ea.ag(charSequence));
    }

    /* JADX WARN: Incorrect types in method signature: (TTypeKey;)V */
    public final void f(CharSequence charSequence) throws IOException {
        this.DZ.p(24, this.Eb.ag(charSequence));
    }
}