package top.syhan.java.basic.variable;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: 变量
 * @author: SYH
 * @Create: 2021-09-25 16:26
 **/

@Slf4j
public class VariableDemo {
   //private final static Logger log = LoggerFactory.getLogger(VariableDemo.class);
    /**
     * 类变量（静态变量）
     * */
    private static int staticVar = 1024;

    /**
     * 实例变量
     * */
    private String instanceVar = "hello";

    /**
     * 实例方法
     * */
    public void method(){
        //局部变量
        int localVar = 666;
        log.info("Local before: {} " , localVar);
        localVar = 888;
        log.info("Local after: {} ", localVar);
    }

    /**
     * 静态方法
     *
     * @param args args
     * */
    public static void main(String[] args){
        //访问类变量（静态变量），无需实例对象
        log.info("staticVar before: {} ", staticVar);
        staticVar = 2048;
        log.info("staticVar after: {} ", staticVar);
        //创建实例对象，访问实例变量
        VariableDemo vd = new VariableDemo();
        log.info("instanceVar before: {} ", vd.instanceVar);
        log.info("instanceVar after: {} ", vd.instanceVar);
        //调用实例方法
        vd.method();
    }
}
