package campaign;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 14:11
 **/
public abstract class Coach extends Person{

    public Coach () {

    }

    public Coach(String name, Integer age) {
        super(name, age);
    }

    public abstract void teach();

}
