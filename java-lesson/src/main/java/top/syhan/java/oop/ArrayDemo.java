package top.syhan.java.oop;

import java.util.Arrays;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 16:19
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[10];
        arr2 = Arrays.copyOf(arr1, arr2.length);
        int[] result = Arrays.copyOf(arr1,2);
        System.out.println(Arrays.toString(result)); //[1, 2]
        System.out.println(Arrays.toString(arr2)); //[1, 2, 3, 4, 5, 6]
        System.out.println(arr2.length); //6
    }
}
