package top.syhan.java.oop.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: java-lesson
 * @description: SetDemo
 * @author: SYH
 * @Create: 2021-11-09 19:30
 **/
public class SetDemo1 {

    public static void main(String[] args) {
        Student[] students = {
                new Student(111,"aaa"),
                new Student(333,"ccc"),
                new Student(111,"aaa"),
                new Student(222,"bbb"),
                new Student(444,"ddd"),
        };
//        Set<Student> set1 = new HashSet<>(Arrays.asList(students));
        Set<Student> set1 = new TreeSet<>(Arrays.asList(students));
        set1.forEach(System.out::println);


//        Set<String> set1 = new TreeSet<>();
//        set1.add("aaa");
//        set1.add("bbb");
//        set1.add("ccc");
//        set1.add("ddd");
//        System.out.println(set1);
    }
}
