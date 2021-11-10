package top.syhan.java.basic.annotation;

import java.lang.annotation.Annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:34
 **/
public class TestMyAnnotation {
    public static void main(String[] args) {
        Annotation[] annotations = Man.class.getAnnotations();
        System.out.println(annotations.length);
        Persons p1 = (Persons) annotations[0];
        for (Person t : p1.value()) {
            System.out.println(t.role());
        }

//        if(Man.class.isAnnotationPresent(Persons.class)) {
//            Persons p2=Man.class.getAnnotation(Persons.class);
//            for(Person t:p2.value()){
//                System.out.println(t.role());
//            }
//        }
    }
}
