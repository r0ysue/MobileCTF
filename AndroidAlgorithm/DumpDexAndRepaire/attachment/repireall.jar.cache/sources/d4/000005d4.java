package org.jf.dexlib2.k;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import org.jf.dexlib2.e;

/* loaded from: repireall.jar:org/jf/dexlib2/k/l.class */
public class l {
    private static int Ba = 0;
    public static HashMap<Integer, a> Bb = null;

    private static void bt(String str) {
        byte[] bArr;
        try {
            String substring = str.substring(str.indexOf("name:") + 5, str.indexOf(",method_idx:"));
            String substring2 = str.substring(str.indexOf("method_idx:") + 11, str.indexOf(",offset:"));
            str.substring(str.indexOf("offset:") + 7, str.indexOf(",code_item_len:"));
            String substring3 = str.substring(str.indexOf("code_item_len:") + 14, str.indexOf(",ins:"));
            String substring4 = str.substring(str.indexOf("ins:") + 4, str.indexOf("}"));
            int parseInt = Integer.parseInt(substring2);
            Integer.parseInt(substring3);
            byte[] decode = Base64.getDecoder().decode(substring4);
            int length = decode.length;
            if (length % 4 != 0) {
                bArr = new byte[((length / 4) + 1) << 2];
                System.arraycopy(decode, 0, bArr, 0, length);
            } else {
                bArr = decode;
            }
            Ba += bArr.length;
            Bb.put(Integer.valueOf(parseInt), new a(parseInt, substring, 0, bArr.length, bArr));
        } catch (Exception e) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            e.printStackTrace();
            System.out.println("=============================================");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.FileNotFoundException] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.FileNotFoundException] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    public final void lW() {
        Bb = new HashMap<>();
        Ba = 0;
        liyh.Be = null;
        liyh.Bf = null;
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            FileInputStream fileInputStream = new FileInputStream(liyh.Bd);
            byte[] bArr = new byte[e.CAN_INITIALIZE_REFERENCE];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
            if (liyh.Be == null) {
                liyh.Be = byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream = fileInputStream;
            byteArrayOutputStream.close();
        } catch (FileNotFoundException e) {
            byteArrayOutputStream.printStackTrace();
        } catch (IOException e2) {
            byteArrayOutputStream.printStackTrace();
        }
        File file = new File(liyh.Bd + "_fart");
        if (file.exists()) {
            file.delete();
        }
        String str = "";
        String bu = bu(liyh.Bc);
        for (int i = 0; i < bu.length(); i++) {
            if (bu.charAt(i) == '{') {
                if (str.length() > 2) {
                    bt(str);
                }
                str = "{";
            } else if (bu.charAt(i) != '}') {
                str = str + bu.charAt(i);
            } else if (bu.charAt(i) == '}') {
                bt(str + "}");
                str = "";
            } else {
                System.out.println(bu.charAt(i));
            }
        }
        liyh.Bf = ByteBuffer.allocate(liyh.Be.length + Ba);
        if (liyh.Be != null) {
            liyh.Bf.put(liyh.Be);
            for (Map.Entry<Integer, a> entry : Bb.entrySet()) {
                entry.getKey().intValue();
                a value = entry.getValue();
                byte[] bArr2 = value.AZ;
                if (value.AY > 0) {
                    int position = liyh.Bf.position();
                    if (position > 0) {
                        value.an = position;
                    }
                    liyh.Bf.put(bArr2);
                }
            }
        }
        ByteBuffer byteBuffer = liyh.Bf;
        ?? r0 = byteBuffer;
        if (byteBuffer != null) {
            r0 = liyh.Bf.position(0);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(liyh.Bd + "_fart"));
            fileOutputStream.write(liyh.Bf.array());
            r0 = fileOutputStream;
            r0.close();
        } catch (FileNotFoundException e3) {
            r0.printStackTrace();
        } catch (IOException e4) {
            r0.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.FileNotFoundException] */
    private static String bu(String str) {
        File file = new File(str);
        ?? r0 = new byte[Long.valueOf(file.length()).intValue()];
        try {
            ?? fileInputStream = new FileInputStream(file);
            fileInputStream.read(r0);
            r0 = fileInputStream;
            r0.close();
        } catch (FileNotFoundException e) {
            r0.printStackTrace();
        } catch (IOException e2) {
            r0.printStackTrace();
        }
        try {
            return new String((byte[]) r0, "UTF-8");
        } catch (UnsupportedEncodingException e3) {
            System.err.println("The OS does not support UTF-8");
            e3.printStackTrace();
            return null;
        }
    }

    public static void main(String[] strArr) {
    }
}