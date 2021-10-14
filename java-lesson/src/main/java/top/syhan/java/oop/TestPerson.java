package top.syhan.java.oop;

import lombok.experimental.var;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-14 13:07
 **/

public class TestPerson {
    public static void main(String[] args) {
        //调用无参构造方法，公有的setter给属性赋值，公有的getter访问属性的值
        System.out.println("****************************************************");
        Person p1 = new Person();
        p1.setName("Tom");
        p1.setAge(25);
        System.out.println(p1.getName() + "," + p1.getAge());

        System.out.println("****************************************************");
        //调用两个参数的构造方法，以及toString()打印对象 （toString()默认应用）
        Person p2  = new Person("Hello", 35);
        System.out.println(p2);

        System.out.println("****************************************************");
        //调用全构造方法，公有的getter访问属性的值，结合格式化输出打印对象属性
        var p3 = new Person("Jack", 30, 1.8888);
        System.out.printf("%-5s,%2d,%.2f", p3.getName(), p3.getAge(), p3.getHeight());
    }
}
