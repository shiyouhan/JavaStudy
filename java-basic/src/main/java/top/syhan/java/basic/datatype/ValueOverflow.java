package top.syhan.java.basic.datatype;

import lombok.extern.slf4j.Slf4j;
import java.math.BigInteger;

/**
 * @program: java-basic
 * @description: 数值溢出
 * @author: SYH
 * @Create: 2021-09-26 19:55
 **/

@Slf4j
public class ValueOverflow {
    public static void main(String[] args) {
        log.info("=============== wrong1 ===============");
        wrong();
        log.info("=============== right1 ===============");
        right1();
        log.info("=============== right1 ===============");
        right2();
    }

    public static void wrong(){
        long l = Long.MAX_VALUE;
        log.info(String.valueOf(l + 1));
        log.info(String.valueOf(l + 1 == Long.MIN_VALUE));
    }

    public static void right1(){
        try{
            long l = Long.MAX_VALUE;
            System.out.println(Math.addExact(l, 1));
        }catch (Exception ex){
            log.error(ex.toString());
        }
    }

    private static void right2(){
        BigInteger i = new BigInteger(String.valueOf(Long.MAX_VALUE));
        log.info(i.add(BigInteger.ONE).toString());
        try{
            long longValue = i.add(BigInteger.ONE).longValueExact();
            log.info(String.valueOf(longValue));
        }catch (Exception ex){
            log.error(ex.toString());
        }
    }
}
