package top.syhan.java.basic.annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 16:15
 **/
@Desc(c = Desc.Color.White)
abstract class Bird {
    public abstract Desc.Color getColor();
}
