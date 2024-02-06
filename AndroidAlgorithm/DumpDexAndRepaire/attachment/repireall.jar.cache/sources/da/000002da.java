package org.jf.baksmali;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DexInputCommand.java */
/* loaded from: repireall.jar:org/jf/baksmali/e.class */
public abstract class e extends org.jf.a.a.b {
    @org.jf.a.a.d(mZ = {"api"})
    @com.a.a.l(bD = {"-a", "--api"}, bF = "The numeric api level of the file being disassembled.")
    public int qI;
    @org.jf.a.a.d(mZ = {"file"})
    @com.a.a.l(bF = "A dex/apk/oat/odex file. For apk or oat files that contain multiple dex files, you can specify the specific entry to use as if the apk/oat file was a directory. e.g. \"app.apk/classes2.dex\". For more information, see \"baksmali help input\".")
    protected List<String> rb;
    protected File rc;
    private String rd;
    protected org.jf.dexlib2.d.g re;

    public e(List<com.a.a.j> list) {
        super(list);
        this.qI = 15;
        this.rb = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bf(String str) {
        File file;
        File file2 = new File(str);
        while (true) {
            file = file2;
            if (file == null || file.exists()) {
                break;
            }
            file2 = file.getParentFile();
        }
        if (file == null || !file.exists() || file.isDirectory()) {
            System.err.println("Can't find file: " + str);
            System.exit(1);
        }
        this.rc = file;
        String str2 = null;
        if (file.getPath().length() < str.length()) {
            str2 = str.substring(file.getPath().length() + 1);
        }
        String str3 = str2;
        if (!(str3 == null || str3.length() == 0)) {
            boolean z = false;
            if (str2.length() > 2 && str2.charAt(0) == '\"') {
                String str4 = str2;
                if (str4.charAt(str4.length() - 1) == '\"') {
                    str2 = str2.substring(1, str2.length() - 1);
                    z = true;
                }
            }
            this.rd = str2;
            try {
                this.re = org.jf.dexlib2.c.a(file, str2, z, org.jf.dexlib2.f.ag(this.qI));
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            this.re = org.jf.dexlib2.c.a(file, org.jf.dexlib2.f.ag(this.qI));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}