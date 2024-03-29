package top.syhan.java.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: switch之case穿透
 * @author: SYH
 * @Create: 2021-10-01 21:33
 **/
@Slf4j
public class SwitchDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = -1;
        switch (i){
            case 0:
                j = 1;
            case 1:
                j = 1;
            case 2:
                j = 2;
        }
        log.info("j={}", j);
    }
}
