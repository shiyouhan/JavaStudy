package campaign;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 10:37
 **/
public abstract class Player extends Person {

    public Player() {

    }

    public Player(String name, Integer age) {
        super(name, age);
    }

    public abstract void sport();
}
