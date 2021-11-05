package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description: 泛型方法
 * @author: SYH
 * @Create: 2021-11-05 23:56
 **/
public class GenericsMethodDemo01 {
    public static <T> void printClass(T obj) {
        System.out.println(obj.getClass().toString());
    }

    public static void main(String[] args) {
        printClass("abc");
        printClass(10);
    }
}
