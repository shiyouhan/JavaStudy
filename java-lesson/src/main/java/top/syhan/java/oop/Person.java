package top.syhan.java.oop;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-14 13:05
 **/
public class Person {
    private String name;
    private Integer age;
    private Double height;

    public Person(){

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ",height=" + height +
                '}';
    }
}
