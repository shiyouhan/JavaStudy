package interface_demo;

/**
 * Created by Jcean.
 * User: Jcean
 * Date: 2021/10/28
 * Time: 08:29
 * Description: 动物
 */
public class Animal implements LiveAble {
    @Override
    public void eat() {
        System.out.println("动物干饭");
    }

    @Override
    public void sleep() {
        System.out.println("动物睡觉");
    }
}
