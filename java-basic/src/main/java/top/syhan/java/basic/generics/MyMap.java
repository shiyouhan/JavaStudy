package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 00:25
 **/
public class MyMap<K,V> {

    private final K key;
    private final V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyMap{" + "key=" + key + ", value=" + value + '}';
    }
}
