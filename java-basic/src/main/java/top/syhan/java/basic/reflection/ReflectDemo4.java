package top.syhan.java.basic.reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @program: java-basic
 * @description: 通过反射获取注释消息
 * @author: SYH
 * @Create: 2021-11-09 20:47
 **/
@Slf4j
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("top.syhan.java.basic.reflection.Student");

        //通过反射获取注释
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            log.info("注释：{}", annotation);
        }

        //获得注释Value的值
        TableSu tableSu = clazz.getAnnotation(TableSu.class);
        String value = tableSu.value();
        log.info("注释的值：{}", value);

        //获取类指定的注释
        Field field = clazz.getDeclaredField("name");
        FieldSu annotation = field.getAnnotation(FieldSu.class);
        log.info("name:{}", annotation.columnName());
        log.info("type:{}", annotation.type());
        log.info("length:{}", annotation.length());

    }
}
