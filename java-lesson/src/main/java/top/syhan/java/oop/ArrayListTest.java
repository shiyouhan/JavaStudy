package top.syhan.java.oop;

import java.util.List;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-11-04 11:01
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        List<Integer> list1 = new java.util.ArrayList();

        boolean add = list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("add: " + add);

        list.remove(1);
        list.forEach(i ->
                System.out.println("remove: " + i));

        list1.add(3);
        list.addAll(list1);

        list1.clear();

        list1.forEach(i ->
                System.out.println(i));

        System.out.println("list1数组是否为空: " + list1.isEmpty());

        int size = list.size();
        System.out.println("list数组长度为: " + size);

        Object[] objects =  list.toArray();
        for (Object i :objects){
            System.out.println("toArray: " + i);
        }

        boolean contains = list.contains(3);
        System.out.println("数组是包含元素3 : " + contains);
    }

}
