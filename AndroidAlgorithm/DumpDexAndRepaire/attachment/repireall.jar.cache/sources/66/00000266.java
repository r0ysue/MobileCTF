package org.antlr.stringtemplate.misc;

import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import org.antlr.stringtemplate.c;
import org.antlr.stringtemplate.e;

/* loaded from: repireall.jar:org/antlr/stringtemplate/misc/StringTemplateTreeView.class */
public class StringTemplateTreeView extends JFrame {
    private StringTemplateTreeView(String str, c cVar) {
        super(str);
        getContentPane().add(new b(new a(cVar), null), "Center");
        addWindowListener(new WindowAdapter(this) { // from class: org.antlr.stringtemplate.misc.StringTemplateTreeView.1
            private final StringTemplateTreeView pn;

            {
                this.pn = this;
            }
        });
        setSize(200, 300);
    }

    public static void main(String[] strArr) {
        e eVar = new e("dummy");
        c g = eVar.g("bold", "<b>$attr$</b>");
        eVar.g("banner", "the banner");
        c cVar = new c(eVar, "<html>\n$banner(a=b)$<p><b>$name$:$email$</b>$if(member)$<i>$fontTag$member</font></i>$endif$");
        cVar.d("name", "Terence");
        cVar.d("name", "Tom");
        cVar.d("email", "parrt@cs.usfca.edu");
        cVar.d("templateAttr", g);
        new StringTemplateTreeView("StringTemplate JTree Example", cVar).setVisible(true);
    }
}