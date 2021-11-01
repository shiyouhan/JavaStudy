package top.syhan.netty.demo.server.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.nio.charset.StandardCharsets;


/**
 * @program: netty-demo-1-09
 * @description: MyChannelInitializer
 * @author: SYH
 * @Create: 2021-11-01 17:11
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        // 基于换行符号
        channel.pipeline().addLast(new LineBasedFrameDecoder(1024));
        // 解码转String，注意调整自己的编码格式
        channel.pipeline().addLast(new StringDecoder(StandardCharsets.UTF_8));
        // 解码转String，注意调整自己的编码格式
        channel.pipeline().addLast(new StringEncoder(StandardCharsets.UTF_8));
        // 在管道中添加我们自己的接收数据实现方法
        //消息出站处理器，在Client发送消息时候会触发此处理器
        channel.pipeline().addLast(new MyOutMsgHandler());
        //消息入站处理器
        channel.pipeline().addLast(new MyInMsgHandler());
    }

}
