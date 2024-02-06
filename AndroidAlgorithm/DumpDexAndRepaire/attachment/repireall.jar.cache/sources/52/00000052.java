package antlr.debug.misc;

import javax.swing.tree.TreeModel;

/* compiled from: JTreeASTModel.java */
/* loaded from: repireall.jar:antlr/debug/misc/b.class */
public final class b implements TreeModel {
    private antlr.a.a A;

    public b(antlr.a.a aVar) {
        this.A = null;
        if (aVar == null) {
            throw new IllegalArgumentException("root is null");
        }
        this.A = aVar;
    }
}