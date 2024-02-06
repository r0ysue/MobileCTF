package antlr;

import java.io.IOException;
import java.io.Reader;

/* compiled from: CharBuffer.java */
/* loaded from: repireall.jar:antlr/t.class */
public final class t extends ap {
    private transient Reader al;

    public t(Reader reader) {
        this.al = reader;
    }

    @Override // antlr.ap
    public final void e(int i) throws y {
        try {
            aD();
            while (this.bN.ao < i + this.bL) {
                this.bN.b((char) this.al.read());
            }
        } catch (IOException e) {
            throw new z(e);
        }
    }
}