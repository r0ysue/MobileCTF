package antlr;

import java.io.IOException;

/* compiled from: CharStreamIOException.java */
/* loaded from: repireall.jar:antlr/z.class */
public final class z extends y {
    public IOException aF;

    public z(IOException iOException) {
        super(iOException.getMessage());
        this.aF = iOException;
    }
}