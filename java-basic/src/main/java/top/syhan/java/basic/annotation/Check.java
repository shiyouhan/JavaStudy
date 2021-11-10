package top.syhan.java.basic.annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:41
 **/
@Check("hi")
public @interface Check {
    String value();
    int a = 0;
}
