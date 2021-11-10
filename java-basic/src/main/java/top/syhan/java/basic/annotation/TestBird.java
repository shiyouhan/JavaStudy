package top.syhan.java.basic.annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 16:16
 **/
public class TestBird {
    public static void main(String[] args) {
        Bird bird = BirdNest.Sparrow.reproduce();
        Desc.Color color = bird.getColor();
        System.out.println("Bird's color is :" + color);
    }
}
