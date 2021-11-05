package top.syhan.java.basic.generics;

/**
 * @program: java-basic
 * @description: 泛型接口：实现接口的子类明确声明泛型类型
 * @author: SYH
 * @Create: 2021-11-06 00:28
 **/
public class GenericsInterfaceDemo01 implements Content<Integer> {
    private final int text;

    public GenericsInterfaceDemo01(int text) {
        this.text = text;
    }

    @Override
    public Integer text() {
        return text;
    }

    public static void main(String[] args) {
        GenericsInterfaceDemo01 demo = new GenericsInterfaceDemo01(10);
        System.out.println(demo.text());
    }
}
