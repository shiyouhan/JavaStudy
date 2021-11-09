package generics;

import java.lang.reflect.InvocationTargetException;
import java.util.IllformedLocaleException;
import java.util.Objects;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-09 15:19
 **/
public class GenericsDemo5 {
    public static void main(String[] args) throws ClassNotFoundException {
        Object obj=null;
        try {
            obj=genericMethod(Class.forName("com.soft.generics.City"));
        } catch (InstantiationException|IllegalAccessException|NoSuchMethodException|InvocationTargetException|ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(obj);
        City city= (City) obj;
        Objects.requireNonNull(city).setName("南京");
        System.out.println(city);
    }
    private static<T> T genericMethod(Class<T>clazz) throws InstantiationException, IllegalAccessException, NoSuchMethodException,InvocationTargetException {
        return clazz.getDeclaredConstructor().newInstance();
    }
}
//public class GenericsDemo5 {
//    public static void main(String[] args) {
//
//        Object obj = null;
//        try {
//            obj = genericMethod(Class.forName("top.syhan.generics.City"));
//        } catch (InstantiationException | IllformedLocaleException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException | IllegalAccessException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(obj);
//        City city = (City) obj;
//        Objects.requireNonNull(city).setName("南京");
//        System.out.println(city);
//    }
//
//    private static <T> T genericMethod(Class<T> clazz) throws InstantiationException, IllformedLocaleException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, IllegalAccessException {
//        return clazz.getDeclaredConstructor().newInstance();
//    }
//}
