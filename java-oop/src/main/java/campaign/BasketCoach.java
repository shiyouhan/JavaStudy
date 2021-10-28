package campaign;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 14:18
 **/
public class BasketCoach extends Coach{

    public BasketCoach() {

    }

    public BasketCoach(String name,Integer age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教运球和篮球");
    }

    @Override
    public void eat() {
        System.out.println("吃肉喝酒");
    }
}
