package top.syhan.java.basic.oop;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-10-15 20:19
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(21, "Shi");
        Person p1 = p;

        System.out.println(p);
        System.out.println(p1);
    }
}
