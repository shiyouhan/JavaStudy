package top.syhan.netty.demo.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @program: netty-demo-1-02
 * @description: MyChannelInitializer
 * @author: SYH
 * @Create: 2021-10-31 19:03
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) {

        System.out.println("连接报告开始");
        System.out.println("连接报告信息：有一客户端链接到本服务端");
        System.out.println("连接IP:" + channel.localAddress().getHostString());
        System.out.println("连接Port:" + channel.localAddress().getPort());
        System.out.println("连接报告完毕");
        //在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyServerHandler());
    }
}
