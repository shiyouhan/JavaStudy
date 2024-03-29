package top.syhan.netty.demo.aio.server;

import top.syhan.netty.demo.aio.ChannelAdapter;
import top.syhan.netty.demo.aio.ChannelHandler;

import java.io.IOException;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.util.Date;

/**
 * @program: netty-demo-1
 * @description: 处理消息
 * @author: SYH
 * @Create: 2021-10-30 19:48
 **/
public class AioServerHandler extends ChannelAdapter {

    public AioServerHandler(AsynchronousSocketChannel channel, Charset charset) {
        super(channel, charset);
    }

    @Override
    public void channelActive(ChannelHandler ctx) {
        try {
            System.out.println("连接到服务器:" + ctx.channel().getRemoteAddress());
            //通知客户端连接建立成功
            ctx.writeAndFlush("服务端连接建立成功" + " " + new Date() + " " + ctx.channel().getRemoteAddress() + "\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void channelInactive(ChannelHandler ctx) {
    }

    @Override
    public void channelRead(ChannelHandler ctx, Object msg) {
        System.out.println("服务端收到：" + new Date() + " " + msg + "\r\n");
        ctx.writeAndFlush("服务端信息处理成功！\r\n");
    }


}