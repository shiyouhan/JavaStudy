package top.syhan.java.basic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:33
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Persons {
    Person[] value();
}