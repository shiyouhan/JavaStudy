package top.syhan.java.oop.animal;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:52
 **/
public class Main {
    public static void main(String[] args) {
        Animal animal = new Pig("猪猪", "杂食性");
        animal.beasts();
        animal = new Cow("牛牛", "草食性");
        animal.beasts();
    }
}
