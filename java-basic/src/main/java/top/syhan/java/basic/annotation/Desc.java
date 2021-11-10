package top.syhan.java.basic.annotation;

import java.lang.annotation.*;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:28
 **/
@Retention(RetentionPolicy.RUNTIME)//注解可以保留到程序运⾏时，加载到JVM中
@Target(ElementType.TYPE)//给⼀个类型进⾏注解，⽐如类、接⼝、枚举
@Inherited //⼦类继承⽗类时，注解会起作⽤
public @interface Desc {
    enum Color {
        White, Grayish, Yellow
    }
    // 默认颜⾊是⽩⾊的
    Color c() default Color.White;
}
