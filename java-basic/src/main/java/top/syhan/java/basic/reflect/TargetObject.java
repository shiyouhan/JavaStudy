package top.syhan.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: 目标类
 * @author: SYH
 * @Create: 2021-10-07 18:25
 **/
@Slf4j
public class TargetObject {
    private final String value;

    public TargetObject() {
        this.value = "default";
    }

    public void publicMethod(String s) {
        log.info("I love " + s);
    }

    private void privateMethod() {
        log.info("value is " + value);
    }
}
