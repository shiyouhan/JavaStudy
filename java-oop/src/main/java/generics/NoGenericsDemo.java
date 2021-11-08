package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-08 21:36
 **/
public class NoGenericsDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");
        list.add(18);
        list.add(new double[] {1.0, 2.0});
        Object obj1 = list.get(0);
        Object obj2 = list.get(1);
        Object obj3 = list.get(2);
        System.out.println("obj1 = [" + obj1 + "]");
        System.out.println("obj2 = [" + obj2 + "]");
        System.out.println("obj3 = [" + obj3 + "]");

        int num1 = (int) list.get(0);
        int num2 = (int) list.get(1);
        int num3 = (int) list.get(2);
        System.out.println("num1 = [" + num1 + "]");
        System.out.println("num2 = [" + num2 + "]");
        System.out.println("num3 = [" + num3 + "]");
    }
}
