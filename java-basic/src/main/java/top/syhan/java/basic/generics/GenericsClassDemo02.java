package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description: 多类型参数的泛型类
 * @author: SYH
 * @Create: 2021-11-06 00:25
 **/
public class GenericsClassDemo02 {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>(1, "one");
        System.out.println(map);
    }
}
