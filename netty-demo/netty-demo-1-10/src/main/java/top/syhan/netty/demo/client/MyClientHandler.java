package top.syhan.netty.demo.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: netty-demo-1-10
 * @description: MyClientHandler
 * @author: SYH
 * @Create: 2021-11-01 18:49
 **/
public class MyClientHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    /**
     * 接受服务端发送的内容
     * @param ctx 上下文
     * @param packet 数据包
     * @throws Exception 异常
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
        String msg = packet.content().toString(StandardCharsets.UTF_8);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " UDP客户端接收到消息：" + msg);
    }

}