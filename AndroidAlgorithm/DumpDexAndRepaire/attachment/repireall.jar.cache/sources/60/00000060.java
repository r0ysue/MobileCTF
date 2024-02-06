package antlr.preprocessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;

/* loaded from: repireall.jar:antlr/preprocessor/Tool.class */
public class Tool {
    private c ez;
    private String eA;
    private String[] aX;
    private int eB;
    private antlr.a.a.f eC;
    private antlr.Tool k;

    public Tool(antlr.Tool tool, String[] strArr) {
        this.k = tool;
        this.eB = 0;
        this.aX = new String[strArr.length];
        int i = 0;
        while (i < strArr.length) {
            if (strArr[i].length() == 0) {
                antlr.Tool tool2 = this.k;
                antlr.Tool.J("Zero length argument ignoring...");
            } else if (strArr[i].equals("-glib")) {
                if (File.separator.equals("\\") && strArr[i].indexOf(47) != -1) {
                    antlr.Tool tool3 = this.k;
                    antlr.Tool.J("-glib cannot deal with '/' on a PC: use '\\'; ignoring...");
                } else {
                    antlr.Tool tool4 = this.k;
                    this.eC = antlr.Tool.a(strArr[i + 1], ';');
                    i++;
                }
            } else if (strArr[i].equals("-o")) {
                String[] strArr2 = this.aX;
                int i2 = this.eB;
                this.eB = i2 + 1;
                strArr2[i2] = strArr[i];
                if (i + 1 >= strArr.length) {
                    this.k.B("missing output directory with -o option; ignoring");
                } else {
                    i++;
                    String[] strArr3 = this.aX;
                    int i3 = this.eB;
                    this.eB = i3 + 1;
                    strArr3[i3] = strArr[i];
                    this.k.H(strArr[i]);
                }
            } else if (strArr[i].charAt(0) == '-') {
                String[] strArr4 = this.aX;
                int i4 = this.eB;
                this.eB = i4 + 1;
                strArr4[i4] = strArr[i];
            } else {
                this.eA = strArr[i];
                if (this.eC == null) {
                    this.eC = new antlr.a.a.f(10);
                }
                this.eC.a(this.eA);
                if (i + 1 < strArr.length) {
                    antlr.Tool tool5 = this.k;
                    antlr.Tool.J("grammar file must be last; ignoring other arguments...");
                    return;
                }
            }
            i++;
        }
    }

    public static void main(String[] strArr) {
        Tool tool = new Tool(new antlr.Tool(), strArr);
        tool.bB();
        for (String str : tool.bC()) {
            System.out.print(new StringBuffer(" ").append(str).toString());
        }
        System.out.println();
    }

    public final boolean bB() {
        if (this.eA == null) {
            antlr.Tool tool = this.k;
            antlr.Tool.I("no grammar file specified");
            return false;
        }
        if (this.eC != null) {
            this.ez = new c(this.k);
            Enumeration bb = this.eC.bb();
            while (bb.hasMoreElements()) {
                String str = (String) bb.nextElement();
                try {
                    this.ez.Z(str);
                } catch (FileNotFoundException unused) {
                    antlr.Tool tool2 = this.k;
                    antlr.Tool.I(new StringBuffer("file ").append(str).append(" not found").toString());
                    return false;
                }
            }
        }
        if (!this.ez.bl()) {
            return false;
        }
        this.ez.W(this.eA);
        b X = this.ez.X(this.eA);
        String U = X.U(this.eA);
        if (U.equals(this.eA)) {
            String[] strArr = this.aX;
            int i = this.eB;
            this.eB = i + 1;
            strArr[i] = this.eA;
            return true;
        }
        try {
            X.bi();
            String[] strArr2 = this.aX;
            int i2 = this.eB;
            this.eB = i2 + 1;
            strArr2[i2] = new StringBuffer().append(this.k.aU()).append(System.getProperty("file.separator")).append(U).toString();
            return true;
        } catch (IOException unused2) {
            antlr.Tool tool3 = this.k;
            antlr.Tool.I(new StringBuffer("cannot write expanded grammar file ").append(U).toString());
            return false;
        }
    }

    public final String[] bC() {
        String[] strArr = new String[this.eB];
        System.arraycopy(this.aX, 0, strArr, 0, this.eB);
        this.aX = strArr;
        return this.aX;
    }
}