package top.syhan.java.oop;

import cn.hutool.core.lang.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 17:02
 **/
public class ListDemo {
    public static void main(String[] args) {
        String[] s = {"aaa", "bbb", "ccc"};
        List<String> list = init(s);
        //单个添加元素
        list.add("ddd");
        printList(list);
        //或者 list.remove(3);
        list.remove("ddd");
        printList(list);
        System.out.println(list.isEmpty());
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
    }

    private static List<String> init(String[] s) {
        return new ArrayList<>(Arrays.asList(s));
    }

    private static void printList(List<String> list) {
        Console.log("list长度：{} ，集合元素:{}", list.size(), list);
    }
}
