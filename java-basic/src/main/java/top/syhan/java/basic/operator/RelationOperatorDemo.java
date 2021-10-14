package top.syhan.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: 关系操作符示例
 * @author: SYH
 * @Create: 2021-09-28 20:45
 **/
@Slf4j
public class RelationOperatorDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        log.info("x == y =" + (x == y)) ;
        log.info("x != y =" + (x != y)) ;
        log.info("x > y =" + (x > y)) ;
        log.info("x < y =" + (x < y)) ;
        log.info("x >= y =" + (x <= y)) ;
        log.info("x <= y =" + (x <= y)) ;
    }
}
