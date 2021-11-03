package top.syhan.netty.demo.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import top.syhan.netty.demo.codec.ObjDecoder;
import top.syhan.netty.demo.codec.ObjEncoder;
import top.syhan.netty.demo.domain.FileTransferProtocol;

/**
 * @program: netty-demo
 * @description:
 * @author: SYH
 * @Create: 2021-11-03 21:07
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(FileTransferProtocol.class));
        channel.pipeline().addLast(new ObjEncoder(FileTransferProtocol.class));
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyClientHandler());
    }

}
