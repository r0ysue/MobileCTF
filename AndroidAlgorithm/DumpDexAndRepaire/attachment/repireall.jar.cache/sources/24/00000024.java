package antlr;

import java.util.StringTokenizer;
import java.util.Vector;

/* compiled from: NameSpace.java */
/* loaded from: repireall.jar:antlr/az.class */
public final class az {
    private Vector cu = new Vector();
    private String cv;

    public az(String str) {
        this.cv = new String(str);
        StringTokenizer stringTokenizer = new StringTokenizer(str, "::");
        while (stringTokenizer.hasMoreTokens()) {
            this.cu.addElement(stringTokenizer.nextToken());
        }
    }
}