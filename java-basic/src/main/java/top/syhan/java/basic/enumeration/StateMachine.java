package top.syhan.java.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: 本例展示枚举状态机
 * @author: SYH
 * @Create: 2021-09-29 20:22
 **/
@Slf4j
public class StateMachine {
    public static String getTrafficInstruct(Signal signal){
        String instruct = "信号灯故障";
        switch (signal){
            case RED:
                instruct = "红灯停";
                break;
            case YELLOW:
                instruct = "黄灯请注意";
                break;
            case GREEN:
                instruct = "绿灯行";
                break;
            default:
                break;
        }
        return instruct;
    }

    public static void main(String[] args) {
        log.info(getTrafficInstruct(Signal.RED));
        log.info(getTrafficInstruct(Signal.YELLOW));
        log.info(getTrafficInstruct(Signal.GREEN));
    }
}
