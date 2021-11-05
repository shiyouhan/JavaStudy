package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description: 泛型类的类型嵌套
 * @author: SYH
 * @Create: 2021-11-06 00:26
 **/
public class GenericsClassDemo03 {
    public static void main(String[] args) {
        Info<String> info = new Info<>("Hello");
        MyMap<Integer, Info<String>> map = new MyMap<>(1, info);
        System.out.println(map);
    }
}
