package org.jf.dexlib2.c;

/* compiled from: Label.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/g.class */
public class g {
    h un;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h hVar) {
        this.un = hVar;
    }

    public final int jo() {
        return jp().qq;
    }

    public final h jp() {
        if (this.un == null) {
            throw new IllegalStateException("Cannot get the location of a label that hasn't been placed yet.");
        }
        return this.un;
    }

    public final boolean jq() {
        return this.un != null;
    }
}