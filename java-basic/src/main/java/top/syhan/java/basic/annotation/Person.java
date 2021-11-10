package top.syhan.java.basic.annotation;

import java.lang.annotation.Repeatable;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:33
 **/
@Repeatable(Persons.class)
public @interface Person{
    String role() default "";
}
