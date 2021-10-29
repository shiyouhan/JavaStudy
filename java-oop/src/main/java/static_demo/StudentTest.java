package static_demo;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-29 16:22
 **/
public class StudentTest {
    private static String info = "info";

    public static void main(String[] args) {

        System.out.println(info);

        Student student1 = new Student("张三");
        Student student2 = new Student("李四");
        Student student3 = new Student("王五");
    }

    public void test() {
        final String info = "info";
        System.out.println(info);
    }
}
