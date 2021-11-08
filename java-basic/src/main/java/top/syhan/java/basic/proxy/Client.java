package top.syhan.java.basic.proxy;

/**
 * @program: java-basic
 * @description: 执行动态代理
 * @author: SYH
 * @Create: 2021-11-08 22:29
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序化处理角色来处理我们要调用的接口对象
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.update();
    }
}
