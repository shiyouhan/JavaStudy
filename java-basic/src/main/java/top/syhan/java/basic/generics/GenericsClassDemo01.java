package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description: 单类型参数的泛型类
 * @author: SYH
 * @Create: 2021-11-06 00:17
 **/
public class GenericsClassDemo01 {
    public static void main(String[] args) {
        Info<Integer> info = new Info<>();
        info.setValue(10);
        System.out.println(info.getValue());

        Info<String> info2 = new Info<>();
        info2.setValue("xyz");
        System.out.println(info2.getValue());
    }
}
