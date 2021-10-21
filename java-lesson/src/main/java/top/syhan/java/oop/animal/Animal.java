package top.syhan.java.oop.animal;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:46
 **/
public abstract class Animal {
    protected String name;
    protected String feature;

    public Animal(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }

    /**
     * 抽象方法
     */
    public abstract  void  beasts();

    public Animal() {

    }
}
