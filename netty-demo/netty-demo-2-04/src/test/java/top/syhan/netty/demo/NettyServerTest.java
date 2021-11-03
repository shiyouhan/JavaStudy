package top.syhan.netty.demo;

import top.syhan.netty.demo.server.NettyServer;

/**
 * @program: netty-demo
 * @description:
 * @author: SYH
 * @Create: 2021-11-03 21:41
 **/
public class NettyServerTest {
    public static void main(String[] args) {
        System.out.println("学习之路，学无止境");
        new NettyServer().bing(7397);
    }
}
