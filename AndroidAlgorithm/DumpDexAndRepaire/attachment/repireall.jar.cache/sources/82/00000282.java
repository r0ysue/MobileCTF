package org.jf.a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ConsoleUtil.java */
/* loaded from: repireall.jar:org/jf/a/h.class */
public final class h {
    public static int mU() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            try {
                String f = f(new String[]{"mode", "con"});
                if (f != null) {
                    Matcher matcher = Pattern.compile("Columns:[ \t]*(\\d+)").matcher(f);
                    if (!matcher.find()) {
                        return 80;
                    }
                    return Integer.parseInt(matcher.group(1));
                }
                return 80;
            } catch (Exception unused) {
                return 80;
            }
        }
        try {
            String f2 = f(new String[]{"sh", "-c", "stty size < /dev/tty"});
            if (f2 == null) {
                return 80;
            }
            String[] split = f2.split(" ");
            if (split.length < 2) {
                return 80;
            }
            return Integer.parseInt(split[1]);
        } catch (Exception unused2) {
            return 80;
        }
    }

    private static String f(String[] strArr) {
        StringBuffer stringBuffer = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                stringBuffer.append(readLine);
            }
            if (stringBuffer != null) {
                return stringBuffer.toString();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}