package top.syhan.java.basic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: java-basic
 * @description: 动态代理执行处理
 * @author: SYH
 * @Create: 2021-11-08 22:19
 **/
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;
    public Object getTarget() {
        return target;
    }
    public void setTarget(Object target) {
        this.target = target;
    }
    /**
     * ⽣成得到代理类
     * @return 代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，并返回结果
     * @param proxy 代理对象
     * @param method 代理⽅法
     * @param args ⼊参数组
     * @return 执⾏结果
     * @throws Throwable 异常
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws
            Throwable {
        log(method.getName());
        //动态代理的本质就是使⽤反射机制来实现
        return method.invoke(target, args);
    }
    public void log(String msg) {
        System.out.println("执⾏了" + msg + "⽅法");
    }
}
