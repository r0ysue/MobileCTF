package org.jf.a.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ExtendedParameters.java */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: repireall.jar:org/jf/a/a/e.class */
public @interface e {
    boolean na() default false;

    String nb();

    String[] nc() default {};

    String nd() default "";
}