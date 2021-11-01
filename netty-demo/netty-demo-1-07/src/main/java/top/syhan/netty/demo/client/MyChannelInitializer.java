package top.syhan.netty.demo.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
/**
 * @program: netty-demo-1-07
 * @description: MyChannelInitializer
 * @author: SYH
 * @Create: 2021-11-01 16:37
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        System.out.println("连接报告开始");
        System.out.println("连接报告信息：本客户端连接到服务端。channelId：" + channel.id());
        System.out.println("连接报告完毕");
    }
}
