package static_demo;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-29 16:12
 **/
public class Student {

    private String name;

    public static String schoolName = "WXIT";

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    public void show() {
        System.out.println(name + '+' + schoolName);
    }

    public static void print() {
        System.out.println(schoolName);
//        System.out.println(this.name);
    }
}
