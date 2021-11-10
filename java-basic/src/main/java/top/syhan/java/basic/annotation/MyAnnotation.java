package top.syhan.java.basic.annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:26
 **/
public @interface MyAnnotation {
    // 定义公共的final静态属性
    int age = 25;
    // 定义公共的抽象⽅法
    String name();
}
