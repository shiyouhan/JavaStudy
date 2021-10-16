package top.syhan.java.basic.oop;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-10-15 20:18
 **/
public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
