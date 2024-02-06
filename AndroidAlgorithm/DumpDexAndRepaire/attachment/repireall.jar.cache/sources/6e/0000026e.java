package org.antlr.stringtemplate.misc;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;

/* compiled from: JTreeStringTemplatePanel.java */
/* loaded from: repireall.jar:org/antlr/stringtemplate/misc/b.class */
public final class b extends JPanel {
    private JTree dZ;

    public b(TreeModel treeModel, TreeSelectionListener treeSelectionListener) {
        setLayout(new BorderLayout());
        this.dZ = new JTree(treeModel);
        this.dZ.putClientProperty("JTree.lineStyle", "Angled");
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.getViewport().add(this.dZ);
        add(jScrollPane, "Center");
    }
}