package top.syhan.java.basic.reflection;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @program: java-basic
 * @description: 通过反射获取配置文件中内容调用类中方法
 * @author: SYH
 * @Create: 2021-11-09 21:02
 **/
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("Class.txt"));

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> clazz = Class.forName(className);
        Method method = clazz.getMethod(methodName);
        method.invoke(clazz.getDeclaredConstructor().newInstance());
    }
}
