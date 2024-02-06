package fart;

import java.io.File;
import java.util.ArrayList;
import org.jf.dexlib2.c;
import org.jf.dexlib2.d.g;
import org.jf.dexlib2.f;
import org.jf.dexlib2.g.e;
import org.jf.dexlib2.g.o;
import org.jf.dexlib2.g.p;
import org.jf.dexlib2.k.l;
import org.jf.dexlib2.k.liyh;

/* loaded from: repireall.jar:fart/Main.class */
public class Main {
    private static void gp() {
        System.out.println("useage: java -jar repireall folderpath");
        System.exit(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, java.lang.Exception] */
    private static int aI(String str) {
        ?? parseInt;
        try {
            parseInt = Integer.parseInt(str.substring(0, str.indexOf("_")));
            return parseInt;
        } catch (Exception e) {
            parseInt.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    public static void main(String[] strArr) {
        System.out.println("Made By hanbingle for FART脱壳王课程，欢迎报名学习加固核心原理、脱壳攻防实战相关内容！微信搜索“大数据安全技术学习”公众号查看课程内容。");
        if (strArr.length <= 0) {
            gp();
            return;
        }
        File file = new File(strArr[0]);
        if (!file.exists() || !file.isDirectory()) {
            gp();
            return;
        }
        System.out.println("Start Repire all dexfile,Plase wait......");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        for (int i = 0; i < length; i++) {
            ?? r0 = listFiles[i];
            try {
                r0 = r0.isDirectory();
                if (r0 == 0) {
                    String name = r0.getName();
                    if (!name.contains("repired")) {
                        if (name.endsWith(".bin")) {
                            arrayList.add(r0.getAbsolutePath());
                        }
                        if (name.endsWith(".dex")) {
                            arrayList2.add(r0.getAbsolutePath());
                        }
                    }
                }
            } catch (Exception e) {
                r0.printStackTrace();
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ?? r02 = (String) arrayList.get(i2);
            try {
                r02 = aI(new File((String) r02).getName());
                if (r02 != -1) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        String str = (String) arrayList2.get(i3);
                        if (aI(new File(str).getName()) == r02) {
                            System.out.println("start repire dexfile:" + str + "->with insfile:" + ((String) r02));
                            new liyh();
                            liyh.Bc = r02;
                            liyh.Bd = str;
                            if (liyh.Bc == null || liyh.Bd == null) {
                                System.out.println("folder is not invalid,dex file is not exist!!\n");
                            } else {
                                new l().lW();
                                try {
                                    g a = c.a(new File(liyh.Bd + "_fart"), f.hZ());
                                    File file2 = new File(liyh.Bd + "_fart");
                                    if (file2.exists()) {
                                        file2.delete();
                                    }
                                    e eVar = new e(new p() { // from class: fart.Main.1
                                        @Override // org.jf.dexlib2.g.p
                                        public final o<String> gq() {
                                            return new o<String>() { // from class: fart.Main.1.1
                                                @Override // org.jf.dexlib2.g.o
                                                public final /* bridge */ /* synthetic */ String E(String str2) {
                                                    return str2;
                                                }
                                            };
                                        }
                                    });
                                    File file3 = new File(str);
                                    String str2 = file3.getParentFile().getParent() + "/repire";
                                    System.out.println("repiredfolder->" + str2);
                                    try {
                                        new File(str2).mkdir();
                                    } catch (Exception unused) {
                                    }
                                    String str3 = str2 + "/" + file3.getName() + "_repired.dex";
                                    File file4 = new File(str3);
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                    c.a(str3, eVar.b(a));
                                    System.out.println("success repire->" + str3);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                r02.printStackTrace();
            }
        }
        System.out.println("Repire all dexfile end!Please enjoy!");
    }
}