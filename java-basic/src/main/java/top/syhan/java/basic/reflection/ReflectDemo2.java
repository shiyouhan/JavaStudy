package top.syhan.java.basic.reflection;

import lombok.extern.slf4j.Slf4j;
import top.syhan.java.basic.reflect.User;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @program: java-basic
 * @description: 通过反射获得泛型信息
 * @author: SYH
 * @Create: 2021-11-09 20:20
 **/
@Slf4j
public class ReflectDemo2 {

    public void method1(Map<String, User> map, List<User> list) {
        log.info("method1");
    }

    public Map<String, User> method2() {
        log.info("method2");
        return null;
    }

    public static void main(String[] args) throws Exception {
        //通过反射获取方法参数信息
        Method method  = ReflectDemo2.class.getMethod("method1", Map.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            log.info("泛型参数类型：{}",genericParameterTypes);
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType)
                genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    log.info("实际类型:{}",actualTypeArgument);
                }
            }
        }
    }
}
