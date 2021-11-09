package top.syhan.java.basic.reflect;

import lombok.Data;
/**
 * @program: java-basic
 * @author: SYH
 * @Create: 2021-10-06 19:55
 **/
@Data
public class User {
    private Integer age;
    private String name;

    public User() {
    }

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
