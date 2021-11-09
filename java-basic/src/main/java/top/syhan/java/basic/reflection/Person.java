package top.syhan.java.basic.reflection;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-09 20:59
 **/
public class Person {
    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public static void getPerson() {
        System.out.println("I am a person.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
