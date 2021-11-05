package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description: 类型边界
 * @author: SYH
 * @Create: 2021-11-05 23:43
 **/
public class GenericsExtendsDemo01 {
    static <T extends Comparable<T>> T max(T x, T y,T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(3,4,5));
        System.out.println(max(6.6,8.8,7.7));
        System.out.println(max("pear","apple","orange"));
    }
}
