package org.jf.a;

import com.b.a.c.ah;
import com.b.a.c.ao;
import com.b.a.c.as;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: ImmutableConverter.java */
/* loaded from: repireall.jar:org/jf/a/k.class */
public abstract class k<ImmutableItem, Item> {
    protected abstract boolean P(Item item);

    protected abstract ImmutableItem O(Item item);

    public final ah<ImmutableItem> n(Iterable<? extends Item> iterable) {
        if (iterable == null) {
            return ah.eY();
        }
        boolean z = false;
        if (iterable instanceof ah) {
            Iterator<? extends Item> it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!P(it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
        }
        if (!z) {
            return (ah) iterable;
        }
        final Iterator<? extends Item> it2 = iterable.iterator();
        return ah.b(new Iterator<ImmutableItem>() { // from class: org.jf.a.k.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it2.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public final ImmutableItem next() {
                return (ImmutableItem) k.this.O(it2.next());
            }

            @Override // java.util.Iterator
            public final void remove() {
                it2.remove();
            }
        });
    }

    public final ao<ImmutableItem> o(Iterable<? extends Item> iterable) {
        if (iterable == null) {
            return ao.fl();
        }
        boolean z = false;
        if (iterable instanceof ao) {
            Iterator<? extends Item> it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!P(it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
        }
        if (!z) {
            return (ao) iterable;
        }
        final Iterator<? extends Item> it2 = iterable.iterator();
        return ao.d(new Iterator<ImmutableItem>() { // from class: org.jf.a.k.2
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it2.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public final ImmutableItem next() {
                return (ImmutableItem) k.this.O(it2.next());
            }

            @Override // java.util.Iterator
            public final void remove() {
                it2.remove();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [org.jf.a.k$3] */
    public final as<ImmutableItem> a(Comparator<? super ImmutableItem> comparator, Iterable<? extends Item> iterable) {
        if (iterable == null) {
            return as.fo();
        }
        boolean z = false;
        if ((iterable instanceof as) && ((as) iterable).comparator().equals(comparator)) {
            Iterator<? extends Item> it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!P(it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
        }
        if (!z) {
            return (as) iterable;
        }
        final Iterator<? extends Item> it2 = iterable.iterator();
        return as.a((Comparator) comparator, (AnonymousClass3) new Iterator<ImmutableItem>() { // from class: org.jf.a.k.3
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it2.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public final ImmutableItem next() {
                return (ImmutableItem) k.this.O(it2.next());
            }

            @Override // java.util.Iterator
            public final void remove() {
                it2.remove();
            }
        });
    }
}