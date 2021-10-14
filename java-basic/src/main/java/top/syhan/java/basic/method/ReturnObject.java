package top.syhan.java.basic.method;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-10-14 20:52
 **/
@AllArgsConstructor
@NoArgsConstructor
public class ReturnObject {
    private Integer max;
    private Integer min;
    private Integer sum;

    @Override
    public String toString() {
        return "{" +
                "max=" + max +
                ", min=" + min +
                ", sum=" + sum +
                '}';
    }
}
