package top.syhan.java.basic.annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 16:15
 **/
public class Sparrow extends Bird {
    private Desc.Color color;
    /**
     * 默认是浅灰⾊
     */
    public Sparrow() {
        color = Desc.Color.Grayish;
    }
    /**
     * 构造函数定义⻦的颜⾊
     *
     * @param color1 ⼊参
     */
    public Sparrow(Desc.Color color1) {
        color = color1;
    }
    @Override
    public Desc.Color getColor() {
        return color;
    }
}

