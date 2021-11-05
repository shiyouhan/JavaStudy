package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 00:21
 **/
public class Info<T> {
    private T value;

    public Info() {
    }

    public Info(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" + "value=" + value + '}';
    }
}
