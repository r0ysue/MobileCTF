package antlr;

import java.io.IOException;

/* compiled from: TokenStreamIOException.java */
/* loaded from: repireall.jar:antlr/ca.class */
public final class ca extends bz {
    private IOException aF;

    public ca(IOException iOException) {
        super(iOException.getMessage());
        this.aF = iOException;
    }
}