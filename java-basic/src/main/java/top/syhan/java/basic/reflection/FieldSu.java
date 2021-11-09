package top.syhan.java.basic.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java-basic
 * @description: 属性注释
 * @author: SYH
 * @Create: 2021-11-09 20:41
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldSu {
    String columnName();

    String type();

    int length();
}
