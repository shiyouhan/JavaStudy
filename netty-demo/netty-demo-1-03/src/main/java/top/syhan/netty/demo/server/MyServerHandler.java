package top.syhan.netty.demo.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: netty-demo-1-03
 * @description: MyServerHandler
 * @author: SYH
 * @Create: 2021-10-31 19:11
 **/
public class MyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        SocketChannel channel = (SocketChannel) ctx.channel();
        System.out.println("连接报告：");
        System.out.println("连接信息：有一客户端链接到本服务端");
        System.out.println("连接客户端IP:" + channel.localAddress().getHostString());
        System.out.println("连接客户端Port:" + channel.localAddress().getPort());
        System.out.println("连接报告完毕");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //接收msg消息{与上一章节相比，此处已经不需要自己进行解码}
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " 接收到消息：" + msg);
    }

}
