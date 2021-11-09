package generics;

/**
 * @program: java-oop
 * @description: 泛型接口
 * @author: SYH
 * @Create: 2021-11-09 14:13
 **/
public interface Generator<T> {
    /**
     * next方法生成类
     *
     * @return T
     */
    T next();
}
