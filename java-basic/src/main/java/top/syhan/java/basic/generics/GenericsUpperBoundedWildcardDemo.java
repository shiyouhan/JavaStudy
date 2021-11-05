package top.syhan.java.basic.generics;

import ch.qos.logback.core.pattern.ConverterUtil;

import java.util.Arrays;
import java.util.List;

/**
 * @program: java-basic
 * @description: 上界通配符
 * @author: SYH
 * @Create: 2021-11-05 23:59
 **/
public class GenericsUpperBoundedWildcardDemo {
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n: list) {
            s += n.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));
    }
}
