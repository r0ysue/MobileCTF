package com.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Parameter.java */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: repireall.jar:com/a/a/l.class */
public @interface l {
    String[] bD() default {};

    String bF() default "";

    boolean bE() default false;

    String bG() default "";

    int bW() default -1;

    boolean bX() default false;

    Class<? extends f<?>> bY() default com.a.a.a.l.class;

    Class<? extends f<?>> bZ() default com.a.a.a.l.class;

    boolean bH() default false;

    Class<? extends d> bI() default com.a.a.c.a.class;

    Class<? extends h> bK() default com.a.a.c.b.class;

    boolean ca() default false;

    Class<? extends com.a.a.a.h> cb() default com.a.a.a.d.class;

    boolean cc() default false;

    boolean cd() default false;

    boolean ce() default false;
}