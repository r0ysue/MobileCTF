package antlr.debug.misc;

import antlr.ab;
import antlr.i;
import javax.swing.JFrame;
import javax.swing.event.TreeSelectionListener;

/* loaded from: repireall.jar:antlr/debug/misc/ASTFrame.class */
public class ASTFrame extends JFrame {

    /* loaded from: repireall.jar:antlr/debug/misc/ASTFrame$a.class */
    class a implements TreeSelectionListener {
        private final ASTFrame dY;

        a(ASTFrame aSTFrame) {
            this.dY = aSTFrame;
        }
    }

    private ASTFrame(String str, ab abVar) {
        super(str);
        new a(this);
        getContentPane().add(new c(new b(abVar), null), "Center");
        addWindowListener(new antlr.debug.misc.a(this));
        setSize(200, 300);
    }

    public static void main(String[] strArr) {
        i iVar = new i();
        ab abVar = (ab) iVar.a(0, "ROOT");
        abVar.a((ab) iVar.a(0, "C1"));
        abVar.a((ab) iVar.a(0, "C2"));
        abVar.a((ab) iVar.a(0, "C3"));
        new ASTFrame("AST JTree Example", abVar).setVisible(true);
    }
}