package com.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: DynamicParameter.java */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: repireall.jar:com/a/a/a.class */
public @interface a {
    String[] bD() default {};

    boolean bE() default false;

    String bF() default "";

    String bG() default "";

    boolean bH() default false;

    Class<? extends d> bI() default com.a.a.c.a.class;

    String bJ() default "=";

    Class<? extends h> bK() default com.a.a.c.b.class;
}