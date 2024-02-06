package org.jf.dexlib2.c;

import org.jf.dexlib2.e.b.p;

/* compiled from: BuilderSwitchPayload.java */
/* loaded from: repireall.jar:org/jf/dexlib2/c/e.class */
public abstract class e extends c implements p {
    h us;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(org.jf.dexlib2.e eVar) {
        super(eVar);
    }

    public final h jk() {
        if (this.us == null) {
            throw new IllegalStateException("The referrer has not been set yet");
        }
        return this.us;
    }
}