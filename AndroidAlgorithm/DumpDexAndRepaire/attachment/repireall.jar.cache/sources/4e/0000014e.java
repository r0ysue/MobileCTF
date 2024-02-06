package com.b.a.c;

import com.b.a.c.af;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ImmutableSet.java */
/* loaded from: repireall.jar:com/b/a/c/ao.class */
public abstract class ao<E> extends af<E> implements Set<E> {
    @Override // com.b.a.c.af, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> ao<E> fl() {
        return u.jC;
    }

    public static <E> ao<E> w(E e) {
        return new bw(e);
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Object;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/b/a/c/ao<TE;>; */
    public static ao a(org.jf.dexlib2.a.a.a aVar, org.jf.dexlib2.a.a.a aVar2, org.jf.dexlib2.a.a.a aVar3, org.jf.dexlib2.a.a.a aVar4, org.jf.dexlib2.a.a.a aVar5, org.jf.dexlib2.a.a.a aVar6, org.jf.dexlib2.a.a.a... aVarArr) {
        int length = aVarArr.length;
        Object[] objArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        System.arraycopy(aVarArr, 0, objArr, 6, aVarArr.length);
        return a(objArr.length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ao<E> a(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case 0:
                    return u.jC;
                case CAN_THROW:
                    return w(objArr[0]);
                default:
                    int U = U(i);
                    Object[] objArr2 = new Object[U];
                    int i2 = U - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object j = be.j(objArr[i5], i5);
                        int hashCode = j.hashCode();
                        int R = ac.R(hashCode);
                        while (true) {
                            int i6 = R & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                int i7 = i4;
                                i4++;
                                objArr[i7] = j;
                                objArr2[i6] = j;
                                i3 += hashCode;
                            } else if (!obj.equals(j)) {
                                R++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i4, i, (Object) null);
                    if (i4 == 1) {
                        return new bw(objArr[0], i3);
                    }
                    if (U != U(i4)) {
                        i = i4;
                    } else {
                        return new bo(i4 < objArr.length ? be.d(objArr, i4) : objArr, i3, objArr2, i2);
                    }
                    break;
            }
        }
    }

    private static int U(int i) {
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            while (true) {
                int i2 = highestOneBit << 1;
                if (i2 * 0.7d < i) {
                    highestOneBit = i2;
                } else {
                    return i2;
                }
            }
        } else {
            com.b.a.a.i.a(i < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    public static <E> ao<E> d(Iterator<? extends E> it) {
        if (it.hasNext()) {
            E next = it.next();
            if (!it.hasNext()) {
                return w(next);
            }
            return new a().t(next).a(it).fm();
        }
        return u.jC;
    }

    boolean eL() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ao) && eL() && ((ao) obj).eL() && hashCode() != obj.hashCode()) {
            return false;
        }
        return bt.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return bt.b(this);
    }

    /* compiled from: ImmutableSet.java */
    /* loaded from: repireall.jar:com/b/a/c/ao$a.class */
    public static class a<E> extends af.a<E> {
        public a() {
            this(4);
        }

        private a(int i) {
            super(4);
        }

        @Override // com.b.a.c.af.a, com.b.a.c.af.b
        /* renamed from: x */
        public a<E> t(E e) {
            super.t(e);
            return this;
        }

        @Override // com.b.a.c.af.b
        /* renamed from: e */
        public a<E> a(Iterator<? extends E> it) {
            super.a(it);
            return this;
        }

        public ao<E> fm() {
            ao<E> a = ao.a(this.dK, this.jJ);
            this.dK = a.size();
            return a;
        }
    }
}