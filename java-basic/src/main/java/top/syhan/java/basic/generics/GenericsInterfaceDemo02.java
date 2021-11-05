package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description: 泛型接口：实现接口的子类不明确声明泛型类型
 * @author: SYH
 * @Create: 2021-11-06 00:30
 **/
public class GenericsInterfaceDemo02<T> implements Content<T> {
    private final T text;

    public GenericsInterfaceDemo02(T text) {
        this.text = text;
    }

    @Override
    public T text() {
        return text;
    }

    public static void main(String[] args) {
        GenericsInterfaceDemo02<String> demo = new GenericsInterfaceDemo02<>("ABC");
        System.out.println(demo.text());
    }
}
