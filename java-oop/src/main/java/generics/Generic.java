package generics;

import ch.qos.logback.core.pattern.ConverterUtil;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-09 13:58
 **/
public class Generic<T> {

    /**
     * key这个成员变量的类型为T，T的类型由外部指定
     * */
    private T key;

    /**
     * 泛型构造方法形参key的类型也为T，T的类型由外部指定
     *
     * @param key key
     */
    public Generic(T key) {
        this.key = key;
    }

    /**
     * 泛型方法getkey的返返回值类型为T，T的类型由外部指定
     *
     * @return T
     */
    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
        //传入的实参数需与泛型的类型参数型相同，即为String
        Generic<Integer> genericInteger = new Generic<Integer>(123);
        //传入的实参类型需与泛型的类型参数类型相同，即为String
        Generic<String> genericString = new Generic<String>("Java学习");
        System.out.println("泛型测试， key is " + genericInteger.getKey());
        System.out.println("泛型测试， key is " + genericString.getKey());
    }
}
