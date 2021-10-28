package campaign;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 10:29
 **/
public abstract class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

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

    public abstract void eat();

    @Override
    public String toString(){
        return String.format("姓名: %s, 年龄: %s", this.name, this.age);
    }
}
