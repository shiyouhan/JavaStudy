package top.syhan.java.basic.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:44
 **/
public class Hero {
    @Deprecated
    public void say() {
        System.out.println("nothing has to say!");
    }
    public void speak() {
        System.out.println("i have a dream!");
    }
    public void addItems(String item) {
        List<String> items = new ArrayList<>();
        items.add(item);
        System.out.println("i am " + items);
    }
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.addItems("Java⼯程师");
        hero.say();
        hero.speak();
    }
}
