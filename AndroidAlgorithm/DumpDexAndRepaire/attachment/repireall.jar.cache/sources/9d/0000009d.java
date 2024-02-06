package com.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Parameters.java */
@Target({ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: repireall.jar:com/a/a/p.class */
public @interface p {
    String cy() default "";

    String cz() default " ";

    String cA() default "-";

    String cB() default "";

    String cC() default "";

    boolean bH() default false;
}