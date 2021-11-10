package top.syhan.java.basic.annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:59
 **/
@FunctionalInterface
public interface GreetingService {
    /**
     * 抽象⽅法
     *
     * @param message ⼊参
     */
    void sayMessage(String message);
}
