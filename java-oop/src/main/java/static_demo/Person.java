package static_demo;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-29 16:54
 **/
public class Person {

    private String name;

    static {
        System.out.println("静态代码快");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public static void main(String[] args) {
        Person aaa = new Person("aaa");
    }
}
