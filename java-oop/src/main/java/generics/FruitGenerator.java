package generics;

import java.sql.ResultSet;
import java.util.Random;

/**
 * @program: java-oop
 * @description: 泛型接口的实现类
 * @author: SYH
 * @Create: 2021-11-09 14:14
 **/
public class FruitGenerator implements Generator<String> {
    String[] fruits = new String[] {"apple", "banana", "pear"};

    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }

    public static void main(String[] args) {
        FruitGenerator fg = new FruitGenerator();
        System.out.println(fg.next());
    }
}
