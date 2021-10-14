package top.syhan.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: 逻辑操作符示例
 * @author: SYH
 * @Create: 2021-09-28 20:38
 **/
@Slf4j
public class LogicalOperatorDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        log.info("a && b = " + (a && b));
        log.info("a || b = " + (a || b));
        log.info("!(a && b) = " + !(a && b));
    }
}
