package generics;

import java.security.SecureRandom;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-09 14:40
 **/
public class GenericsDemo4 {
    public static void main(String[] args) {
        Generic<Integer> gInteger = new Generic<>(123);
        Generic<Number> gNumber = new Generic<Number>(123);
        getValueByT(gInteger);
        getValueByT(gNumber);
    }

    public static void getValueByT(Generic<?> obj) {
        System.out.println(obj.getKey());
    }

//    public static void getValueByInteger(Generic<Integer> obj) {
//        System.out.println(obj.getKey());
//    }
//
//    public static void getValueByNumber(Generic<Number> obj) {
//        System.out.println(obj.getKey());
//    }
}
