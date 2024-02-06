package org.jf.a;

import java.text.DecimalFormat;

/* compiled from: NumberUtils.java */
/* loaded from: repireall.jar:org/jf/a/n.class */
public final class n {
    private static final int FM = Float.floatToRawIntBits(Float.NaN);
    private static final int FN = Float.floatToRawIntBits(Float.MAX_VALUE);
    private static final int FO = Float.floatToRawIntBits(3.1415927f);
    private static final int FP = Float.floatToRawIntBits(2.7182817f);
    private static final long FQ = Double.doubleToRawLongBits(Double.NaN);
    private static final long FR = Double.doubleToLongBits(Double.MAX_VALUE);
    private static final long FS = Double.doubleToLongBits(3.141592653589793d);
    private static final long FT = Double.doubleToLongBits(2.718281828459045d);
    private static final DecimalFormat FU = new DecimalFormat("0.####################E0");

    public static boolean bY(int i) {
        if (i == FM || i == FN || i == FO || i == FP) {
            return true;
        }
        if (i == Integer.MAX_VALUE || i == Integer.MIN_VALUE) {
            return false;
        }
        int i2 = i >> 24;
        int i3 = (i >> 16) & 255;
        int i4 = i & 65535;
        if ((i2 == 127 || i2 == 1) && i3 < 31 && i4 < 4095) {
            return false;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        if (Float.isNaN(intBitsToFloat)) {
            return false;
        }
        String format = FU.format(i);
        String format2 = FU.format(intBitsToFloat);
        String str = format2;
        int indexOf = format2.indexOf(46);
        int indexOf2 = str.indexOf("E");
        int indexOf3 = str.indexOf("000");
        if (indexOf3 > indexOf && indexOf3 < indexOf2) {
            str = str.substring(0, indexOf3) + str.substring(indexOf2);
        } else {
            int indexOf4 = str.indexOf("999");
            if (indexOf4 > indexOf && indexOf4 < indexOf2) {
                str = str.substring(0, indexOf4) + str.substring(indexOf2);
            }
        }
        return str.length() < format.length();
    }

    public static boolean n(long j) {
        if (j == FQ || j == FR || j == FS || j == FT) {
            return true;
        }
        if (j == Long.MAX_VALUE || j == Long.MIN_VALUE) {
            return false;
        }
        double longBitsToDouble = Double.longBitsToDouble(j);
        if (Double.isNaN(longBitsToDouble)) {
            return false;
        }
        String format = FU.format(j);
        String format2 = FU.format(longBitsToDouble);
        String str = format2;
        int indexOf = format2.indexOf(46);
        int indexOf2 = str.indexOf("E");
        int indexOf3 = str.indexOf("000");
        if (indexOf3 > indexOf && indexOf3 < indexOf2) {
            str = str.substring(0, indexOf3) + str.substring(indexOf2);
        } else {
            int indexOf4 = str.indexOf("999");
            if (indexOf4 > indexOf && indexOf4 < indexOf2) {
                str = str.substring(0, indexOf4) + str.substring(indexOf2);
            }
        }
        return str.length() < format.length();
    }
}