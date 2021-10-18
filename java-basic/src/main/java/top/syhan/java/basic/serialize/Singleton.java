package top.syhan.java.basic.serialize;

import java.io.Serializable;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-10-18 21:42
 **/
public class Singleton implements Serializable {

    private static final long serialVersionUID = -1576643344804979563L;

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static synchronized Singleton getSingleton() {
        return SingletonHolder.singleton;
    }

//    private Object readResolve() {
//        return SingletonHolder.singleton;
//    }
}
