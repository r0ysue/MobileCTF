package org.jf.dexlib2.i.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import org.jf.a.o;
import org.jf.a.p;

/* compiled from: FileDataStore.java */
/* loaded from: repireall.jar:org/jf/dexlib2/i/a/d.class */
public final class d implements c {
    private final RandomAccessFile Eo;

    public d(File file) throws FileNotFoundException, IOException {
        this.Eo = new RandomAccessFile(file, "rw");
        this.Eo.setLength(0L);
    }

    @Override // org.jf.dexlib2.i.a.c
    public final OutputStream bL(int i) {
        return new p(this.Eo, i);
    }

    @Override // org.jf.dexlib2.i.a.c
    public final InputStream bM(int i) {
        return new o(this.Eo, i);
    }

    @Override // org.jf.dexlib2.i.a.c
    public final void close() throws IOException {
        this.Eo.close();
    }
}