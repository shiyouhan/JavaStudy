package interface_demo;

/**
 * Created by Jcean.
 * User: Jcean
 * Date: 2021/10/28
 * Time: 08:32
 * Description: 人
 */
public class People extends Animal {
    @Override
    public void eat() {
        System.out.println("人干饭");
    }

    @Override
    public void sleep() {
        System.out.println("人睡觉");
    }
}
