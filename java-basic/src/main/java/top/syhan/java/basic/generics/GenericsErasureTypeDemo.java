package top.syhan.java.basic.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-basic
 * @description: 类型擦除
 * @author: SYH
 * @Create: 2021-11-05 23:39
 **/
public class GenericsErasureTypeDemo {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
    }
    
}
