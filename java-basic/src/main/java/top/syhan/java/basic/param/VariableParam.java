package top.syhan.java.basic.param;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * java中定义了变长参数，允许在调用方法时传入不定长度的参数
 * 在定义方法时，在最后一个形参后加上三个点...就表示该形参可以接受多个参数值，多个参数值被当成数值传入
 * 上述定义有几个要点需要注意：
 * 1.可变参数只能作为函数的最后一个参数，但其前面可以有也可以没有任何其他参数
 * 2.由于可变参数必须是最后一个参数，所以一个函数最多只能有一个可变参数
 * 3.Java的可变参数，会被编译器转型为一个数组
 * 4.变长参数在编译为字节码后，在方法签名中就是以数组形态出现的
 * 5.这两个方法的签名是一致的，不能作为方法的重载，如果同时出现，是不能编译通过的，可变参数可以兼容数组，反之则不成立
 *
 * @author: SYH
 * @Create: 2021-10-12 20:48
 **/
@Slf4j
public class VariableParam {
    /**
     * 求任意个整数的乘积
     *
     * @param args 参数数组
     * @return 乘积
     * */
    public static int func (int... args) {
        int result = 1;
        for (int i: args) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        log.info("1*2*3 = {}", func(1, 2, 3));
        log.info("2 * 2 * 2 * 2 * 2 = {}", func(2, 2, 2, 2, 2));
        log.info("100 * 1000 = {}", func(100, 1000));
    }
}
