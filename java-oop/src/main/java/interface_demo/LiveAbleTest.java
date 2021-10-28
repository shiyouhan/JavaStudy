package interface_demo;

/**
 * Created by Jcean.
 * User: Jcean
 * Date: 2021/10/28
 * Time: 08:30
 * Description: LiveAbleTest
 */
public class LiveAbleTest {
    public static void main(String[] args) {
        Animal liveAble = new Animal();
        liveAble.eat();
        liveAble.sleep();

        liveAble = new People();
        liveAble.eat();
        liveAble.sleep();
        liveAble.defaultMethod();
    }
}
