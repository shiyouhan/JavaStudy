package top.syhan.java.basic.other;

import java.util.regex.Pattern;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-10-19 21:31
 **/
public class RegexExample {
    public static void main(String[] args){
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }
}
