package static_demo;

import static static_demo.A.print1;
import static static_demo.A.*;
/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-29 16:46
 **/
public class TestStaticImport {
    public static void main(String[] args) {
        print1("hello");
        print2(123);
//        A.print1("hello");
    }
}
