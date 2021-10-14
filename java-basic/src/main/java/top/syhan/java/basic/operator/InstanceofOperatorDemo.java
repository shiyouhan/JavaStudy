package top.syhan.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: Instanceof操作符示例
 * @author: SYH
 * @Create: 2021-09-28 20:59
 **/
@Slf4j
public class InstanceofOperatorDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        boolean result = animal instanceof Cat;
        log.info(String.valueOf(true));
    }

    static class Animal {

    }

    static class Cat extends Animal {

    }
}
