package antlr.debug.misc;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;

/* compiled from: JTreeASTPanel.java */
/* loaded from: repireall.jar:antlr/debug/misc/c.class */
public final class c extends JPanel {
    private JTree dZ;

    public c(TreeModel treeModel, TreeSelectionListener treeSelectionListener) {
        setLayout(new BorderLayout());
        this.dZ = new JTree(treeModel);
        this.dZ.putClientProperty("JTree.lineStyle", "Angled");
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.getViewport().add(this.dZ);
        add(jScrollPane, "Center");
    }
}