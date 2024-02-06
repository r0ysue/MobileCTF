package com.b.a.c;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SortedLists.java */
/* loaded from: repireall.jar:com/b/a/c/bz.class */
final class bz {

    /* compiled from: SortedLists.java */
    /* loaded from: repireall.jar:com/b/a/c/bz$a.class */
    public enum a {
        NEXT_LOWER { // from class: com.b.a.c.bz.a.1
            @Override // com.b.a.c.bz.a
            final int resultIndex(int i) {
                return i - 1;
            }
        },
        NEXT_HIGHER { // from class: com.b.a.c.bz.a.2
            @Override // com.b.a.c.bz.a
            public final int resultIndex(int i) {
                return i;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.b.a.c.bz.a.3
            @Override // com.b.a.c.bz.a
            public final int resultIndex(int i) {
                return i ^ (-1);
            }
        };

        abstract int resultIndex(int i);
    }

    /* compiled from: SortedLists.java */
    /* loaded from: repireall.jar:com/b/a/c/bz$b.class */
    public enum b {
        ANY_PRESENT { // from class: com.b.a.c.bz.b.1
            @Override // com.b.a.c.bz.b
            final <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        },
        LAST_PRESENT { // from class: com.b.a.c.bz.b.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.b.a.c.bz.b
            final <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = i;
                int size = list.size() - 1;
                while (i2 < size) {
                    int i3 = ((i2 + size) + 1) >>> 1;
                    if (comparator.compare((E) list.get(i3), e) > 0) {
                        size = i3 - 1;
                    } else {
                        i2 = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_PRESENT { // from class: com.b.a.c.bz.b.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.b.a.c.bz.b
            final <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                int i3 = i;
                while (i2 < i3) {
                    int i4 = (i2 + i3) >>> 1;
                    if (comparator.compare((E) list.get(i4), e) < 0) {
                        i2 = i4 + 1;
                    } else {
                        i3 = i4;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER { // from class: com.b.a.c.bz.b.4
            @Override // com.b.a.c.bz.b
            public final <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return LAST_PRESENT.resultIndex(comparator, e, list, i) + 1;
            }
        },
        LAST_BEFORE { // from class: com.b.a.c.bz.b.5
            @Override // com.b.a.c.bz.b
            public final <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return FIRST_PRESENT.resultIndex(comparator, e, list, i) - 1;
            }
        };

        abstract <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
    }

    public static <E> int a(List<? extends E> list, E e, Comparator<? super E> comparator, b bVar, a aVar) {
        com.b.a.a.i.i(comparator);
        com.b.a.a.i.i(list);
        com.b.a.a.i.i(bVar);
        com.b.a.a.i.i(aVar);
        if (!(list instanceof RandomAccess)) {
            list = ax.j(list);
        }
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, (E) list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare > 0) {
                i = i2 + 1;
            } else {
                return i + bVar.resultIndex(comparator, e, list.subList(i, size + 1), i2 - i);
            }
        }
        return aVar.resultIndex(i);
    }
}