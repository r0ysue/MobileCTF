package org.jf.dexlib2.e;

import java.io.IOException;
import java.util.List;
import org.jf.dexlib2.e.d;

/* compiled from: MultiDexContainer.java */
/* loaded from: repireall.jar:org/jf/dexlib2/e/j.class */
public interface j<T extends d> {

    /* compiled from: MultiDexContainer.java */
    /* loaded from: repireall.jar:org/jf/dexlib2/e/j$a.class */
    public interface a extends d {
        j<? extends a> lc();
    }

    List<String> hY() throws IOException;

    T bg(String str) throws IOException;
}