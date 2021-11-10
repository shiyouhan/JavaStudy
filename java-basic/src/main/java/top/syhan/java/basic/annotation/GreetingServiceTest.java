package top.syhan.java.basic.annotation;


import org.junit.Test;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 16:00
 **/
public class GreetingServiceTest {
   @Test
    public void testGreetingService() {
        GreetingService greetingService = message -> System.out.println("hello" + message);
        greetingService.sayMessage("Java工程师");
    }
}
