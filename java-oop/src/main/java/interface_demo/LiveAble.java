package interface_demo;

/**
 * Created by Jcean.
 * User: Jcean
 * Date: 2021/10/28
 * Time: 08:28
 * Description: 生物
 */
public interface LiveAble {
    /**
     * 吃
     */
    void eat();

    /**
     * 睡
     */
    void sleep();

    /**
     *
     */
    default void defaultMethod() {
        System.out.println("接口默认方法");
    }
}
