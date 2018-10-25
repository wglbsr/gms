package com.dyny.gms.annotation;

import java.lang.annotation.*;

/**
 * @author:wanggl
 * @date:2018-10-25
 * @version:1.0.0
 */
@Deprecated
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Intercepted {
    boolean multiple() default true;

    Class pojoClass() default Object.class;

    String propertyName() default "";
}
